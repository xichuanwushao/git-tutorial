package com.mirson.service;

import com.mirson.grpc.lib.StockServiceGrpc;
import com.mirson.grpc.lib.StockServiceReply;
import com.mirson.grpc.lib.StockServiceRequest;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {
    @GrpcClient("grpc-server")
    private StockServiceGrpc.StockServiceBlockingStub stockServiceStub;

    public String getStockPrice(final String name) {
        try {
            final StockServiceReply response = stockServiceStub.getStockPrice(StockServiceRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            e.printStackTrace();
            return "error!";
        }
    }
}
