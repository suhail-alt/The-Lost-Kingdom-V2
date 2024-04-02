package the.lost.kingdom.v2;

import the.lost.kingdom.v2.builds.Build;

public class Player {
    String name;
    Build build;
    
    public Player (){
        
    }

    public Player(String name, Build build) {
        this.name = name;
        this.build = build;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuild() {
        return build.getBuild();
    }

    public void setBuild(Build build) {
        this.build = build;
    }
    
    
    
}
