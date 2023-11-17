package backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import backend.models.Customer;
import jakarta.persistence.Persistence;

public class CustomerRepositories {
    private final EntityManager em;

    private final EntityTransaction tr;

    public CustomerRepositories() throws Exception {
        em = Persistence.createEntityManagerFactory("HuynhTrieuPhu-20076921-week2").createEntityManager();
        tr = em.getTransaction();
    }

    public void insert(Customer customer) {
        try {
            tr.begin();
            em.persist(customer);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public void dalete(String id) {
        try {
            tr.begin();
            em.remove(id);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public void update(Customer customer) {
        try {
            tr.begin();
            em.merge(customer);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public Customer find(long id) {
        return em.find(Customer.class, id);
    }

    public Customer findByName(String name) {
        return em.createNamedQuery("Customer.FIND_BY_NAME", Customer.class).setParameter("name", name)
                .getSingleResult();
    }


}
