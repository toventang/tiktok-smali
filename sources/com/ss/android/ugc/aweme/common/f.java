package com.ss.android.ugc.aweme.common;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f76415a = new f();

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    private f() {
    }

    private static boolean a() {
        if (a.f96671a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(47172);
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            a.a(4, str, str2);
        }
    }

    public static final void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            a.a(6, str, str2);
        }
    }

    public static final void a(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            a.b(6, str, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
