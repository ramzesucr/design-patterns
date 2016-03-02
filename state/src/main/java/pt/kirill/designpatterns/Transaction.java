package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 22/02/16.
 */
public class Transaction implements Runnable {

    private State currentState;
    private Runnable action;
    private int balance;

    private int initBalance;

    public Transaction(int balance) {
        this.balance = balance;
    }

    public void saveState() {
        initBalance = balance;
    }

    public void restoreInitState() {
        balance = initBalance;
    }

    public void setAction(Runnable runnable) {
        action = runnable;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setState(State state) {
        currentState = state;
    }

    public void proceed() {
        currentState.handle(this);
    }

    public void start() {
        currentState = new StartState();
        proceed();
    }

    @Override
    public void run() {
        action.run();
    }
}
