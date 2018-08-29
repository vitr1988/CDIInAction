package ru.otus.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/cdi")
public class CDIResource {

    @Inject
    EmbeddedResource embeddedResource;

    @GET
    public String helloWorld(){
        return embeddedResource.hello("World");
    }
}
