import java.util.Random;

public class prg1 {

  
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int size = 10000; // Large dataset
        int[] data = new int[size];

        Random rand = new Random();

        
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(100000);
        }

        
        long startTime = System.nanoTime();

        selectionSort(data);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Execution Time: " + executionTime + " nanoseconds");
    }
}
/*
Dataset size: 5000
Execution Time (nanoseconds): 420000000
Execution Time (milliseconds): 420.0
*/
