package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Template Method");
        System.out.println();

        Player[] players = { new Man(), new Goblin(), new Witch() };

        for (Player player : players) {
            player.move();
        }

    }

}
