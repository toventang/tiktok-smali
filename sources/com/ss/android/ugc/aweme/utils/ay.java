package com.ss.android.ugc.aweme.utils;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;

public final class ay {
    static {
        Covode.recordClassIndex(93320);
    }

    public static final Integer a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
