package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 02/03/16.
 */
public class Cart {

    private BillingService billingService = new BillingService();
    private ShippingService shippingService = new ShippingService();

    public void buy(Order order) {
        System.out.println("Buy order process start");
        billingService.bill(order);
        System.out.println(String.format("Order status: %s", order.getStatus()));
        shippingService.shipping(order);
        System.out.println(String.format("Order status: %s", order.getStatus()));
    }

}
