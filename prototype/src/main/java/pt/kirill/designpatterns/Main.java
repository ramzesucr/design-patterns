package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main extends Object {

    public static void main(String[] args) {
        System.out.println("Prototype");
        System.out.println();

        User user = new User("John Connor", 30);
        System.out.println("User: " + user);
        User clonedUser = user.clone();
        System.out.println("Cloned user: " + clonedUser);
    }

}
