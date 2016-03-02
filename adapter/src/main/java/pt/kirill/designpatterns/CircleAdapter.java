package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class CircleAdapter implements Shape {

    LibCircle libCircle = new LibCircle();

    @Override
    public void draw() {
        libCircle.drawing();
    }
}
