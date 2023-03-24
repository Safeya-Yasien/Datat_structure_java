package org.example;

import java.util.Scanner;

public class TwoElementsSumEqualZero {

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

        //suppose the first two elements there sum equals to 0 or close to zero
        int minimum = Math.abs(array[0] + array[1]);

        //to print the smallest elements we will store their indexs in variables
        int sum = 0, min1 = 0, min2 = 1;

        //loop on array from the start to the end
        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                //sum every two numbers
                sum = Math.abs(array[i] + array[j]);

                //compare the result with the result of the two first elements
                if(sum < minimum)
                {
                    //if the sum of two numbers is large than two other numbers then
                    //store the index of this number in variable to print his value of array
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }

        System.out.println(array[min1]);
        System.out.println(array[min2]);

    }
}
