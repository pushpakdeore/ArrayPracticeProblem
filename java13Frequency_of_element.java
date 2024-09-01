package pushpak11Array;
import java.util.Scanner;

public class java13Frequency_of_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        int[] freq = new int[n]; // Temporary array to store frequency counts

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1; // Initialize frequency array with -1
        }

        // Calculate frequency of each element
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0; // Mark this element as counted
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }

        // Display the frequency of each element
        System.out.println("Element | Frequency");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println("   " + arr[i] + "    |    " + freq[i]);
            }
        }

        // Close the sr
    }
}


