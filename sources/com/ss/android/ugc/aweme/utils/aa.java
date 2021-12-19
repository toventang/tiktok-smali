package com.ss.android.ugc.aweme.utils;

import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final h.h f142590a = h.i.a((h.f.a.a) m.f142614a);

    /* renamed from: b  reason: collision with root package name */
    public static final h.h f142591b = h.i.a((h.f.a.a) g.f142608a);

    /* renamed from: c  reason: collision with root package name */
    public static final h.h f142592c = h.i.a((h.f.a.a) h.f142609a);

    /* renamed from: d  reason: collision with root package name */
    public static final h.h f142593d = h.i.a((h.f.a.a) f.f142607a);

    /* renamed from: e  reason: collision with root package name */
    public static final h.h f142594e = h.i.a((h.f.a.a) j.f142611a);

    /* renamed from: f  reason: collision with root package name */
    public static final h.h f142595f = h.i.a((h.f.a.a) e.f142606a);

    /* renamed from: g  reason: collision with root package name */
    public static final h.h f142596g = h.i.a((h.f.a.a) b.f142603a);

    /* renamed from: h  reason: collision with root package name */
    public static final h.h f142597h = h.i.a((h.f.a.a) d.f142605a);

    /* renamed from: i  reason: collision with root package name */
    public static final h.h f142598i = h.i.a((h.f.a.a) c.f142604a);

    /* renamed from: j  reason: collision with root package name */
    public static final h.h f142599j = h.i.a((h.f.a.a) k.f142612a);

    /* renamed from: k  reason: collision with root package name */
    public static final h.h f142600k = h.i.a((h.f.a.a) l.f142613a);

    /* renamed from: l  reason: collision with root package name */
    public static final h.h f142601l = h.i.a((h.f.a.a) r.f142619a);

    /* renamed from: m  reason: collision with root package name */
    public static final h.h f142602m = h.i.a((h.f.a.a) i.f142610a);
    public static final h.h n = h.i.a((h.f.a.a) s.f142620a);
    public static final h.h o = h.i.a((h.f.a.a) n.f142615a);
    public static final h.h p = h.i.a((h.f.a.a) o.f142616a);
    public static final h.h q = h.i.a((h.f.a.a) p.f142617a);
    public static final h.h r = h.i.a((h.f.a.a) q.f142618a);
    public static final a s = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(93277);
        }

        public static BDDateFormat a() {
            return (BDDateFormat) aa.f142595f.getValue();
        }

        public static BDDateFormat b() {
            return (BDDateFormat) aa.f142599j.getValue();
        }

        public static BDDateFormat c() {
            return (BDDateFormat) aa.n.getValue();
        }

        public static BDDateFormat d() {
            return (BDDateFormat) aa.p.getValue();
        }

        public static BDDateFormat e() {
            return (BDDateFormat) aa.r.getValue();
        }

        private static BDDateFormat f() {
            return (BDDateFormat) aa.f142590a.getValue();
        }

        private static BDDateFormat g() {
            return (BDDateFormat) aa.f142591b.getValue();
        }

        private static BDDateFormat h() {
            return (BDDateFormat) aa.f142592c.getValue();
        }

        private static BDDateFormat i() {
            return (BDDateFormat) aa.f142593d.getValue();
        }

        private static BDDateFormat j() {
            return (BDDateFormat) aa.f142594e.getValue();
        }

        private static BDDateFormat k() {
            return (BDDateFormat) aa.f142596g.getValue();
        }

        private static BDDateFormat l() {
            return (BDDateFormat) aa.f142598i.getValue();
        }

        private static BDDateFormat m() {
            return (BDDateFormat) aa.f142600k.getValue();
        }

        private static BDDateFormat n() {
            return (BDDateFormat) aa.f142601l.getValue();
        }

        private static BDDateFormat o() {
            return (BDDateFormat) aa.o.getValue();
        }

        private static BDDateFormat p() {
            return (BDDateFormat) aa.q.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean f(long j2) {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            h.f.b.l.b(instance2, "");
            instance2.setTimeInMillis(j2);
            if (instance2.get(1) == instance.get(1)) {
                return true;
            }
            return false;
        }

        private static boolean g(long j2) {
            if (System.currentTimeMillis() < j2) {
                return true;
            }
            return false;
        }

        private static boolean h(long j2) {
            if (System.currentTimeMillis() - j2 < 604800000) {
                return true;
            }
            return false;
        }

        public static String d(long j2) {
            long millis = TimeUnit.SECONDS.toMillis(j2);
            if (j2 == 0) {
                return "";
            }
            if (bo.a(millis)) {
                return BDDateFormat.a(o(), millis);
            }
            if (bo.c(millis)) {
                return BDDateFormat.a(p(), millis);
            }
            return BDDateFormat.a(k(), millis);
        }

        public static String a(long j2) {
            if (System.currentTimeMillis() - j2 < 60000) {
                return BDDateFormat.a((BDDateFormat) aa.f142602m.getValue(), j2);
            }
            if (System.currentTimeMillis() - j2 < 3600000) {
                return BDDateFormat.a.a(a(j2, 60000), com.bytedance.bddatefmt.a.MINUTE);
            }
            if (System.currentTimeMillis() - j2 < 86400000) {
                return BDDateFormat.a.a(a(j2, 3600000), com.bytedance.bddatefmt.a.HOUR);
            }
            if (h(j2)) {
                return BDDateFormat.a.a(a(j2, 86400000), com.bytedance.bddatefmt.a.DAY);
            }
            if (a(j2, 86400000) == 7) {
                return BDDateFormat.a.a(1, com.bytedance.bddatefmt.a.WEEK);
            }
            if (f(j2)) {
                return BDDateFormat.a(i(), j2);
            }
            return BDDateFormat.a(j(), j2);
        }

        public static String b(long j2) {
            if (j2 == 0) {
                return "";
            }
            if (!g(j2)) {
                if (bo.a(j2)) {
                    return BDDateFormat.a(f(), j2);
                }
                if (bo.b(j2)) {
                    return BDDateFormat.a(n(), j2);
                }
                if (h(j2)) {
                    return BDDateFormat.a(g(), j2);
                }
                if (f(j2)) {
                    return BDDateFormat.a(i(), j2);
                }
            }
            return BDDateFormat.a(j(), j2);
        }

        public static String c(long j2) {
            if (j2 == 0) {
                return "";
            }
            if (!g(j2)) {
                if (bo.a(j2)) {
                    return BDDateFormat.a(f(), j2);
                }
                if (bo.b(j2)) {
                    return BDDateFormat.a(c(), j2);
                }
                if (h(j2)) {
                    return BDDateFormat.a(h(), j2);
                }
                if (f(j2)) {
                    return BDDateFormat.a(l(), j2);
                }
            }
            return BDDateFormat.a(a(), j2);
        }

        public static String e(long j2) {
            long millis = TimeUnit.SECONDS.toMillis(j2);
            if (j2 == 0) {
                return "";
            }
            if (bo.b(millis)) {
                return BDDateFormat.a(c(), millis);
            }
            if (bo.a(millis)) {
                return BDDateFormat.a(d(), millis);
            }
            if (bo.c(millis)) {
                return BDDateFormat.a(e(), millis);
            }
            if (!f(millis)) {
                return BDDateFormat.a(b(), millis);
            }
            return BDDateFormat.a(m(), millis);
        }

        private static int a(long j2, long j3) {
            long currentTimeMillis = (System.currentTimeMillis() - j2) / j3;
            if (currentTimeMillis > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) currentTimeMillis;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142603a = new b();

        static {
            Covode.recordClassIndex(93278);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y, LT");
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f142604a = new c();

        static {
            Covode.recordClassIndex(93279);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y, lt");
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142605a = new d();

        static {
            Covode.recordClassIndex(93280);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y lt");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142606a = new e();

        static {
            Covode.recordClassIndex(93281);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL lt");
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f142607a = new f();

        static {
            Covode.recordClassIndex(93282);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("M/D");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f142608a = new g();

        static {
            Covode.recordClassIndex(93283);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("dddd");
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f142609a = new h();

        static {
            Covode.recordClassIndex(93284);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("dddd lt");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f142610a = new i();

        static {
            Covode.recordClassIndex(93285);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("jn");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f142611a = new j();

        static {
            Covode.recordClassIndex(93286);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("l");
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f142612a = new k();

        static {
            Covode.recordClassIndex(93287);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lll");
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f142613a = new l();

        static {
            Covode.recordClassIndex(93288);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lll-Y");
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f142614a = new m();

        static {
            Covode.recordClassIndex(93289);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lt");
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f142615a = new n();

        static {
            Covode.recordClassIndex(93290);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tdy LT");
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f142616a = new o();

        static {
            Covode.recordClassIndex(93291);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tdy lt");
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f142617a = new p();

        static {
            Covode.recordClassIndex(93292);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tmr LT");
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f142618a = new q();

        static {
            Covode.recordClassIndex(93293);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tmr lt");
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f142619a = new r();

        static {
            Covode.recordClassIndex(93294);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("ytd");
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<BDDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f142620a = new s();

        static {
            Covode.recordClassIndex(93295);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("ytd lt");
        }
    }

    static {
        Covode.recordClassIndex(93276);
    }
}
