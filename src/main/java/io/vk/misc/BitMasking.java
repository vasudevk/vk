package io.vk.misc;

import java.math.BigInteger;

public class BitMasking {

    private BigInteger power(int x, int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        }
        int[] res = new int[100000];
        int resSize = 0;
        int temp = x;
        while (temp != 0) {
            res[resSize++] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 2; i <= n; i++) {
            resSize = multiply(x, res, resSize);
        }
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = resSize - 1; i >= 0; i--) {
            stringBuffer.append(res[i]);
        }
        return new BigInteger(stringBuffer.toString());
    }

    private int multiply(int x, int[] res, int resSize) {
        int carry = 0;
        for (int i = 0; i < resSize; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        while (carry > 0) {
            res[resSize] = carry % 10;
            carry = carry / 10;
            resSize++;
        }
        return resSize;
    }

}