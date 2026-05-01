public class prg2 {

    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
        long start = System.nanoTime();

        
        bubbleSort(arr);

        
        long end = System.nanoTime();

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
        long time = end - start;

        System.out.println("\nExecution Time (nanoseconds): " + time);
        System.out.println("Execution Time (milliseconds): " + (time / 1_000_000));
    }
}
/*
Before Sorting:
5 2 9 1 3

After Sorting:
1 2 3 5 9

Execution Time (nanoseconds): 12000
Execution Time (milliseconds): 0
*/
