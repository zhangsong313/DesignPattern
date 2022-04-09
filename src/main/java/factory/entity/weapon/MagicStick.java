package factory.entity.weapon;
// 魔法棒
public class MagicStick extends Weapon{
    @Override
    public void fire() {
        System.out.println("fire by magicStick...");
    }
}
