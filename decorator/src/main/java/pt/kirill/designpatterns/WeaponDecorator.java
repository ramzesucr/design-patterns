package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class WeaponDecorator implements Weapon {

    private Weapon decorated;

    public WeaponDecorator(Weapon weapon) {
        decorated = weapon;
    }

    @Override
    public int fire() {
        return decorated.fire();
    }

}
