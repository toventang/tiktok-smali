package com.d.a.a.a.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.l;

public final class d {
    static {
        Covode.recordClassIndex(28329);
    }

    public static void a(l lVar) {
        if (lVar.f46360e) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void b(l lVar) {
        d(lVar);
        a(lVar);
    }

    public static void c(l lVar) {
        if (!lVar.e()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    private static void d(l lVar) {
        if (!lVar.f46359d) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
