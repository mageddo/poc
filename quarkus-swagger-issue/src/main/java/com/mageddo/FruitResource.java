package com.mageddo;

import com.mageddo.service.HelloService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Tag(name = "hello-samples")
@Path("/hello")
public class FruitResource {

    HelloService helloService;
//
//    public FruitResource() {
//    }

    @Inject
    public FruitResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return this.helloService.hello();
    }
}