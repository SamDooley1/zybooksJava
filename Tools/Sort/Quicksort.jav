public class QuickSort {
   public static int partition(int [] numbers, int i, int k) {
      int l;
      int h;
      int midpoint;
      int pivot;
      int temp;
      boolean done;

      /* Pick middle element as pivot */
      midpoint = i + (k - i) / 2;
      pivot = numbers[midpoint];

      done = false;
      l = i;
      h = k;

      while (!done) {
         /* Increment l while numbers[l] < pivot */
         while (numbers[l] < pivot) {
            ++l;
         }

         /* Decrement h while pivot < numbers[h] */
         while (pivot < numbers[h]) {
            --h;
         }

         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
         if (l >= h) {
            done = true;
         } 
         else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
            temp = numbers[l];
            numbers[l] = numbers[h];
            numbers[h] = temp;

            ++l;
            --h;
         }
      }

      return h;
   }

   public static void quicksort(int [] numbers, int i, int k) {
      int j;

      /* Base case: If there are 1 or zero entries to sort,
       partition is already sorted */
      if (i >= k) {
         return;
      }

      /* Partition the data within the array. Value j returned
         from partitioning is location of last item in low partition. */
      j = partition(numbers, i, k);

      /* Recursively sort low partition (i to j) and
         high partition (j + 1 to k) */
      quicksort(numbers, i, j);
      quicksort(numbers, j + 1, k);
   }

   public static void main(String [] args) {
      int [] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
      int i;

      System.out.print("UNSORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* Initial call to quicksort */
      quicksort(numbers, 0, numbers.length - 1);

      System.out.print("SORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }
}
