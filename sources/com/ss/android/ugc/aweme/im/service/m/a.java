package com.ss.android.ugc.aweme.im.service.m;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103879a = new a();

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    private a() {
    }

    private static boolean a() {
        if (com.ss.android.ugc.aweme.framework.a.a.f96671a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(66553);
    }

    public static final void a(Throwable th) {
        l.d(th, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }

    public static final void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, str, Log.getStackTraceString(th));
        }
    }

    public static final void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, str, str2);
        }
    }

    public static final void d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(5, str, str2);
        }
    }

    public static final void e(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, str, str2);
        }
    }

    public static final void a(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        l.d(th, "");
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, str, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
