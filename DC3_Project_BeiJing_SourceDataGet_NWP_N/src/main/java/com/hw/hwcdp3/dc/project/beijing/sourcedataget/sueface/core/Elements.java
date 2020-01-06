package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.core;


public class Elements {
	public static final  String dataCode_3_03="SURF_CHN_MUL_MIN";
	public static final  String dataCode_3_04="SURF_CHN_MUL_MIN_NQ";
	public static final  String dataCode_3_05="SURF_CHN_MIN_BUFR";
	public static final  String dataCode_3_06="SURF_CHN_MIN_BUFR_NQ";
	public static final  String dataCode_3_07="SURF_CHN_PRE_MIN";
	public static final  String dataCode_3_08="SURF_CHN_PRE_MIN_NQ";
	public static final  String dataCode_3_09="SURF_CHN_PERF_PRE_MIN";
	public static final  String dataCode_3_10="SURF_CHN_PERF_PRE_MIN_NQ";
	public static final  String dataCode_3_11="SURF_CHN_PRE_MIN_BUFR";
	public static final  String dataCode_3_12="SURF_CHN_PRE_MIN_BUFR_NQ";
	public static final  String dataCode_3_13="SURF_CHN_MUL_HOR";
	public static final  String dataCode_3_14="SURF_CHN_MUL_HOR_NQ";
	public static final  String dataCode_3_15="SURF_CHN_MUL_HOR_BUFR";
	public static final  String dataCode_3_16="SURF_CHN_MUL_HOR_BUFR_NQ";
	public static final  String dataCode_3_17="SURF_CHN_MUL_HOR_PERF";
	public static final  String dataCode_3_18="SURF_CHN_MUL_HOR_PERF_NQ";
	public static final  String dataCode_3_19="SURF_CHN_MUL_DAY_BJ_NQ";
	public static final  String dataCode_3_20="SURF_CHN_SSD_HOR_NQ";
	public static final  String dataCode_3_21="SURF_WEA_CBF_SSD_HOR_TAB";
	public static final  String dataCode_3_22="SURF_WEA_CBF_SSD_HOR_TAB_NQ";
	public static final  String dataCode_3_23="SURF_CHN_WSET_FTM_BUFR";
	public static final  String dataCode_3_24="SURF_CHN_WSET_FTM_BUFR_NQ";
	public static final  String dataCode_3_25="SURF_WEA_RTA_BJ";
	public static final  String dataCode_3_26="SURF_WEA_RA_BJ";
	public static final  String dataCode_3_27="SURF_CHN_MUL_PEN";
	public static final  String dataCode_3_28="SURF_CHN_MUL_TEN";
	public static final  String dataCode_3_29="SURF_WEA_CHN_PHE_HOR";
	public static final  String dataCode_3_30="SURF_CHN_TRAFW_MUL";
	public static final  String dataCode_3_31="SURF_TRAFW_MUL_MIN";
	public static final  String dataCode_3_32="SURF_TRAFW_MUL_PRE";
	public static final  String dataCode_3_33="SURF_PRE_MON_BJ";
	public static final  String dataCode_3_34="SURF_CHN_WATER_PRE";
	public static final  String dataCode_3_35="SURF_BJ_TRAFW_MUL";
	public static final  String dataCode_3_36="SURF_BJ_TRAFW_PRE";
	public static final  String dataCode_3_37="SURF_BJ_ANION";
	public static String minLat="39.6631";
	public static String maxLat="40.6269";
	public static String minLon="115.9833";
	public static String maxLon="117.2503";
	public static String minStaId="A1220";//651220
	public static String maxStaId="A1682";//651682
	public static String staIds="A1220,A1275,A1349,A1350,A1446,A1467,A1679,A1680,A1681,A1682";
	public static String times ="20191209160000";
	public static String orderBy ="RECORD_ID:asc";
	public static String timeRange="[2019120816000000,2019120916020000)";
	public static String elements_3_03 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE"+//经度
					"WIN_D_Avg_2mi"+//经度
					"WIN_S_Avg_2mi";//经度
	public static String elements_3_04 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE"+//经度
					"WIN_D_Avg_2mi"+//经度
					"WIN_S_Avg_2mi";//经度
	public static String elements_3_05 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"DPT,"+//经度
					"TEM";//经度
	public static String elements_3_06 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"TEM"+//经度
					"WIN_D_Avg_2mi"+//经度
					"WIN_S_Avg_2mi";//经度
	public static String elements_3_07 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_08 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_09 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_10 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_11 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_12 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE";//经度
	public static String elements_3_13 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_1h,"+//经度
					"PRE_24h";//经度
	public static String elements_3_14 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_1h,"+//经度
					"PRE_24h";//经度
	public static String elements_3_15 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"RHU,"+//经度
					"TEM,"+//经度
					"TEM,"+//经度
					"WIN_D_Inst_Max_6h,"+//经度
					"WIN_D_Inst_Max_12h";//小时降水量
	public static String elements_3_16 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_1h,"+//经度
					"PRE_3h,"+//经度
					"PRE_6h";//小时降水量
	public static String elements_3_17 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_1h,"+//经度
					"PRE_24h";//经度
	public static String elements_3_18 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_1h,"+//经度
					"PRE_24h";//经度
	public static String elements_3_19 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"EICE_TEM";//经度
	public static String elements_3_20 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"SSH_Time_0001,"+//经度
					"SSH_Time_0102,"+//经度
					"SSH";//小时降水量
	public static String elements_3_21 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"SSH_Time_0001,"+//经度
					"SSH_Time_0102,"+//经度
					"SSH";//小时降水量
	public static String elements_3_22 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"SSH_Time_0001,"+//经度
					"SSH_Time_0102,"+//经度
					"SSH";//小时降水量
	public static String elements_3_23 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_3h,"+//经度
					"WIN_D_INST_Max,"+//经度
					"PRE_6h";//小时降水量
	public static String elements_3_24 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_6h,"+//经度
					"PRE_3h,"+//经度
					"PRE_1h";//小时降水量
	public static String elements_3_25 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"WIN_S_Avg_10mi,"+//经度
					"WIN_D_Avg_10mi,"+//经度
					"rainstate";//小时降水量
	public static String elements_3_26 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"WIN_S_Avg_10mi,"+//经度
					"WIN_D_Avg_10mi,"+//经度
					"rainstate";//小时降水量
	public static String elements_3_27 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_Time_2020,"+//经度
					"PRE_Time_0808,"+//经度
					"SPRE_Time_2020"+//小时降水量
					"SPRE_Time_0808";//小时降水量
	public static String elements_3_28 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"PRE_Time_2020,"+//经度
					"PRE_Time_0808,"+//经度
					"SPRE_Time_2020"+//小时降水量
					"SPRE_Time_0808";//小时降水量
	public static String elements_3_29 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"CLO_Cov,"+//经度
					"CLO_Height_LoM";//小时降水量
	public static String elements_3_30 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"WIN_D_Avg_2mi,"+//经度
					"WIN_S_Avg_2mi,"+//经度
					"PRE_1h";//小时降水量
	public static String elements_3_31 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"WIN_D_Avg_2mi,"+//经度
					"WIN_S_Avg_2mi,"+//经度
					"PRE_1h";//小时降水量
	public static String elements_3_32 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"WIN_D_Avg_2mi,"+//经度
					"WIN_S_Avg_2mi,"+//经度
					"PRE";//小时降水量
	public static String elements_3_33 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//纬度
					"Lon,"+//经度
					"WIN_D_Avg_2mi,"+//经度
					"WIN_S_Avg_2mi,"+//经度
					"PRE";//小时降水量
	public static String elements_3_34 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"PRE_1h";//小时降水量
	public static String elements_3_35 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"WIN_D_Avg_2mi,"+//经度
					"WIN_S_Avg_2mi,"+//经度
					"PRE_1h";//小时降水量
	public static String elements_3_36 = 
			"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"Station_Id_d,"+//区站号(数字)
					"Lat,"+//区站号(数字)
					"Lon,"+//区站号(数字)
					"PRE_1h,"+//经度
					"PRE,"+//经度
					"Alti";//小时降水量
	public static String elements_3_37 = 
				 	"RECORD_ID,"+   //记录主键
					"DATA_ID,"+     //资料标识
					"UPDATE_TIME,"+	//入库时间
					"Datetime,"+    //资料时间
					"Station_Id_C,"+//区站号(字符)
					"positiveions";//小时降水量
}