package com.vedroid.blog.controller.rest;

import com.vedroid.blog.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/hello")
public class HelloController {

    // try GET http://localhost:8080/blog/rest/hello/say
    private static int i = 0;

    @Autowired
    private EntryService entryService;

    @GET
    @Path("/say")
    @Produces("text/plain")
    public String say() {
        int amount = entryService.findAll().size();
        return "Hello World: " + i++ + "; amount: " + amount;
    }
}
