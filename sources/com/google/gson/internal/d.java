package com.google.gson.internal;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f54867a;

    public static boolean a() {
        if (f54867a >= 9) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34033);
        String property = System.getProperty("java.version");
        int a2 = a(property);
        if (a2 == -1) {
            a2 = b(property);
        }
        if (a2 == -1) {
            a2 = 6;
        }
        f54867a = a2;
    }

    private static int a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
