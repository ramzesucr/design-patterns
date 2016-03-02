package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 23/02/16.
 */
public class NullStream extends Stream {

    @Override
    public void print(String s) {
        System.out.println("Do nothing, this stream doesn't print nothing");
    }

}
