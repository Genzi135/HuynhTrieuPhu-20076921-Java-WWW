package backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import backend.models.Employee;
import jakarta.persistence.Persistence;

public class EmployeeRepositories {
    private final EntityManager em;

    private final EntityTransaction tr;

    public EmployeeRepositories() {
        em = Persistence.createEntityManagerFactory("HuynhTrieuPhu-20076921-week2").createEntityManager();
        tr = em.getTransaction();
    }

    public void insert(Employee employee) {
        try {
            tr.begin();
            em.persist(employee);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(String id) {
        try {
            tr.begin();
            em.remove(id);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(Employee employee) {
        try {
            tr.begin();
            em.merge(employee);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
