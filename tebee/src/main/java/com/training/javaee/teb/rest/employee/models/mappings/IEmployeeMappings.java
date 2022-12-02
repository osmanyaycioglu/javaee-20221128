package com.training.javaee.teb.rest.employee.models.mappings;


import java.util.List;

import com.training.javaee.teb.rest.employee.models.Employee;
import com.training.javaee.teb.services.models.EmployeeDto;

public interface IEmployeeMappings {

    IEmployeeMappings employeeMappings = new IEmployeeMappingsImpl();

    EmployeeDto toEmployeeDto(Employee employeeParam);

    Employee toEmployee(EmployeeDto employeeParam);

    List<Employee> toEmployees(List<EmployeeDto> allParam);


}
