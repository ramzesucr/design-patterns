package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 16/02/16.
 */
public class FirstObserver implements Observer {

    @Override
    public void onChange(Observable observable) {
        System.out.println(String.format("First observer received notification, new value: %d", observable.getValue()));
    }

}
