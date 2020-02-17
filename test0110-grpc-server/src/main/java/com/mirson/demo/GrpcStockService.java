package com.mirson.demo;


import com.mirson.grpc.lib.StockServiceGrpc;
import com.mirson.grpc.lib.StockServiceReply;
import com.mirson.grpc.lib.StockServiceRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Random;

@GrpcService
public class GrpcStockService extends StockServiceGrpc.StockServiceImplBase {
@Override
    public void getStockPrice(StockServiceRequest request, StreamObserver<StockServiceReply> responseObserver) {
        String msg = "股票名称:" + request.getName() + ", 股票价格:" + (new Random().nextInt(100-20)+20);
        StockServiceReply reply = StockServiceReply.newBuilder().setMessage(msg).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
