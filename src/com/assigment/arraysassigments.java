package com.assigment;


import java.util.Arrays;
import java.util.Scanner;

public class arraysassigments {
    public static void main(String[] args) {
        //Assignment_1();
        //Assignment_2();
       Assignment_3();

    }



    static void Assignment_1() {
        int[] elements = new int[]{5, 3, 7, 6, 2, 8};
        for (int i = 0; i < elements.length; i++) {
            System.out.println("For loop: " + elements[i]);
        }
        for (int tempVar : elements) {
            System.out.println("For each loop: " + tempVar);
        }
        int i = 0;
        while (i < elements.length) {
            System.out.println("While loop: " + elements[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println("Do while loop: " + elements[i]);
            i++;
        } while (i < elements.length);

        System.out.println("The best option would be for each loop");
    }

    static void Assignment_2() {
        int[] myArray = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        int oddCount = 0;
        int sum = 0;
        double averageValue = 0;
        int smallerThenAverage = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < 0) {
                System.out.println("Negative element: " + myArray[i]);
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println("Odd element: " + myArray[i]);
                oddCount++;
            }
        }
        System.out.println("Total amount of odd numbers are: " + oddCount + "\n");

        //Verify if there are multiple elements with the same value

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (i != j && myArray[i] == myArray[j]) {
                    System.out.println("Elements with the same value: " + myArray[j]+"\n");
                }
            }
        }

        for (int i = 1; i < myArray.length; i += 2) {
            System.out.println("Every 2nd element of array: " + myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
            averageValue = (double) sum / (double) myArray.length;
        }
        System.out.println("\n Average value is " + averageValue + "\n");
        System.out.println("Smaller than average:");
        for (int i = 0; i < myArray.length; i++) {
        if (myArray[i] < averageValue) {
                System.out.println(myArray[i]);
                smallerThenAverage++;
            }
        }

        System.out.println(smallerThenAverage + " elements are smaller then average");
    }

    static void Assignment_3() {
        byte[] grades = new byte[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Write the grade: ");
        int failed = 0;
        int bestMark = 0;
        int frequency=0;



        for (int i = 0; i < grades.length; i++) {
            byte x = input.nextByte();
            while (x >= 11 || x < 0) {
                System.out.println("Invalid value! Enter valid value:");
                x = input.nextByte();
            }
                grades[i] = x;
        }
        System.out.println("Grades you input" + Arrays.toString(grades));

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 4) {
                failed++;
            }
            if (grades[i] == 10) {
                bestMark++;
            }
        }
        System.out.println("\n" + failed + " students failed exam");
        System.out.println("\n" + bestMark + " student(s) got the best mark A\n");

        for (int i = 0; i <= grades.length; i++){
            frequency = 0;
            for (int j = 0; j< grades.length; j++){
                    if (grades[j] == i){
                    frequency++;
                }
            }
            System.out.println(frequency + " students with the grade " + i);
        }

        }
}







