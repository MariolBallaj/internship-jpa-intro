package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.Employee;
import repository.EmployeeRepository;
import util.Queries;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private EntityManager entityManager = EntityManagerConfiguration.getEntityManager();

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> result = entityManager.createQuery(Queries.FIND_ALL_EMPLOYEES, Employee.class);
        return result.getResultList();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(Employee.class, id));
    }

    @Override
    public void save(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();;
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        TypedQuery<Employee> result = entityManager.createQuery(Queries.FIND_EMPLOYEE_BY_FIRST_NAME_METHOD_2, Employee.class);
        result.setParameter("firstName", firstName);
        return result.getResultList();    }

}
