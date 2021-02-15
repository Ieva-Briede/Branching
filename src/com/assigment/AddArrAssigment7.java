package com.assigment;


public class AddArrAssigment7 {

    public static void main(String[] args) {
        System.out.println("Is your choosed number palindrome? \n" + isPalindrome(11212));
        //-1221
        //707
        //11212)
        }

        public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        while (originalNumber != 0) {
           int reminder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            originalNumber = originalNumber / 10;
        }

        return number == reversedNumber;
    }
}