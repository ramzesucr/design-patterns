package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Facade");
        System.out.println();

        Address address = new Address();
        address.setName("John Connor");
        address.setAddress("Left Street, 3");

        BillingInfo billingInfo = new BillingInfo("John Connor", "12345678", "773");

        Order order = new Order();
        order.setShippingAddress(address);
        order.setBillingInfo(billingInfo);

        Cart cart = new Cart();
        cart.buy(order);

    }

}
