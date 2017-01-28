/* This class is the underlying foundation of 
 * all of the characters in this game 
 *
 * ©Michael Wilson, 2017 */
import java.util.*; 
 
public abstract class Character {
   // FIELDS
   String classType;
   
   // it is important to keep track of not only the
   // current amount of health that a player has
   // but also the maxCap of health
   int hp, att, mp, maxHealth, maxAttack, maxMagic;
   Random rand = new Random();
   
      
   /* Method that returns the current health level
    * @return hp */
   int getHealth() {
      return hp;
   }   
   
   /* Method that returns the current attack power level
    * @return att */
   int getAttackPower() {
      return att;
   }
   
   /* Method that returns the current magic power level
    * @return mp */
   int getMagicPower() {
      return mp;
   }
      
   /* Method that sets the health 
    * @param h The health to set to */
   void setHealth(int h) {
      System.out.println("Method called");
      hp = h > maxHealth ? maxHealth : h;
   }
      
   /* Method that sets the attack of the character
    * @param a The attack power to set to */
   void setAttackPower(int a) {
      att = a > maxAttack ? maxAttack : a;
   }
   
   /* Method that sets the magic power 
    * @param m The magic power to set to */
   void setMagicPower(int m) {
      mp = m > maxMagic ? maxMagic : m;
   }
   
   /* Gets the class name 
    * @return The class name */
   String getClassName() {
      return classType;
   }
   
   public abstract String toString();
}