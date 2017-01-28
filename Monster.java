/* This class represents the monsters over all
 * 
 * ©Michael Wilson, 2017 */
public abstract class Monster extends Character {
   // represents the level that this monster spawns at
   int levelSpawn;
   
   /* Simple to String method of the monsters stats
    * @return String representation of the monsters stats */
   public String toString() {
      return getClassName()
            + "\nHealth: " + getHealth()
            + "\nAttack Power: " + getAttackPower()
            + "\nMagic Power: " + getMagicPower();   
   }
}