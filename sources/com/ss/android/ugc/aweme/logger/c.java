package com.ss.android.ugc.aweme.logger;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109013a;

    /* renamed from: b  reason: collision with root package name */
    public static long f109014b;

    /* renamed from: c  reason: collision with root package name */
    public static int f109015c = -999;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f109016a = true;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f109017b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f109018c;

        static {
            Covode.recordClassIndex(69802);
        }

        public static void a(int i2) {
            f.e().a(new WarmBootLogger$BootTypeLogger$1(i2)).a();
        }
    }

    static {
        Covode.recordClassIndex(69801);
    }

    public static void a() {
        if (f109013a && f109014b > 0) {
            f109013a = false;
            f.e().a(new WarmBootLogger$1(SystemClock.uptimeMillis() - f109014b)).a();
        }
    }
}
