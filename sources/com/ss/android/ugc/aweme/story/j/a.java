package com.ss.android.ugc.aweme.story.j;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137974a = new a();

    private a() {
    }

    private static boolean a() {
        if (com.ss.android.ugc.aweme.framework.a.a.f96671a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(90237);
    }

    private static String a(String str) {
        return "Story-".concat(String.valueOf(str));
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String a2 = a(str);
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, a2, str2);
        }
    }

    public static void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String a2 = a(str);
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, a2, str2);
        }
    }

    public static void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String a2 = a(str);
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, a2, str2);
        }
    }

    public static void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        String a2 = a(str);
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, a2, Log.getStackTraceString(th));
        }
    }

    public static void a(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        l.d(th, "");
        String a2 = a(str);
        if (a()) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, a2, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
