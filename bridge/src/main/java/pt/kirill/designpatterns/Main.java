package pt.kirill.designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bridge");
        System.out.println("Calculating values with bridge pattern");
        System.out.println();

        float firstNumber = 100;
        float secondNumber = 25;
        Calculator calculator = new Calculator(firstNumber);
        Action[] actions = {
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        };

        for (Action action : actions) {
            calculator.setAction(action);

            System.out.println(String.format("Result of %s: %.2f", action, calculator.calculate(secondNumber)));
        }
    }

}
