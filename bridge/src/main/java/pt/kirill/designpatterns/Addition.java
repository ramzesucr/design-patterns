package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Addition implements Action {

    @Override
    public float calculate(float first, float second) {
        return first + second;
    }

    @Override
    public String toString() {
        return "Addition";
    }
}
