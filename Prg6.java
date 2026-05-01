import java.util.*;

public class SearchDemo {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 25, 5, 40, 15, 30};

        System.out.print("Array: ");
        for (int x : arr) System.out.print(x + " ");

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        long start1 = System.nanoTime();
        int res1 = linearSearch(arr, key);
        long end1 = System.nanoTime();

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        long start2 = System.nanoTime();
        int res2 = binarySearch(sorted, key);
        long end2 = System.nanoTime();

        if (res1 != -1)
            System.out.println("Linear Search Index: " + res1);
        else
            System.out.println("Linear Search: Not Found");

        if (res2 != -1)
            System.out.println("Binary Search Index (sorted array): " + res2);
        else
            System.out.println("Binary Search: Not Found");

        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");
    }
}
/*
Original Array: 10 25 5 40 15 30
Enter element to search: 15
Sorted Array: 5 10 15 25 30 40

Linear Search: Element found at index 4
Binary Search: Element found at index 2
Linear Search Time: 1200 ns
Binary Search Time: 700 ns
*/
