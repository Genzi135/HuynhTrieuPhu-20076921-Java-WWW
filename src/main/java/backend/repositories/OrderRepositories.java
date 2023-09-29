package backend.repositories;

import backend.Connection.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class OrderRepositories {
    private final EntityManager em;
    private final EntityTransaction tr;

    public OrderRepositories() {
        em = Persistence.createEntityManagerFactory("HuynhTrieuPhu-20076921-week2").createEntityManager();
        tr = em.getTransaction();
    }


}
