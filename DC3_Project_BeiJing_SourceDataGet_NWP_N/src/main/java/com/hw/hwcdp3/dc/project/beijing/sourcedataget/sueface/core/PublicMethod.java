package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.core;

import grpc.cma.cimiss2.music.comm.ApiException;
import grpc.cma.cimiss2.music.comm.DBType;
import grpc.cma.cimiss2.music.pb.common.RetArray2D;
import grpc.cma.cimiss2.music.query.client.SurfQueryGrpcClient;
import grpc.cma.cimiss2.music.utils.MusicQueryGrpcUtil;

public class PublicMethod {
	public static final SurfQueryGrpcClient client = new SurfQueryGrpcClient("10.224.47.203",9898);
	
	public void getSurfEleByTime(String times,String elements, String dataCode)
	 {
		DBType dbType = DBType.STDB;
	    String orderBy ="Station_Id_C:asc";
	   try {
		   RetArray2D ret = client.getSurfEleByTime(dataCode, null, times, elements,null , null, orderBy, null, false, null);
		   System.out.println("按时间检索地面数据要素"+dataCode+"_getSurfEleByTime"+" 一共返回"+ret.getDataCount()+"条记录");
		   for(int i=0;i<ret.getDataCount();i++)
		   {
			   System.out.println(ret.getData(i));
		   }
		  } catch (ApiException e) {
			  System.out.println(e.getCode()+e.getMessage());
		  }
	 } 
	
	
	public  void getSurfEleInRectByTime(String times,String elements, String dataCode,String minLat,String minLon,String maxLat,String maxLon)
	{
		DBType dbType = DBType.STDB;
		String limitCnt="100";
			try {
			RetArray2D ret  = client.getSurfEleInRectByTime(dataCode, dbType, times, elements, minLat, minLon, maxLat, maxLon, null, null, null, limitCnt);
			System.out.println("按时间、经纬度范围检索地面数据要素"+dataCode+"_getSurfEleInRectByTime"+" 一共返回"+ret.getDataCount()+"条记录");
			for(int i=0;i<ret.getDataCount();i++)
		    {
				   System.out.println(ret.getData(i));
		    }
		} catch (ApiException e) {
				System.out.println(e.getCode()+e.getMessage());
		}
	}
	//3.2.3按时间、站号段检索地面数据要素（getSurfEleByTimeAndStaIdRange）
		public  void getSurfEleByTimeAndStaIdRange(String times,String elements, String dataCode,String minStaId,String maxStaId)
		{
			  DBType dbType = DBType.STDB;
			  String limitCnt="100";
			  try {
					RetArray2D ret = client.getSurfEleByTimeAndStaIdRange(dataCode, dbType, times, elements, minStaId, maxStaId, null, null, limitCnt);
					System.out.println("按时间、站号段检索地面数据要素"+dataCode+"_getSurfEleByTimeAndStaIdRange"+" 一共返回"+ret.getDataCount()+"条记录");
				   for(int i=0;i<ret.getDataCount();i++)
				   {
					   System.out.println(ret.getData(i));
				   }
				} catch (ApiException e) {
					System.out.println(e.getCode()+e.getMessage());
				}
		}
		
		
	public  void getSurfEleByTimeAndStaID(String times,String elements, String dataCode,String staIds)
	{
		  DBType dbType = DBType.STDB;
		  //区域分钟
		  String limitCnt="100";
		  try {
		   RetArray2D ret  = client.getSurfEleByTimeAndStaID(dataCode, dbType, times, elements, staIds, null, null, null, limitCnt);
		   System.out.println("按时间、站号检索地面数据要素"+dataCode+"_getSurfEleByTimeAndStaID"+" 一共返回"+ret.getDataCount()+"条记录");
		   for(int i=0;i<ret.getDataCount();i++)
		   {
		    System.out.println(ret.getData(i));
		   }
		  } catch (ApiException e) {
		   System.out.println(e.getCode()+e.getMessage());
		  }
	}
	
	public  void getSurfEleByTimeRange(String times,String elements, String dataCode,String timeRange)
	{
		  DBType dbType = DBType.STDB;
		  String orderBy ="RECORD_ID:asc";
		  //区域分钟
			try {
				RetArray2D ret =	client.getSurfEleByTimeRange(dataCode, dbType, timeRange, elements, null, null, orderBy, null);
				 System.out.println("按时间段检索地面数据要素"+dataCode+"_getSurfEleByTimeRange"+" 一共返回"+ret.getDataCount()+"条记录");
				 for(int i=0;i<ret.getDataCount();i++)
				   {
				    System.out.println(ret.getData(i));
				   }
			} catch (ApiException e) {
				System.out.println(e.getCode()+e.getMessage());
			}
	}
	
	
	//3.2.6按时间段、经纬度范围检索地面要素资料（getSurfEleInRectByTimeRange）
		public  void getSurfEleInRectByTimeRange(String times,String elements, String dataCode,String timeRange,String minLat,String minLon,String maxLat,String maxLon)
		{
			 String orderBy ="RECORD_ID:asc";
			  DBType dbType = DBType.STDB;
			  //区域分钟
				try {
					RetArray2D ret  =  client.getSurfEleInRectByTimeRange(dataCode, dbType, timeRange, elements, minLon, maxLon, minLat, maxLat, null, orderBy, null);
					System.out.println("按时间段、经纬度范围检索地面要素资料"+dataCode+"_getSurfEleInRectByTimeRange"+" 一共返回"+ret.getDataCount()+"条记录"); 
					for(int i=0;i<ret.getDataCount();i++)
					{
					    System.out.println(ret.getData(i));
					}
				} catch (ApiException e) {
					System.out.println(e.getCode()+e.getMessage());
				}
		}
		
		
		
		public  void getSurfEleByTimeRangeAndStaID(String times,String elements, String dataCode,String timeRange,String staIds)
		{
			  DBType dbType = DBType.STDB;
			  //区域分钟
				String limitCnt="100";
				try {
					RetArray2D ret = client.getSurfEleByTimeRangeAndStaID(dataCode, dbType, timeRange, elements, null, null, staIds, null, null, limitCnt);
					System.out.println("按时间段、站号检索地面数据要素"+dataCode+"_getSurfEleByTimeRangeAndStaID"+" 一共返回"+ret.getDataCount()+"条记录"); 
					for(int i=0;i<ret.getDataCount();i++)
					{
					    System.out.println(ret.getData(i));
					}
				} catch (ApiException e) {
					System.out.println(e.getCode()+e.getMessage());
				}
		}
		
		public  void getSurfEleByTimeRangeAndStaIDRange(String times,String elements, String dataCode,String timeRange,String minStaId,String maxStaId)
		{
			  DBType dbType = DBType.STDB;
			  //区域分钟
				String limitCnt="100";
				try {
					RetArray2D ret = client.getSurfEleByTimeRangeAndStaIDRange(dataCode, dbType, timeRange, elements, maxStaId, minStaId, null, null, null, null, limitCnt);
					System.out.println("按时间段、站号段检索地面数据要素"+dataCode+"_getSurfEleByTimeRangeAndStaIDRange"+" 一共返回"+ret.getDataCount()+"条记录"); 
					for(int i=0;i<ret.getDataCount();i++)
					{
					    System.out.println(ret.getData(i));
					}
				} catch (ApiException e) {
					System.out.println(e.getCode()+e.getMessage());
				}
		}
		
		public void getSurfLatestTimeTest(String elements, String dataCode)
		{
		  DBType dbType = DBType.STDB;
			String lastTime ="40";
			try {
				RetArray2D ret = client.getSurfLatestTime(dataCode, lastTime, dbType);
				System.out.println("获取资料最新时次"+dataCode+"_getSurfLatestTime"+" 一共返回"+ret.getDataCount()+"条记录"); 
				for(int i=0;i<ret.getDataCount();i++)
				   {
				    System.out.println(ret.getData(i));
				   }
			} catch (ApiException e) {
				e.printStackTrace();
			}
		}
}
