package backend.repositories;

import backend.enums.EmployeeStatus;
import backend.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProductRepositories {
    private final EntityManager em;
    private final EntityTransaction tr;

    public ProductRepositories() {
        em = Persistence.createEntityManagerFactory("HuynhTrieuPhu-20076921-week2").createEntityManager();
        tr = em.getTransaction();
    }

    public void add(Product p) {
        try {
            tr.begin();
            em.persist(p);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public void update(Product p) {
        try {
            tr.begin();
            em.merge(p);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public void delete(Product p) {
        try {
            tr.begin();
            em.remove(p);
            tr.commit();
        } catch (Exception e) {
            if (tr.isActive())
                tr.rollback();
            e.printStackTrace();
        }
    }

    public List<Product> getActiveProduct() {
        return em.createNamedQuery("Product.findAll", Product.class)
                .getResultList();
    }

    public Product findById(String id) {
        return em.createNamedQuery("Product.findById", Product.class).setParameter("id", Long.parseLong(id)).getSingleResult();
    }


}
