package com.ss.android.ugc.aweme.inbox.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.q;
import h.r;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f104111a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f104112b;

    /* renamed from: c  reason: collision with root package name */
    private static String f104113c;

    private e() {
    }

    public static void b() {
        a(d.f104124a);
    }

    public static void c() {
        a(g.f104126a);
    }

    public static void d() {
        a(b.f104122a);
    }

    static {
        Covode.recordClassIndex(66666);
    }

    public static void f() {
        a(i.f104128a);
        e();
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f104114a;

        /* renamed from: b  reason: collision with root package name */
        public long f104115b;

        /* renamed from: c  reason: collision with root package name */
        public b f104116c;

        /* renamed from: d  reason: collision with root package name */
        public long f104117d;

        /* renamed from: e  reason: collision with root package name */
        public long f104118e;

        /* renamed from: f  reason: collision with root package name */
        public l<Integer> f104119f;

        /* renamed from: g  reason: collision with root package name */
        public long f104120g;

        /* renamed from: h  reason: collision with root package name */
        public long f104121h;

        static {
            Covode.recordClassIndex(66667);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104114a == aVar.f104114a && this.f104115b == aVar.f104115b && l.a(this.f104116c, aVar.f104116c) && this.f104117d == aVar.f104117d && this.f104118e == aVar.f104118e && l.a(this.f104119f, aVar.f104119f) && this.f104120g == aVar.f104120g && this.f104121h == aVar.f104121h;
        }

        public final String toString() {
            return "MetaData(clickTs=" + this.f104114a + ", fragConstructorTs=" + this.f104115b + ", lifecycleTracker=" + this.f104116c + ", noticeReqTs=" + this.f104117d + ", noticeRespTs=" + this.f104118e + ", noticeResp=" + this.f104119f + ", adapterSetDataTs=" + this.f104120g + ", renderedTs=" + this.f104121h + ")";
        }

        public /* synthetic */ a() {
            this(0, 0, new b(), 0, 0, null, 0, 0);
        }

        public final int hashCode() {
            int i2;
            long j2 = this.f104114a;
            long j3 = this.f104115b;
            int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            b bVar = this.f104116c;
            int i4 = 0;
            if (bVar != null) {
                i2 = bVar.hashCode();
            } else {
                i2 = 0;
            }
            long j4 = this.f104117d;
            long j5 = this.f104118e;
            int i5 = (((((i3 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            l<Integer> lVar = this.f104119f;
            if (lVar != null) {
                i4 = lVar.hashCode();
            }
            long j6 = this.f104120g;
            long j7 = this.f104121h;
            return ((((i5 + i4) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }

        public a(long j2, long j3, b bVar, long j4, long j5, l<Integer> lVar, long j6, long j7) {
            l.d(bVar, "");
            this.f104114a = j2;
            this.f104115b = j3;
            this.f104116c = bVar;
            this.f104117d = j4;
            this.f104118e = j5;
            this.f104119f = lVar;
            this.f104120g = j6;
            this.f104121h = j7;
        }
    }

    public static void a() {
        if (f.a("inbox_enter_perf", 1.0f)) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (currentUserID != null && currentUserID.length() != 0 && !l.a((Object) f104113c, (Object) currentUserID)) {
                f104113c = currentUserID;
                f104112b = new a();
                a(c.f104123a);
            }
        }
    }

    public static void e() {
        if (f104112b != null) {
            a aVar = f104112b;
            if (aVar == null) {
                l.b();
            }
            if (aVar.f104120g > 0) {
                a aVar2 = f104112b;
                if (aVar2 != null) {
                    Long.valueOf(aVar2.f104120g);
                }
                a aVar3 = f104112b;
                if (aVar3 == null) {
                    l.b();
                }
                aVar3.f104121h = SystemClock.uptimeMillis();
                a aVar4 = f104112b;
                if (aVar4 == null) {
                    l.b();
                }
                long j2 = aVar4.f104114a;
                long j3 = aVar4.f104115b;
                b bVar = aVar4.f104116c;
                long j4 = aVar4.f104117d;
                long j5 = aVar4.f104118e;
                l<Integer> lVar = aVar4.f104119f;
                long j6 = aVar4.f104120g;
                long j7 = aVar4.f104121h;
                l.d(bVar, "");
                b.i.b(new j(new a(j2, j3, bVar, j4, j5, lVar, j6, j7)), b.i.f4824a);
                f104112b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104129a;

        static {
            Covode.recordClassIndex(66676);
        }

        j(a aVar) {
            this.f104129a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            if (f.a("inbox_enter_perf", 1.0f)) {
                final z.a aVar = new z.a();
                int i3 = 0;
                aVar.element = false;
                AnonymousClass1 r10 = new h.f.a.b<Long, Long>() {
                    /* class com.ss.android.ugc.aweme.inbox.d.e.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(66677);
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
                new h.f.a.b<l<T>, l<T>>() {
                    /* class com.ss.android.ugc.aweme.inbox.d.e.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(66678);
                    }

                    @Override // h.f.a.b
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        if (obj == null) {
                            aVar.element = true;
                        }
                        return obj;
                    }
                };
                long a2 = r10.a(this.f104129a.f104115b - this.f104129a.f104114a);
                long a3 = r10.a(this.f104129a.f104121h - this.f104129a.f104114a);
                long a4 = r10.a(this.f104129a.f104121h - this.f104129a.f104120g);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cost", a3);
                    jSONObject.put("construct_cost", a2);
                    jSONObject.put("render_cost", a4);
                    this.f104129a.f104116c.a(jSONObject);
                    l<Integer> lVar = this.f104129a.f104119f;
                    if (lVar != null) {
                        String str = "";
                        if (lVar.f104202b != null) {
                            jSONObject.put("api_notice_status", 1);
                            String message = lVar.f104202b.getMessage();
                            if (message == null) {
                                message = str;
                            }
                            jSONObject.put("api_notice_error", message);
                        } else {
                            jSONObject.put("api_notice_status", 0);
                        }
                        TYPE type = lVar.f104201a;
                        if (type != null) {
                            i2 = type.intValue();
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("api_notice_count", i2);
                        String str2 = lVar.f104203c;
                        if (str2 != null) {
                            str = str2;
                        }
                        jSONObject.put("api_notice_log_id", str);
                    }
                    jSONObject.put("inbox_type", com.ss.android.ugc.aweme.inbox.b.b.a());
                    jSONObject.put("refactor_type", com.ss.android.ugc.aweme.notice.api.ab.a.a());
                    jSONObject.put("perf_level", com.ss.android.ugc.aweme.notice.api.services.b.f112773a.e());
                    if (aVar.element) {
                        i3 = 1;
                    }
                    q.m223constructorimpl(jSONObject.put("invalid_metrics", i3));
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                com.ss.android.ugc.aweme.common.r.a("inbox_enter_perf", jSONObject);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f104126a = new g();

        static {
            Covode.recordClassIndex(66673);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f104127a = new h();

        static {
            Covode.recordClassIndex(66674);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    public static void a(h.f.a.b<? super a, h.z> bVar) {
        a aVar = f104112b;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104122a = new b();

        static {
            Covode.recordClassIndex(66668);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f104120g = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104123a = new c();

        static {
            Covode.recordClassIndex(66669);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f104114a = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104124a = new d();

        static {
            Covode.recordClassIndex(66670);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f104115b = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f104128a = new i();

        static {
            Covode.recordClassIndex(66675);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f104120g = SystemClock.uptimeMillis();
            return h.z.f158842a;
        }
    }

    public static void a(l<Integer> lVar) {
        l.d(lVar, "");
        a(new f(lVar));
    }

    public static void b(l<Integer> lVar) {
        l.d(lVar, "");
        a(h.f104127a);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$e  reason: collision with other inner class name */
    public static final class C2651e extends m implements h.f.a.b<a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2651e f104125a = new C2651e();

        static {
            Covode.recordClassIndex(66671);
        }

        C2651e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f104117d <= 0) {
                aVar2.f104117d = SystemClock.uptimeMillis();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<a, h.z> {
        final /* synthetic */ l $resp;

        static {
            Covode.recordClassIndex(66672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(1);
            this.$resp = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f104118e <= 0) {
                aVar2.f104118e = SystemClock.uptimeMillis();
                aVar2.f104119f = this.$resp;
            }
            return h.z.f158842a;
        }
    }

    public static <T> T a(a aVar, h.f.a.a<? extends T> aVar2) {
        T t;
        l.d(aVar, "");
        l.d(aVar2, "");
        a aVar3 = f104112b;
        return (aVar3 == null || (t = (T) aVar3.f104116c.a(aVar, aVar2)) == null) ? (T) aVar2.invoke() : t;
    }
}
