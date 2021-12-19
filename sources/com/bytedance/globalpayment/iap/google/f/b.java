package com.bytedance.globalpayment.iap.google.f;

import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(17644);
    }

    public static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            sb.append(strArr[i2]).append("\n");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith("\n")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return a.a(sb2);
    }
}
