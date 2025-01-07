import java.util.*;
public class unique_ele_array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input size of the array
        int size = obj.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Unique elements in the array:");
        // Find and print unique elements
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false; // Element is not unique
                    break;
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
