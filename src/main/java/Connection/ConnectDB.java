package Connection;

import emuns.EmpStatus;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Connection;


public class ConnectDB {
    private static ConnectDB instance;
    private final EntityManagerFactory emf;

    private ConnectDB() {
        emf = Persistence.createEntityManagerFactory("HuynhTrieuPhu-20076921-week2");
    }

    public static ConnectDB getInstance() {
        if (instance == null)
            instance = new ConnectDB();
        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
