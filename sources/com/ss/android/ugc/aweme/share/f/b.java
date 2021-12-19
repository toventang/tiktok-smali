package com.ss.android.ugc.aweme.share.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import h.a.i;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f123481a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(81078);
    }

    public static boolean a() {
        if (!g() || f() != 1) {
            return false;
        }
        return true;
    }

    private static int f() {
        return com.bytedance.ies.abmock.b.a().a(true, "put_whatsapp_and_whatsappstatus_in_front", 0);
    }

    public static boolean b() {
        if (!g() || f() != 2) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (!g() || f() != 3) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        if (!g() || f() != 4) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        if (a() || b() || c() || d()) {
            return true;
        }
        return false;
    }

    private static boolean g() {
        String a2 = d.a();
        l.b(a2, "");
        Locale locale = Locale.US;
        l.b(locale, "");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a2.toUpperCase(locale);
        l.b(upperCase, "");
        return i.a(new String[]{"ID", "BR"}, upperCase);
    }
}
