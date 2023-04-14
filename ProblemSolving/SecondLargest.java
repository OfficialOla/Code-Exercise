package ProblemSolving;

import java.util.Scanner;

public class SecondLargest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of inputs: ");
            int numberOfInput = scanner.nextInt();
            int[] arr = new int[numberOfInput];
            for (int i = 0; i < numberOfInput; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
//                arr[(int) i] = (int) scanner.nextDouble();
            }
            int largest = arr[0];
            int secondLargest = arr[0];
            for (int i = 1; i < numberOfInput; i++) {
                if (arr[(int) i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
            System.out.println("Second largest element is: " + secondLargest);
            }
        }

