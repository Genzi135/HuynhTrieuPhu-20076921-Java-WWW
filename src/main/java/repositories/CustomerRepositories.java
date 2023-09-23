package repositories;

import Connection.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRepositories {
    private EntityManager em;

    private EntityTransaction tr;

    public CustomerRepositories() throws Exception {
        em = ConnectDB.getInstance().getEntityManagerFactory().createEntityManager();
        tr = em.getTransaction();
    }

    public void insert_Customer(Customer customer) {
        try {
            tr.begin();
            em.persist(customer);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dalete_Customer(String id) {
        try {
            tr.begin();
            em.remove(id);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update_Customer(Customer customer) {
        try {
            tr.begin();
            em.merge(customer);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
