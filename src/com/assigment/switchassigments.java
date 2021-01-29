package com.assigment;

import java.util.Scanner;

public class switchassigments {

   static void Assigment_2_1() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please write number which represents the day number in the week (1 to 7): ");
       int dayNumber = scanner.nextInt();
       switch (dayNumber) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
               System.out.println("It is a working day");
               break;
           case 6:
           case 7:
               System.out.println("It is holiday");
               break;
           default:
               System.out.println("Please add correct verification code!");

       }
   }

       static void Assigment_2_2(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Please write your grade (A, B, C, D, E or F): ");
           char yourGrade = scanner.next().toUpperCase().charAt(0);
           //char.equalsIgnoreCase();
           switch (yourGrade) {
               case 'A':
               case 'B':
                   System.out.println("Perfect! You are so clever!");
                   break;
               case 'C':
                   System.out.println("Good! But you can do better!");
                   break;
               case 'D':
               case 'E':
                   System.out.println("It is not good! You should study!");
                   break;
               case 'F':
                   System.out.println("Fail! You need to repeat the exam");
                   break;
               default:
                   System.out.println("Such grade does not exist! Please write correct grade!");

           }
       }

    static void Assigment_2_3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numerical variable: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second numerical variable: ");
        double num2 = scanner.nextDouble();
        System.out.println("Please choose one of the following calculations you want to do with numbers: \n + to sum; " +
                "\n - to substract; \n / to divide; \n * to multiply; \n % to get remainder; \n p to print out both " +
                "elements; \n b to verify biggest; \n s to verify smallest.");
        char calculation = scanner.next().charAt(0);

        switch (calculation){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case 'p':
                System.out.println(num1 + " and " + num2);
                break;
            case 'b':
                System.out.println(Math.max(num1,num2));
                break;
            case 's':
                System.out.println(Math.min(num1, num2));
                break;
            default:
                System.out.println("There is no such option for calculation! Choose from available options!");

        }

    }

    public static void main(String[] args){
        //Assigment_2_1();

        Assigment_2_2();
       // Assigment_2_3();
    }
}
