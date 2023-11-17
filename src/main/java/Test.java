import backend.enums.ProductStatus;
import backend.models.Customer;
import backend.models.Product;
import backend.repositories.CustomerRepositories;
import backend.repositories.ProductRepositories;

public class Test {

    public static void main(String[] args) throws Exception {
        ProductRepositories productRepositories = new ProductRepositories();
//        for (int i=0; i<20; i++){
//            Product p1=new Product( "Pencil 4A " +i, "pencil 4A "+i, "piece", "Thien Long", ProductStatus.ACTIVE);
//            productRepositories.add(p1);
//        }
        CustomerRepositories customerRepositories = new CustomerRepositories();
//        String name="phu";
//        System.out.println(customerRepositories.findByName(name));
    }

}
