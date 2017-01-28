/* Generic class for moves
 * 
 * ©Michael Wilson, 2017 */
public abstract class Move {
   // FIELDS
   int basePower, accuracy;
   
   /* Method that returns the accuracy of a move */
   int getAccuracy() {
      return accuracy;
   }
   
   /* Method that returns the base power of the move */
   int basePower() { 
      return basePower;
   }
}