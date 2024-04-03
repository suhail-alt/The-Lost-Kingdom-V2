package the.lost.kingdom.v2.builds;

public class Swordsman extends Build {

    public Swordsman() {
        super.setBuildName("Swordsman");
        super.setHealthPoints(30);
        super.setMana(10);
        super.setArmour("Light Armour");
        super.setArmourClass(9);
        super.setRightHand("Long Sword");
        super.setLeftHand("Sword Scabbard");
        super.setSmallWeapon("Dagger");
    }

    @Override
    public void mainAttack() {
        System.out.println("You draw your blade from its sheath,\n "
                         + "take a deep breath while\n "
                         + "you step forward and you swing your massive\n "
                         + "blade at the enemy.");
        int chance = (int) (Math.random() * 10) + 1;
        System.out.println(chance);
        if (chance <= 6) {
            System.out.println("You slash the enemy in half :0\nThe enemy is now dead");
        } else {
            System.out.println("However, you swing with too much force, the enemy ducks\n"
                             + "under your blade as it gets wedged in a tree!\n"
                             + "The enemy takes this opportunity to attack you");
            takeDamage(this.getHealthPoints());
        }

    }

}
