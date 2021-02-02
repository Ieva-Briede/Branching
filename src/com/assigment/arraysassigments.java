package com.assigment;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class arraysassigments {
    public static void main(String[] args) {
        //Assigment_1();
        //Assigment_2();
        Assigment_3();

    }



    static void Assigment_1() {
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

    static void Assigment_2() {
        int[] myArray = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        int i = 0;
        int oddCount = 0;
        int sum = 0;
        int smallerThenAverage = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                System.out.println("Negative element: " + myArray[i]);
            }
        }
        i = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println("Odd element: " + myArray[i]);
                oddCount++;
            }
        }
        System.out.println("\nAmount of odd numbers are: " + oddCount + "\n");

        //Verify if there are multiple elements with the same value
        i = 0;
        for (i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (i != j && myArray[i] == myArray[j]) {
                    System.out.println("There are equal values: \n" + myArray[j]);
                }
            }
        }

        i = 0;
        for (i = 0; i < myArray.length; i += 2) {
            System.out.println("Every 2nd elemnt of array: " + myArray[i]);
        }
        i = 0;
        for (i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
            if (myArray[i] <= ((double) sum / myArray.length)) {
                smallerThenAverage++;
            }
        }
        System.out.println("\n Average value is " + (double) sum / myArray.length + "\n");
        System.out.println(smallerThenAverage + " elements are smaller then average");
    }

    static void Assigment_3() {
        byte[] grades = new byte[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Write the grade: ");
        int failed = 0;
        int bestMark = 0;
        int frequency=0;



        for (int i = 0; i < grades.length; i++) {
            byte x = input.nextByte();
            if (x > 10 || x < 0) {
                System.out.println("Invalid value! Grades are in range from 0 to 10. Start again and input valid values!");
                return;
            } else
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

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 0) {
                frequency++;
            }
        }
            System.out.println(frequency + " students with grade 0");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 1) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 1");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 2");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 3) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 3");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 4) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 4");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 5) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 5");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 6) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 6");
                frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 7) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 7");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 8) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 8");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 9) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 9");
        frequency=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 10) {
                frequency++;
            }
        }
        System.out.println(frequency + " students with grade 10");
        }



        }







