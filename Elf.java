/* The elf class
 * 
 * ©Michael Wilson, 2017 */

public class Elf extends Humanoid {
   public Elf() {
      maxHealth = hp = rand.nextInt(12) + 3;
      maxAttack = att = rand.nextInt(3) + 1;
      maxMagic = mp = rand.nextInt(5) + 1;
      luck = rand.nextInt(40) + 35; 
      catchPhrase = "Welcome to my league";
      classType = "Elf";
      setStats();
   }   

   /* This method says the goblin catch phrase */
   public void greeting() {
      System.out.println("Hello there, " + catchPhrase + "\n\n");
   }
   
}
