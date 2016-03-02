package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 02/03/16.
 */
public class BillingInfo {

    private final String name;
    private final String cardNumber;
    private final String ccv;

    public BillingInfo(String name, String cardNumber, String ccv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCcv() {
        return ccv;
    }
}
