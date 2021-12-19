package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38774a = false;

    static {
        Covode.recordClassIndex(23128);
        i.f38772a = new b();
    }

    public static void a(String str) {
        f.a("imsdk", str, (Throwable) null);
    }

    public static void b(String str) {
        f.b("imsdk", str, (Throwable) null);
    }

    public static void c(String str) {
        if (!d.a().b().X) {
            f.a("imsdk", str, (Throwable) null);
        }
    }

    public static void a(String str, Throwable th) {
        f.a("imsdk", str, th);
    }

    public static void b(String str, Throwable th) {
        f.b("imsdk", str, th);
    }
}
