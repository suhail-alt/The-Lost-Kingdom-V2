package the.lost.kingdom.v2;

import java.util.Scanner;
import the.lost.kingdom.v2.builds.*;

public class GameFunctions {
     Scanner sc = new Scanner(System.in);
    Player p = new Player();
    Build b;

    public void run() {
        
        playerCreate();
        new StoryRunner().run();
    }
    
    public void playerCreate(){

    }

    public void pressEnterToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
