package factory.entity.weapon;
// 枪支
public class AK47 extends Weapon{
    @Override
    public void fire() {
        System.out.println("fire by AK47...");
    }
}
