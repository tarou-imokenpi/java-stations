package com.example.station9;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから

        // クーポンA適用価格
        // 送料なし
        int total_a = 0;
        for (int value : itemPrices) {
            total_a += value;
        }

        // クーポンB適用価格
        int total_b = 800;
        for (int value : itemPrices) {
            total_b += (value * 0.9);
        }

        // クーポンC適用価格
        int total_c = 800;
        for (int value : itemPrices) {
            if (value >= 2000) {
                total_c += (value * 0.8);
            } else {
                total_c += value;
            }
        }


        // 5000円以上の場合は送料無料
        if (total_b >= 5000) {
            total_b -= 800;
        }
        if (total_c >= 5000) {
            total_c -= 800;
        }

        // もっとも割引率の高いクーポンを求める
        int result = getMin(total_a, total_b, total_c);
        if (result == total_a) {
            System.out.println("A");
        } else if (result == total_b) {
            System.out.println("B");
        } else if (result == total_c) {
            System.out.println("C");
        }
        // ここまで
    }

    private static int getMin(Integer... integers) {
        return Collections.min(Arrays.asList(integers));
    }
}
