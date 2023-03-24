package org.example;

public class Sum {
    int sum(int n)
    {
        if (n == 0)
        {
            return (0);
        }
        else
        {
            return n + sum(n-1);
        }
    }

    public static void main(String [] args)
    {
        int n = 5;
        Sum func = new Sum();
        int res = func.sum(n);

        System.out.println(res);
    }
}
