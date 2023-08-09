package com.niket.javaspringgrpc.proto_gen.ping_pong;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: pingPong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PingPongServiceGrpc {

  private PingPongServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "PingPongService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.niket.javaspringgrpc.proto_gen.ping_pong.Request,
      com.niket.javaspringgrpc.proto_gen.ping_pong.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = com.niket.javaspringgrpc.proto_gen.ping_pong.Request.class,
      responseType = com.niket.javaspringgrpc.proto_gen.ping_pong.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.niket.javaspringgrpc.proto_gen.ping_pong.Request,
      com.niket.javaspringgrpc.proto_gen.ping_pong.Response> getPingMethod() {
    io.grpc.MethodDescriptor<com.niket.javaspringgrpc.proto_gen.ping_pong.Request, com.niket.javaspringgrpc.proto_gen.ping_pong.Response> getPingMethod;
    if ((getPingMethod = PingPongServiceGrpc.getPingMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getPingMethod = PingPongServiceGrpc.getPingMethod) == null) {
          PingPongServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.niket.javaspringgrpc.proto_gen.ping_pong.Request, com.niket.javaspringgrpc.proto_gen.ping_pong.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.niket.javaspringgrpc.proto_gen.ping_pong.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.niket.javaspringgrpc.proto_gen.ping_pong.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingPongServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongServiceStub>() {
        @java.lang.Override
        public PingPongServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongServiceStub(channel, callOptions);
        }
      };
    return PingPongServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingPongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongServiceBlockingStub>() {
        @java.lang.Override
        public PingPongServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongServiceBlockingStub(channel, callOptions);
        }
      };
    return PingPongServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingPongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingPongServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingPongServiceFutureStub>() {
        @java.lang.Override
        public PingPongServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingPongServiceFutureStub(channel, callOptions);
        }
      };
    return PingPongServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void ping(com.niket.javaspringgrpc.proto_gen.ping_pong.Request request,
        io.grpc.stub.StreamObserver<com.niket.javaspringgrpc.proto_gen.ping_pong.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PingPongService.
   */
  public static abstract class PingPongServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PingPongServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PingPongService.
   */
  public static final class PingPongServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PingPongServiceStub> {
    private PingPongServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.niket.javaspringgrpc.proto_gen.ping_pong.Request request,
        io.grpc.stub.StreamObserver<com.niket.javaspringgrpc.proto_gen.ping_pong.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PingPongService.
   */
  public static final class PingPongServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PingPongServiceBlockingStub> {
    private PingPongServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.niket.javaspringgrpc.proto_gen.ping_pong.Response ping(com.niket.javaspringgrpc.proto_gen.ping_pong.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PingPongService.
   */
  public static final class PingPongServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PingPongServiceFutureStub> {
    private PingPongServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingPongServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.niket.javaspringgrpc.proto_gen.ping_pong.Response> ping(
        com.niket.javaspringgrpc.proto_gen.ping_pong.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.niket.javaspringgrpc.proto_gen.ping_pong.Request) request,
              (io.grpc.stub.StreamObserver<com.niket.javaspringgrpc.proto_gen.ping_pong.Response>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.niket.javaspringgrpc.proto_gen.ping_pong.Request,
              com.niket.javaspringgrpc.proto_gen.ping_pong.Response>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingPongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.niket.javaspringgrpc.proto_gen.ping_pong.PingPong.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingPongService");
    }
  }

  private static final class PingPongServiceFileDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier {
    PingPongServiceFileDescriptorSupplier() {}
  }

  private static final class PingPongServiceMethodDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PingPongServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PingPongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingPongServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
