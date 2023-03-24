package org.example;

public class Power {
    int power(int n, int p)
    {
        if (p == 0)
        {
            //to return the base which we will multiple with n will return the n
            return (1);
        }
        else
        {
            return n * power(n, p-1);
        }
    }

    public static void main(String [] args)
    {
        int n = 5, p = 3;
        Power func = new Power();
        int res = func.power(n, p);

        System.out.println(res);
    }
}
