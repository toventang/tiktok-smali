package com.ss.android.ugc.aweme.mediachoose.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(70073);
    }

    public static final String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        StringBuilder append = new StringBuilder().append(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = " AND ".concat(String.valueOf(str2));
        }
        return append.append(str2).toString();
    }
}
