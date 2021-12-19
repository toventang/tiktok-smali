package com.ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(101205);
    }

    public static String a(String str, e eVar) {
        if (TextUtils.isEmpty(str) || eVar == null) {
            return null;
        }
        String a2 = eVar.a(str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }
}
