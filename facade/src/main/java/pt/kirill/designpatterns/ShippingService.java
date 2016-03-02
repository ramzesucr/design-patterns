package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 02/03/16.
 */
public class ShippingService {

    public void shipping(Order order) {
        Address address = order.getShippingAddress();
        System.out.println(String.format("Shipping order to %s address for %s",
                address.getAddress(), address.getName()));
        order.setStatus("Shipped");
    }

}
