/* Level 3
Write a while loop that reads integers from input and calculates integer finalVal as follows:

If the input is not divisible by 4, add the input to finalVal.
Otherwise, subtract the input from finalVal.
The loop iterates until a negative integer is read.

Ex: If the input is 8 5 12 -1, then the output is:

Final value is -15

Note: x % 4 == 0 returns true if x is divisible by 4. */

      while (numInput >= 0) {
         if (numInput % 4 != 0) {
            finalVal = finalVal + numInput;
         }
         else {
            finalVal = finalVal - numInput;
         }
         numInput = scnr.nextInt();
      }
