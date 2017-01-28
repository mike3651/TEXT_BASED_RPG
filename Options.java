/* This is my own option data structure 
 * 
 * ©Michael Wilson, 2017 */

import java.util.*;
public class Options {
   ArrayList<Move> myMoves;
   ArrayList<Item> myItems;
   boolean run;
   
   void addMove(Move theMove) {
      myMoves.add(theMove);
   } 
   
   void addItem(Item theItem) {
      myItems.add(theItem);
   }
   
   void removeItem(Item theItem) {
      myItems.remove(theItem);
   }
   
   void removeMove(Move theMove) {
      myItems.remove(theMove);
   }
   
   /* Method that checks to see as to whether
    * or not a player can run
    * @param luck The characters luck factor
    * @return success > 66% ? true : false; */ 
   boolean canRun(int luck) {
      Random rand = new Random();
      return rand.nextInt(100 - luck) + luck > 66 ? true : false;
   }
   
   /* Method that returns a string rep of the users options
    * @return The options available */
   public String toString() {
      StringBuilder myString = new StringBuilder();
      myString.append("Check my stats [enter \"Stats\"]\n");
      myString.append("Attack\n");
      myString.append("Items\n");
      myString.append("run\n");
      return myString.toString();
   }
   
}