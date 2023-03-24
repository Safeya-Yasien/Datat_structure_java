package org.example;

import java.util.Scanner;

public class RecursionBinarySearch {

    public static int rec_bin_sea(int[] array, int start, int end, int target)
    {
        int mid = (start + end) / 2;

        if (end < start)
        {
            return (-1);
        }

        if (target == array[mid])
        {
            return (mid);
        }
        else if (target < array[mid])
        {
            return (rec_bin_sea(array, start, mid - 1, target));
        }
        else
        {
            return (rec_bin_sea(array, mid + 1, end, target));
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //take the length of array
        int length = scanner.nextInt();
        //initialize array
        int [] my_arr = new int[length];

        int i, key;
        //take array from user
        for (i = 0; i < length; i++)
        {
            my_arr[i] = scanner.nextInt();
        }

        //take the number you want to search on it
        key = scanner.nextInt();

        int result = rec_bin_sea(my_arr, 0, length - 1, key);

        if (result == -1)
            System.out.println("not found");
        else
            System.out.println("found");

    }
}
