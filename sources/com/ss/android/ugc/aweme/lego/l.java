package com.ss.android.ugc.aweme.lego;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final int f107573a = 0;

    /* renamed from: b  reason: collision with root package name */
    static final int f107574b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f107575c = 2;

    /* renamed from: d  reason: collision with root package name */
    static final int f107576d = 4;

    /* renamed from: e  reason: collision with root package name */
    static final int f107577e = 8;

    /* renamed from: f  reason: collision with root package name */
    static final int f107578f = 16;

    /* renamed from: g  reason: collision with root package name */
    static final int f107579g = 32;

    /* renamed from: h  reason: collision with root package name */
    static final int f107580h = 64;

    /* renamed from: i  reason: collision with root package name */
    static final int f107581i = 128;

    /* renamed from: j  reason: collision with root package name */
    public static final int f107582j = 19;

    /* renamed from: k  reason: collision with root package name */
    public static final h f107583k = i.a((h.f.a.a) b.f107587a);

    /* renamed from: l  reason: collision with root package name */
    public static final l f107584l = new l();

    /* renamed from: m  reason: collision with root package name */
    private static final int f107585m = -1;
    private static final h n = i.a((h.f.a.a) g.f107592a);
    private static final h o = i.a((h.f.a.a) f.f107591a);
    private static final h p = i.a((h.f.a.a) a.f107586a);
    private static final h q = i.a((h.f.a.a) c.f107588a);
    private static final h r = i.a((h.f.a.a) e.f107590a);
    private static final h s = i.a((h.f.a.a) d.f107589a);

    public static int a() {
        return ((Number) n.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) o.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) q.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) r.getValue()).booleanValue();
    }

    public static boolean e() {
        return ((Boolean) s.getValue()).booleanValue();
    }

    private l() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107587a = new b();

        static {
            Covode.recordClassIndex(68824);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((l.a() & l.f107575c) != l.f107575c || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107588a = new c();

        static {
            Covode.recordClassIndex(68825);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((l.a() & l.f107579g) != l.f107579g || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107589a = new d();

        static {
            Covode.recordClassIndex(68826);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((l.a() & l.f107581i) != l.f107581i || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f107590a = new e();

        static {
            Covode.recordClassIndex(68827);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((l.a() & l.f107580h) != l.f107580h || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f107591a = new f();

        static {
            Covode.recordClassIndex(68828);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((l.a() & l.f107574b) != l.f107574b || !com.ss.android.ugc.aweme.lego.b.c.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f107592a = new g();

        static {
            Covode.recordClassIndex(68829);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("is_opt_lego_bootfinish", l.f107573a));
        }
    }

    static final class a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107586a = new a();

        static {
            Covode.recordClassIndex(68823);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            if (com.ss.android.ugc.aweme.lego.b.c.a() && (l.a() & l.f107576d) == l.f107576d) {
                j2 = 3000;
            } else if (com.ss.android.ugc.aweme.lego.b.c.a() && (l.a() & l.f107576d) == l.f107577e) {
                j2 = 5000;
            } else if (!com.ss.android.ugc.aweme.lego.b.c.a() || (l.a() & l.f107576d) != l.f107578f) {
                j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            } else {
                j2 = 7000;
            }
            return Long.valueOf(j2);
        }
    }

    static {
        Covode.recordClassIndex(68822);
    }
}
