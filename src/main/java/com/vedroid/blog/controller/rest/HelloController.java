package com.vedroid.blog.controller.rest;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/hello")
public class HelloController {

    // try GET http://localhost:8080/blog/rest/hello/say
    private static int i = 0;

    @GET
    @Path("/say")
    @Produces("text/plain")
    public String say() {
        return "Hello World:" + i++;
    }
}
