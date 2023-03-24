package org.example;

import java.util.Scanner;

public class IntsertionSort {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();

        int key, j;

        for (int i = 1; i < size; i++)
        {
            key = array[i];
            j = i - 1;

        /* Move elements of arr[0..i-1],
           that are greater than key,
           to one position ahead of
           their current position */
            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}