package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 22/02/16.
 */
public class RollbackState implements State {

    @Override
    public void handle(Transaction transaction) {
        System.out.println("Rollback");
        transaction.restoreInitState();
        transaction.setState(new EndState(false));
        transaction.proceed();
    }

}
