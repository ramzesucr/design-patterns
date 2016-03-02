package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Aim extends WeaponDecorator {

    public Aim(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int fire() {
        return super.fire() + 25;
    }
}
