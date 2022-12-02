package com.training.javaee.teb.services;

import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.javaee.teb.employee.data.EmployeeDao;
import com.training.javaee.teb.services.models.EEmployeeStatus;
import com.training.javaee.teb.services.models.EmployeeDto;

@LocalBean
@Singleton
public class EmployeeProvisionService {

    @EJB
    private EmployeeDao employeeDao;

    public void add(final EmployeeDto dtoParam) {
        // fraud git
        // password generate et
        // Mernis check
        // tc kimlik no check
        dtoParam.setEmployeeStatus(EEmployeeStatus.ACTIVE);
        dtoParam.setPassword(UUID.randomUUID()
                                 .toString());
        dtoParam.setUsername(dtoParam.getName() + dtoParam.getSurname());
        this.employeeDao.insert(dtoParam);
    }

    public EmployeeDto getEmployee(final Long employeeIdParam) {
        return this.employeeDao.getOne(employeeIdParam);
    }

    public List<EmployeeDto> getAll() {
        return this.employeeDao.getAll();
    }

}
