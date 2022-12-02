package com.training.javaee.teb.rest.employee.models.mappings;

import java.util.List;
import java.util.stream.Collectors;

import com.training.javaee.teb.rest.employee.models.Employee;
import com.training.javaee.teb.services.models.EmployeeDto;

public class IEmployeeMappingsImpl implements IEmployeeMappings {

    @Override
    public EmployeeDto toEmployeeDto(final Employee employeeParam) {
        if (employeeParam == null) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setName(employeeParam.getName());
        employeeDto.setSurname(employeeParam.getSurname());
        employeeDto.setAge(employeeParam.getAge());
        employeeDto.setHeight(employeeParam.getHeight());

        return employeeDto;
    }

    @Override
    public Employee toEmployee(final EmployeeDto employeeParam) {
        if (employeeParam == null) {
            return null;
        }

        Employee employee = new Employee();

        employee.setName(employeeParam.getName());
        employee.setSurname(employeeParam.getSurname());
        employee.setAge(employeeParam.getAge());
        employee.setHeight(employeeParam.getHeight());

        return employee;
    }

    @Override
    public List<Employee> toEmployees(final List<EmployeeDto> allParam) {
        return allParam.stream()
                       .map(ed -> this.toEmployee(ed))
                       .collect(Collectors.toList());
    }
}
