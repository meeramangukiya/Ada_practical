import java.util.Random;

public class prg3{

    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int size = 20; // Keep small to display values clearly
        int[] arr = new int[size];

        Random rand = new Random();


        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Print before sorting
        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
        long start = System.nanoTime();

        
        insertionSort(arr);

        
        long end = System.nanoTime();

        
        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

      
        long time = end - start;
        System.out.println("\nExecution Time (ns): " + time);
    }
}
