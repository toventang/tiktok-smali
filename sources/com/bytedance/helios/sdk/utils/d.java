package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class d {

    /* renamed from: a */
    public static final Keva f31001a = Keva.getRepo("sky_eye_repo", 1);

    /* renamed from: b */
    public static final d f31002b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(18007);
    }

    public static void a(String str, int i2) {
        l.c(str, "");
        f31001a.storeInt(str, i2);
    }

    public static void b(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        f31001a.storeString(str, str2);
    }

    public static String a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        String string = f31001a.getString(str, str2);
        l.a((Object) string, "");
        return string;
    }
}
