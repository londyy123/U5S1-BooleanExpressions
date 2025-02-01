package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 & 10: ");
            int num = scanner.nextInt();

            if (num >= 1 && num <= 10) {
                if (num % 2 == 0) {
                    return "Even number " + num;
                } else {
                    return "Odd number " + num;
                }
            } else {
                return "Invalid input. Please enter a number between 1 and 10.";
            }
        }

        {
            System.out.println(oddEven());
        }
    }
}