package com.training.javaee.teb.services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.training.javaee.teb.employee.data.EmployeeDao;
import com.training.javaee.teb.services.models.EmployeeDto;

@LocalBean
@Stateless
public class EmployeeProvisionService {

    @EJB
    private EmployeeDao employeeDao;

    public void add(final EmployeeDto dtoParam) {
        // fraud git
        // password generate et
        // Mernis check
        // tc kimlik no check
        this.employeeDao.insert(dtoParam);
    }

}
