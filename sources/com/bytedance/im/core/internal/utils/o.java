package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;

public final class o {
    static {
        Covode.recordClassIndex(23138);
    }

    public static String a(ah ahVar) {
        if (ahVar != null) {
            try {
                return h.f38770a.b(ahVar);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static ah a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (ah) h.f38770a.a(str, ah.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
