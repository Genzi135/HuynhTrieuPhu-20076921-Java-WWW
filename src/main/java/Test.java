import backend.Connection.ConnectDB;
import backend.repositories.ProductRepositories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = ConnectDB.getInstance().getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        System.out.println("done!");

        ProductRepositories repositories = new ProductRepositories();
        System.out.println(repositories.getActiveProduct());
    }

}
