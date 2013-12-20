package cn.niot.service;

import cn.niot.dao.RecoDao;

//����62�����С��������EAN-13���бȽϣ��������볤�ȶ���13
public class CompareCode13 {
	//ƥ�����
	private int randomNum = 10000;
	
	//���ֽ���������չ��򷵻�char����
	private char[] randomCodeRegex(String[] regexArray){
		char[] charArray = new char[regexArray.length];
		NewIDstdCollisionDetect detect = new NewIDstdCollisionDetect();
		for(int i = 0; i < regexArray.length; i++){
			charArray[i] = detect.generateRandomChar(regexArray[i]);
		}
		return charArray;
	}
	
	//����õ�һ������������������
	private String randomAdminDivision(){
		String code = "";
		try{
			RecoDao dao = new RecoDao();
			code = dao.getRandomAdminDivision();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return code;
	}
	
	//����õ�һ��EANUPC���Ҵ�������
	private String randomRetailCommunityNumber(){
		String code = "";
		try{
			RecoDao dao = new RecoDao();
			code = dao.getRandomEANUPC();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return code;
	}
	//EAN-13У���㷨
	private char checkCommodityCode(char[] eanCode){
		char checkcode = 0;
		int i = 0;

		// the sum of the odd and even number
		int odd_sum = 0;
		int even_sum = 0;
		
		for (i = eanCode.length - 1; i >= 0; i -= 2) {
			even_sum += (eanCode[i] - 48); // ASCII���� �ַ�'0'��Ӧ����30H,ʮ���ƾ���48
		}

		for (i = eanCode.length - 2; i >= 0; i -= 2) {
			odd_sum += (eanCode[i] - 48);
		}

		if ((((even_sum * 3 + odd_sum)) % 10) == 0) {
			checkcode = 48;
		} else {
			checkcode = (char) ((10 - ((even_sum * 3 + odd_sum)) % 10) + 48);
		}
		return checkcode;
	}
	
	//���62���������
	public char[] generateRandomStreetCode(){
		String[] regexArray = new String[]{"[0-3]", "[0-9]", "[0-9]", "[0,1]", "[0-9]", "[0-9]", "[0-9]"};
		char[] charArray = new char[regexArray.length];
		char[] adminDivisionArray = new char[6];
		String adminDivisionCode = randomAdminDivision();
		
		charArray = randomCodeRegex(regexArray);
		System.out.println(adminDivisionCode.toCharArray());
		adminDivisionArray =  adminDivisionCode.toCharArray();
		char[] streetCode = new char[adminDivisionArray.length + charArray.length];
		System.arraycopy(adminDivisionArray, 0, streetCode, 0, adminDivisionArray.length);
		System.arraycopy(charArray, 0, streetCode, adminDivisionArray.length, charArray.length);
		return streetCode;
	}

	//EAN-13�������
	public char[] generateRandomEAN13(){
		String[] regexArray = new String[]{"[0-9]", "[0-9]", "[0-9]", "[0-9]" ,"[0-9]", "[0-9]" ,"[0-9]", "[0-9]", "[0-9]"};
		String commodityNum = randomRetailCommunityNumber();
		char[] charArray = randomCodeRegex(regexArray);
		char[] eanArray =  commodityNum.toCharArray();
		
		char[] eanCode = new char[eanArray.length + charArray.length + 1];
		System.arraycopy(eanArray, 0, eanCode, 0, eanArray.length);
		System.arraycopy(charArray, 0, eanCode, eanArray.length, charArray.length);
		
		char checkSum = checkCommodityCode(eanCode);
		eanCode[eanCode.length - 1] = checkSum;
		return eanCode;
	}
}