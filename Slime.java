/* Dragon Warrior Monsters is my favorite game of all time
 * A lot of my classes are going to be geared towards DWM's base types
 * 
 * ©Michael Wilson, 2017 */
public class Slime extends Monster{
   public Slime() {
      // spawns on the first level 
      levelSpawn = 1;
      classType = "Slime";
      maxAttack = maxHealth = maxMagic = hp = att = mp = rand.nextInt(2) + levelSpawn;
   }
}