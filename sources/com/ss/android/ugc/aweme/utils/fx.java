package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class fx {
    static {
        Covode.recordClassIndex(93555);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String b2 = b(str.trim());
        if (TextUtils.isEmpty(b2)) {
            return "";
        }
        return b2;
    }

    private static String b(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.normalizeNumber(str);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (sb.length() == 0 && charAt == '+') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
