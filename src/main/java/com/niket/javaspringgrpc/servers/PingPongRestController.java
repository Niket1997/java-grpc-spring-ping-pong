package com.niket.javaspringgrpc.servers;

import com.niket.javaspringgrpc.proto_gen.ping_pong.Request;
import com.niket.javaspringgrpc.proto_gen.ping_pong.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController()
public class PingPongRestController {
    public final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @PostMapping("/v1/ping")
    Response ping(@RequestBody Request request) {
        logger.info("request received: " + request.getPayload());
        return Response.newBuilder().setResponse("PONG").build();
    }
}
