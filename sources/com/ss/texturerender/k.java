package com.ss.texturerender;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(101258);
    }

    public static Class<?> a(String str) {
        ClassLoader a2;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        } else if (j.f151835a == null || (a2 = j.f151835a.a()) == null) {
            return Class.forName(str);
        } else {
            return Class.forName(str, true, a2);
        }
    }
}
