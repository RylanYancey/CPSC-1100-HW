/**
   A class to simulate a combination lock.
*/
public class ComboLock
{
   
	//********* you will need to create appropriate instance variables here
   private int currentNumber = 0; //current value lock dial is set to
   //more variables here ....

   int[] secrets = {0, 0, 0};
   int secrets_unl = 0; 

   /**
      Initializes the combination of the lock.
      
   */

   //**** COMPLETE THIS CONSTRUCTOR - input should be 3 number combination
   //**** You may need to set other instance variables other than the 
   //**** arguments here
   //You should verify that the secret number are in the range 0-39 (inclusive)
   //if the values given are not in that range, clamp them.
   //i.e. the call new ComboLock(0, -20, 45) would create a combination of
   // 0, 0, 39  (the -20 gets clamped to 0 because it was less than 0)
   // (the 45 gets clamped to 39 because it was > 39).
   public ComboLock(int secret1, int secret2, int secret3)
   {
      secrets[0] = clamp(39, 0, secret1);
      secrets[1] = clamp(39, 0, secret2);
      secrets[2] = clamp(39, 0, secret3);
   }
   /**
      Resets the state of the lock so that it can be opened again.
   */
   //********* COMPLETE THIS METHOD
   public void reset()
   {
      currentNumber = 0;

      secrets[0] = 0;
      secrets[1] = 0;
      secrets[2] = 0;
      secrets_unl = 0;
   }

   /**
      Turns lock left given number of ticks.
      @param ticks number of ticks to turn left
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnRight(int ticks)
   {
      currentNumber -= ticks;

      if (currentNumber < 0) 
         currentNumber = currentNumber + 40;

      if (currentNumber == secrets[secrets_unl]) 
         secrets_unl++;
   }

   /**
      Turns lock right given number of ticks
      @param ticks number of ticks to turn right
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnLeft(int ticks)
   {
	   currentNumber += ticks;
      if (currentNumber > 39) 
         currentNumber = currentNumber - 40;

      if (currentNumber == secrets[secrets_unl])
         secrets_unl++;
   }

   /**
      Returns true if the lock can be opened now
      @return true if lock is in open state
   */
   //**** COMPLETE THIS METHOD
   public boolean open()
   {
      if (secrets_unl == 3) return true;
      else return false;
   }
   /**
   Returns current value dial is pointing at
   @return value dial is pointing at currently
    */
   public int getCurrentNumber() {
	   return currentNumber;
   }

   public int clamp(int max, int min, int num) {

      if (num > max) return max;
      else if (num < min) return min;
      else return num;

   }
   
}
