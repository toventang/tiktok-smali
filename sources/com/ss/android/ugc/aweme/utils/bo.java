package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.TimeZone;

public final class bo {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f142683a;

        /* renamed from: b  reason: collision with root package name */
        public long f142684b;

        static {
            Covode.recordClassIndex(93347);
        }
    }

    static {
        Covode.recordClassIndex(93346);
    }

    public static a a() {
        a b2 = b();
        b2.f142683a += 86400000;
        b2.f142684b += 86400000;
        return b2;
    }

    private static a c() {
        a b2 = b();
        b2.f142683a -= 86400000;
        b2.f142684b -= 86400000;
        return b2;
    }

    public static a b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        a aVar = new a();
        aVar.f142683a = time;
        aVar.f142684b = time2;
        return aVar;
    }

    public static long d(long j2) {
        return j2 + ((long) TimeZone.getDefault().getRawOffset());
    }

    public static boolean b(long j2) {
        a c2 = c();
        if (j2 <= c2.f142683a || j2 >= c2.f142684b) {
            return false;
        }
        return true;
    }

    public static boolean a(long j2) {
        a b2 = b();
        if (j2 <= b2.f142683a || j2 >= b2.f142684b) {
            return false;
        }
        return true;
    }

    public static boolean c(long j2) {
        a a2 = a();
        if (j2 <= a2.f142683a || j2 >= a2.f142684b) {
            return false;
        }
        return true;
    }
}
