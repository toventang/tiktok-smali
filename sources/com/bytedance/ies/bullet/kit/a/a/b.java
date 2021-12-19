package com.bytedance.ies.bullet.kit.a.a;

import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.kit.a.p;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.m;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.ar;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.g;
import com.bytedance.ies.bullet.service.base.resourceloader.config.h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends IXResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32173a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f32174b = "CDN";

    static {
        Covode.recordClassIndex(18865);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18866);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.f32174b;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b  reason: collision with other inner class name */
    public static final class C0684b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f32176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f32178d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f32179e;

        static {
            Covode.recordClassIndex(18867);
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b$a */
        static final class a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0684b f32180a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f32181b;

            static {
                Covode.recordClassIndex(18868);
            }

            a(C0684b bVar, String str) {
                this.f32180a = bVar;
                this.f32181b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                m g2;
                try {
                    this.f32180a.f32179e.invoke(new Throwable(this.f32181b));
                } catch (Throwable th) {
                    o oVar = this.f32180a.f32178d.s;
                    if (oVar == null || (g2 = oVar.g()) == null || !g2.c()) {
                        j.b.a(this.f32180a.f32175a, this.f32180a.f32175a.getTAG() + ":reject error " + th.getMessage(), null, null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.a.a.b$b$b  reason: collision with other inner class name */
        static final class CallableC0685b<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0684b f32182a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f32183b;

            static {
                Covode.recordClassIndex(18869);
            }

            CallableC0685b(C0684b bVar, g gVar) {
                this.f32182a = bVar;
                this.f32183b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                m g2;
                try {
                    h.f.a.b bVar = this.f32182a.f32176b;
                    Uri parse = Uri.parse(this.f32182a.f32177c);
                    l.a((Object) parse, "");
                    com.bytedance.ies.bullet.kit.a.l lVar = new com.bytedance.ies.bullet.kit.a.l(parse);
                    com.bytedance.ies.bullet.kit.a.c cVar = new com.bytedance.ies.bullet.kit.a.c(new File(this.f32183b.f32618a), ao.CDN);
                    cVar.f32227b = 0L;
                    cVar.f32229d = ao.CDN;
                    cVar.f32226a = this.f32183b.f32619b;
                    lVar.f32288a = cVar;
                    bVar.invoke(lVar);
                } catch (Throwable th) {
                    o oVar = this.f32182a.f32178d.s;
                    if (oVar == null || (g2 = oVar.g()) == null || !g2.c()) {
                        j.b.a(this.f32182a.f32175a, this.f32182a.f32175a.getTAG() + ":resolve error " + th.getMessage(), null, null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return z.f158842a;
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.h
        public final void a(g gVar) {
            l.c(gVar, "");
            i.b(new CallableC0685b(this, gVar), i.f4826c);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.h
        public final void a(String str) {
            l.c(str, "");
            i.b(new a(this, str), i.f4826c);
        }

        C0684b(b bVar, h.f.a.b bVar2, String str, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, h.f.a.b bVar3) {
            this.f32175a = bVar;
            this.f32176b = bVar2;
            this.f32177c = str;
            this.f32178d = jVar;
            this.f32179e = bVar3;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;

        static {
            Covode.recordClassIndex(18871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ap apVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.$input = apVar;
            this.$interval = pVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            ap apVar = this.$input;
            JSONObject jSONObject = apVar.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("c_total", this.$interval.b());
            }
            JSONArray jSONArray = apVar.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "CDN");
            jSONObject2.put("status", "failed");
            jSONObject2.put("message", th2.getMessage());
            jSONArray.put(jSONObject2);
            ap apVar2 = this.$input;
            if (apVar2 instanceof com.bytedance.ies.bullet.kit.a.f) {
                com.bytedance.ies.bullet.kit.a.f fVar = (com.bytedance.ies.bullet.kit.a.f) apVar2;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                fVar.b(sb.append(str).toString());
            }
            this.$reject.invoke(th2);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.kit.a.l, z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ ap $input;
        final /* synthetic */ z.e $result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, z.e eVar, ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = bVar;
            this.$result = eVar;
            this.$input = apVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.kit.a.l lVar) {
            File file;
            com.bytedance.ies.bullet.kit.a.l lVar2 = lVar;
            l.c(lVar2, "");
            com.bytedance.ies.bullet.kit.a.c a2 = lVar2.a();
            if (a2 != null) {
                file = a2.f32228c;
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                z.e eVar = this.$result;
                T t = (T) this.$input;
                t.o = file.getAbsolutePath();
                t.p = ar.DISK;
                t.q = ao.CDN;
                t.r = a2.f32226a;
                JSONArray jSONArray = t.f32564m;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                eVar.element = t;
            }
            JSONArray jSONArray2 = this.$input.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ ap $input;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, ap apVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = bVar;
            this.$input = apVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            JSONArray jSONArray = this.$input.f32564m;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            ap apVar = this.$input;
            if (apVar instanceof com.bytedance.ies.bullet.kit.a.f) {
                com.bytedance.ies.bullet.kit.a.f fVar = (com.bytedance.ies.bullet.kit.a.f) apVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                fVar.b(sb.append(str).toString());
            }
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.kit.a.l, h.z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;

        static {
            Covode.recordClassIndex(18870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.b bVar, ap apVar, p pVar, h.f.a.b bVar2) {
            super(1);
            this.$resolve = bVar;
            this.$input = apVar;
            this.$interval = pVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.kit.a.l lVar) {
            File file;
            com.bytedance.ies.bullet.kit.a.l lVar2 = lVar;
            l.c(lVar2, "");
            com.bytedance.ies.bullet.kit.a.c a2 = lVar2.a();
            if (a2 != null) {
                file = a2.f32228c;
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                this.$reject.invoke(new FileNotFoundException("[cdn] resource not found on url:" + this.$input.n));
                JSONObject jSONObject = this.$input.f32563l.f32555h;
                if (jSONObject != null) {
                    jSONObject.put("c_total", this.$interval.b());
                }
            } else {
                h.f.a.b bVar = this.$resolve;
                ap apVar = this.$input;
                apVar.o = file.getAbsolutePath();
                apVar.p = ar.DISK;
                apVar.q = ao.CDN;
                apVar.r = a2.f32226a;
                JSONArray jSONArray = apVar.f32564m;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, "CDN");
                jSONObject2.put("status", "success");
                jSONArray.put(jSONObject2);
                bVar.invoke(apVar);
                JSONObject jSONObject3 = this.$input.f32563l.f32555h;
                if (jSONObject3 != null) {
                    jSONObject3.put("c_total", this.$interval.b());
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final ap loadSync(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar) {
        l.c(apVar, "");
        l.c(jVar, "");
        j.b.a(this, "start to sync load from cdn", null, null, 6);
        z.e eVar = new z.e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(apVar.n, true, jVar, (h.f.a.b<? super com.bytedance.ies.bullet.kit.a.l, h.z>) new e(this, eVar, apVar, countDownLatch), (h.f.a.b<? super Throwable, h.z>) new f(this, apVar, countDownLatch));
        countDownLatch.await(jVar.f32635i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, h.f.a.b<? super ap, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        Uri parse;
        l.c(apVar, "");
        l.c(jVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        p pVar = new p();
        j.b.a(this, "start to async load from cdn", null, null, 6);
        if (jVar.o.length() == 0) {
            parse = apVar.n;
        } else {
            parse = Uri.parse(jVar.o);
        }
        l.a((Object) parse, "");
        a(parse, false, jVar, (h.f.a.b<? super com.bytedance.ies.bullet.kit.a.l, h.z>) new c(bVar, apVar, pVar, bVar2), (h.f.a.b<? super Throwable, h.z>) new d(apVar, pVar, bVar2));
    }

    private final void a(String str, boolean z, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, h.f.a.b<? super com.bytedance.ies.bullet.kit.a.l, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        g.b.f32252a.a(getService()).o.a(str, z, jVar, new C0684b(this, bVar, str, jVar, bVar2));
    }

    private final void a(Uri uri, boolean z, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, h.f.a.b<? super com.bytedance.ies.bullet.kit.a.l, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            String str = "";
            if (hashCode != -1772600516) {
                if (hashCode != 3213448) {
                }
                String uri2 = uri.toString();
                l.a((Object) uri2, str);
                a(uri2, z, jVar, bVar, bVar2);
                return;
            } else if (scheme.equals("lynxview")) {
                String queryParameter = uri.getQueryParameter("surl");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                a(str, z, jVar, bVar, bVar2);
                return;
            }
        }
        bVar2.invoke(new IllegalArgumentException("cdn Invalid URL"));
    }
}
