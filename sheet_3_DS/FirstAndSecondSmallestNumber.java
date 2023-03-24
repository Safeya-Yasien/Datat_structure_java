package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndSecondSmallestNumber {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //initialize the size of array
        int size = scanner.nextInt();

        //initialize array
        int[] array = new int[size];

        //take elements of array
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        //function to sort array
        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);

    }
}
