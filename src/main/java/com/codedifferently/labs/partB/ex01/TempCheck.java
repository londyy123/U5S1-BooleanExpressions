package com.codedifferently.labs.partB.ex01;

public class TempCheck {

    public static String bool(){
        String response= "";

        int temp = 66;

        if (temp <= 45) {
            response += ("It's cold - putting on a coat!");
        }
        if (temp >= 46)  {
            response += ("It's not that bad out - a hoodie will do just fine!");
        }
        else {
            response += ("It's hot - a T shirt will be perfect");
        }



            //Create a program that takes in an expected user input as an integer.

                //The program should compare that input and based on the result of the comparison, print out a statement:

        //If input is less than or equal to 45 - "It's cold - putting on a coat!"
        //If input is greater than or equal to 46 and less than or equal to 65 - "It's not bad out - a hoodie will do just fine!"
        //Any other situation, - "It's hot - a T shirt will be perfect."


        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);

    }
}
