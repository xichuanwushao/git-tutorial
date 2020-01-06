package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.publiccode;

import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SurfaceDataSelectGrpc;
import com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SurfaceDataSelectGrpc.SurfaceDataSelectBlockingStub;

import grpc.cma.cimiss2.music.query.utils.GrpcClient;

public class SurfaceDataSelect extends GrpcClient
{
	private SurfaceDataSelectBlockingStub stub;

	public SurfaceDataSelect(String host, int port)
	{
		super(host, port);
		stub = SurfaceDataSelectGrpc.newBlockingStub(channel);
	}

	public RetArr2D getSurfEleByTimeAndStaID(String elements, String times, String staLevels,String staIds)
	{
		GetSurfEleByTimeAndStaIDRequest.Builder request = GetSurfEleByTimeAndStaIDRequest.newBuilder();
		request.setElements(elements);
		request.setStaIds(staIds);
		request.setTimes(times);
		request.setStaLevels(staLevels);

		GetSurfEleByTimeResponse response = stub.getSurfEleByTimeAndStaID(request.build());
		return response.getData();
	}
	
	public RetArr2D getSurfEleByTime(String elements, String times, String staLevels)
	{
		GetSurfEleByTimeRequest.Builder request = GetSurfEleByTimeRequest.newBuilder();
		request.setElements(elements);
		request.setTimes(times);
		request.setStaLevels(staLevels);

		
		GetSurfEleByTimeResponse response = stub.getSurfEleByTime(request.build());
		return response.getData();
	}
	public RetArr2D getSurfEleByTime(String dataCode,String elements,String eleValueRanges,String times,String staLevels)
	{
		String limitCnt ="";
		String orderBy ="";
		String minSeparate ="";
		GetSurfEleByTimeRequest.Builder request = GetSurfEleByTimeRequest.newBuilder();
			request.setDataCode(dataCode);
			request.setElements(elements);
	        request.setEleValueRanges(eleValueRanges);
	        request.setLimitCnt(limitCnt);
	        request.setOrderBy(orderBy);
	        request.setTimes(times);
	        request.setMinSeparate(minSeparate);
//	        request.setHourSeparate(hourSeparate);
	        request.setStaLevels(staLevels).build();


		
		GetSurfEleByTimeResponse response = stub.getSurfEleByTime(request.build());
		return response.getData();
	}
	public RetArr2D getSurfEleByTime(String dataCode,String elements,String eleValueRanges,String limitCnt,String orderBy,String times, String minSeparate,String hourSeparate,String staLevels)
	{
		    GetSurfEleByTimeRequest.Builder request = GetSurfEleByTimeRequest.newBuilder();
			request.setDataCode(dataCode);
			request.setElements(elements);
	        request.setEleValueRanges(eleValueRanges);
	        request.setLimitCnt(limitCnt);
	        request.setOrderBy(orderBy);
	        request.setTimes(times);
	        request.setMinSeparate(minSeparate);
	        request.setHourSeparate(hourSeparate);
	        request.setStaLevels(staLevels).build();


		
		GetSurfEleByTimeResponse response = stub.getSurfEleByTime(request.build());
		return response.getData();
	}
}
