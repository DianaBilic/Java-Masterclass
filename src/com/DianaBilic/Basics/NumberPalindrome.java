package com.DianaBilic.Basics;

public class NumberPalindrome {

    public static void main (String[] args){
        System.out.println(isPalindrome(-222));
    }


    public static boolean isPalindrome (int number){

        // is number negative
        if (number < 0){
            number *= (-1);
        }

        int ogNr = number;

        // calc reverse number
        int reverse = 0;

        do {

            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        } while (number > 0);

        return (ogNr == reverse) ? true : false;

    }

}
