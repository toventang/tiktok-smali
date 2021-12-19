package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(65544);
    }

    public static final String a(String str) {
        l.d(str, "");
        int length = str.length();
        char[] charArray = str.toCharArray();
        l.b(charArray, "");
        int i2 = 0;
        while (i2 < length) {
            char c2 = charArray[i2];
            if (l.a(c2, 32) > 0 && c2 != 160 && c2 != 12288) {
                break;
            }
            i2++;
        }
        while (i2 < length) {
            char c3 = charArray[length - 1];
            if (l.a(c3, 32) > 0 && c3 != 160 && c3 != 12288) {
                break;
            }
            length--;
        }
        if (i2 <= 0 && length >= str.length()) {
            return str;
        }
        String substring = str.substring(i2, length);
        l.b(substring, "");
        return substring;
    }
}
