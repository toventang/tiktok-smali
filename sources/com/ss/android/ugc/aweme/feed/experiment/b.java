package com.ss.android.ugc.aweme.feed.experiment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f93049a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final b f93050b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final int f93051c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f93052d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final int f93053e = 4;

    /* renamed from: f  reason: collision with root package name */
    private static final int f93054f = 5;

    private b() {
    }

    private static int d() {
        return com.bytedance.ies.abmock.b.a().a(true, "audio_mode", 1);
    }

    static {
        Covode.recordClassIndex(59015);
    }

    public static boolean b() {
        if (d() == f93052d || d() == f93054f) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (d() == f93051c || d() == f93052d) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        String str;
        if (d() == f93049a) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        String str3 = null;
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.toUpperCase(Locale.ROOT);
            l.b(str, "");
        } else {
            str = null;
        }
        if (!(!l.a((Object) str, (Object) "OPPO"))) {
            return false;
        }
        String str4 = Build.MANUFACTURER;
        if (str4 != null) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            str3 = str4.toUpperCase(Locale.ROOT);
            l.b(str3, "");
        }
        if (!l.a((Object) str3, (Object) "REALME")) {
            return true;
        }
        return false;
    }
}
