solve 1 :
import java.util.Scanner;

public class Main {
        public static void reverse(float[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                float temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            float[] arr = new float[n];
            System.out.println("Enter " + n + " floating-point numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextFloat();
            }
            reverse(arr);
            System.out.println("Reversed array:");
            for (float num : arr) {
                System.out.print(num + " ");
            }
            scanner.close();
        }
    }
