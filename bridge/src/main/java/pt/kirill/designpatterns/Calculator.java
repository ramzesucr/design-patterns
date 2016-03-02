package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Calculator {

    private Action action;
    private float number;

    public Calculator(float number) {
        this.number = number;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public float calculate(float secondNumber) {
        if(action == null)
            throw new UnsupportedOperationException("Action of calculator shouldn't be null");

        return action.calculate(number, secondNumber);
    }

}
