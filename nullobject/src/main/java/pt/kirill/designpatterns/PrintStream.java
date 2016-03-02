package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 23/02/16.
 */
public class PrintStream extends Stream {

    @Override
    public void print(String s) {
        System.out.println("This stream prints to console: " + s);
    }

}
