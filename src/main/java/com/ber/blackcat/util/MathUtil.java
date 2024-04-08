package com.ber.blackcat.util;

public class MathUtil {
    public static int Clamp(int value, int min, int max) {
        if (value < min){ return min;}
        else if (value > max){ return max;}
        return value;
    }
}
