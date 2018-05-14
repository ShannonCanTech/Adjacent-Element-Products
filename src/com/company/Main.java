package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Boolean done = false;
        int[] inputArray = new int[5];
        Scanner scan = new Scanner(System.in);

        do {
            for (int i = 0; i < 5; i++) {
                System.out.println("Insert number: ");
                inputArray[i] = scan.nextInt();
                scan.nextLine();
            }
            System.out.println("The product is: " + adjacentElementsProduct(inputArray));

            System.out.println("Would you like to create another array?");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {
                done = false;
            } else {
                done = true;
            }
        } while (!done);
    }


    public static int adjacentElementsProduct(int[] inputArray) {

        int product = inputArray[0] * inputArray[1];
        for (int i = 0; i < inputArray.length-1; i++) {
            int adjElements = inputArray[i] * inputArray[i+1];
            if (adjElements > product ){
                product = adjElements;
            }
        }

        return product;
    }
}
