package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.v;
import java.util.List;

public final class at {
    static {
        Covode.recordClassIndex(93315);
    }

    public static String a(String str) {
        List<String> a2;
        if (!TextUtils.isEmpty(str) && str.contains("challenge/detail") && (a2 = v.a(str)) != null && a2.size() > 0) {
            return a2.get(a2.size() - 1);
        }
        return null;
    }
}
