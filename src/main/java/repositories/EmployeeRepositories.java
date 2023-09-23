package repositories;

import Connection.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import models.Employee;

public class EmployeeRepositories {
    private EntityManager em;

    private EntityTransaction tr;

    public EmployeeRepositories() {
        em = ConnectDB.getInstance().getEntityManagerFactory().createEntityManager();
        tr = em.getTransaction();
    }

    public void insert(Employee employee) {
        try {
            tr.begin();
            em.persist(employee);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            tr.begin();
            em.remove(id);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Employee employee) {
        try {
            tr.begin();
            em.merge(employee);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
