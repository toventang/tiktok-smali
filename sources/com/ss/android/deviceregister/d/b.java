package com.ss.android.deviceregister.d;

import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(36715);
    }

    public static boolean a(String str) {
        int length;
        if (str == null || (length = str.length()) < 13 || length > 160) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
