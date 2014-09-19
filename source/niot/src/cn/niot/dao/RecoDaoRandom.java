package cn.niot.dao;
import java.sql.*;

import cn.niot.util.*;

import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
import cn.niot.service.*;
/**
 * 
 * @author sq
 * @date 2014-08-28
 */

public class RecoDaoRandom {
	
	private static RecoDaoRandom RecoDaoRandom = new RecoDaoRandom();
	

	public static RecoDaoRandom getRecoDao() {
		return RecoDaoRandom;
	}

	
	//哈希表的声明
	public static HashMap<String,String> hashMapDistrictNo=new HashMap<String,String>();
	public static HashMap<String,String> hashMapAdminDivision=new HashMap<String,String>();
	public static HashMap<String,String> hashMapAdminDivision1=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapAnimalDisease=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGassCompany=new HashMap<String,String>();
	public static HashMap<String,String>hashMapGainStoreHouse=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGeographicInfoCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapWirtschaftsTypCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapJadejewelryClass=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGrainsIndex=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPort=new HashMap<String,String>();
	public static HashMap<String,String> hashMapForestTypes=new HashMap<String,String>();
	public static HashMap<String,String> hashMapVoltageClass=new HashMap<String,String>();
	public static HashMap<String,String> hashMapNormalAndShortCycleSpeciality=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGrainAdministrative=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHarmfulFacto=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTabaccoStandardPart=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayTransportation4c6=new HashMap<String,String>();
	public static HashMap<String,String> hashMapDZClassify=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGainsDiseases=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTabaccoMachineProduct=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTabaccoMachineProducer=new HashMap<String,String>();
	public static HashMap<String,String> hashMapgoalsocialeconomic=new HashMap<String,String>();
	public static HashMap<String,String> hashMapBusinessAdminis=new HashMap<String,String>();
	public static HashMap<String,String> hashMapJadejewelryMaterialclassif=new HashMap<String,String>();
	public static HashMap<String,String> hashMapConstructionProducts=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayMaintenance4=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials53=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials54=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials51=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials52=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials50=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials49=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTreeDiseaseCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapRailwayStationCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapDZClassify710=new HashMap<String,String>();
	public static HashMap<String,String> hashMapFoodAccount=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGeneralManufacturingProcess=new HashMap<String,String>();
	public static HashMap<String,String> hashMapMachinery9=new HashMap<String,String>();
	public static HashMap<String,String> hashMaptabaccoC=new HashMap<String,String>();
	public static HashMap<String,String> hashMapCoastalAdminAreaId=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayTransportation=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayTransportation4b9=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayTransportation4c3=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials46=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials45=new HashMap<String,String>();
	public static HashMap<String,String> hashMapPowerMaterials44=new HashMap<String,String>();
	public static HashMap<String,String> hashMapMaintenanceSystemPTwo=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayDatabase71=new HashMap<String,String>();
	public static HashMap<String,String> hashMapElectricPowerGeography=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGrainEstablishment=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayMaintenance3=new HashMap<String,String>();
	public static HashMap<String,String> hashMapMachinery2=new HashMap<String,String>();
	public static HashMap<String,String> hashMapFoodTrade=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGainsEquipment=new HashMap<String,String>();
	public static HashMap<String,String> hashMapRoadTransportation21=new HashMap<String,String>();
	public static HashMap<String,String> hashMapInfectiousDiseases=new HashMap<String,String>();
	public static HashMap<String,String> hashMapRoadTransportation50=new HashMap<String,String>();
	public static HashMap<String,String> hashMapRoadTransportation53=new HashMap<String,String>();
	public static HashMap<String,String> hashMapWasteproducts=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayDatabase17=new HashMap<String,String>();
	public static HashMap<String,String> hashMapModeofProduction=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTerminationofPregnancy=new HashMap<String,String>();
	public static HashMap<String,String> hashMapTobaccoLeafForm=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHighwayDatabase46=new HashMap<String,String>();
	public static HashMap<String,String> hashMapHealthSupervisionObject=new HashMap<String,String>();
	public static HashMap<String,String> hashMapDileveryPlace=new HashMap<String,String>();
	public static HashMap<String,String> hashMapInformationSafe=new HashMap<String,String>();
	public static HashMap<String,String> hashMapClassificationOfCivilAviation=new HashMap<String,String>();
	public static HashMap<String,String> hashMapChildrenExcrement=new HashMap<String,String>();
	
	//liuliying
	public static HashMap<String,String> hashMaphashMapvehiclenowj=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapvehiclenoarmy=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapmachinery6=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapvehiclenonormal=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMaptcmdisease=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMaptcmfeature=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapgrainsprocess=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapCarProductCompnent=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapporttariff9=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapporttariff25=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapclothesclass=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapCoastalAdminAreaId=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapgoalsocialeconomic=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapInternationalShipCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapfuneralservice=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapfuneralfacilities=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapfuneralsupplies=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMaptabaccoelectriccomponent=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMaptabaccomaterial=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapNaturaldisaster=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapsecurityaccounterments=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMaptextilefabricnamecode=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesmainmaterial=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesmain=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesfibercharacteristics=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesmixed=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesfabric=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMappropertiesdyeingandfinishing=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmachinery8=new HashMap<String,String>();
	public static HashMap<String,String> hashMaphashMapmachinery7=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmedicalInstrument=new HashMap<String,String>();
	public static HashMap<String,String> hashMapgrainstechnicaleconomy=new HashMap<String,String>();
	public static HashMap<String,String> hashMapGeographicalCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmeatandvegetable=new HashMap<String,String>();
	public static HashMap<String,String> hashMapgrainequipment=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmachinery5=new HashMap<String,String>();
	public static HashMap<String,String> hashMapprovinceadmincode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapgrainsinformation=new HashMap<String,String>();
	public static HashMap<String,String> hashMapNuclearelementNation=new HashMap<String,String>();
	public static HashMap<String,String> hashMapNuclearelements=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmachinery3=new HashMap<String,String>();
	public static HashMap<String,String> hashMapmachinery4=new HashMap<String,String>();
	public static HashMap<String,String> hashMapelectricpower=new HashMap<String,String>();
	public static HashMap<String,String> hashMapeworkerhealthsupervision=new HashMap<String,String>();
	public static HashMap<String,String> hashMapePesticideFormulationCode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapofficialposition=new HashMap<String,String>();
	public static HashMap<String,String> hashMaproadtransportation22=new HashMap<String,String>();
	public static HashMap<String,String> hashMapspecialvehicle=new HashMap<String,String>();
	public static HashMap<String,String> hashMaproadtransportation41=new HashMap<String,String>();
	public static HashMap<String,String> hashMapelectronicmap=new HashMap<String,String>();
	public static HashMap<String,String> hashMaproadtransportation32=new HashMap<String,String>();
	public static HashMap<String,String> hashMapcommunicationmediacode=new HashMap<String,String>();
	public static HashMap<String,String> hashMapuntransportableproduct=new HashMap<String,String>();
	public static HashMap<String,String> hashMapbarcodeforcommodity=new HashMap<String,String>();
	
	//wangbin
	public static HashMap<String, String> hashMapClothesName = new HashMap<String, String>();
	public static HashMap<String, String> hashMapHydrologicData = new HashMap<String, String>();
	public static HashMap<String, String> hashMapgrainsSmartWMS = new HashMap<String, String>();
	public static HashMap<String, String> hashMapmachinery10 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapcountryregioncode = new HashMap<String, String>();
	public static HashMap<String, String> hashMapgeographicinformation = new HashMap<String, String>();
	public static HashMap<String, String> hashMaptobaccoorganization = new HashMap<String, String>();
	public static HashMap<String, String> hashMappassengerCarCode = new HashMap<String, String>();
	public static HashMap<String, String> hashMapgrainsqualitystandard = new HashMap<String, String>();
	public static HashMap<String, String> hashMapmeasuringinstrument = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphighwaydatabase47 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapTCLBatteryProduct = new HashMap<String, String>();
	public static HashMap<String, String> hashMapProductCode = new HashMap<String, String>();
	public static HashMap<String, String> hashMapcivilaviation = new HashMap<String, String>();
	public static HashMap<String, String> hashMapLogisticsInf = new HashMap<String, String>();
	public static HashMap<String, String> hashMapwaterwaytransportation = new HashMap<String, String>();
	public static HashMap<String, String> hashMapmountainrangeandpeakname = new HashMap<String, String>();
	public static HashMap<String, String> hashMaptobaccoleafclass = new HashMap<String, String>();
	public static HashMap<String, String> hashMapintellectualproperty = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphighwaytransportation4b1 = new HashMap<String, String>();
	public static HashMap<String, String> hashMaproadtransportation5 = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphighwaytransportation = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphighwaytransportation4b7 = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphighwaytransportation4b10 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapporttariff26 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapporttariff3 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapLogisticsoperation = new HashMap<String, String>();
	public static HashMap<String, String> hashMapphysicalactivityfrequency = new HashMap<String, String>();
	public static HashMap<String, String> hashMaphygieneagencypersonnel = new HashMap<String, String>();
	public static HashMap<String, String> hashMaptobaccomaterials = new HashMap<String, String>();
	public static HashMap<String, String> hashMapInternetWebService = new HashMap<String, String>();
	public static HashMap<String, String> hashMaproadtransportation64 = new HashMap<String, String>();
	public static HashMap<String, String> hashMaproadtransportation63 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapdrinkingclass = new HashMap<String, String>();
	public static HashMap<String, String> hashMapdrinkingfrequency = new HashMap<String, String>();
	public static HashMap<String, String> hashMapgrainconditiondetection = new HashMap<String, String>();
	public static HashMap<String, String> hashMaptrafficinformationcollection = new HashMap<String, String>();
	public static HashMap<String, String> hashMapelectricpowerindustry = new HashMap<String, String>();
	public static HashMap<String, String> hashMappowergoodsp2 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapTravleDocumentCode = new HashMap<String, String>();
	public static HashMap<String, String> hashMaproadtransportation60 = new HashMap<String, String>();
	public static HashMap<String, String> hashMapFireInfomation = new HashMap<String, String>();
	public static HashMap<String, String> hashMaptobaccoleafcolor = new HashMap<String, String>();
	public static HashMap<String, String> hashMapgrainsattribute = new HashMap<String, String>();
	public static HashMap<String, String> hashMapNavigationShip = new HashMap<String, String>();
	public static HashMap<String, String> hashMapTheCenteralPartyCommitte = new HashMap<String, String>();
	public static HashMap<String, String> hashMapporttariff10 = new HashMap<String, String>();
	public static HashMap<String, String> hashMappowergrid = new HashMap<String, String>();
	public static HashMap<String , String> hashmapmeasureunit=new HashMap<String , String>();
	
	public static HashMap<String , String> hashpharmaceuticalmachinery=new HashMap<String , String>();
	

	



	/*public static RecoDaoRandom getRecoDaoRandom() 
	{
		return RecoDaoRandom;
	}*/
	
	
	public int getLengthPublicFunction(String TableName,HashMap<String,String> hashmap)
	{
		
		int length=0;
		try{
		if(hashmap.size()==0)
		{   
			MakeHashMap(TableName,hashmap);
		}
		}finally
		{
			JdbcUtilsRandom.free(null, null, null);
		}
		
		length=hashmap.size();
		
		return length;
	}
	
	
	
	public void MakeHashMap(String TableName,HashMap<String,String> hashmap){
		
		
		Connection connection = JdbcUtilsRandom.getConnection();
		try {
			
			PreparedStatement stmt;
			ResultSet result;
	        stmt = connection.prepareStatement("select * from "+TableName);
			result = stmt.executeQuery();
			
		    while (result.next()) {
		    	String id = result.getString("id");
		    	String code = result.getString("code");
		    		
		    	hashmap.put(id, code);
		    	}		    	
		  
		} catch (SQLException e) {
			System.out.println(e.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public String getRandomIndexPublicFunction(String TableName,int RandomIndex,HashMap<String,String> hashmap)
	{
		String RandomResults="";
		
		if(hashmap.size()==0)
		{
			
			MakeHashMap(TableName,hashmap);
		}
		
		
		RandomResults=hashmap.get(String.valueOf(RandomIndex+1));
		
		return RandomResults;
	}
	
	
	public int getLengthOfEANUPC()
	{
		int length=0;
	
		
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.COUNT_EANUPC);
			results = stmt.executeQuery();
			while(results.next())
			{
			length=results.getInt("length");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
	
		return length;
	
	}
	public String getRandomIndexEANUPC(int RandomIndex)
	{
		String RandomResults="";
		String Begincode="";
		String Endcode="";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_EANUPC);
			
			int i=1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while(results.next())
			{
			
			Begincode=results.getString("begincode");
			Endcode=results.getString("endcode");
			
			}
			int IntBegincode=Integer.parseInt(Begincode);
			int IntEndcode=Integer.parseInt(Endcode);
			Random random=new Random();
			int Randomcode=random.nextInt(IntEndcode-IntBegincode+1);
			RandomResults=String.valueOf(Randomcode+IntBegincode);
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		
		return RandomResults;
	}
	
	public int getLengthOfcountryregioncode()
	{
		int length=0;
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.COUNT_COUNTRYREGIONCODE);
			results = stmt.executeQuery();
			while(results.next())
			{
			length=results.getInt("length");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		return length;
	}
	
	//0827
	//modified by lly
	/*public String getRandomIndexcountryregioncode(int RandomIndex)
	{
		String RandomResults="";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_COUNTRYREGIONCODE);
			
			int i=1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while(results.next())
			{
				RandomResults=results.getString("numcode");
				
		    }
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		
		return RandomResults;
	}*/
	public String getRandomIndexcountryregioncode(int RandomIndex,int paramlengh)
	{
		String RandomResults="";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_COUNTRYREGIONCODE);
			
			int i=1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while(results.next())
			{   if(paramlengh==2){
				RandomResults=results.getString("twocharcode");
			}else if(paramlengh==3){
				String code[]={"numcode","threecharcode"};
				RandomResults=results.getString(code[RandomChar.generateRandomInt(code.length)]);
			}
		    }
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		
		return RandomResults;
	}
	
	//added by SQ on 0911
	public String getRandomIndexcountryregioncode4all(int RandomIndex)
	{
		String RandomResults="";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		int Type=RandomChar.generateRandomInt(3);
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_COUNTRYREGIONCODE);
			
			int i=1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while(results.next())
			{   if(Type==0){
				RandomResults=results.getString("twocharcode");
			}else if(Type==1){
				
				RandomResults=results.getString("numcode");
			}else{
				RandomResults=results.getString("threecharcode");
			}
		    }
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		
		return RandomResults;
	}


	
	public int getLengthOfMobilePhoneNum()
	{
		int length=0;

		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.COUNT_PHONENUMBER);
			results = stmt.executeQuery();
			while(results.next())
			{
			length=results.getInt("length");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		return length;
	}
	
	public String getRandomIndexMobilePhoneNum(int RandomIndex)
	{
		String RandomResults="";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try{
			stmt=connection.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_PHONENUMBER);
			
			int i=1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while(results.next())
			{
				RandomResults=results.getString("code");
				
		    }
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			JdbcUtilsRandom.free(null, null, connection);
		}
		return RandomResults;
		
	}
	
	public String getRandomIndexcountryregioncode2(int RandomIndex) {
		String RandomResults = "";
		Connection connection = JdbcUtilsRandom.getConnection();
		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection
					.prepareStatement(RecoUtilRandom.SELECT_RANDOMINDEX_COUNTRYREGIONCODE);

			int i = 1;
			stmt.setInt(i, RandomIndex);
			results = stmt.executeQuery();
			while (results.next()) {
				RandomResults = results.getString("twocharcode");

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"getRandomIndexcountryregioncode failed", e);
		} finally {
			JdbcUtilsRandom.free(null, null, connection);
		}

		return RandomResults;
	}
	
	public static void ClearHashMap()
	{
		//哈希表的声明
		 hashMapDistrictNo=null;
		 hashMapAdminDivision=null;
		 hashMapAdminDivision1=null;
		 hashMaphashMapAnimalDisease=null;
		 hashMapGassCompany=null;
		hashMapGainStoreHouse=null;
		 hashMapGeographicInfoCode=null;
		 hashMapWirtschaftsTypCode=null;
		 hashMapJadejewelryClass=null;
		 hashMapGrainsIndex=null;
		 hashMapPort=null;
		 hashMapForestTypes=null;
		 hashMapVoltageClass=null;
		 hashMapNormalAndShortCycleSpeciality=null;
		 hashMapGrainAdministrative=null;
		 hashMapHarmfulFacto=null;
		 hashMapTabaccoStandardPart=null;
		 hashMapHighwayTransportation4c6=null;
		 hashMapDZClassify=null;
		 hashMapGainsDiseases=null;
		 hashMapTabaccoMachineProduct=null;
		 hashMapTabaccoMachineProducer=null;
		 hashMapgoalsocialeconomic=null;
		 hashMapBusinessAdminis=null;
		 hashMapJadejewelryMaterialclassif=null;
		 hashMapConstructionProducts=null;
		 hashMapHighwayMaintenance4=null;
		 hashMapPowerMaterials53=null;
		 hashMapPowerMaterials54=null;
		 hashMapPowerMaterials51=null;
		 hashMapPowerMaterials52=null;
		 hashMapPowerMaterials50=null;
		 hashMapPowerMaterials49=null;
		 hashMapTreeDiseaseCode=null;
		 hashMapRailwayStationCode=null;
		 hashMapDZClassify710=null;
		 hashMapFoodAccount=null;
		 hashMapGeneralManufacturingProcess=null;
		 hashMapMachinery9=null;
		 hashMaptabaccoC=null;
		 hashMapCoastalAdminAreaId=null;
		 hashMapHighwayTransportation=null;
		 hashMapHighwayTransportation4b9=null;
		 hashMapHighwayTransportation4c3=null;
		 hashMapPowerMaterials46=null;
		 hashMapPowerMaterials45=null;
		 hashMapPowerMaterials44=null;
		 hashMapMaintenanceSystemPTwo=null;
		 hashMapHighwayDatabase71=null;
		 hashMapElectricPowerGeography=null;
		 hashMapGrainEstablishment=null;
		 hashMapHighwayMaintenance3=null;
		 hashMapMachinery2=null;
		 hashMapFoodTrade=null;
		 hashMapGainsEquipment=null;
		 hashMapRoadTransportation21=null;
		 hashMapInfectiousDiseases=null;
		 hashMapRoadTransportation50=null;
		 hashMapRoadTransportation53=null;
		 hashMapWasteproducts=null;
		 hashMapHighwayDatabase17=null;
		 hashMapModeofProduction=null;
		 hashMapTerminationofPregnancy=null;
		 hashMapTobaccoLeafForm=null;
		 hashMapHighwayDatabase46=null;
		 hashMapHealthSupervisionObject=null;
		 hashMapDileveryPlace=null;
		 hashMapInformationSafe=null;
		 hashMapClassificationOfCivilAviation=null;
		 hashMapChildrenExcrement=null;
		
		//liuliying
		 hashMaphashMapvehiclenowj=null;
		 hashMaphashMapvehiclenoarmy=null;
		 hashMaphashMapmachinery6=null;
		 hashMaphashMapvehiclenonormal=null;
		 hashMaphashMaptcmdisease=null;
		 hashMaphashMaptcmfeature=null;
		 hashMaphashMapgrainsprocess=null;
		 hashMaphashMapCarProductCompnent=null;
		 hashMaphashMapporttariff9=null;
		 hashMaphashMapporttariff25=null;
		 hashMaphashMapclothesclass=null;
		 hashMaphashMapCoastalAdminAreaId=null;
		 hashMaphashMapgoalsocialeconomic=null;
		 hashMaphashMapInternationalShipCode=null;
		 hashMaphashMapfuneralservice=null;
		 hashMaphashMapfuneralfacilities=null;
		 hashMaphashMapfuneralsupplies=null;
		 hashMaphashMaptabaccoelectriccomponent=null;
		 hashMaphashMaptabaccomaterial=null;
		 hashMaphashMapNaturaldisaster=null;
		 hashMaphashMapsecurityaccounterments=null;
		 hashMaphashMaptextilefabricnamecode=null;
		 hashMaphashMappropertiesmainmaterial=null;
		 hashMaphashMappropertiesmain=null;
		 hashMaphashMappropertiesfibercharacteristics=null;
		 hashMaphashMappropertiesmixed=null;
		 hashMaphashMappropertiesfabric=null;
		 hashMaphashMappropertiesdyeingandfinishing=null;
		 hashMapmachinery8=null;
		 hashMaphashMapmachinery7=null;
		 hashMapmedicalInstrument=null;
		 hashMapgrainstechnicaleconomy=null;
		 hashMapGeographicalCode=null;
		 hashMapmeatandvegetable=null;
		 hashMapgrainequipment=null;
		 hashMapmachinery5=null;
		 hashMapprovinceadmincode=null;
		 hashMapgrainsinformation=null;
		 hashMapNuclearelementNation=null;
		 hashMapNuclearelements=null;
		 hashMapmachinery3=null;
		 hashMapmachinery4=null;
		 hashMapelectricpower=null;
		 hashMapeworkerhealthsupervision=null;
		 hashMapePesticideFormulationCode=null;
		 hashMapofficialposition=null;
		 hashMaproadtransportation22=null;
		 hashMapspecialvehicle=null;
		 hashMaproadtransportation41=null;
		 hashMapelectronicmap=null;
		 hashMaproadtransportation32=null;
		 hashMapcommunicationmediacode=null;
		 hashMapuntransportableproduct=null;
		 hashMapbarcodeforcommodity=null;
		
		//wangbin
		hashMapClothesName =null;
		hashMapHydrologicData =null;
		hashMapgrainsSmartWMS =null;
		hashMapmachinery10 =null;
		hashMapcountryregioncode =null;
		hashMapgeographicinformation =null;
		hashMaptobaccoorganization =null;
		hashMappassengerCarCode =null;
		hashMapgrainsqualitystandard =null;
		hashMapmeasuringinstrument =null;
		hashMaphighwaydatabase47 =null;
		hashMapTCLBatteryProduct =null;
		hashMapProductCode =null;
		hashMapcivilaviation =null;
		hashMapLogisticsInf =null;
		hashMapwaterwaytransportation =null;
		hashMapmountainrangeandpeakname =null;
		hashMaptobaccoleafclass =null;
		hashMapintellectualproperty =null;
		hashMaphighwaytransportation4b1 =null;
		hashMaproadtransportation5 =null;
		hashMaphighwaytransportation =null;
		hashMaphighwaytransportation4b7 =null;
		hashMaphighwaytransportation4b10 =null;
		hashMapporttariff26 =null;
		hashMapporttariff3 =null;
		hashMapLogisticsoperation =null;
		hashMapphysicalactivityfrequency =null;
		hashMaphygieneagencypersonnel =null;
		hashMaptobaccomaterials =null;
		hashMapInternetWebService =null;
		hashMaproadtransportation64 =null;
		hashMaproadtransportation63 =null;
		hashMapdrinkingclass =null;
		hashMapdrinkingfrequency =null;
		hashMapgrainconditiondetection =null;
		hashMaptrafficinformationcollection =null;
		hashMapelectricpowerindustry =null;
		hashMappowergoodsp2 =null;
		hashMapTravleDocumentCode =null;
		hashMaproadtransportation60 =null;
		hashMapFireInfomation =null;
		hashMaptobaccoleafcolor =null;
		hashMapgrainsattribute =null;
		hashMapNavigationShip =null;
		hashMapTheCenteralPartyCommitte =null;
		hashMapporttariff10 =null;
		hashMappowergrid =null;
		hashmapmeasureunit=null;
	    hashpharmaceuticalmachinery=null;
		System.gc();
		

		hashMapDistrictNo=new HashMap<String,String>();
		hashMapAdminDivision=new HashMap<String,String>();
		hashMapAdminDivision1=new HashMap<String,String>();
		hashMaphashMapAnimalDisease=new HashMap<String,String>();
		hashMapGassCompany=new HashMap<String,String>();
		hashMapGainStoreHouse=new HashMap<String,String>();
		hashMapGeographicInfoCode=new HashMap<String,String>();
		hashMapWirtschaftsTypCode=new HashMap<String,String>();
		hashMapJadejewelryClass=new HashMap<String,String>();
		hashMapGrainsIndex=new HashMap<String,String>();
		hashMapPort=new HashMap<String,String>();
		hashMapForestTypes=new HashMap<String,String>();
		hashMapVoltageClass=new HashMap<String,String>();
		hashMapNormalAndShortCycleSpeciality=new HashMap<String,String>();
		hashMapGrainAdministrative=new HashMap<String,String>();
		hashMapHarmfulFacto=new HashMap<String,String>();
		hashMapTabaccoStandardPart=new HashMap<String,String>();
		hashMapHighwayTransportation4c6=new HashMap<String,String>();
		hashMapDZClassify=new HashMap<String,String>();
		hashMapGainsDiseases=new HashMap<String,String>();
		hashMapTabaccoMachineProduct=new HashMap<String,String>();
		hashMapTabaccoMachineProducer=new HashMap<String,String>();
		hashMapgoalsocialeconomic=new HashMap<String,String>();
		hashMapBusinessAdminis=new HashMap<String,String>();
		hashMapJadejewelryMaterialclassif=new HashMap<String,String>();
		hashMapConstructionProducts=new HashMap<String,String>();
		hashMapHighwayMaintenance4=new HashMap<String,String>();
		hashMapPowerMaterials53=new HashMap<String,String>();
		hashMapPowerMaterials54=new HashMap<String,String>();
		hashMapPowerMaterials51=new HashMap<String,String>();
		hashMapPowerMaterials52=new HashMap<String,String>();
		hashMapPowerMaterials50=new HashMap<String,String>();
		hashMapPowerMaterials49=new HashMap<String,String>();
		hashMapTreeDiseaseCode=new HashMap<String,String>();
		hashMapRailwayStationCode=new HashMap<String,String>();
		hashMapDZClassify710=new HashMap<String,String>();
		hashMapFoodAccount=new HashMap<String,String>();
		hashMapGeneralManufacturingProcess=new HashMap<String,String>();
		hashMapMachinery9=new HashMap<String,String>();
		hashMaptabaccoC=new HashMap<String,String>();
		hashMapCoastalAdminAreaId=new HashMap<String,String>();
		hashMapHighwayTransportation=new HashMap<String,String>();
		hashMapHighwayTransportation4b9=new HashMap<String,String>();
		hashMapHighwayTransportation4c3=new HashMap<String,String>();
		hashMapPowerMaterials46=new HashMap<String,String>();
		hashMapPowerMaterials45=new HashMap<String,String>();
		hashMapPowerMaterials44=new HashMap<String,String>();
		hashMapMaintenanceSystemPTwo=new HashMap<String,String>();
		hashMapHighwayDatabase71=new HashMap<String,String>();
		hashMapElectricPowerGeography=new HashMap<String,String>();
		hashMapGrainEstablishment=new HashMap<String,String>();
		hashMapHighwayMaintenance3=new HashMap<String,String>();
		hashMapMachinery2=new HashMap<String,String>();
		hashMapFoodTrade=new HashMap<String,String>();
		hashMapGainsEquipment=new HashMap<String,String>();
		hashMapRoadTransportation21=new HashMap<String,String>();
		hashMapInfectiousDiseases=new HashMap<String,String>();
		hashMapRoadTransportation50=new HashMap<String,String>();
		hashMapRoadTransportation53=new HashMap<String,String>();
		hashMapWasteproducts=new HashMap<String,String>();
		hashMapHighwayDatabase17=new HashMap<String,String>();
		hashMapModeofProduction=new HashMap<String,String>();
		hashMapTerminationofPregnancy=new HashMap<String,String>();
		hashMapTobaccoLeafForm=new HashMap<String,String>();
		hashMapHighwayDatabase46=new HashMap<String,String>();
		hashMapHealthSupervisionObject=new HashMap<String,String>();
		hashMapDileveryPlace=new HashMap<String,String>();
		hashMapInformationSafe=new HashMap<String,String>();
		hashMapClassificationOfCivilAviation=new HashMap<String,String>();
		hashMapChildrenExcrement=new HashMap<String,String>();
		

		hashMaphashMapvehiclenowj=new HashMap<String,String>();
		hashMaphashMapvehiclenoarmy=new HashMap<String,String>();
		hashMaphashMapmachinery6=new HashMap<String,String>();
		hashMaphashMapvehiclenonormal=new HashMap<String,String>();
		hashMaphashMaptcmdisease=new HashMap<String,String>();
		hashMaphashMaptcmfeature=new HashMap<String,String>();
		hashMaphashMapgrainsprocess=new HashMap<String,String>();
		hashMaphashMapCarProductCompnent=new HashMap<String,String>();
		hashMaphashMapporttariff9=new HashMap<String,String>();
		hashMaphashMapporttariff25=new HashMap<String,String>();
		hashMaphashMapclothesclass=new HashMap<String,String>();
		hashMaphashMapCoastalAdminAreaId=new HashMap<String,String>();
		hashMaphashMapgoalsocialeconomic=new HashMap<String,String>();
		hashMaphashMapInternationalShipCode=new HashMap<String,String>();
		hashMaphashMapfuneralservice=new HashMap<String,String>();
		hashMaphashMapfuneralfacilities=new HashMap<String,String>();
		hashMaphashMapfuneralsupplies=new HashMap<String,String>();
		hashMaphashMaptabaccoelectriccomponent=new HashMap<String,String>();
		hashMaphashMaptabaccomaterial=new HashMap<String,String>();
		hashMaphashMapNaturaldisaster=new HashMap<String,String>();
		hashMaphashMapsecurityaccounterments=new HashMap<String,String>();
		hashMaphashMaptextilefabricnamecode=new HashMap<String,String>();
		hashMaphashMappropertiesmainmaterial=new HashMap<String,String>();
		hashMaphashMappropertiesmain=new HashMap<String,String>();
		hashMaphashMappropertiesfibercharacteristics=new HashMap<String,String>();
		hashMaphashMappropertiesmixed=new HashMap<String,String>();
		hashMaphashMappropertiesfabric=new HashMap<String,String>();
		hashMaphashMappropertiesdyeingandfinishing=new HashMap<String,String>();
		hashMapmachinery8=new HashMap<String,String>();
		hashMaphashMapmachinery7=new HashMap<String,String>();
		hashMapmedicalInstrument=new HashMap<String,String>();
		hashMapgrainstechnicaleconomy=new HashMap<String,String>();
		hashMapGeographicalCode=new HashMap<String,String>();
		hashMapmeatandvegetable=new HashMap<String,String>();
		hashMapgrainequipment=new HashMap<String,String>();
		hashMapmachinery5=new HashMap<String,String>();
		hashMapprovinceadmincode=new HashMap<String,String>();
		hashMapgrainsinformation=new HashMap<String,String>();
		hashMapNuclearelementNation=new HashMap<String,String>();
		hashMapNuclearelements=new HashMap<String,String>();
		hashMapmachinery3=new HashMap<String,String>();
		hashMapmachinery4=new HashMap<String,String>();
		hashMapelectricpower=new HashMap<String,String>();
		hashMapeworkerhealthsupervision=new HashMap<String,String>();
		hashMapePesticideFormulationCode=new HashMap<String,String>();
		hashMapofficialposition=new HashMap<String,String>();
		hashMaproadtransportation22=new HashMap<String,String>();
		hashMapspecialvehicle=new HashMap<String,String>();
		hashMaproadtransportation41=new HashMap<String,String>();
		hashMapelectronicmap=new HashMap<String,String>();
		hashMaproadtransportation32=new HashMap<String,String>();
		hashMapcommunicationmediacode=new HashMap<String,String>();
		hashMapuntransportableproduct=new HashMap<String,String>();
		hashMapbarcodeforcommodity=new HashMap<String,String>();


		 hashMapClothesName = new HashMap<String, String>();
		 hashMapHydrologicData = new HashMap<String, String>();
		 hashMapgrainsSmartWMS = new HashMap<String, String>();
		 hashMapmachinery10 = new HashMap<String, String>();
		 hashMapcountryregioncode = new HashMap<String, String>();
		 hashMapgeographicinformation = new HashMap<String, String>();
		 hashMaptobaccoorganization = new HashMap<String, String>();
		 hashMappassengerCarCode = new HashMap<String, String>();
		 hashMapgrainsqualitystandard = new HashMap<String, String>();
		 hashMapmeasuringinstrument = new HashMap<String, String>();
		 hashMaphighwaydatabase47 = new HashMap<String, String>();
		 hashMapTCLBatteryProduct = new HashMap<String, String>();
		 hashMapProductCode = new HashMap<String, String>();
		 hashMapcivilaviation = new HashMap<String, String>();
		 hashMapLogisticsInf = new HashMap<String, String>();
		 hashMapwaterwaytransportation = new HashMap<String, String>();
		 hashMapmountainrangeandpeakname = new HashMap<String, String>();
		 hashMaptobaccoleafclass = new HashMap<String, String>();
		 hashMapintellectualproperty = new HashMap<String, String>();
		 hashMaphighwaytransportation4b1 = new HashMap<String, String>();
		 hashMaproadtransportation5 = new HashMap<String, String>();
		 hashMaphighwaytransportation = new HashMap<String, String>();
		 hashMaphighwaytransportation4b7 = new HashMap<String, String>();
		 hashMaphighwaytransportation4b10 = new HashMap<String, String>();
		 hashMapporttariff26 = new HashMap<String, String>();
		 hashMapporttariff3 = new HashMap<String, String>();
		 hashMapLogisticsoperation = new HashMap<String, String>();
		 hashMapphysicalactivityfrequency = new HashMap<String, String>();
		 hashMaphygieneagencypersonnel = new HashMap<String, String>();
		 hashMaptobaccomaterials = new HashMap<String, String>();
		 hashMapInternetWebService = new HashMap<String, String>();
		 hashMaproadtransportation64 = new HashMap<String, String>();
		 hashMaproadtransportation63 = new HashMap<String, String>();
		 hashMapdrinkingclass = new HashMap<String, String>();
		 hashMapdrinkingfrequency = new HashMap<String, String>();
		 hashMapgrainconditiondetection = new HashMap<String, String>();
		 hashMaptrafficinformationcollection = new HashMap<String, String>();
		 hashMapelectricpowerindustry = new HashMap<String, String>();
		 hashMappowergoodsp2 = new HashMap<String, String>();
		 hashMapTravleDocumentCode = new HashMap<String, String>();
		 hashMaproadtransportation60 = new HashMap<String, String>();
		 hashMapFireInfomation = new HashMap<String, String>();
		 hashMaptobaccoleafcolor = new HashMap<String, String>();
		 hashMapgrainsattribute = new HashMap<String, String>();
		 hashMapNavigationShip = new HashMap<String, String>();
		 hashMapTheCenteralPartyCommitte = new HashMap<String, String>();
		 hashMapporttariff10 = new HashMap<String, String>();
		 hashMappowergrid = new HashMap<String, String>();
		 hashmapmeasureunit=new HashMap<String , String>();
         hashpharmaceuticalmachinery=new HashMap<String , String>();
		
	}
	
	//added by sq
	//2014-08-28
	public String DBreadIoTIDTypesAndRules(
			HashMap<String, Integer> hashMapTypeSampleNumber,
			HashMap<String, String> hashMapTypeToLengthRule,
			HashMap<String, ArrayList<String>> hashMapTypeToByteRule,
			HashMap<String, String[]> hashMapTypeToFunctionRule) {
		Connection connection = JdbcUtilsRandom.getConnection();
		
		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection.prepareStatement(RecoUtilRandom.SELECT_TYPEANDRULES);
			results = stmt.executeQuery();
           
			while (results.next()) {
				
				ArrayList<String> ByteRules = new ArrayList<String>();// 字节规则列表
				String[] FunctionRules;// 函数规则列表
				String idType = results.getString("id");
				
				String lengthRule = results.getString("length");
				
				String byteRule = results.getString("byte");
				
				String functionRules = results.getString("function");
				

				int Number = results.getInt("number");
				hashMapTypeSampleNumber.put(idType, Number);
				

				// process the length rule
				if (lengthRule.length() > 0) {
					lengthRule = "IoTIDLength)(?#PARA=" + lengthRule + "){]";
					hashMapTypeToLengthRule.put(idType, lengthRule);
				}

				// process the byte rule
				if (byteRule.length() > 0) {
					String[] byteStrArray = byteRule.split(";");
					int ByteLength = byteStrArray.length;
					for (int i = 0; i < ByteLength; i++) {
						byteStrArray[i] = "IoTIDByte)(?#PARA="
								+ byteStrArray[i] + "){]";
						ByteRules.add(byteStrArray[i]);
					}
					hashMapTypeToByteRule.put(idType, ByteRules);
				}

				// at last, process the function rule
				if (functionRules.length() > 0) {
					String[] splitFunctionRules = functionRules
							.split("\\(\\?\\#ALGNAME=");
					int FunctionLength = splitFunctionRules.length;
					FunctionRules = new String[FunctionLength - 1];
					for (int i = 1; i < FunctionLength; i++) {
						if (splitFunctionRules[i].length() != 0) {
							FunctionRules[i - 1] = splitFunctionRules[i];
						}
					}
					hashMapTypeToFunctionRule.put(idType, FunctionRules);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtilsRandom.free(null, null, connection);
		}
		return "OK";
	}

	// added by sq on 0829
	public static HashMap<String, String> TypetoTableName() {
		HashMap<String, String> typetoTablename = new HashMap<String, String>();
		Connection connection = JdbcUtilsRandom.getConnection4Test();

		PreparedStatement stmt = null;
		ResultSet results = null;
		try {
			stmt = connection
					.prepareStatement(RecoUtilRandom.SELECT_TYPETONAME);
			results = stmt.executeQuery();

			while (results.next()) {
				String type = results.getString("type");
				String tablename = results.getString("tablename");
				typetoTablename.put(type, tablename);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtilsRandom.free(null, null, connection);
		}
		return typetoTablename;
	}
	
	public static HashMap<Integer,String> testSamples(String type)
	{
		HashMap<Integer,String> Samples=new HashMap<Integer,String>();
		Connection connection = JdbcUtilsRandom.getConnection4Test();

		PreparedStatement stmt = null;
		ResultSet results = null;
		String sql="";
		sql="select * from "+type;
		try {
			stmt = connection
					.prepareStatement(sql);
			results = stmt.executeQuery();

			while (results.next()) {
				int index = results.getInt("id");
				String code = results.getString("code");
				Samples.put(index, code);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtilsRandom.free(null, null, connection);
		}
		return Samples;
	}
	
	
	
	

	
	

}