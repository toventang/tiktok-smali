package com.ss.android.ugc.aweme.utils.permission;

import androidx.core.content.b;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(93715);
    }

    public static int a() {
        if (a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    private static boolean a(String str) {
        try {
            if (b.a(com.bytedance.ies.ugc.appcontext.d.a(), str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }
}
