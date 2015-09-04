package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Makhobey Oleh on 8/31/15.
 * emai: tajcig@ya.ru
 */

@Path("userok")
public class Controller {
    @GET
    @Produces("text/plain")
    public String getUser(){
        return "Hello world";
    }


    @PUT
    @Produces("text/plain")
    public String updateUser(){
        return "user updated";
    }

    @DELETE
    @Produces("text/plain")
    public String deleteUser(){
        return "user deleted";
    }

    @POST
    @Produces("text/plain")
    public Response createUser(){
        return Response.status(404).build();
    }
}
