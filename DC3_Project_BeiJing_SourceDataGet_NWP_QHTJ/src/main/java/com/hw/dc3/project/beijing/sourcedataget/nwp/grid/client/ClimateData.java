package com.hw.dc3.project.beijing.sourcedataget.nwp.grid.client;

import com.hw.hwcdp3.grpc.thridparty.rihang.climate.ClimateProtoGrpc;
import com.hw.hwcdp3.grpc.thridparty.rihang.climate.ClimateProtoGrpc.ClimateProtoBlockingStub;
import com.hw.hwcdp3.grpc.thridparty.rihang.climate.GetClimateQhtjRequest;
import com.hw.hwcdp3.grpc.thridparty.rihang.climate.RepEntity;
import com.hw.hwcdp3.grpc.utils.GrpcClient;

public class ClimateData extends GrpcClient {
    private ClimateProtoBlockingStub stub;

    public ClimateData(String host, int port) {
        super(host, port);
        stub = ClimateProtoGrpc.newBlockingStub(channel);
    }

    public String getClimateQhtjCgtj(String startTime, String endTime, String elename, String siteInfo) {
        GetClimateQhtjRequest.Builder request = GetClimateQhtjRequest.newBuilder();
        request.setStartTime(startTime);
        request.setEndTime(endTime);
        request.setElename(elename);
        request.setSiteInfo(siteInfo);

        RepEntity entity = stub.getClimateQhtjCgtj(request.build());
        return entity.getData();
    }
}
