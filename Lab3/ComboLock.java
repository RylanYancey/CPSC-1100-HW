/**
   A class to simulate a combination lock.
*/
public class ComboLock
{
   
	//********* you will need to create appropriate instance variables here
   private int currentNumber = 0; //current value lock dial is set to
   //more variables here ....

   // Stores secrets in an array so we can iterate them
   int[] secrets = {0, 0, 0};

   // tells us how far along we are
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
      // Initialize and Clamp secret numbers. 
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
      // Resets the currentNumber and Secrets unl so we can try again. 
      currentNumber = 0;
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
      // Iterates down the number of ticks
      currentNumber -= ticks;

      // Correction for if you go under zero, wraps around
      if (currentNumber < 0) 
         currentNumber = currentNumber + 40;

      // Checks for if you found one of the secrets. 
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
      // Increase the ticks
	   currentNumber += ticks;

      // Correction for if you go over, wraps around
      if (currentNumber > 39) 
         currentNumber = currentNumber - 40;

      // Checks if you've found the secret. 
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
      // Checks if you've found all the secrets. 
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

   /**
    * <p> Clamps the value to the specified range. 
    * @param max => the maximum value 
    * @param min => the minimum value
    * @param num => the value in question
    * @return
    */
   public int clamp(int max, int min, int num) {

      if (num > max) return max;
      else if (num < min) return min;
      else return num;

   }
   
}
