package com.google.gson.internal.bind.a;

import com.bytedance.covode.number.Covode;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f54802a = TimeZone.getTimeZone("UTC");

    static {
        Covode.recordClassIndex(33976);
    }

    private static int a(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a3 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date a(java.lang.String r15, java.text.ParsePosition r16) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i2, char c2) {
        if (i2 >= str.length() || str.charAt(i2) != c2) {
            return false;
        }
        return true;
    }

    private static int a(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i4 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i5 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        } else {
            i4 = i2;
            i5 = 0;
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i5 = (i5 * 10) - digit2;
                i4 = i6;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        }
        return -i5;
    }
}
