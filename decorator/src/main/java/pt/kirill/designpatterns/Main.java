package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Decorator");
        System.out.println();


        Weapon baseWeapon = new BaseWeapon();
        System.out.println(String.format("Damage by base weapon: %d", baseWeapon.fire()));

        GoldBullet goldBulletWeapon = new GoldBullet(baseWeapon);
        System.out.println(String.format("Damage by weapon with golden bullet: %d", goldBulletWeapon.fire()));

        SilverBullet silverBulletWeapon = new SilverBullet(baseWeapon);
        System.out.println(String.format("Damage by weapon with silver bullet: %d", silverBulletWeapon.fire()));

        Aim weaponWithAimAndSilver = new Aim(silverBulletWeapon);
        System.out.println(String.format("Damage by weapon with silver bullet and aim: %d", weaponWithAimAndSilver.fire()));


        String[] decorators = new String[] { "aim", "gold" };
        for (String decorator : decorators) {
            if(decorator.equals("aim")) {
                baseWeapon = new Aim(baseWeapon);
            } else if(decorator.equals("gold")) {
                baseWeapon = new GoldBullet(baseWeapon);
            }
        }
        System.out.println(String.format("Damage by dynamic weapon: %d", baseWeapon.fire()));
    }

}
