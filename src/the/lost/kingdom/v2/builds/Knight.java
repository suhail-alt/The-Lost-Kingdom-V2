package the.lost.kingdom.v2.builds;

public class Knight extends Build {

    public Knight() {
        super.setBuildName("Knight");
        super.setHealthPoints(20);
        super.setMana(10);
        super.setArmour("Full Suit Off Armour");
        super.setArmourClass(15);
        super.setRightHand("Basic Sword");
        super.setLeftHand("Medium Shield");
        super.setSmallWeapon("Dagger");
    }

    @Override
    public void mainAttack() {
        System.out.println("You draw your sword,\n "
                + "move into an offensive stance,\n "
                + "and swing your blade with your enemy in its path.");
        int chance = (int) (Math.random() * 10) + 1;
        System.out.println(chance);
        if (chance <= 6) {
            System.out.println("You slash the enemy across its body!\n"
                             + "The enemy is now dead");
        } else {
            System.out.println("However, you the ememy side steps and retaliates!!");
            takeDamage(this.getHealthPoints());
        }

    }

}
