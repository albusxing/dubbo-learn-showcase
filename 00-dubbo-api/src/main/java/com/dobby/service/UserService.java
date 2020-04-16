package com.dobby.service;

import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author liguoqing
 */
@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserService {

    @GET
    @Path("{id : \\d+}")
    User getUser(@PathParam("id") Long id);


    @POST
    @Path("register")
    Long registerUser(User user);


}
