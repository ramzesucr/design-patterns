package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 22/02/16.
 */
public class EndState implements State {

    boolean isSuccess;

    public EndState(boolean status) {
        isSuccess = status;
    }

    @Override
    public void handle(Transaction transaction) {
        System.out.println("End state");
        if(isSuccess) {
            System.out.println("Transaction completed successfully, balance is: " + transaction.getBalance());
        } else {
            System.out.printf("Transaction came to primary status, balance is: " + transaction.getBalance());
        }
    }

}
