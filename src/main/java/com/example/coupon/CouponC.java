package com.example.coupon;

public class CouponC {

    public float calculate(int[] cartItems) {
        int total = 800;
        for (int value : cartItems) {
            if (value >= 2000) {
                total += (value * 0.8);
            } else {
                total += value;
            }
        }
        if (total >= 5000) {
            total -= 800;
        }
        return (float) total;
    }
}
