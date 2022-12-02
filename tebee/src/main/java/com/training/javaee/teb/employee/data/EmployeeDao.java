package com.training.javaee.teb.employee.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.training.javaee.teb.services.models.EmployeeDto;

@LocalBean
@Stateless
// @TransactionManagement(TransactionManagementType.BEAN)
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

    public List<EmployeeDto> getBySurname(final String surname) {
        TypedQuery<EmployeeDto> createQueryLoc = this.entityManager.createQuery("select e from EmployeeDto e where e.surname=?1",
                                                                                EmployeeDto.class);
        createQueryLoc.setParameter(1,
                                    surname);
        return createQueryLoc.getResultList();
    }

    public List<EmployeeDto> getBySurnameNative(final String surname) {
        Query queryLoc = this.entityManager.createNativeQuery("select * from employee e where e.surname=?1",
                                                              EmployeeDto.class);
        queryLoc.setParameter(1,
                              surname);
        return queryLoc.getResultList();
    }

    public List<EmployeeDto> getAll() {
        TypedQuery<EmployeeDto> createQueryLoc = this.entityManager.createQuery("select e from EmployeeDto e",
                                                                                EmployeeDto.class);
        return createQueryLoc.getResultList();
    }

}
