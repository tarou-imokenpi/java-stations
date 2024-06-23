package com.example.coupon;

import java.util.Arrays;
import java.util.Collections;

public class CouponCalculator {
    public String findBestCoupon(int[] cartItems) {
        float total_a = new CouponA().calculate(cartItems);
        float total_b = new CouponB().calculate(cartItems);
        float total_c = new CouponC().calculate(cartItems);

        float result = Collections.min(Arrays.asList(total_a, total_b, total_c));

        if (result == total_a) {
            return "A";
        } else if (result == total_b) {
            return "B";
        } else if (result == total_c) {
            return "C";
        }
        return null;
    }
}
