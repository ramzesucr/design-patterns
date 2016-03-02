package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Adapter");
        System.out.println();

        Shape[] shapes = new Shape[] { new Oval(), new Rectangle(), new CircleAdapter() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
