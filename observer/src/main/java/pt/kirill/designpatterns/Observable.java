package pt.kirill.designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirillryabin on 16/02/16.
 */
public class Observable {

    private List<Observer> observers;

    private Integer value;

    public Observable() {
        observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.onChange(this);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }


}
