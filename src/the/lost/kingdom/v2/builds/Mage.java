package the.lost.kingdom.v2.builds;

public class Mage extends Build {

    public Mage() {
        super.setBuildName("Mage");
        super.setHealthPoints(35);
        super.setMana(40);
        super.setArmour("Mage Robes");
        super.setArmourClass(5);
        super.setRightHand("Sorceror's Staff");
        super.setLeftHand("Magical Shield");
        super.setSmallWeapon("Trowing knives");
    }

    @Override
    public void mainAttack() {
        System.out.println("You hold your staff infront of you,\n "
                         + "call upon your magical power,\n "
                         + "chant your spell...");
        int chance = (int) (Math.random() * 10) + 1;
        System.out.println(chance);
        if (chance <= 6) {
            System.out.println("and you launch a massive fireball at the enemy\n, "
                             + "nothing could survive such heat!\n"
                             + "The enemy is now dead");
        } else {
            System.out.println("but your spell gets interupted by an attacking enemy!!");
            takeDamage(this.getHealthPoints());
        }

    }

}
