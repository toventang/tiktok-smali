package com.google.android.gms.common.util;

import android.util.Base64;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(31465);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
