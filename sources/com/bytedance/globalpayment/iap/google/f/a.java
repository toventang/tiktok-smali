package com.bytedance.globalpayment.iap.google.f;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(17643);
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        while (i2 < str.length()) {
            sb.append((char) ((str.charAt(i2 - 1) << '\b') + str.charAt(i2)));
            i2 += 2;
        }
        if (i2 == str.length()) {
            sb.append(str.charAt(i2 - 1));
        }
        return sb.toString();
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            String binaryString = Integer.toBinaryString(charAt);
            if (binaryString.length() < 8) {
                sb.append((char) charAt);
            } else {
                int parseInt = Integer.parseInt(binaryString.substring(0, binaryString.length() - 8), 2);
                int parseInt2 = Integer.parseInt(binaryString.substring(binaryString.length() - 8), 2);
                sb.append((char) parseInt);
                sb.append((char) parseInt2);
            }
        }
        return sb.toString();
    }
}
