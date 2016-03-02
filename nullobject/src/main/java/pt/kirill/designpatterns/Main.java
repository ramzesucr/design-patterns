package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Null Object");
        System.out.println();

        Stream[] streams = { new PrintStream(), new NullStream() };

        for (Stream stream : streams) {
            stream.print("Some text to print");
        }
    }

}
