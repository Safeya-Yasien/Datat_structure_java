package org.example;

public class SumDigits {
    int sumDigits(int n)
    {
        int sum = n % 10;
        if (n == 0)
        {
            return (0);
        }
        else
        {
            return sum + sumDigits(n / 10);
        }
    }

    public static void main(String [] args)
    {
        int n = 1230;
        SumDigits func = new SumDigits();
        int res = func.sumDigits(n);

        System.out.println(res);
    }
}
