package the.lost.kingdom.v2;
import java.util.Scanner;
import the.lost.kingdom.v2.builds.*;

public class GameFunctions {
     Scanner sc = new Scanner(System.in);
     Player p = new Player();
     Build b;
         
    public void run() {
       
        System.out.println("Please enter your name:");

        String name = sc.next().trim();
        p.setName(name);
        System.out.println("Welcome to the story of the Lost Kingdom, " + name + "!!"+
                           "\nPlease Select a Build (Enter 1-4): "+
                           "\n1. Knight"+"\n2. Swordsman"+"\n3. Mage"+"\n4. Archer");
        int buildNum = sc.nextInt();
        
        while (true) {

            if (!(buildNum == 1) && !(buildNum == 2)) {
                System.out.println("Please Enter 1 or 2");
                buildNum = sc.nextInt();
               
            } else {
                break;
            }
            

        }
        
        switch(buildNum){
            case 1 : b = new Knight();
                     break;
            case 2 : b = new Swordsman();
                     break;
            case 3 : b = new Mage();
                     break;
            case 4 : b = new Archer();
                     break;         
            
        }
        p.setBuild(b);        
        System.out.println("Your Build Info:\n"+p.getBuild()+"\n\n");
        
       pressEnterToContinue();
        
        new StoryRunner().story();
    }
    
    private void pressEnterToContinue() { 
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
    
   
    
}
