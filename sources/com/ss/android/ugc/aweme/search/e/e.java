package com.ss.android.ugc.aweme.search.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.TimeUnit;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final h f121014a = new h((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final e f121015b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final long f121016c = TimeUnit.HOURS.toMillis(12);

    private e() {
    }

    public static String c() {
        String str;
        h e2 = e();
        if (e2 == null || (str = e2.f121019c) == null) {
            return "";
        }
        return str;
    }

    public static String d() {
        String str;
        h e2 = e();
        if (e2 == null || (str = e2.f121020d) == null) {
            return "";
        }
        return str;
    }

    static {
        Covode.recordClassIndex(78838);
    }

    public static boolean a() {
        Integer num;
        h e2 = e();
        if (e2 == null || (num = e2.f121017a) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static long b() {
        Long l2;
        h e2 = e();
        if (e2 == null || (l2 = e2.f121018b) == null) {
            return f121016c;
        }
        return l2.longValue();
    }

    private static h e() {
        return (h) SettingsManager.a().a("search_easter_egg", h.class, f121014a);
    }
}
