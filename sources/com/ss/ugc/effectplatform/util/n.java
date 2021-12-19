package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import d.a.g.e;
import h.f.b.l;
import h.m.p;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f153986a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(102683);
    }

    public static String a(String str) {
        l.c(str, "");
        int a2 = p.a((CharSequence) str, "/");
        int a3 = e.a.a(str, "_v[0-9]");
        int i2 = a2 + 1;
        if (r.a(str, i2, a3)) {
            String substring = str.substring(i2, a3);
            l.a((Object) substring, "");
            return substring;
        }
        int a4 = e.a.a(str, "\\.model|_model|\\.dat");
        if (a4 <= 0 || a4 <= a2) {
            String substring2 = str.substring(i2, str.length());
            l.a((Object) substring2, "");
            return substring2;
        }
        String substring3 = str.substring(i2, a4);
        l.a((Object) substring3, "");
        return substring3;
    }

    public static String b(String str) {
        l.c(str, "");
        p.a((CharSequence) str, "/");
        int a2 = p.a((CharSequence) str, "_v");
        int a3 = e.a.a(str, "\\.model|_model|\\.dat");
        if (a2 <= 0) {
            return "1.0";
        }
        String substring = str.substring(a2 + 2, a3);
        l.a((Object) substring, "");
        return substring;
    }

    public static int c(String str) {
        int a2;
        l.c(str, "");
        if (!p.a((CharSequence) str, (CharSequence) "size", false)) {
            return 0;
        }
        int a3 = p.a((CharSequence) str, "size");
        if (p.a((CharSequence) str, (CharSequence) "md5", false)) {
            a2 = e.a.a(str, "_md5");
        } else {
            a2 = e.a.a(str, "\\.model|_model|\\.dat");
        }
        if (a3 >= a2) {
            return -1;
        }
        String substring = str.substring(a3 + 4, a2);
        l.a((Object) substring, "");
        try {
            return Integer.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String d(String str) {
        l.c(str, "");
        if (!p.a((CharSequence) str, (CharSequence) "md5", false)) {
            return null;
        }
        try {
            String substring = str.substring(p.a((CharSequence) str, "md5", 0, false, 6) + 3, p.a((CharSequence) str, "_model"));
            l.a((Object) substring, "");
            return substring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        boolean z = false;
        if (u.a(str) || u.a(str2)) {
            return false;
        }
        if (u.a(str, str2)) {
            return true;
        }
        try {
            String substring = str.substring(0, p.a((CharSequence) str, ".", 0, false, 6));
            l.a((Object) substring, "");
            String substring2 = str2.substring(0, p.a((CharSequence) str, ".", 0, false, 6));
            l.a((Object) substring2, "");
            z = u.a(substring, substring2);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }
}
