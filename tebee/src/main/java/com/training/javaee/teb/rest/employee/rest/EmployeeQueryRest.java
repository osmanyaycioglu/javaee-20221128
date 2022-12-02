package com.training.javaee.teb.rest.employee.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.training.javaee.teb.rest.employee.models.Employee;
import com.training.javaee.teb.rest.employee.models.mappings.IEmployeeMappings;
import com.training.javaee.teb.services.EmployeeProvisionService;

@Path("/api/v1/employee/query")
@Produces({
            "application/json"
})
@Consumes({
            "application/json"
})
public class EmployeeQueryRest {

    @EJB
    private EmployeeProvisionService employeeProvisionService;

    @Path("/get/one")
    @GET
    public Employee getEmployee(@QueryParam("eid") final Long employeeId) {
        return IEmployeeMappings.employeeMappings.toEmployee(this.employeeProvisionService.getEmployee(employeeId));
    }

    @Path("/get/all")
    @GET
    public List<Employee> getAllEmployees() {
        return IEmployeeMappings.employeeMappings.toEmployees(this.employeeProvisionService.getAll());
    }


}
