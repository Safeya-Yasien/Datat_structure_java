package org.example;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        //initialize the size of array
        int size = scanner.nextInt();

        //initialize array
        int[] array = new int[size];

        //take elements of array
        //get the sum of array elements
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        //calc the sum of whole numbers of array
        //why not size (size + 1)
        //because we calc the missing number with them
        int ws = ((size + 1) * (size + 2)) / 2;

        //print the result
        System.out.println(ws - sum);
    }
}
