package ru.otus.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/embedded")
public class EmbeddedResource {

    @GET
    public String hello(@QueryParam("name") String somebody) {
        return "Hello, " + somebody;
    }
}
