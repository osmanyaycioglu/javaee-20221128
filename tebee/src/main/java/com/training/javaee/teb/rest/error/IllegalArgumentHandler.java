package com.training.javaee.teb.rest.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalArgumentHandler implements ExceptionMapper<IllegalArgumentException> {

    @Override
    public Response toResponse(final IllegalArgumentException exp) {
        return Response.status(Status.BAD_REQUEST)
                       .header("deneme",
                               "error oldu")
                       .header("Content-Type",
                               "application/json")
                       .entity(new ErrorObj().setErrorDesc(exp.getMessage())
                                             .setErrorCode(1035))
                       .build();
    }

}
