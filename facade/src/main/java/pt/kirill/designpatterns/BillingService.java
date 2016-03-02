package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 02/03/16.
 */
public class BillingService {

    public void bill(Order order) {
        BillingInfo billingInfo = order.getBillingInfo();
        System.out.println(String.format("Making billing with card: %s in name %s and secure code %s",
                billingInfo.getCardNumber(), billingInfo.getName(), billingInfo.getCcv()));
        order.setStatus("Payment accepted");
    }

}
