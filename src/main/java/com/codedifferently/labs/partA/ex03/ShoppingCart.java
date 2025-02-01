package com.codedifferently.labs.partA.ex03;

public class ShoppingCart {
    public static String shopping(){
        String response = "";
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;


        // Declare outOfStock variable and initialize it
            boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
            if (quantity > 1)  {
                message = "There are " + quantity + " amount of items";
            }

        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println("This item is out of stock.");
        } else {
            System.out.println(message);
        }
        System.out.print(custName + " wants to purchase " + quantity + " Shirts");
        System.out.println(" Total cost with tax: $" + total);
        return response;
    }



    public static void main(String[] args) {
        String shopOutput = shopping();
        System.out.println(shopOutput);

    }}
