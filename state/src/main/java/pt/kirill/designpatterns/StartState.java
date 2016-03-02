package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 22/02/16.
 */
public class StartState implements State {

    @Override
    public void handle(Transaction transaction) {
        System.out.println("Start state");

        try {
            transaction.saveState();
            transaction.run();
            transaction.setState(new EndState(true));
        } catch (Exception e) {
            transaction.setState(new RollbackState());
        } finally {
            transaction.proceed();
        }
    }

}
