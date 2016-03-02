package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class SilverBullet extends WeaponDecorator {

    public SilverBullet(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int fire() {
        return super.fire() + 2;
    }

}
