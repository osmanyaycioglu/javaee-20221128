package com.training.javaee.teb.rest.employee.rest;

import java.util.Objects;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.training.javaee.teb.rest.employee.models.Employee;

@Path("/api/v1/employee/provision")
public class EmployeeProvisionRest {

    @Path("/add")
    @POST
    public String add(@Valid final Employee employeeParam) {
        if (employeeParam.getName() == null) {
            throw new IllegalArgumentException("name null olamaz");
        }
        Objects.requireNonNull(employeeParam.getName());
        // Database e yaz
        return "OK";
    }

    @Path("/activate")
    @GET
    public String activate(@QueryParam("eid") final Long employeeId) {
        return "activated";
    }

    @Path("/deactivate")
    @GET
    public String deactivate(@QueryParam("eid") final Long employeeId) {
        return "deactivated";
    }


}