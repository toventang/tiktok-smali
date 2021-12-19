package com.ss.android.ugc.aweme.shortvideo.p;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.property.ce;
import com.ss.android.ugc.aweme.property.fg;
import com.ss.android.ugc.aweme.property.fh;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;

public final class a {

    /* renamed from: a */
    public static boolean f129530a;

    /* renamed from: b */
    public static boolean f129531b;

    /* renamed from: c */
    public static final a f129532c = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$a */
    public static final class C3375a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a */
        public static final C3375a f129533a = new C3375a();

        static {
            Covode.recordClassIndex(85020);
        }

        C3375a() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        public static boolean a() {
            int[] g2 = com.ss.android.ugc.aweme.property.b.g();
            if (g2 == null || g2.length < 2 || g2[0] != 720) {
                return false;
            }
            return true;
        }
    }

    public static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a */
        public static final b f129534a = new b();

        static {
            Covode.recordClassIndex(85021);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        public static boolean a() {
            int[] h2 = com.ss.android.ugc.aweme.property.b.h();
            if (h2 == null || h2.length < 2 || h2[0] != 720) {
                return false;
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(85019);
    }

    public final void a() {
        int i2;
        int i3;
        MethodCollector.i(10314);
        synchronized (this) {
            try {
                if (f129531b && f129530a) {
                    if (C3375a.a()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    a("resolution", i2, ag.a(v.a("resolution_default", fg.a()), v.a("resolution_category", fh.a()), v.a("resolution_real", com.ss.android.ugc.aweme.property.b.e())).toString());
                    if (b.a()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    a("resolution", i3, ag.a(v.a("resolution_default", fg.a()), v.a("resolution_category_upload", ce.a()), v.a("resolution_real_upload", com.ss.android.ugc.aweme.property.b.f())).toString());
                }
            } finally {
                MethodCollector.o(10314);
            }
        }
    }

    public static void a(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        q.a("aweme_android_white_list", com.ss.android.ugc.aweme.tools.c.a.a(ag.a(v.a("white_list_type", str), v.a("white_list_value", String.valueOf(i2)), v.a("extra", str2))));
    }
}
