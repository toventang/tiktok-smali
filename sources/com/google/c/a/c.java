package com.google.c.a;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(33234);
    }

    private static boolean a(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String a(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (a(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (a(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }
}
