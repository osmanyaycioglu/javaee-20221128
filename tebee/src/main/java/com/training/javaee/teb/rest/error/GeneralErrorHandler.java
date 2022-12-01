package com.training.javaee.teb.rest.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GeneralErrorHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(final Exception exp) {
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                       .header("Content-Type",
                               "application/json")
                       .entity(new ErrorObj().setErrorDesc(exp.getMessage())
                                             .setErrorCode(5000))
                       .build();
    }

}
