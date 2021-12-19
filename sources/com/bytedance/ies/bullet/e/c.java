package com.bytedance.ies.bullet.e;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.ah;
import com.bytedance.ies.bullet.service.base.al;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.f;
import com.bytedance.ies.bullet.service.base.i;
import com.bytedance.ies.bullet.service.base.r;
import com.bytedance.ies.bullet.service.base.x;
import h.f.b.l;
import h.f.b.m;
import h.h;
import org.json.JSONObject;

public final class c implements j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f32129g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.ies.bullet.e.b.b f32130a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.ies.bullet.e.b.c f32131b;

    /* renamed from: c  reason: collision with root package name */
    public i f32132c;

    /* renamed from: d  reason: collision with root package name */
    final h f32133d = h.i.a((h.f.a.a) C0680c.f32138a);

    /* renamed from: e  reason: collision with root package name */
    final r f32134e;

    /* renamed from: f  reason: collision with root package name */
    public final String f32135f;

    /* renamed from: h  reason: collision with root package name */
    private ah f32136h;

    /* renamed from: i  reason: collision with root package name */
    private final h f32137i = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(18843);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return (q) this.f32137i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18844);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.e.c$c  reason: collision with other inner class name */
    static final class C0680c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0680c f32138a = new C0680c();

        static {
            Covode.recordClassIndex(18846);
        }

        C0680c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class b extends m implements h.f.a.a<q> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(18845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) e.a.a().a(this.this$0.f32135f, com.bytedance.ies.bullet.service.base.m.class), "Pool");
        }
    }

    public static final class d implements x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f32140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f32141c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f32142d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f32143e;

        static {
            Covode.recordClassIndex(18847);
        }

        @Override // com.bytedance.ies.bullet.service.base.x
        public final void a() {
            i iVar = this.f32139a.f32132c;
            if (iVar != null) {
                iVar.a(new f(this.f32140b, this.f32141c, com.bytedance.ies.bullet.service.base.c.PRE_RENDER));
            }
            this.f32142d.a();
            if (this.f32143e > 0) {
                ((Handler) this.f32139a.f32133d.getValue()).postDelayed(new a(this), this.f32143e);
            }
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f32144a;

            static {
                Covode.recordClassIndex(18848);
            }

            a(d dVar) {
                this.f32144a = dVar;
            }

            public final void run() {
                c cVar = this.f32144a.f32139a;
                Uri uri = this.f32144a.f32140b;
                Uri a2 = this.f32144a.f32139a.a(this.f32144a.f32140b);
                l.c(uri, "");
                l.c(a2, "");
                l.c("timeout", "");
                com.bytedance.ies.bullet.e.b.b bVar = cVar.f32130a;
                l.c(a2, "");
                boolean b2 = bVar.f32125a.b(a2);
                com.bytedance.ies.bullet.e.b.c cVar2 = cVar.f32131b;
                l.c(a2, "");
                boolean b3 = cVar2.f32127a.b(a2);
                if (b2 || b3) {
                    i iVar = cVar.f32132c;
                    f fVar = new f(uri, a2, com.bytedance.ies.bullet.service.base.c.NONE);
                    int size = cVar.f32130a.f32125a.f32123a.size();
                    int size2 = cVar.f32131b.f32127a.f32123a.size();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prerender_pool_size", String.valueOf(size));
                    jSONObject.put("prerender_pool_max_size", String.valueOf(cVar.f32134e.a()));
                    jSONObject.put("reuse_pool_size", String.valueOf(size2));
                    jSONObject.put("reuse_pool_max_size", String.valueOf(cVar.f32134e.b()));
                    jSONObject.put("reason", "timeout");
                    iVar.a(fVar, jSONObject);
                }
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.x
        public final void a(al alVar, String str) {
            l.c(alVar, "");
            this.f32142d.a(alVar, str);
        }

        d(c cVar, Uri uri, Uri uri2, x xVar, long j2) {
            this.f32139a = cVar;
            this.f32140b = uri;
            this.f32141c = uri2;
            this.f32142d = xVar;
            this.f32143e = j2;
        }
    }

    public final Uri a(Uri uri) {
        Uri a2 = this.f32136h.a(uri);
        return a2 == null ? uri : a2;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    public c(r rVar, String str) {
        l.c(rVar, "");
        l.c(str, "");
        this.f32134e = rVar;
        this.f32135f = str;
        this.f32130a = new com.bytedance.ies.bullet.e.b.b(rVar.a());
        this.f32131b = new com.bytedance.ies.bullet.e.b.c(rVar.b());
        this.f32136h = rVar.c();
        this.f32132c = rVar.d();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }
}
