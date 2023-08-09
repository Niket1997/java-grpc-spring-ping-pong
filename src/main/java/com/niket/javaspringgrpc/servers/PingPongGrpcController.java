package com.niket.javaspringgrpc.servers;

import com.niket.javaspringgrpc.proto_gen.ping_pong.PingPongServiceGrpc;
import com.niket.javaspringgrpc.proto_gen.ping_pong.Request;
import com.niket.javaspringgrpc.proto_gen.ping_pong.Response;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.logging.Logger;

@GRpcService
public class PingPongGrpcController extends PingPongServiceGrpc.PingPongServiceImplBase {
    public final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Override
    public void ping (Request request, StreamObserver<Response> responseObserver) {
        logger.info("request received: " + request.getPayload());
        Response response = Response.newBuilder().setResponse("PONG").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
