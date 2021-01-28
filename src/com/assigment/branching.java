package com.assigment;

import java.util.Calendar;
import java.util.Scanner;

public class branching {

    static void Assigment1() {
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
        if (a == b) {
            System.out.println("Variables a and b are equal");
        } else {
            System.out.println("Variables a and b are not equal");
        }
        //Verify if there are any variables which are even. Print out information in the console.
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.println("There are even variables");
        }
        if ((a % 2 == 1) || (b % 2 == 1)) {
            System.out.println("There are odd variables");
        }
        //Verify if there are any variables which are  or positive. Print out information in the console.
        if ((a > 0) || (b > 0)) {
            System.out.println("There are positive variables");
        }
        if ((a < 0) || (b < 0)) {
            System.out.println("There are negative variables");
        }
//Verify if there are any variables which are less than 100. Print out information in thec onsole
        if ((a < 100) || (b < 100)) {
            System.out.println("There are variables which are less than 100");
        } else {
            System.out.println("Both variables are larger than 100");
        }
    }

    static void Assigment2() {
        //Create a variable time with value 8.
        //If the value is smaller than 12, then the greeting message “Good Morning Sunshine!”;
        // If the value is between 13 and 19, then the greeting message “Good Afternoon. Work Hard!”
        // If the value is between 20 and 24, then the greeting message “Good Evening. Get some rest!”
//int time = -2;
        Scanner number = new Scanner(System.in);
        System.out.println("What is time now: ");
        int time = number.nextShort();
//System.out.println("Time currently is " + time);
        if ((time > 24) || (time < 0)) {
            System.out.println("Sorry, you have choosen invalid time. Such time does not exist! Please check and try again!");
        }
        if ((time <= 12) && (time >=0)) {
            System.out.println("Good Morning Sunshine!");
        }
        if ((time > 12) && (time < 19)) {
            System.out.println("Good Afternoon. Work Hard!");
        }
        if ((time > 19) && (time <= 24)) {
            System.out.println("Good Evening. Get some rest!");
        }
        //Change the time variable value to -2 and look at the console. Please add correct verification
        //in the code! Change the time variable value to 100 and look at the console. Please add correct
        // verification in the code!

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


    static void Assigment4() {
        Scanner number = new Scanner(System.in);
        System.out.println("Please write any day number of whole year: ");
        int d = number.nextInt();
        if ((d < 0) || (d > 365)) {
            System.out.println("Incorrect day! Year has 365 days! Please try again!");
            return;
        }
        System.out.println("The day number is: " + d);
        if (d <= 31) {
            System.out.println("It is January");
        }
        if ((d > 31) && (d <= 59)) {
            System.out.println("It is February");
        }
        if ((d > 59) && (d <= 90)) {
            System.out.println("It is March");
        }
        if ((d > 90) && (d <= 120)) {
            System.out.println("It is April");
        }
        if ((d > 120) && (d <= 151)) {
            System.out.println("It is May");
        }
        if ((d > 151) && (d <= 181)) {
            System.out.println("It is June");
        }
        if ((d > 181) && (d <= 212)) {
            System.out.println("It is July");
        }
        if ((d > 212) && (d <= 243)) {
            System.out.println("It is August");
        }
        if ((d > 243) && (d <= 273)) {
            System.out.println("It is September");
        }
        if ((d > 273) && (d <= 304)) {
            System.out.println("It is October");
        }
        if ((d > 304) && (d <= 334)) {
            System.out.println("It is November");
        }
        if ((d > 334) && (d <= 365)) {
            System.out.println("It is December");
        }
    }


    static void Assigment5() {
        Scanner number = new Scanner(System.in);
        System.out.println("Please write in how many hours you have worked today: ");
        int x = number.nextInt();
        if ((x < 0) || (x > 24)) {
            System.out.println("Incorrect value");
            return;
        } else {
            System.out.println("workingHoursInDay = " + x);
        }
        if (x <= 8) {
            System.out.println("Your salary is: " + (x * 10) + " EUR");
        } else {
            System.out.println("Your salary is " + (80 + (x - 8) * 15) + " EUR)");
        }
    }

    static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        } else {
            return 4;
        }

    }

    static void toMilesPerHour(double kilometresPerHour) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("How many kilometres per hour do you drive: ");
        //double kilometresPerHour = scanner.nextDouble();
        //long milesPerHour = (long) kilometresPerHour * 6.21371;
        long milesPerHour = Math.round(kilometresPerHour * 6.21371);
        if (kilometresPerHour < 0) {
            System.out.println("-1");
        } else {
            System.out.println("Miles per Hour: " + milesPerHour);
        }
    }
    static void Assigment4_b() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any anu month number from 1 to 12: ");
        int month = scanner.nextInt();
        System.out.println("Please write any year: ");
        int year = scanner.nextInt();
        if ((month < 0) || (month > 365)) {
            System.out.println("IChoose applicable variables! Please try again!");
            return;
        }
        if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)) {
            System.out.println("Number of days is 31");
        } else if ((month==4) || (month==6) || (month==9) || (month==11)){
            System.out.println("Number of days is 30");
    }else{
        System.out.println("Number of days is 28");
        }
    }

    public static void main(String[] args) {
        //Assigment 1.7
        //toMilesPerHour(87.89);

        //Assigment 1.6 (just first part)
        //displayHighScorePosition("John", 1);
        //displayHighScorePosition("Peter", 2);
        //displayHighScorePosition("Elsa", 3);
        //displayHighScorePosition("Lisa", 4);

        //Assigment 1.6 (running both parts together)

        // int position = calculateHighScorePosition(1500);
        //displayHighScorePosition("John", position);
        //position = calculateHighScorePosition(900);
        //displayHighScorePosition("Peter", position);
        //position = calculateHighScorePosition(400);
        //displayHighScorePosition("Elsa", position);
        //position = calculateHighScorePosition(50);
        //displayHighScorePosition("Lisa", position);

        //Assigment4_b();


        //Assigment1();
        Assigment2();
        //Assigment3();
        //Assigment4();
        // Assigment5();

    }
}
