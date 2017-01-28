/* The goblin class
 * 
 * ©Michael, Wilson */
public class Goblin extends Humanoid {

   public Goblin() {   
      maxHealth = hp = rand.nextInt(9) + 3;
      maxAttack = att = rand.nextInt(4) + 1;
      maxMagic = mp = rand.nextInt(3);
      
      // goblins aren't very luck );
      luck = rand.nextInt(20) + 20; 
      catchPhrase = "Rag town punk";
      classType = "Goblin";
      setStats();
   }   
   
   /* This method says the goblin catch phrase */
   public void greeting() {
      System.out.println("I'm a goblin " + catchPhrase + "\n\n");
   }
}