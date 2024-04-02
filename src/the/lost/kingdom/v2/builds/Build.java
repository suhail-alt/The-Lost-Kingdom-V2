package the.lost.kingdom.v2.builds;


public class Build {
    String buildName;
    int healthPoints;
    int mana;
    String rightHand;
    String leftHand;
    String smallWeapon;
    String armour;
    int armourClass;
    
    public Build(){ 
        
    }

//    public Build(String buildName, int baseHp, int baseMana, String rightHand, String leftHand, String smallWeapon, String armour, int armourClass) {
//        this.buildName = buildName;
//        this.healthPoints = baseHp;
//        this.mana = baseMana;
//        this.rightHand = rightHand;
//        this.leftHand = leftHand;
//        this.smallWeapon = smallWeapon;
//        this.armour = armour;
//        this.armourClass = armourClass;
//    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getRightHand() {
        return rightHand;
    }

    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }

    public String getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public String getSmallWeapon() {
        return smallWeapon;
    }

    public void setSmallWeapon(String smallWeapon) {
        this.smallWeapon = smallWeapon;
    }

    public String getArmour() {
        return armour;
    }

    public void setArmour(String armour) {
        this.armour = armour;
    }

    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }
    
    public String getBuild(){
          return "Build Name: "+ getBuildName()+
                 "\nHealth Points: "+ getHealthPoints()+
                 "\nMana: "+ getMana()+
                 "\nRight Hand Weapon: "+ getRightHand()+
                 "\nLeft Hand Weapon: "+ getLeftHand()+
                 "\nSmall Weapon: "+ getSmallWeapon()+
                 "\nArmour Type: "+ getArmour()+
                 "\nArmour Class: "+ getArmourClass();
    }
    
}
