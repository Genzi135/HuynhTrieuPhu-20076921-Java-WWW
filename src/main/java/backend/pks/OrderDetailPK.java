package backend.pks;

import backend.models.Order;
import backend.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
