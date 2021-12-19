package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;

public final class ho {
    static {
        Covode.recordClassIndex(32290);
    }

    public static String a(Context context, String str) {
        try {
            return new t(context).a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String a(String str, String[] strArr, String[] strArr2) {
        r.a(strArr);
        r.a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str2 = strArr[i2];
            if (str == null) {
                if (str2 != null) {
                }
            } else if (!str.equals(str2)) {
            }
            return strArr2[i2];
        }
        return null;
    }
}
