package repository.impl;

import configuration.EntityManagerConfiguration;
import model.entity.Role;
import repository.RoleRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class RoleRepositoryImpl implements RoleRepository {

    private final EntityManager entityManager = EntityManagerConfiguration.getEntityManager();

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Optional<Role> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(Role.class, id));
    }

    @Override
    public void save(Role role) {
        entityManager.getTransaction().begin();
        entityManager.persist(role);
        entityManager.getTransaction().commit();
    }

}
