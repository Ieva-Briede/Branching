package com.assigment;

import java.util.Calendar;
import java.util.Scanner;

public class branching {

    static void Assigment1(){
       //Create two variables with the type short.
        Scanner number = new Scanner(System.in);
        System.out.println("Enter variable a: ");
        short a = number.nextShort();
        System.out.println("Enter variable b: ");
        short b = number.nextShort();

        //Verify which variable is the largest. Print out information in the console.
//Verify which variable is the smallest. Print out information in the console.

        if (a > b) {
            System.out.println("The largest is variable a " + a + " and the smallest is variable b " + b);
        } else {
            System.out.println("The largest is variable b " + b + "and the smallest is variable a " + a);
        }
        //Verify if both variables are equals. Print out information in the console.
        if (a == b){
            System.out.println("Variables a and b are equal");
        } else {
            System.out.println("Variables a and b are not equal");
        }
        //Verify if there are any variables which are even. Print out information in the console.
        if ((a % 2 == 0) || (b % 2 == 0) ) {
            System.out.println("There are even variables");
        }
        if ((a % 2 == 1) || (b % 2 == 1) ) {
            System.out.println("There are odd variables");
        }
        //Verify if there are any variables which are  or positive. Print out information in the console.
        if ((a > 0) || (b>0)) {
            System.out.println("There are positive variables");
        }
        if ((a < 0) || (b<0)) {
            System.out.println("There are negative variables");
        }
//Verify if there are any variables which are less than 100. Print out information in thec onsole
        if ((a < 100) || (b<100)) {
            System.out.println("There are variables which are less than 100");
        } else {
            System.out.println("Both variables are larger than 100");
        }
    }

    static void Assigment2(){
        //Create a variable time with value 8.
        //If the value is smaller than 12, then the greeting message “Good Morning Sunshine!”;
        // If the value is between 13 and 19, then the greeting message “Good Afternoon. Work Hard!”
        // If the value is between 20 and 24, then the greeting message “Good Evening. Get some rest!”
//int time = -2;
        Scanner number = new Scanner(System.in);
        System.out.println("What is time now: ");
        int time = number.nextShort();
//System.out.println("Time currently is " + time);
if ((time <= 12) && (time>1)) {
    System.out.println("Good Morning Sunshine!"); }
if ((time>12) && (time<19)){
    System.out.println("Good Afternoon. Work Hard!"); }
if ((time > 19) && (time<=24)){
    System.out.println("Good Evening. Get some rest!");}
        //Change the time variable value to -2 and look at the console. Please add correct verification
        //in the code! Change the time variable value to 100 and look at the console. Please add correct
       // verification in the code!
if ((time>24) || (time<0)){
    System.out.println("Sorry, you have choosen invalid time. Such time does not exist! Please check and try again!");
}
}
    static void Assigment3() {
        Scanner number = new Scanner(System.in);
        System.out.println("Please write the day: ");
        int d = number.nextInt();
        System.out.println("Please write the month: ");
        int m = number.nextInt();
        System.out.println("Please write the year: ");
        int y = number.nextInt();
        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD: ");
        int dateformat = number.nextInt();
        if ((d < 0) || (d > 31) || (m < 0) || (m > 13) || (y < 0)) {
            System.out.println("Incorrect date! Please try again");
        }
        if ((m == 2) && (d > 28)) {
            System.out.println("Incorrect date. February is a short month");
            return;
        }
        if ((m == 4) || (m == 6) || (m == 9) || (m == 11) && (d > 30)) {
            System.out.println("Incorrect date. April, June, September and November have 30 days. Cannot run the date");
        } else {
            if (dateformat == 1) {
                System.out.println("Your date is: " + y + "/" + m + "/" + d);
            } else {
                System.out.println("Your date is: " + y + "." + m + "." + d);
            }
        }

        }



    static void Assigment4(){
        Scanner number = new Scanner(System.in);
        System.out.println("Please write any day number of whole year: ");
        int d = number.nextInt();
        if ((d < 0)||(d>365)) {
            System.out.println("Incorrect day! Year has 365 days! Please try again!");
            return;
        }
        System.out.println("The day number is: " + d);
        if (d<=31){
            System.out.println("It is January");
        }
        if ((d>31)&&(d<=59)){
            System.out.println("It is February");
        }
        if ((d>59) && (d<=90)){
            System.out.println("It is March");
        }
        if ((d>90) && (d<=120)){
            System.out.println("It is April");
        }
        if ((d>120) && (d<=151)){
            System.out.println("It is May");
        }
        if ((d>151) && (d<=181)){
            System.out.println("It is June");
        }
        if ((d>181) && (d<=212)){
            System.out.println("It is July");
        }
        if ((d>212) && (d<=243)){
            System.out.println("It is August");
        }
        if ((d>243) && (d<=273)){
            System.out.println("It is September");
        }
        if ((d>273) && (d<=304)){
            System.out.println("It is October");
        }
        if ((d>304) && (d<=334)){
            System.out.println("It is November");
        }
        if ((d>334) && (d<=365)){
            System.out.println("It is December");
        }
    }



    static void Assigment5() {
        Scanner number = new Scanner(System.in);
        System.out.println("Please write in how many hours you have worked today: ");
        int x = number.nextInt();
        if ((x<0)||(x>24)){
            System.out.println("Incorrect value");
            return;
        } else {
            System.out.println("workingHoursInDay = " + x);
        }
        if (x<=8){
            System.out.println("Your salary is: " + (x*10) + " EUR" );
        } else {
            System.out.println("Your salary is "+ (80+(x-8)*15) +" EUR)");
        }
    }
    public static void main(String[] args) {

        //Assigment1();
       // Assigment2();
        //Assigment3();
        Assigment4();
       // Assigment5();

    }

}
