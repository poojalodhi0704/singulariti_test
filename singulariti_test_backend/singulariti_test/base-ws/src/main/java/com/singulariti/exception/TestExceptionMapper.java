package com.singulariti.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.ws.rs.ext.Provider;

/**
 * Created by ps on 1/6/17.
 */
@Provider
public class TestExceptionMapper {

    public Response toResponse(Exception e) {

        return Response.status(500).entity(e).type(MediaType.APPLICATION_JSON).build();
    }
}
