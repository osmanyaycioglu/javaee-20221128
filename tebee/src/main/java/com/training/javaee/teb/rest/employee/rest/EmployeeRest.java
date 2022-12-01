package com.training.javaee.teb.rest.employee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.training.javaee.teb.rest.employee.models.Employee;

@Path("/employee")
public class EmployeeRest {

    @Path("/insert")
    @POST
    public String insert(final Employee employeeParam) {
        // Database e yaz
        return "OK";
    }

    @Path("/select")
    @GET
    public Employee getEmployee(@QueryParam("eid") final Long employeeId) {
        return null;
    }

}
