package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Builder");
        System.out.println();

        Player player = new Player.Builder()
                .setRace("Warrior")
                .setHairColor("black")
                .setGender("male")
                .build();

        System.out.println(player);

    }

}
