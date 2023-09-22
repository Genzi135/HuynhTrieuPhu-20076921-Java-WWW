import Connection.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = ConnectDB.getInstance().getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        System.out.println("ok");
    }

}
