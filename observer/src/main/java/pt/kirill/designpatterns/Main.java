package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Observable");
        System.out.println();

        Observable observable = new Observable();
        System.out.println("Subscribe with first observer");
        observable.subscribe(new FirstObserver());
        observable.setValue(100);
        System.out.println("Subscribe with second observer");
        observable.subscribe(new SecondObserver());
        observable.setValue(1000);

    }

}
