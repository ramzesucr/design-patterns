package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 23/02/16.
 */
public class User implements Prototype<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public User clone() {
        return new User(name, age);
    }

    @Override
    public String toString() {
        return String.format("%s - %d, instance: %d", name, age, hashCode());
    }
}
