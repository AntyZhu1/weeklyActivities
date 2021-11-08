package com.anthony.gcd;

public class FindingGCD {

    static int gcd(int a, int b)
    {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int findingGCD(int arrayIn[]) {
        int result = 0;
        for (int i : arrayIn) {
            result = gcd(result, i);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
}
