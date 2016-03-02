package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class GoldBullet extends WeaponDecorator {

    public GoldBullet(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int fire() {
        return super.fire() + 5;
    }
}
