package com.ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import com.ss.android.ugc.aweme.lego.f;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static long f66733a = 60000;

    /* renamed from: b  reason: collision with root package name */
    static boolean f66734b;

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f66735c;

    /* renamed from: d  reason: collision with root package name */
    static boolean f66736d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f66737e = new g();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66738f = true;

    /* renamed from: g  reason: collision with root package name */
    private static final h f66739g = i.a((h.f.a.a) c.f66750a);

    private g() {
    }

    static final class c extends m implements h.f.a.a<SpringApiLimitConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66750a = new c();

        static {
            Covode.recordClassIndex(41081);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SpringApiLimitConfig invoke() {
            return a();
        }

        private static SpringApiLimitConfig a() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                return iESSettingsProxy.getSpringApiLimitConfig();
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static long b() {
        if (!f66736d) {
            f66733a = c();
            f66736d = true;
        }
        return f66733a;
    }

    static {
        Covode.recordClassIndex(41077);
    }

    public static /* synthetic */ boolean a() {
        l.d("", "");
        if (!f66735c || f66734b) {
            return false;
        }
        if (TextUtils.isEmpty("")) {
            return true;
        }
        com.ss.android.ugc.aweme.app.a.a a2 = com.ss.android.ugc.aweme.app.a.b.a("");
        if (a2 == null || !a2.f66519a) {
            return false;
        }
        return true;
    }

    public static long c() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) f66739g.getValue();
        if (springApiLimitConfig == null || !a(springApiLimitConfig)) {
            return 60000;
        }
        try {
            double random = Math.random();
            long longValue = springApiLimitConfig.getLimitEndTime().longValue();
            Long limitStartTime = springApiLimitConfig.getLimitStartTime();
            l.b(limitStartTime, "");
            double longValue2 = (double) (longValue - limitStartTime.longValue());
            Double.isNaN(longValue2);
            double d2 = random * longValue2;
            Long limitStartTime2 = springApiLimitConfig.getLimitStartTime();
            l.b(limitStartTime2, "");
            double longValue3 = (double) limitStartTime2.longValue();
            Double.isNaN(longValue3);
            return (long) (d2 + longValue3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 60000;
        }
    }

    public static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66742a = new a();

        static {
            Covode.recordClassIndex(41078);
        }

        a() {
        }

        @Override // f.a.w
        public final void subscribe(v<Long> vVar) {
            l.d(vVar, "");
            if (!g.f66736d) {
                long c2 = g.c();
                if (c2 != 60000) {
                    vVar.a(Long.valueOf(c2));
                } else {
                    f.f107536a = 60000;
                }
            } else if (g.f66733a != 60000) {
                vVar.a(Long.valueOf(g.f66733a));
            } else {
                f.f107536a = 60000;
            }
        }
    }

    public static final class b implements z<Long> {

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final a f66745a = new a();

            static {
                Covode.recordClassIndex(41080);
            }

            a() {
            }

            public final void run() {
                g.f66734b = true;
            }
        }

        static {
            Covode.recordClassIndex(41079);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Long l2) {
            g.f66733a = l2.longValue();
            g.f66735c = true;
            g.f66736d = true;
            f.f107536a = g.f66733a;
            new Handler(Looper.getMainLooper()).postDelayed(a.f66745a, g.f66733a);
        }
    }

    public static long a(String str) {
        com.ss.android.ugc.aweme.app.a.a a2;
        l.d(str, "");
        long b2 = b();
        if (b2 == 60000 || (a2 = com.ss.android.ugc.aweme.app.a.b.a(str)) == null) {
            return b2;
        }
        if (a2.f66519a) {
            return 2147483647L;
        }
        return a2.f66520b;
    }

    private static boolean a(SpringApiLimitConfig springApiLimitConfig) {
        if (springApiLimitConfig != null) {
            try {
                long longValue = springApiLimitConfig.getEndTime().longValue();
                Long startTime = springApiLimitConfig.getStartTime();
                l.b(startTime, "");
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue - startTime.longValue() < 0) {
                    return false;
                }
                Long startTime2 = springApiLimitConfig.getStartTime();
                l.b(startTime2, "");
                if (currentTimeMillis - startTime2.longValue() >= 0) {
                    Long endTime = springApiLimitConfig.getEndTime();
                    l.b(endTime, "");
                    if (currentTimeMillis - endTime.longValue() <= 0) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
