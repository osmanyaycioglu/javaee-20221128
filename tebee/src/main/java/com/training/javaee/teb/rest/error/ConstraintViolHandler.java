package com.training.javaee.teb.rest.error;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConstraintViolHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(final ConstraintViolationException exp) {
        return Response.status(Status.BAD_REQUEST)
                       .header("deneme",
                               "error oldu")
                       .header("Content-Type",
                               "application/json")
                       .entity(new ErrorObj().setErrorDesc("validasyon problemi")
                                             .setErrorCode(1048)
                                             .setSubErrors(exp.getConstraintViolations()
                                                              .stream()
                                                              .map(cv -> new ErrorObj().setErrorCode(1049)
                                                                                       .setErrorDesc(cv.toString()))
                                                              .collect(Collectors.toList())))
                       .build();
    }

}
