import java.util.*;

public abstract class Humanoid extends Character{
   // FIELDS
   // STATS
   int level = 1, bonus, luck, x, y;
   Map<String, Integer> myStats;
   int[][] theMap;
   
   // PHRASES & TYPE
   String catchPhrase;
        
   /* Method that grabs and returns the users luck 
    * @return The luck of the user */
   int getLuck() {
      return luck;
   }
        
   
   /* This method sets up the users stats in a map format
    * NOTE: This is only called after everything else has been constructed */
   void setStats()
   {
      myStats = new TreeMap<>();
      myStats.put("Health: ", hp);
      myStats.put("Attack Power: ", att);
      myStats.put("Magic Power: ", mp);
      myStats.put("Level: ", level);
      myStats.put("Luck: ", luck);
   }
   
   /* This method sets the player's coordinates
    * THIS METHOD IS CALLED ONES A LEVEL IS LOADED */
   void setLocation(int[][] levelMap) {
      theMap = levelMap; 
      x = rand.nextInt(levelMap.length);
      y = rand.nextInt(levelMap[0].length);
   }
   
   
   // NONABSTRACT METHODS
   
   /* This method updates the current health */
   void updateHealth() {
      // remove the current health mapping 
      myStats.remove(myStats.get("Health: "));
      myStats.put("Health: ", maxHealth += bonus);
      
      // auto regen
      hp = maxHealth;
   }

   /* This method updates the current attack power */
   void updateAttack() {
      // remove the current attack mapping 
      myStats.remove(myStats.get("Attack Power: "));
      myStats.put("Attack Power: ", maxAttack += bonus);
      
      // auto regen
      mp = maxAttack;
   }

   /* This method updates the current magic power */
   void updateMagic() {
      // remove the current magic power mapping 
      myStats.remove(myStats.get("Magic Power: "));
      myStats.put("Magic Power: ", maxMagic += bonus);
      
      // auto regen
      mp = maxMagic;
   }   
   
   /* This method updates the current health */
   void updateLevel() {
      // remove the current health mapping 
      myStats.remove(myStats.get("Level: "));
      myStats.put("Level: ", level++);
   }   
   
   // DEALING WITH PLAYER MOVEMENT
   /* Moves left if valid */
   void moveUp() {
      if(y > 0)
         y--;
   }
   
   /* Moves down if valid */
   void moveDown() {
      if(y < theMap[0].length)
         y++;
   }
   
   /* Moves left if valid */
   void moveLeft() {
      if(x > 0)
         x--;
   }
   
   /* Moves right if valid */
   void moveRight() {
      if(x < theMap.length)
         x++;
   }
   
   
   /* Method that returns a string of a characters stats
    * @return String representing basic description of the character */
   public String toString() {
      StringBuilder myString = new StringBuilder();
      myString.append("Current player stats:");
      
      // temp array
      int[] temp = {att, hp, level, luck, mp};
      int counter = 0;
      for(String stat : myStats.keySet()) {
         myString.append("\n");
         myString.append(stat);
         if(!stat.equals("Level: ") && !stat.equals("Luck: ")) {
            myString.append(temp[counter]);
            myString.append("/");
         }
         myString.append(myStats.get(stat));  
         counter++;       
      }
      myString.append("\n");
      return myString.toString();
   }
   
   // ABSTRACT METHODS
   abstract void greeting();
   
}