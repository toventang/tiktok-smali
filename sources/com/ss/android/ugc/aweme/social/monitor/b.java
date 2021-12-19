package com.ss.android.ugc.aweme.social.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.f.b.z;
import h.q;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f133700d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f133701e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f133702a;

    /* renamed from: b  reason: collision with root package name */
    public final int f133703b;

    /* renamed from: c  reason: collision with root package name */
    public final String f133704c;

    public static final class a {
        static {
            Covode.recordClassIndex(87462);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            l.b(str.substring(0, 3), "");
        }
    }

    private final void h() {
        r.a().execute(new RunnableC3465b(this));
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void a() {
        this.f133702a.f133688b = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void b() {
        this.f133702a.f133690d = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void c() {
        this.f133702a.f133691e = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void d() {
        this.f133702a.f133692f = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void e() {
        this.f133702a.f133694h = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void f() {
        this.f133702a.f133695i = SystemClock.uptimeMillis();
        a.a(this.f133704c);
    }

    static {
        Covode.recordClassIndex(87461);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void g() {
        this.f133702a.f133696j = SystemClock.uptimeMillis();
        a.a(this.f133704c);
        h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.monitor.b$b  reason: collision with other inner class name */
    public static final class RunnableC3465b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133705a;

        static {
            Covode.recordClassIndex(87463);
        }

        RunnableC3465b(b bVar) {
            this.f133705a = bVar;
        }

        public final void run() {
            Object obj;
            long j2;
            String message;
            long j3;
            String message2;
            final z.a aVar = new z.a();
            aVar.element = true;
            AnonymousClass1 r6 = new h.f.a.b<Long, Long>() {
                /* class com.ss.android.ugc.aweme.social.monitor.b.RunnableC3465b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87464);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Long invoke(Long l2) {
                    return Long.valueOf(a(l2.longValue()));
                }

                public final long a(long j2) {
                    if (j2 >= -1 && j2 <= 2147483647L) {
                        return j2;
                    }
                    aVar.element = false;
                    return -1;
                }
            };
            a aVar2 = this.f133705a.f133702a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("api_scene", aVar2.f133687a);
                jSONObject.put("is_new_impl", com.ss.android.ugc.aweme.social.widget.card.c.a.a(aVar2.f133697k));
                jSONObject.put("map_size", aVar2.f133699m);
                jSONObject.put("error_count", aVar2.f133698l);
                Throwable th = aVar2.n;
                if (!(th == null || (message2 = th.getMessage()) == null || message2.length() == 0)) {
                    String message3 = th.getMessage();
                    if (message3 == null) {
                        message3 = "";
                    }
                    jSONObject.put("db_error", message3);
                }
                jSONObject.put("cost", r6.a(aVar2.f133696j - aVar2.f133688b));
                jSONObject.put("db_cost", r6.a(aVar2.f133689c - aVar2.f133688b));
                if (aVar2.f133699m != 0) {
                    Long a2 = c.a(aVar2.f133690d);
                    if (a2 != null) {
                        jSONObject.put("filter_cost", r6.a(a2.longValue() - aVar2.f133689c));
                    }
                    Long a3 = c.a(aVar2.f133691e);
                    if (a3 != null) {
                        long longValue = a3.longValue();
                        Long a4 = c.a(aVar2.f133690d);
                        if (a4 != null) {
                            j3 = a4.longValue();
                        } else {
                            j3 = aVar2.f133689c;
                        }
                        jSONObject.put("pre_hash_cost", r6.a(longValue - j3));
                    }
                    long j4 = aVar2.f133692f;
                    Long a5 = c.a(aVar2.f133691e);
                    if (a5 == null && (a5 = c.a(aVar2.f133690d)) == null) {
                        j2 = aVar2.f133689c;
                    } else {
                        j2 = a5.longValue();
                    }
                    jSONObject.put("hash_cost", r6.a(j4 - j2));
                    jSONObject.put("serialize_cost", r6.a(aVar2.f133693g - aVar2.f133692f));
                    jSONObject.put("api_cost", r6.a(aVar2.f133694h - aVar2.f133692f));
                    Long a6 = c.a(aVar2.f133695i);
                    if (a6 != null) {
                        jSONObject.put("construct_cost", r6.a(a6.longValue() - aVar2.f133694h));
                    }
                    Throwable th2 = aVar2.o;
                    if (!(th2 == null || (message = th2.getMessage()) == null)) {
                        if (message.length() != 0) {
                            jSONObject.put("net_error", th2.getMessage());
                        }
                    }
                }
                jSONObject.put("is_valid", com.ss.android.ugc.aweme.social.widget.card.c.a.a(aVar.element));
                a.a(this.f133705a.f133704c);
                r.a("relation_monitor_contact_android", jSONObject);
                obj = q.m223constructorimpl(h.z.f158842a);
            } catch (Throwable th3) {
                obj = q.m223constructorimpl(h.r.a(th3));
            }
            Throwable r1 = q.m226exceptionOrNullimpl(obj);
            if (r1 != null) {
                String str = this.f133705a.f133704c;
                r1.getMessage();
                a.a(str);
            }
            b.f133700d.remove(this.f133705a.f133704c);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void a(Throwable th) {
        l.d(th, "");
        this.f133702a.f133694h = SystemClock.uptimeMillis();
        this.f133702a.o = th;
        String str = this.f133704c;
        th.getMessage();
        a.a(str);
    }

    public b(int i2, String str) {
        l.d(str, "");
        this.f133703b = i2;
        this.f133704c = str;
        this.f133702a = new a(i2, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void a(boolean z, int i2) {
        this.f133702a.f133697k = z;
        this.f133702a.f133689c = SystemClock.uptimeMillis();
        this.f133702a.f133699m = i2;
        a.a(this.f133704c);
        if (i2 <= 0) {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.d
    public final void a(boolean z, int i2, Throwable th) {
        l.d(th, "");
        this.f133702a.f133697k = z;
        this.f133702a.f133698l = i2;
        this.f133702a.n = th;
        String str = this.f133704c;
        th.getMessage();
        a.a(str);
    }
}
