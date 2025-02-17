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



solve 3:

import java.util.Scanner;

public class Lab3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Enter number of courses: ");
            int numCourses = scanner.nextInt();

            int totalCredits = 0;
            int totalWeightedScores = 0;
            for (int i = 1; i <= numCourses; i++) {
                System.out.println("\nCourse " + i + ":");
                System.out.print("Enter Credit (Max 3): ");
                int credit = scanner.nextInt();
                System.out.print("Enter CT score (Max 30): ");
                int ct = scanner.nextInt();
                System.out.print("Enter AT score (Max 10): ");
                int at = scanner.nextInt();

                System.out.print("Enter FE score (Max 60): ");
                int fe = scanner.nextInt();

                int totalMarks = ct + at + fe;
                double gradePoint = calculateGradePoint(totalMarks);

                totalCredits += credit;
                totalWeightedScores += gradePoint * credit;
            }
            double cgpa = (double) totalWeightedScores / totalCredits;
            String grade = calculateGrade(cgpa);
            System.out.println("\nStudent ID: " + studentId);
            System.out.println("Credit Taken: " + totalCredits);
            System.out.println("Credit Earned: " + totalCredits);
            System.out.printf("CGPA: %.2f\n", cgpa);
            System.out.println("Grade: " + grade);

            scanner.close();
        }
        public static double calculateGradePoint(int marks) {
            if (marks >= 90) return 4.0;
            else if (marks >= 80) return 3.5;
            else if (marks >= 70) return 3.0;
            else if (marks >= 60) return 2.5;
            else if (marks >= 50) return 2.0;
            else return 1.0;
        }
        public static String calculateGrade(double cgpa) {
            if (cgpa >= 3.7) return "A+";
            else if (cgpa >= 3.5) return "A-";
            else if (cgpa >= 3.0) return "B";
            else if (cgpa >= 2.5) return "C";
            else return "F";
        }
    }
