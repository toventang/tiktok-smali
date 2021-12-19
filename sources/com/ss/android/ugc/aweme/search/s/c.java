package com.ss.android.ugc.aweme.search.s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(79205);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.isEmpty(str.trim());
    }
}
