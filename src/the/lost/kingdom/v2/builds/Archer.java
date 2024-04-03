package the.lost.kingdom.v2.builds;

public class Archer extends Build{

    public Archer(){
        super.setBuildName("Archer");
        super.setHealthPoints(25);
        super.setMana(10);
        super.setArmour("Chain Armour");
        super.setArmourClass(10);
        super.setRightHand("Long Bow");
        super.setLeftHand("Small Shield");
        super.setSmallWeapon("Trowing knives");        
    }
    
    @Override
    public void mainAttack() {
        System.out.println("You select an Arrow from your quiver,\n dock it on your bow,\n draw the string, steady your aim and fire.");
        int chance = (int) (Math.random() * 10) + 1;
        System.out.println(chance);
        if (chance <= 6) {
            System.out.println("You hit your mark as expected!\nThe enemy is now dead");
        } else {
            System.out.println("However, you miss your mark and your arrow goes astray,\n the enemy attacks you instead!!");
            takeDamage(this.getHealthPoints());
        }

    }
    
    
}
