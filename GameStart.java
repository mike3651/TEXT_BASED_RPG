/* This class just kicks off this small RPG adventure game
 * This does nothing more than help me understand abstraction,
 * inheritance
 * 
 * ©Michael Wilson, 2017 */
 
import java.util.*;
import java.io.*;

public class GameStart {
   // list of the current monster classes 
   private static final Monster[] MONSTERS = {new Slime()};

   // keeps track of the users class
   private static Humanoid playerClass;
   
   // keeps track of the users response
   private static String userResponse;
   
   // list of options
   private static Options myOptions;
   
   // just a random object
   private static Random rand = new Random();
   
   // just a random scanner
   private static Scanner scan = new Scanner(System.in);
   
   public static void main(final String[] args) {
      myOptions = new Options();
      // want to allow the user to select a class
      // for now: elf || goblin
      System.out.println("What class would you like to choose from: elf || goblin?");
      userResponse = scan.next();
      switch(userResponse) {
         case "goblin" : case"Goblin":
            playerClass = new Goblin();
            break;
         case "elf": case "Elf":
            playerClass = new Elf();
            break;
      }
      playerClass.greeting();
      System.out.println(playerClass.toString());       
      monsterEncounter();         
        
   }   
   
   /* Method that simulates a monster encounter */
   private static void monsterEncounter() {
      Monster selected = MONSTERS[rand.nextInt(MONSTERS.length)];
      
      System.out.println("Oh no! A " + selected.getClassName() + " has appeared!");
      System.out.println("Here are its stats: \n" + selected.toString());
      boolean inCombat = true;
      
      while(inCombat) {
         System.out.println("\n\nWhat would you like to do?\n" + myOptions.toString());
         userResponse = scan.next();
         switch(userResponse) {
            case "Stats": case "stats" :
               System.out.println(playerClass.toString()); 
               break;
            case "Attack": case "attack" : break;
            case "Items": case "items": break;
            case "Run": case "run" :
               if(myOptions.canRun(playerClass.getLuck())) {
                  System.out.println("You ran away.");
                  inCombat = false;
               } else {
                  System.out.println("You couldn't run away!");
                  int damageDealt = selected.getAttackPower();
                  System.out.println("The monster attacked! It dealt " 
                    + damageDealt + " to you!");
                  playerClass.setHealth(playerClass.getHealth() - damageDealt);
               }
            break;
         }
      }
   }
}