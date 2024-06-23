package com.example.coupon;

public class CouponB {

    public float calculate(int[] cartItems) {
        int total = 800;
        for (int value : cartItems) {
            total += (value * 0.9);
        }
        if (total >= 5000) {
            total -= 800;
        }
        return (float) total;
    }
}
