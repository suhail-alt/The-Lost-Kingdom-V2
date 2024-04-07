package the.lost.kingdom.v2;

import java.util.Scanner;

public class GameFunctions {

    Scanner sc = new Scanner(System.in);

    public void run() {
        

        new StoryRunner().story();
    }

    public void pressEnterToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
