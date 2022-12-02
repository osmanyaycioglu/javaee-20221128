package com.training.javaee.teb.employee.data;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.training.javaee.teb.services.models.EmployeeDto;

@LocalBean
@Stateless
public class EmployeeDao {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    public void insert(final EmployeeDto dtoParam) {
        this.entityManager.persist(dtoParam);
    }

    public void update(final EmployeeDto dtoParam) {
        this.entityManager.merge(dtoParam);
    }

    public EmployeeDto getOne(final Long employeeId) {
        return this.entityManager.find(EmployeeDto.class,
                                       employeeId);
    }

}
