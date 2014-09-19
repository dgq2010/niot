package cn.niot.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mypack.TestHibernate;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import cn.unitTest.RuleFuncTest;
import cn.niot.dao.RecoDao;
import cn.niot.service.*;
import cn.niot.util.RecoUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

import java.util.Date; 
import java.util.Calendar; 

import java.text.SimpleDateFormat; 

/**
 * 
* @Title: RespCode.java 
* @Package cn.niot.zt 
* @Description:
* @author Zhang Tao
* @date 2013-12-3 
* @version V1.0
 */



public class IoTIDRecognitionAction extends ActionSupport {

	private String code;

	private String status;

	private String data;

	private String statement;	

	private String extraData;

	private String Msg;


	public String getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}

	public String getStatement() {
		return statement;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getExtraData() {
		return extraData;
	}

	public String replaceBlank(String str) {

        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\\t|\\r|\\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

	public String execute() throws Exception {
		int nflag =4;
		if (1 == nflag) {
			IDstrRecognition.readDao(0);
			IDstrRecognition.testAndTestID();
			System.out.println("The end of this run!!!!\n");
			
			return SUCCESS;
		}
		
		//added by sq on 2014-08-28
		if(2==nflag)
		{
			CreateIoTIDSample.generateIoTIDSamples();
			System.out.println("The end of generrate!!!!\n");
			//Runtime runtime = Runtime.getRuntime();
		   // Process proc = runtime.exec("shutdown -s -t 0");
		   // System.exit(0);
			return SUCCESS;
		}
		if(3==nflag)
		{
			//记录开始时间
			Date nowbegin = new Date(); 
			SimpleDateFormat dateFormatbegin = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String begin = dateFormatbegin.format( nowbegin ); 
			
            //开始识别
            IDstrRecognition.readDao(0);
			IDstrRecognition.testAndTestIDRandom();
			System.out.println("The end of TestRandom!!!!\n");
			
			//记录结束时间
			Date nowfinish = new Date(); 
			SimpleDateFormat dateFormatfinish = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String finish = dateFormatfinish.format( nowfinish ); 
            
            //将起始时间写入数据库
            File f6 = new File("e://debug//TimeInfo.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(
					f6, true));
			output.append("Begin_Time:"+"  "+begin);
			output.append("\n");
			output.append("Finish_Time:"+"  "+finish);
			output.append("\n");
			output.flush();
			output.close();
			//Runtime runtime = Runtime.getRuntime();
		    //Process proc = runtime.exec("shutdown -s -t 0");
		   // System.exit(0);
			return SUCCESS;
			
		}

		String IoTcode = null;
		if (this.code != null) {
			IoTcode = replaceBlank(this.code);
			

		}

		if (IoTcode != null) {
			IDstrRecognition.readDao(0);
			HashMap<String, Double> typeProbability = IDstrRecognition
					.IoTIDRecognizeAlg(IoTcode);
			
			// added by dgq on 2014-04-29, to remove those items with
			// probability of 0.0
//			Iterator iterator_IDPro = typeProbability.keySet().iterator();
//			while (iterator_IDPro.hasNext()) {
//				String key_IDstd = iterator_IDPro.next().toString();				
//				double probability = typeProbability.get(key_IDstd);
//				if (0 >= probability) {
//					iterator_IDPro.remove();
//				}
//			}
			
//			// added by dgq on 2014-04-29, to remove those items with
//			// probability of 0.0
//			Iterator iterator_IDPro = typeProbability.keySet().iterator();
//			double sumPro = 0;
//			while (iterator_IDPro.hasNext()) {
//				String key_IDstd = iterator_IDPro.next().toString();				
//				double probability = typeProbability.get(key_IDstd);
//				if (0 >= probability) {
//					//iterator_IDPro.remove();
//					probability = 0.1;
//					typeProbability.put(key_IDstd, probability);					
//				}
//				sumPro = sumPro + probability;
//			}
//			
//			iterator_IDPro = typeProbability.keySet().iterator();
//			while (iterator_IDPro.hasNext()) {
//				String key_IDstd = iterator_IDPro.next().toString();				
//				double probability = typeProbability.get(key_IDstd);
//				typeProbability.put(key_IDstd, probability / sumPro);
//			}

			HashMap<String, Double> ShortName_Probability = new HashMap<String, Double>();
			JSONObject jsonObjectRes = IDstrRecognition.getTwoNamesByIDCode(
					typeProbability, ShortName_Probability);
			this.extraData = (jsonObjectRes.toString()).replace("\"", "\'");

			int len = ShortName_Probability.size();
			if (RecoUtil.NO_ID_MATCHED == len) {
				this.status = String.valueOf(RecoUtil.NO_ID_MATCHED);
				// this.status = "1";
			} else if (RecoUtil.ONE_ID_MATCHED == len) {
				Iterator iterator = ShortName_Probability.keySet().iterator();
				while (iterator.hasNext()) {
					Object key = iterator.next();
					this.data = String.valueOf(key);
					this.status = String.valueOf(RecoUtil.ONE_ID_MATCHED);
				}
			} else {
				this.status = String.valueOf(len);

				JSONArray jsonArray = new JSONArray();
				Iterator iterator2 = ShortName_Probability.keySet().iterator();
				while (iterator2.hasNext()) {
					Object key = iterator2.next();
					JSONObject jsonObject = new JSONObject();
					double probability = ShortName_Probability.get(key);
					jsonObject.put("codeName", String.valueOf(key));
					jsonObject.put("probability", String.valueOf(probability));
					if (!jsonArray.add(jsonObject)) {
						System.out.println("ERROR! jsonArray.add(jsonObject)");
					}
					this.data = jsonArray.toString();
				}
			}

		}

		System.out.println("\nthis.data:   " + this.data);
		System.out.println("\nthis.extraData:   " + this.extraData);
		return SUCCESS;
	}
}
