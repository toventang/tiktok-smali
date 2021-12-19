package com.ss.android.ugc.aweme.inbox.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.f.b.z;
import h.q;
import h.r;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f104140a;

    /* renamed from: b  reason: collision with root package name */
    public static String f104141b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f104142c = new g();

    private g() {
    }

    public static void a() {
        a(C2652g.f104160a);
    }

    public static void b() {
        a(i.f104162a);
    }

    public static void c() {
        a(b.f104155a);
    }

    static {
        Covode.recordClassIndex(66684);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f104143a;

        /* renamed from: b  reason: collision with root package name */
        public long f104144b;

        /* renamed from: c  reason: collision with root package name */
        public b f104145c;

        /* renamed from: d  reason: collision with root package name */
        public long f104146d;

        /* renamed from: e  reason: collision with root package name */
        public long f104147e;

        /* renamed from: f  reason: collision with root package name */
        public long f104148f;

        /* renamed from: g  reason: collision with root package name */
        public long f104149g;

        /* renamed from: h  reason: collision with root package name */
        public long f104150h;

        /* renamed from: i  reason: collision with root package name */
        public long f104151i;

        /* renamed from: j  reason: collision with root package name */
        public long f104152j;

        /* renamed from: k  reason: collision with root package name */
        public long f104153k;

        /* renamed from: l  reason: collision with root package name */
        public long f104154l;

        static {
            Covode.recordClassIndex(66685);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104143a == aVar.f104143a && this.f104144b == aVar.f104144b && h.f.b.l.a(this.f104145c, aVar.f104145c) && this.f104146d == aVar.f104146d && this.f104147e == aVar.f104147e && this.f104148f == aVar.f104148f && this.f104149g == aVar.f104149g && this.f104150h == aVar.f104150h && this.f104151i == aVar.f104151i && this.f104152j == aVar.f104152j && this.f104153k == aVar.f104153k && this.f104154l == aVar.f104154l;
        }

        public final String toString() {
            return "MetaData(clickTs=" + this.f104143a + ", fragConstructorTs=" + this.f104144b + ", lifecycleTracker=" + this.f104145c + ", imReqTs=" + this.f104146d + ", imRespTs=" + this.f104147e + ", multiReqTs=" + this.f104148f + ", multiRespTs=" + this.f104149g + ", recommendReqTs=" + this.f104150h + ", recommendRespTs=" + this.f104151i + ", contactReqTs=" + this.f104152j + ", contactRespTs=" + this.f104153k + ", endTs=" + this.f104154l + ")";
        }

        public /* synthetic */ a() {
            this(0, 0, new b(), 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f104143a;
            long j3 = this.f104144b;
            int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            b bVar = this.f104145c;
            if (bVar != null) {
                i2 = bVar.hashCode();
            } else {
                i2 = 0;
            }
            long j4 = this.f104146d;
            long j5 = this.f104147e;
            long j6 = this.f104148f;
            long j7 = this.f104149g;
            long j8 = this.f104150h;
            long j9 = this.f104151i;
            long j10 = this.f104152j;
            long j11 = this.f104153k;
            long j12 = this.f104154l;
            return ((((((((((((((((((i3 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
        }

        public a(long j2, long j3, b bVar, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
            h.f.b.l.d(bVar, "");
            this.f104143a = j2;
            this.f104144b = j3;
            this.f104145c = bVar;
            this.f104146d = j4;
            this.f104147e = j5;
            this.f104148f = j6;
            this.f104149g = j7;
            this.f104150h = j8;
            this.f104151i = j9;
            this.f104152j = j10;
            this.f104153k = j11;
            this.f104154l = j12;
        }
    }

    public static final class l<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104165a;

        static {
            Covode.recordClassIndex(66696);
        }

        public l(a aVar) {
            this.f104165a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Throwable th;
            int i2;
            if (f.a("inbox_enter_perf_v1", 1.0f)) {
                final z.a aVar = new z.a();
                aVar.element = false;
                AnonymousClass1 r11 = new h.f.a.b<Long, Long>() {
                    /* class com.ss.android.ugc.aweme.inbox.d.g.l.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(66697);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ Long invoke(Long l2) {
                        return Long.valueOf(a(l2.longValue()));
                    }

                    public final long a(long j2) {
                        if (j2 < 0 || j2 > 600000) {
                            aVar.element = true;
                        }
                        return j2;
                    }
                };
                long a2 = r11.a(this.f104165a.f104154l - this.f104165a.f104143a);
                long a3 = r11.a(this.f104165a.f104144b - this.f104165a.f104143a);
                long a4 = r11.a(this.f104165a.f104147e - this.f104165a.f104146d);
                long a5 = r11.a(this.f104165a.f104149g - this.f104165a.f104148f);
                long a6 = r11.a(this.f104165a.f104151i - this.f104165a.f104150h);
                long a7 = r11.a(this.f104165a.f104153k - this.f104165a.f104152j);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cost", a2);
                    jSONObject.put("construct_cost", a3);
                    jSONObject.put("im_cost", a4);
                    jSONObject.put("multi_cost", a5);
                    jSONObject.put("recommend_cost", a6);
                    jSONObject.put("contact_cost", a7);
                    try {
                        this.f104165a.f104145c.a(jSONObject);
                        if (aVar.element) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        q.m223constructorimpl(jSONObject.put("invalid_metrics", i2));
                    } catch (Throwable th2) {
                        th = th2;
                        q.m223constructorimpl(r.a(th));
                        com.ss.android.ugc.aweme.common.r.a("inbox_enter_perf_v1", jSONObject);
                        return h.z.f158842a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    q.m223constructorimpl(r.a(th));
                    com.ss.android.ugc.aweme.common.r.a("inbox_enter_perf_v1", jSONObject);
                    return h.z.f158842a;
                }
                com.ss.android.ugc.aweme.common.r.a("inbox_enter_perf_v1", jSONObject);
            }
            return h.z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104157a = new d();

        static {
            Covode.recordClassIndex(66688);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f104144b = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    public static final class k extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f104164a = new k();

        static {
            Covode.recordClassIndex(66695);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f104143a = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    public static void a(h.f.a.b<? super a, h.z> bVar) {
        a aVar = f104140a;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104155a = new b();

        static {
            Covode.recordClassIndex(66686);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104152j <= 0) {
                aVar2.f104152j = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104156a = new c();

        static {
            Covode.recordClassIndex(66687);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104153k <= 0) {
                aVar2.f104153k = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f104158a = new e();

        static {
            Covode.recordClassIndex(66689);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104146d <= 0) {
                aVar2.f104146d = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static final class f extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f104159a = new f();

        static {
            Covode.recordClassIndex(66690);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104147e <= 0) {
                aVar2.f104147e = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$g  reason: collision with other inner class name */
    static final class C2652g extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2652g f104160a = new C2652g();

        static {
            Covode.recordClassIndex(66691);
        }

        C2652g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104148f <= 0) {
                aVar2.f104148f = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static final class h extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f104161a = new h();

        static {
            Covode.recordClassIndex(66692);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104149g <= 0) {
                aVar2.f104149g = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f104162a = new i();

        static {
            Covode.recordClassIndex(66693);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104150h <= 0) {
                aVar2.f104150h = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static final class j extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f104163a = new j();

        static {
            Covode.recordClassIndex(66694);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aVar2.f104151i <= 0) {
                aVar2.f104151i = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    public static <T> T a(a aVar, h.f.a.a<? extends T> aVar2) {
        T t;
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        a aVar3 = f104140a;
        return (aVar3 == null || (t = (T) aVar3.f104145c.a(aVar, aVar2)) == null) ? (T) aVar2.invoke() : t;
    }
}
