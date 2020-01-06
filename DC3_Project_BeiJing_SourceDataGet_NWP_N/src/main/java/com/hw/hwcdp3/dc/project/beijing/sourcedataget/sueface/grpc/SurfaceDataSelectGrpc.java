package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: surface.proto")
public final class SurfaceDataSelectGrpc {

  private SurfaceDataSelectGrpc() {}

  public static final String SERVICE_NAME = "surfaceDataSelect.SurfaceDataSelect";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetStationProByValidTimeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStationProByValidTimeRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetStationProByValidTimeRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetStationProByValidTimeRangeMethod;
    if ((getGetStationProByValidTimeRangeMethod = SurfaceDataSelectGrpc.getGetStationProByValidTimeRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetStationProByValidTimeRangeMethod = SurfaceDataSelectGrpc.getGetStationProByValidTimeRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetStationProByValidTimeRangeMethod = getGetStationProByValidTimeRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetStationProByValidTimeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetStationProByValidTimeRange"))
                  .build();
          }
        }
     }
     return getGetStationProByValidTimeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTime",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeMethod;
    if ((getGetSurfEleByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeMethod = getGetSurfEleByTimeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTime"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInRectByTime",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeMethod;
    if ((getGetSurfEleInRectByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInRectByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeMethod = getGetSurfEleInRectByTimeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInRectByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInRectByTime"))
                  .build();
          }
        }
     }
     return getGetSurfEleInRectByTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTimeAndStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDMethod;
    if ((getGetSurfEleByTimeAndStaIDMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeAndStaIDMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDMethod = getGetSurfEleByTimeAndStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTimeAndStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTimeAndStaID"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeAndStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTimeAndStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeAndStaIDRangeMethod;
    if ((getGetSurfEleByTimeAndStaIDRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeAndStaIDRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeAndStaIDRangeMethod = getGetSurfEleByTimeAndStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTimeAndStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTimeAndStaIDRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeAndStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInRegionByTime",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeMethod;
    if ((getGetSurfEleInRegionByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInRegionByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeMethod = getGetSurfEleInRegionByTimeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInRegionByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInRegionByTime"))
                  .build();
          }
        }
     }
     return getGetSurfEleInRegionByTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInBasinByTime",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeMethod;
    if ((getGetSurfEleInBasinByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInBasinByTimeMethod = SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeMethod = getGetSurfEleInBasinByTimeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInBasinByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInBasinByTime"))
                  .build();
          }
        }
     }
     return getGetSurfEleInBasinByTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTimeRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeMethod;
    if ((getGetSurfEleByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeMethod = getGetSurfEleByTimeRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTimeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTimeRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInRectByTimeRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRectByTimeRangeMethod;
    if ((getGetSurfEleInRectByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInRectByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInRectByTimeRangeMethod = getGetSurfEleInRectByTimeRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInRectByTimeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInRectByTimeRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleInRectByTimeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTimeRangeAndStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDMethod;
    if ((getGetSurfEleByTimeRangeAndStaIDMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeRangeAndStaIDMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDMethod = getGetSurfEleByTimeRangeAndStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTimeRangeAndStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTimeRangeAndStaID"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeRangeAndStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleByTimeRangeAndStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleByTimeRangeAndStaIDRangeMethod;
    if ((getGetSurfEleByTimeRangeAndStaIDRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleByTimeRangeAndStaIDRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleByTimeRangeAndStaIDRangeMethod = getGetSurfEleByTimeRangeAndStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleByTimeRangeAndStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleByTimeRangeAndStaIDRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleByTimeRangeAndStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInRegionByTimeRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInRegionByTimeRangeMethod;
    if ((getGetSurfEleInRegionByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInRegionByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInRegionByTimeRangeMethod = getGetSurfEleInRegionByTimeRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInRegionByTimeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInRegionByTimeRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleInRegionByTimeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSurfEleInBasinByTimeRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getGetSurfEleInBasinByTimeRangeMethod;
    if ((getGetSurfEleInBasinByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getGetSurfEleInBasinByTimeRangeMethod = SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeRangeMethod) == null) {
          SurfaceDataSelectGrpc.getGetSurfEleInBasinByTimeRangeMethod = getGetSurfEleInBasinByTimeRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "GetSurfEleInBasinByTimeRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("GetSurfEleInBasinByTimeRange"))
                  .build();
          }
        }
     }
     return getGetSurfEleInBasinByTimeRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEle",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleMethod;
    if ((getStatSurfEleMethod = SurfaceDataSelectGrpc.getStatSurfEleMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleMethod = SurfaceDataSelectGrpc.getStatSurfEleMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleMethod = getStatSurfEleMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEle"))
                  .build();
          }
        }
     }
     return getStatSurfEleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEleInRect",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRectMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRectMethod;
    if ((getStatSurfEleInRectMethod = SurfaceDataSelectGrpc.getStatSurfEleInRectMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleInRectMethod = SurfaceDataSelectGrpc.getStatSurfEleInRectMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleInRectMethod = getStatSurfEleInRectMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEleInRect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEleInRect"))
                  .build();
          }
        }
     }
     return getStatSurfEleInRectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEleByStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDMethod;
    if ((getStatSurfEleByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfEleByStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfEleByStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleByStaIDMethod = getStatSurfEleByStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEleByStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEleByStaID"))
                  .build();
          }
        }
     }
     return getStatSurfEleByStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEleByStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleByStaIDRangeMethod;
    if ((getStatSurfEleByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfEleByStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfEleByStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleByStaIDRangeMethod = getStatSurfEleByStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEleByStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEleByStaIDRange"))
                  .build();
          }
        }
     }
     return getStatSurfEleByStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEleInRegion",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRegionMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInRegionMethod;
    if ((getStatSurfEleInRegionMethod = SurfaceDataSelectGrpc.getStatSurfEleInRegionMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleInRegionMethod = SurfaceDataSelectGrpc.getStatSurfEleInRegionMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleInRegionMethod = getStatSurfEleInRegionMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEleInRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEleInRegion"))
                  .build();
          }
        }
     }
     return getStatSurfEleInRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInBasinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfEleInBasin",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInBasinMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfEleInBasinMethod;
    if ((getStatSurfEleInBasinMethod = SurfaceDataSelectGrpc.getStatSurfEleInBasinMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfEleInBasinMethod = SurfaceDataSelectGrpc.getStatSurfEleInBasinMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfEleInBasinMethod = getStatSurfEleInBasinMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfEleInBasin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfEleInBasin"))
                  .build();
          }
        }
     }
     return getStatSurfEleInBasinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPre",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreMethod;
    if ((getStatSurfPreMethod = SurfaceDataSelectGrpc.getStatSurfPreMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreMethod = SurfaceDataSelectGrpc.getStatSurfPreMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreMethod = getStatSurfPreMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPre"))
                  .build();
          }
        }
     }
     return getStatSurfPreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPreInRect",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRectMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRectMethod;
    if ((getStatSurfPreInRectMethod = SurfaceDataSelectGrpc.getStatSurfPreInRectMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreInRectMethod = SurfaceDataSelectGrpc.getStatSurfPreInRectMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreInRectMethod = getStatSurfPreInRectMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPreInRect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPreInRect"))
                  .build();
          }
        }
     }
     return getStatSurfPreInRectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPreByStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDMethod;
    if ((getStatSurfPreByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfPreByStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfPreByStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreByStaIDMethod = getStatSurfPreByStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPreByStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPreByStaID"))
                  .build();
          }
        }
     }
     return getStatSurfPreByStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPreByStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreByStaIDRangeMethod;
    if ((getStatSurfPreByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfPreByStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfPreByStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreByStaIDRangeMethod = getStatSurfPreByStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPreByStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPreByStaIDRange"))
                  .build();
          }
        }
     }
     return getStatSurfPreByStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPreInRegion",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRegionMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInRegionMethod;
    if ((getStatSurfPreInRegionMethod = SurfaceDataSelectGrpc.getStatSurfPreInRegionMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreInRegionMethod = SurfaceDataSelectGrpc.getStatSurfPreInRegionMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreInRegionMethod = getStatSurfPreInRegionMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPreInRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPreInRegion"))
                  .build();
          }
        }
     }
     return getStatSurfPreInRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInBasinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfPreInBasin",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInBasinMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfPreInBasinMethod;
    if ((getStatSurfPreInBasinMethod = SurfaceDataSelectGrpc.getStatSurfPreInBasinMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfPreInBasinMethod = SurfaceDataSelectGrpc.getStatSurfPreInBasinMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfPreInBasinMethod = getStatSurfPreInBasinMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfPreInBasin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfPreInBasin"))
                  .build();
          }
        }
     }
     return getStatSurfPreInBasinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTem",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemMethod;
    if ((getStatSurfTemMethod = SurfaceDataSelectGrpc.getStatSurfTemMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemMethod = SurfaceDataSelectGrpc.getStatSurfTemMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemMethod = getStatSurfTemMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTem"))
                  .build();
          }
        }
     }
     return getStatSurfTemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemInRect",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRectMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRectMethod;
    if ((getStatSurfTemInRectMethod = SurfaceDataSelectGrpc.getStatSurfTemInRectMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemInRectMethod = SurfaceDataSelectGrpc.getStatSurfTemInRectMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemInRectMethod = getStatSurfTemInRectMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemInRect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemInRect"))
                  .build();
          }
        }
     }
     return getStatSurfTemInRectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemByStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDMethod;
    if ((getStatSurfTemByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfTemByStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfTemByStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemByStaIDMethod = getStatSurfTemByStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemByStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemByStaID"))
                  .build();
          }
        }
     }
     return getStatSurfTemByStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemByStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByStaIDRangeMethod;
    if ((getStatSurfTemByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfTemByStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfTemByStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemByStaIDRangeMethod = getStatSurfTemByStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemByStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemByStaIDRange"))
                  .build();
          }
        }
     }
     return getStatSurfTemByStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemInRegion",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRegionMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInRegionMethod;
    if ((getStatSurfTemInRegionMethod = SurfaceDataSelectGrpc.getStatSurfTemInRegionMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemInRegionMethod = SurfaceDataSelectGrpc.getStatSurfTemInRegionMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemInRegionMethod = getStatSurfTemInRegionMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemInRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemInRegion"))
                  .build();
          }
        }
     }
     return getStatSurfTemInRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInBasinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemInBasin",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInBasinMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemInBasinMethod;
    if ((getStatSurfTemInBasinMethod = SurfaceDataSelectGrpc.getStatSurfTemInBasinMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemInBasinMethod = SurfaceDataSelectGrpc.getStatSurfTemInBasinMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemInBasinMethod = getStatSurfTemInBasinMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemInBasin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemInBasin"))
                  .build();
          }
        }
     }
     return getStatSurfTemInBasinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtm",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmMethod;
    if ((getStatSurfTemFtmMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmMethod = getStatSurfTemFtmMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtm"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtmInRect",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRectMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRectMethod;
    if ((getStatSurfTemFtmInRectMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInRectMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmInRectMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInRectMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmInRectMethod = getStatSurfTemFtmInRectMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtmInRect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtmInRect"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmInRectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtmByStaID",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDMethod;
    if ((getStatSurfTemFtmByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmByStaIDMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDMethod = getStatSurfTemFtmByStaIDMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtmByStaID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtmByStaID"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmByStaIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtmByStaIDRange",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDRangeMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmByStaIDRangeMethod;
    if ((getStatSurfTemFtmByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDRangeMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmByStaIDRangeMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDRangeMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmByStaIDRangeMethod = getStatSurfTemFtmByStaIDRangeMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtmByStaIDRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtmByStaIDRange"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmByStaIDRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtmInRegion",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRegionMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInRegionMethod;
    if ((getStatSurfTemFtmInRegionMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInRegionMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmInRegionMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInRegionMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmInRegionMethod = getStatSurfTemFtmInRegionMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtmInRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtmInRegion"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmInRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInBasinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemFtmInBasin",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInBasinMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemFtmInBasinMethod;
    if ((getStatSurfTemFtmInBasinMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInBasinMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemFtmInBasinMethod = SurfaceDataSelectGrpc.getStatSurfTemFtmInBasinMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemFtmInBasinMethod = getStatSurfTemFtmInBasinMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemFtmInBasin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemFtmInBasin"))
                  .build();
          }
        }
     }
     return getStatSurfTemFtmInBasinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByMYearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatSurfTemByMYear",
      requestType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest.class,
      responseType = com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest,
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByMYearMethod() {
    io.grpc.MethodDescriptor<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStatSurfTemByMYearMethod;
    if ((getStatSurfTemByMYearMethod = SurfaceDataSelectGrpc.getStatSurfTemByMYearMethod) == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        if ((getStatSurfTemByMYearMethod = SurfaceDataSelectGrpc.getStatSurfTemByMYearMethod) == null) {
          SurfaceDataSelectGrpc.getStatSurfTemByMYearMethod = getStatSurfTemByMYearMethod = 
              io.grpc.MethodDescriptor.<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surfaceDataSelect.SurfaceDataSelect", "StatSurfTemByMYear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurfaceDataSelectMethodDescriptorSupplier("StatSurfTemByMYear"))
                  .build();
          }
        }
     }
     return getStatSurfTemByMYearMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SurfaceDataSelectStub newStub(io.grpc.Channel channel) {
    return new SurfaceDataSelectStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SurfaceDataSelectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SurfaceDataSelectBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SurfaceDataSelectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SurfaceDataSelectFutureStub(channel);
  }

  /**
   */
  public static abstract class SurfaceDataSelectImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStationProByValidTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStationProByValidTimeRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInRectByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInRectByTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeAndStaIDMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeAndStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInRegionByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInRegionByTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInBasinByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInBasinByTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInRectByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInRectByTimeRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRangeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeRangeAndStaIDMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRangeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleByTimeRangeAndStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInRegionByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInRegionByTimeRangeMethod(), responseObserver);
    }

    /**
     */
    public void getSurfEleInBasinByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSurfEleInBasinByTimeRangeMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEle(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEleInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleInRectMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEleByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleByStaIDMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEleByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleByStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEleInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleInRegionMethod(), responseObserver);
    }

    /**
     */
    public void statSurfEleInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfEleInBasinMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPre(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPreInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreInRectMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPreByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreByStaIDMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPreByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreByStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPreInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreInRegionMethod(), responseObserver);
    }

    /**
     */
    public void statSurfPreInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfPreInBasinMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTem(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemInRectMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemByStaIDMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemByStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemInRegionMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemInBasinMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtm(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmInRectMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtmByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmByStaIDMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtmByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmByStaIDRangeMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmInRegionMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemFtmInBasinMethod(), responseObserver);
    }

    /**
     */
    public void statSurfTemByMYear(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatSurfTemByMYearMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStationProByValidTimeRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_STATION_PRO_BY_VALID_TIME_RANGE)))
          .addMethod(
            getGetSurfEleByTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME)))
          .addMethod(
            getGetSurfEleInRectByTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_RECT_BY_TIME)))
          .addMethod(
            getGetSurfEleByTimeAndStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME_AND_STA_ID)))
          .addMethod(
            getGetSurfEleByTimeAndStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME_AND_STA_IDRANGE)))
          .addMethod(
            getGetSurfEleInRegionByTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_REGION_BY_TIME)))
          .addMethod(
            getGetSurfEleInBasinByTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME)))
          .addMethod(
            getGetSurfEleByTimeRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME_RANGE)))
          .addMethod(
            getGetSurfEleInRectByTimeRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_RECT_BY_TIME_RANGE)))
          .addMethod(
            getGetSurfEleByTimeRangeAndStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_ID)))
          .addMethod(
            getGetSurfEleByTimeRangeAndStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_IDRANGE)))
          .addMethod(
            getGetSurfEleInRegionByTimeRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_REGION_BY_TIME_RANGE)))
          .addMethod(
            getGetSurfEleInBasinByTimeRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME_RANGE)))
          .addMethod(
            getStatSurfEleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE)))
          .addMethod(
            getStatSurfEleInRectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE_IN_RECT)))
          .addMethod(
            getStatSurfEleByStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE_BY_STA_ID)))
          .addMethod(
            getStatSurfEleByStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE_BY_STA_IDRANGE)))
          .addMethod(
            getStatSurfEleInRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE_IN_REGION)))
          .addMethod(
            getStatSurfEleInBasinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_ELE_IN_BASIN)))
          .addMethod(
            getStatSurfPreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE)))
          .addMethod(
            getStatSurfPreInRectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE_IN_RECT)))
          .addMethod(
            getStatSurfPreByStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE_BY_STA_ID)))
          .addMethod(
            getStatSurfPreByStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE_BY_STA_IDRANGE)))
          .addMethod(
            getStatSurfPreInRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE_IN_REGION)))
          .addMethod(
            getStatSurfPreInBasinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_PRE_IN_BASIN)))
          .addMethod(
            getStatSurfTemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM)))
          .addMethod(
            getStatSurfTemInRectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_IN_RECT)))
          .addMethod(
            getStatSurfTemByStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_BY_STA_ID)))
          .addMethod(
            getStatSurfTemByStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_BY_STA_IDRANGE)))
          .addMethod(
            getStatSurfTemInRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_IN_REGION)))
          .addMethod(
            getStatSurfTemInBasinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_IN_BASIN)))
          .addMethod(
            getStatSurfTemFtmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM)))
          .addMethod(
            getStatSurfTemFtmInRectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM_IN_RECT)))
          .addMethod(
            getStatSurfTemFtmByStaIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM_BY_STA_ID)))
          .addMethod(
            getStatSurfTemFtmByStaIDRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM_BY_STA_IDRANGE)))
          .addMethod(
            getStatSurfTemFtmInRegionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM_IN_REGION)))
          .addMethod(
            getStatSurfTemFtmInBasinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_FTM_IN_BASIN)))
          .addMethod(
            getStatSurfTemByMYearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest,
                com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>(
                  this, METHODID_STAT_SURF_TEM_BY_MYEAR)))
          .build();
    }
  }

  /**
   */
  public static final class SurfaceDataSelectStub extends io.grpc.stub.AbstractStub<SurfaceDataSelectStub> {
    private SurfaceDataSelectStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurfaceDataSelectStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurfaceDataSelectStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurfaceDataSelectStub(channel, callOptions);
    }

    /**
     */
    public void getStationProByValidTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStationProByValidTimeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInRectByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInRectByTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeAndStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeAndStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInRegionByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInRegionByTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInBasinByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInBasinByTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInRectByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInRectByTimeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRangeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeAndStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleByTimeRangeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeAndStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInRegionByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInRegionByTimeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSurfEleInBasinByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSurfEleInBasinByTimeRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEle(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEleInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleInRectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEleByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleByStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEleByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleByStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEleInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleInRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfEleInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfEleInBasinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPre(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPreInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreInRectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPreByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreByStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPreByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreByStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPreInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreInRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfPreInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfPreInBasinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTem(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemInRectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemByStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemByStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemInRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemInBasinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtm(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInRectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtmByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmByStaIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtmByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmByStaIDRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemFtmInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInBasinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statSurfTemByMYear(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest request,
        io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatSurfTemByMYearMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SurfaceDataSelectBlockingStub extends io.grpc.stub.AbstractStub<SurfaceDataSelectBlockingStub> {
    private SurfaceDataSelectBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurfaceDataSelectBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurfaceDataSelectBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurfaceDataSelectBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getStationProByValidTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStationProByValidTimeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInRectByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInRectByTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTimeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeAndStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTimeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeAndStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInRegionByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInRegionByTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInBasinByTime(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInBasinByTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInRectByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInRectByTimeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTimeRangeAndStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeRangeAndStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleByTimeRangeAndStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleByTimeRangeAndStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInRegionByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInRegionByTimeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getSurfEleInBasinByTimeRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSurfEleInBasinByTimeRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEle(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEleInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleInRectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEleByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleByStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEleByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleByStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEleInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleInRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfEleInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfEleInBasinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPre(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPreInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreInRectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPreByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreByStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPreByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreByStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPreInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreInRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfPreInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfPreInBasinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTem(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemInRectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemByStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemByStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemInRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemInBasinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtm(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtmInRect(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmInRectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtmByStaID(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmByStaIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtmByStaIDRange(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmByStaIDRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtmInRegion(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmInRegionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemFtmInBasin(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemFtmInBasinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse statSurfTemByMYear(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatSurfTemByMYearMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SurfaceDataSelectFutureStub extends io.grpc.stub.AbstractStub<SurfaceDataSelectFutureStub> {
    private SurfaceDataSelectFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurfaceDataSelectFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurfaceDataSelectFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurfaceDataSelectFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getStationProByValidTimeRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStationProByValidTimeRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTime(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInRectByTime(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInRectByTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTimeAndStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeAndStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTimeAndStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeAndStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInRegionByTime(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInRegionByTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInBasinByTime(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInBasinByTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTimeRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInRectByTimeRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInRectByTimeRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTimeRangeAndStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeAndStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleByTimeRangeAndStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleByTimeRangeAndStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInRegionByTimeRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInRegionByTimeRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> getSurfEleInBasinByTimeRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSurfEleInBasinByTimeRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEle(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEleInRect(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleInRectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEleByStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleByStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEleByStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleByStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEleInRegion(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleInRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfEleInBasin(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfEleInBasinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPre(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPreInRect(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreInRectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPreByStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreByStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPreByStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreByStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPreInRegion(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreInRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfPreInBasin(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfPreInBasinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTem(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemInRect(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemInRectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemByStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemByStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemByStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemByStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemInRegion(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemInRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemInBasin(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemInBasinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtm(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtmInRect(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInRectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtmByStaID(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmByStaIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtmByStaIDRange(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmByStaIDRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtmInRegion(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInRegionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemFtmInBasin(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemFtmInBasinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse> statSurfTemByMYear(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatSurfTemByMYearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATION_PRO_BY_VALID_TIME_RANGE = 0;
  private static final int METHODID_GET_SURF_ELE_BY_TIME = 1;
  private static final int METHODID_GET_SURF_ELE_IN_RECT_BY_TIME = 2;
  private static final int METHODID_GET_SURF_ELE_BY_TIME_AND_STA_ID = 3;
  private static final int METHODID_GET_SURF_ELE_BY_TIME_AND_STA_IDRANGE = 4;
  private static final int METHODID_GET_SURF_ELE_IN_REGION_BY_TIME = 5;
  private static final int METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME = 6;
  private static final int METHODID_GET_SURF_ELE_BY_TIME_RANGE = 7;
  private static final int METHODID_GET_SURF_ELE_IN_RECT_BY_TIME_RANGE = 8;
  private static final int METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_ID = 9;
  private static final int METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_IDRANGE = 10;
  private static final int METHODID_GET_SURF_ELE_IN_REGION_BY_TIME_RANGE = 11;
  private static final int METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME_RANGE = 12;
  private static final int METHODID_STAT_SURF_ELE = 13;
  private static final int METHODID_STAT_SURF_ELE_IN_RECT = 14;
  private static final int METHODID_STAT_SURF_ELE_BY_STA_ID = 15;
  private static final int METHODID_STAT_SURF_ELE_BY_STA_IDRANGE = 16;
  private static final int METHODID_STAT_SURF_ELE_IN_REGION = 17;
  private static final int METHODID_STAT_SURF_ELE_IN_BASIN = 18;
  private static final int METHODID_STAT_SURF_PRE = 19;
  private static final int METHODID_STAT_SURF_PRE_IN_RECT = 20;
  private static final int METHODID_STAT_SURF_PRE_BY_STA_ID = 21;
  private static final int METHODID_STAT_SURF_PRE_BY_STA_IDRANGE = 22;
  private static final int METHODID_STAT_SURF_PRE_IN_REGION = 23;
  private static final int METHODID_STAT_SURF_PRE_IN_BASIN = 24;
  private static final int METHODID_STAT_SURF_TEM = 25;
  private static final int METHODID_STAT_SURF_TEM_IN_RECT = 26;
  private static final int METHODID_STAT_SURF_TEM_BY_STA_ID = 27;
  private static final int METHODID_STAT_SURF_TEM_BY_STA_IDRANGE = 28;
  private static final int METHODID_STAT_SURF_TEM_IN_REGION = 29;
  private static final int METHODID_STAT_SURF_TEM_IN_BASIN = 30;
  private static final int METHODID_STAT_SURF_TEM_FTM = 31;
  private static final int METHODID_STAT_SURF_TEM_FTM_IN_RECT = 32;
  private static final int METHODID_STAT_SURF_TEM_FTM_BY_STA_ID = 33;
  private static final int METHODID_STAT_SURF_TEM_FTM_BY_STA_IDRANGE = 34;
  private static final int METHODID_STAT_SURF_TEM_FTM_IN_REGION = 35;
  private static final int METHODID_STAT_SURF_TEM_FTM_IN_BASIN = 36;
  private static final int METHODID_STAT_SURF_TEM_BY_MYEAR = 37;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SurfaceDataSelectImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SurfaceDataSelectImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATION_PRO_BY_VALID_TIME_RANGE:
          serviceImpl.getStationProByValidTimeRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetStationProByValidTimeRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME:
          serviceImpl.getSurfEleByTime((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_RECT_BY_TIME:
          serviceImpl.getSurfEleInRectByTime((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME_AND_STA_ID:
          serviceImpl.getSurfEleByTimeAndStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME_AND_STA_IDRANGE:
          serviceImpl.getSurfEleByTimeAndStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeAndStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_REGION_BY_TIME:
          serviceImpl.getSurfEleInRegionByTime((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME:
          serviceImpl.getSurfEleInBasinByTime((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME_RANGE:
          serviceImpl.getSurfEleByTimeRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_RECT_BY_TIME_RANGE:
          serviceImpl.getSurfEleInRectByTimeRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRectByTimeRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_ID:
          serviceImpl.getSurfEleByTimeRangeAndStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_BY_TIME_RANGE_AND_STA_IDRANGE:
          serviceImpl.getSurfEleByTimeRangeAndStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeRangeAndStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_REGION_BY_TIME_RANGE:
          serviceImpl.getSurfEleInRegionByTimeRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInRegionByTimeRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_GET_SURF_ELE_IN_BASIN_BY_TIME_RANGE:
          serviceImpl.getSurfEleInBasinByTimeRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleInBasinByTimeRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE:
          serviceImpl.statSurfEle((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE_IN_RECT:
          serviceImpl.statSurfEleInRect((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRectRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE_BY_STA_ID:
          serviceImpl.statSurfEleByStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE_BY_STA_IDRANGE:
          serviceImpl.statSurfEleByStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleByStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE_IN_REGION:
          serviceImpl.statSurfEleInRegion((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_ELE_IN_BASIN:
          serviceImpl.statSurfEleInBasin((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfEleInBasinRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE:
          serviceImpl.statSurfPre((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE_IN_RECT:
          serviceImpl.statSurfPreInRect((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRectRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE_BY_STA_ID:
          serviceImpl.statSurfPreByStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE_BY_STA_IDRANGE:
          serviceImpl.statSurfPreByStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreByStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE_IN_REGION:
          serviceImpl.statSurfPreInRegion((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_PRE_IN_BASIN:
          serviceImpl.statSurfPreInBasin((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfPreInBasinRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM:
          serviceImpl.statSurfTem((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_IN_RECT:
          serviceImpl.statSurfTemInRect((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRectRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_BY_STA_ID:
          serviceImpl.statSurfTemByStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_BY_STA_IDRANGE:
          serviceImpl.statSurfTemByStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_IN_REGION:
          serviceImpl.statSurfTemInRegion((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_IN_BASIN:
          serviceImpl.statSurfTemInBasin((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemInBasinRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM:
          serviceImpl.statSurfTemFtm((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM_IN_RECT:
          serviceImpl.statSurfTemFtmInRect((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRectRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM_BY_STA_ID:
          serviceImpl.statSurfTemFtmByStaID((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM_BY_STA_IDRANGE:
          serviceImpl.statSurfTemFtmByStaIDRange((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmByStaIDRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM_IN_REGION:
          serviceImpl.statSurfTemFtmInRegion((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_FTM_IN_BASIN:
          serviceImpl.statSurfTemFtmInBasin((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemFtmInBasinRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        case METHODID_STAT_SURF_TEM_BY_MYEAR:
          serviceImpl.statSurfTemByMYear((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.StatSurfTemByMYearRequest) request,
              (io.grpc.stub.StreamObserver<com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SurfaceDataSelectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SurfaceDataSelectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SurfaceDataSelect");
    }
  }

  private static final class SurfaceDataSelectFileDescriptorSupplier
      extends SurfaceDataSelectBaseDescriptorSupplier {
    SurfaceDataSelectFileDescriptorSupplier() {}
  }

  private static final class SurfaceDataSelectMethodDescriptorSupplier
      extends SurfaceDataSelectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SurfaceDataSelectMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SurfaceDataSelectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SurfaceDataSelectFileDescriptorSupplier())
              .addMethod(getGetStationProByValidTimeRangeMethod())
              .addMethod(getGetSurfEleByTimeMethod())
              .addMethod(getGetSurfEleInRectByTimeMethod())
              .addMethod(getGetSurfEleByTimeAndStaIDMethod())
              .addMethod(getGetSurfEleByTimeAndStaIDRangeMethod())
              .addMethod(getGetSurfEleInRegionByTimeMethod())
              .addMethod(getGetSurfEleInBasinByTimeMethod())
              .addMethod(getGetSurfEleByTimeRangeMethod())
              .addMethod(getGetSurfEleInRectByTimeRangeMethod())
              .addMethod(getGetSurfEleByTimeRangeAndStaIDMethod())
              .addMethod(getGetSurfEleByTimeRangeAndStaIDRangeMethod())
              .addMethod(getGetSurfEleInRegionByTimeRangeMethod())
              .addMethod(getGetSurfEleInBasinByTimeRangeMethod())
              .addMethod(getStatSurfEleMethod())
              .addMethod(getStatSurfEleInRectMethod())
              .addMethod(getStatSurfEleByStaIDMethod())
              .addMethod(getStatSurfEleByStaIDRangeMethod())
              .addMethod(getStatSurfEleInRegionMethod())
              .addMethod(getStatSurfEleInBasinMethod())
              .addMethod(getStatSurfPreMethod())
              .addMethod(getStatSurfPreInRectMethod())
              .addMethod(getStatSurfPreByStaIDMethod())
              .addMethod(getStatSurfPreByStaIDRangeMethod())
              .addMethod(getStatSurfPreInRegionMethod())
              .addMethod(getStatSurfPreInBasinMethod())
              .addMethod(getStatSurfTemMethod())
              .addMethod(getStatSurfTemInRectMethod())
              .addMethod(getStatSurfTemByStaIDMethod())
              .addMethod(getStatSurfTemByStaIDRangeMethod())
              .addMethod(getStatSurfTemInRegionMethod())
              .addMethod(getStatSurfTemInBasinMethod())
              .addMethod(getStatSurfTemFtmMethod())
              .addMethod(getStatSurfTemFtmInRectMethod())
              .addMethod(getStatSurfTemFtmByStaIDMethod())
              .addMethod(getStatSurfTemFtmByStaIDRangeMethod())
              .addMethod(getStatSurfTemFtmInRegionMethod())
              .addMethod(getStatSurfTemFtmInBasinMethod())
              .addMethod(getStatSurfTemByMYearMethod())
              .build();
        }
      }
    }
    return result;
  }
}
