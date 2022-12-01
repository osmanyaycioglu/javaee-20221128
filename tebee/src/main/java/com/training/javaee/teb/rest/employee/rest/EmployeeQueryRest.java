package com.training.javaee.teb.rest.employee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.training.javaee.teb.rest.employee.models.Employee;

@Path("/api/v1/employee/query")
public class EmployeeQueryRest {

    @Path("/get/one")
    @GET
    public Employee getEmployee(@QueryParam("eid") final Long employeeId) {
        return null;
    }

    @Path("/get/all")
    @GET
    public Employee getAllEmployees() {
        return null;
    }


}
