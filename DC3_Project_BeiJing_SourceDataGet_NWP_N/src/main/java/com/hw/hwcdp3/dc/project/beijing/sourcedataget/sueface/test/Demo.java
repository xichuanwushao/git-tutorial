package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.test;

import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.publiccode.SurfaceDataSelect;

import grpc.cma.cimiss2.music.comm.ApiException;
import grpc.cma.cimiss2.music.comm.DBType;
import grpc.cma.cimiss2.music.pb.common.RetArray2D;
import grpc.cma.cimiss2.music.query.client.SurfQueryGrpcClient;

public class Demo {
    public static void main(String[] args) {
        String dataCode = "SURF_CHN_MUL";
        String elements =
                "TWO_AVE_WD," +   //记录主键
                        "TWO_AVE_WS," +     //资料标识
                        "TEN_AVE_WD," +    //入库时间
                        "TEN_AVE_WS," +    //资料时间
                        "MINITE_RA," +//区站号(字符)
                        "HOUR_RA," +//区站号(数字)
                        "TGRASS";//经度
        String eleValueRanges = "TAVE:(5,30)";
        String limitCnt = "";
        String orderBy = "TAVE:asc";
        String times = "20191210100000";
        String staLevels = "3";
        SurfaceDataSelect surface = new SurfaceDataSelect("10.224.47.203", 8888);
//		RetArr2D ret =  surface.getSurfEleByTime(elements, times, staLevels);
        RetArr2D ret = surface.getSurfEleByTime(dataCode, elements, eleValueRanges, limitCnt, orderBy, times, "1", "1", staLevels);
        System.out.println("返回的记录数--" + ret.getDataCount() + "条");
        for (int i = 0; i < ret.getDataCount(); i++) {
            System.out.println(ret.getData(i));
        }
    }
}
