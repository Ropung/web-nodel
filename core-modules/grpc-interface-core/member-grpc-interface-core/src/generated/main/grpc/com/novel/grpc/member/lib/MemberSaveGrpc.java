package com.novel.grpc.member.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: memberSaveInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MemberSaveGrpc {

  private MemberSaveGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MemberSave";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.novel.grpc.member.lib.MemberSaveRequest,
      com.novel.grpc.member.lib.MemberSaveResponse> getMemberSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "memberSave",
      requestType = com.novel.grpc.member.lib.MemberSaveRequest.class,
      responseType = com.novel.grpc.member.lib.MemberSaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.novel.grpc.member.lib.MemberSaveRequest,
      com.novel.grpc.member.lib.MemberSaveResponse> getMemberSaveMethod() {
    io.grpc.MethodDescriptor<com.novel.grpc.member.lib.MemberSaveRequest, com.novel.grpc.member.lib.MemberSaveResponse> getMemberSaveMethod;
    if ((getMemberSaveMethod = MemberSaveGrpc.getMemberSaveMethod) == null) {
      synchronized (MemberSaveGrpc.class) {
        if ((getMemberSaveMethod = MemberSaveGrpc.getMemberSaveMethod) == null) {
          MemberSaveGrpc.getMemberSaveMethod = getMemberSaveMethod =
              io.grpc.MethodDescriptor.<com.novel.grpc.member.lib.MemberSaveRequest, com.novel.grpc.member.lib.MemberSaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "memberSave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.novel.grpc.member.lib.MemberSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.novel.grpc.member.lib.MemberSaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MemberSaveMethodDescriptorSupplier("memberSave"))
              .build();
        }
      }
    }
    return getMemberSaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberSaveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberSaveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberSaveStub>() {
        @java.lang.Override
        public MemberSaveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberSaveStub(channel, callOptions);
        }
      };
    return MemberSaveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberSaveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberSaveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberSaveBlockingStub>() {
        @java.lang.Override
        public MemberSaveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberSaveBlockingStub(channel, callOptions);
        }
      };
    return MemberSaveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberSaveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberSaveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberSaveFutureStub>() {
        @java.lang.Override
        public MemberSaveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberSaveFutureStub(channel, callOptions);
        }
      };
    return MemberSaveFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void memberSave(com.novel.grpc.member.lib.MemberSaveRequest request,
        io.grpc.stub.StreamObserver<com.novel.grpc.member.lib.MemberSaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberSaveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MemberSave.
   */
  public static abstract class MemberSaveImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MemberSaveGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MemberSave.
   */
  public static final class MemberSaveStub
      extends io.grpc.stub.AbstractAsyncStub<MemberSaveStub> {
    private MemberSaveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberSaveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberSaveStub(channel, callOptions);
    }

    /**
     */
    public void memberSave(com.novel.grpc.member.lib.MemberSaveRequest request,
        io.grpc.stub.StreamObserver<com.novel.grpc.member.lib.MemberSaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberSaveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MemberSave.
   */
  public static final class MemberSaveBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MemberSaveBlockingStub> {
    private MemberSaveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberSaveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberSaveBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.novel.grpc.member.lib.MemberSaveResponse memberSave(com.novel.grpc.member.lib.MemberSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MemberSave.
   */
  public static final class MemberSaveFutureStub
      extends io.grpc.stub.AbstractFutureStub<MemberSaveFutureStub> {
    private MemberSaveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberSaveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberSaveFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.novel.grpc.member.lib.MemberSaveResponse> memberSave(
        com.novel.grpc.member.lib.MemberSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MEMBER_SAVE = 0;

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
        case METHODID_MEMBER_SAVE:
          serviceImpl.memberSave((com.novel.grpc.member.lib.MemberSaveRequest) request,
              (io.grpc.stub.StreamObserver<com.novel.grpc.member.lib.MemberSaveResponse>) responseObserver);
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
          getMemberSaveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.novel.grpc.member.lib.MemberSaveRequest,
              com.novel.grpc.member.lib.MemberSaveResponse>(
                service, METHODID_MEMBER_SAVE)))
        .build();
  }

  private static abstract class MemberSaveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberSaveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.novel.grpc.member.lib.memberSaveProtobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberSave");
    }
  }

  private static final class MemberSaveFileDescriptorSupplier
      extends MemberSaveBaseDescriptorSupplier {
    MemberSaveFileDescriptorSupplier() {}
  }

  private static final class MemberSaveMethodDescriptorSupplier
      extends MemberSaveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MemberSaveMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MemberSaveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberSaveFileDescriptorSupplier())
              .addMethod(getMemberSaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
