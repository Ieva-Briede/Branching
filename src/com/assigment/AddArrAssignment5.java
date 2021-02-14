package com.assigment;

public class AddArrAssignment5 {

    public static void main(String[] args) {
        int[] array = {1,2, 3, 4, 5, 6};
        System.out.println("Non-reverse array is: ");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("Reversed array is: ");
        reverse(array);
        System.out.println();

    }

    //Assignment 5
    public static void reverse(int[] x){
        for (int i = x.length-1; i>=0; i--)
            System.out.print(x[i]);
    }


}

