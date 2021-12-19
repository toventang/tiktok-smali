package com.bytedance.lynx.hybrid.resource.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.h;
import com.bytedance.lynx.hybrid.resource.config.i;
import com.bytedance.lynx.hybrid.resource.f;
import com.bytedance.lynx.hybrid.resource.j;
import com.bytedance.lynx.hybrid.resource.n;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends IHybridResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41041a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f41042b = "CDN";

    static {
        Covode.recordClassIndex(25147);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25148);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.f41042b;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b  reason: collision with other inner class name */
    public static final class C0999b implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f41043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f41044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f41046d;

        static {
            Covode.recordClassIndex(25149);
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b$a */
        static final class a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0999b f41047a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f41048b;

            static {
                Covode.recordClassIndex(25150);
            }

            a(C0999b bVar, String str) {
                this.f41047a = bVar;
                this.f41048b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                try {
                    this.f41047a.f41046d.invoke(new Throwable(this.f41048b));
                } catch (Throwable th) {
                    if (!c.a.a().f40901a) {
                        com.bytedance.lynx.hybrid.j.c.a(this.f41047a.f41043a.getTAG() + ":reject error " + th.getMessage(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.bytedance.lynx.hybrid.resource.b.b$b$b  reason: collision with other inner class name */
        static final class CallableC1000b<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0999b f41049a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f41050b;

            static {
                Covode.recordClassIndex(25151);
            }

            CallableC1000b(C0999b bVar, h hVar) {
                this.f41049a = bVar;
                this.f41050b = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                try {
                    h.f.a.b bVar = this.f41049a.f41044b;
                    Uri parse = Uri.parse(this.f41049a.f41045c);
                    l.a((Object) parse, "");
                    n nVar = new n(parse);
                    com.bytedance.lynx.hybrid.resource.e eVar = new com.bytedance.lynx.hybrid.resource.e(new File(this.f41050b.f41103a), com.bytedance.lynx.hybrid.resource.d.d.CDN);
                    eVar.f41140b = 0L;
                    eVar.f41142d = com.bytedance.lynx.hybrid.resource.d.d.CDN;
                    eVar.f41139a = this.f41050b.f41104b;
                    nVar.f41232a = eVar;
                    bVar.invoke(nVar);
                } catch (Throwable th) {
                    if (!c.a.a().f40901a) {
                        com.bytedance.lynx.hybrid.j.c.a(this.f41049a.f41043a.getTAG() + ":resolve error " + th.getMessage(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                    } else {
                        throw new Throwable(th);
                    }
                }
                return z.f158842a;
            }
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.i
        public final void a(h hVar) {
            l.c(hVar, "");
            b.i.a(new CallableC1000b(this, hVar), b.i.f4826c);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.i
        public final void a(String str) {
            l.c(str, "");
            b.i.a(new a(this, str), b.i.f4826c);
        }

        C0999b(b bVar, h.f.a.b bVar2, String str, h.f.a.b bVar3) {
            this.f41043a = bVar;
            this.f41044b = bVar2;
            this.f41045c = str;
            this.f41046d = bVar3;
        }
    }

    static final class c extends m implements h.f.a.b<n, z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;

        static {
            Covode.recordClassIndex(25152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.b bVar, com.bytedance.lynx.hybrid.resource.d.e eVar, h.f.a.b bVar2) {
            super(1);
            this.$resolve = bVar;
            this.$input = eVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            File file;
            n nVar2 = nVar;
            l.c(nVar2, "");
            com.bytedance.lynx.hybrid.resource.e a2 = nVar2.a();
            if (a2 == null || (file = a2.f41141c) == null || !file.exists()) {
                this.$reject.invoke(new FileNotFoundException("[cdn] resource not found on url:" + this.$input.f41131m));
            } else {
                h.f.a.b bVar = this.$resolve;
                com.bytedance.lynx.hybrid.resource.d.e eVar = this.$input;
                eVar.n = file.getAbsolutePath();
                eVar.o = com.bytedance.lynx.hybrid.resource.d.h.DISK;
                eVar.p = com.bytedance.lynx.hybrid.resource.d.d.CDN;
                eVar.q = a2.f41139a;
                JSONArray jSONArray = eVar.f41130l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                bVar.invoke(eVar);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ h.f.a.b $reject;

        static {
            Covode.recordClassIndex(25153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.lynx.hybrid.resource.d.e eVar, h.f.a.b bVar) {
            super(1);
            this.$input = eVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, "CDN");
            jSONObject.put("status", "failed");
            jSONObject.put("message", th2.getMessage());
            jSONArray.put(jSONObject);
            com.bytedance.lynx.hybrid.resource.d.e eVar = this.$input;
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                jVar.b(sb.append(str).toString());
            }
            this.$reject.invoke(th2);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<n, z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ z.e $result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(25154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, z.e eVar, com.bytedance.lynx.hybrid.resource.d.e eVar2, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = bVar;
            this.$result = eVar;
            this.$input = eVar2;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(n nVar) {
            File file;
            n nVar2 = nVar;
            l.c(nVar2, "");
            com.bytedance.lynx.hybrid.resource.e a2 = nVar2.a();
            if (a2 != null) {
                file = a2.f41141c;
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                z.e eVar = this.$result;
                T t = (T) this.$input;
                t.n = file.getAbsolutePath();
                t.o = com.bytedance.lynx.hybrid.resource.d.h.DISK;
                t.p = com.bytedance.lynx.hybrid.resource.d.d.CDN;
                t.q = a2.f41139a;
                JSONArray jSONArray = t.f41130l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, "CDN");
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
                eVar.element = t;
            }
            JSONArray jSONArray2 = this.$input.f41130l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "success");
            jSONArray2.put(jSONObject2);
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e $input;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(25155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, com.bytedance.lynx.hybrid.resource.d.e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.this$0 = bVar;
            this.$input = eVar;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            JSONArray jSONArray = this.$input.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.this$0.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            com.bytedance.lynx.hybrid.resource.d.e eVar = this.$input;
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                StringBuilder sb = new StringBuilder("cdn ");
                String message = th2.getMessage();
                if (message != null) {
                    str = message;
                }
                jVar.b(sb.append(str).toString());
            }
            this.$countDown.countDown();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final com.bytedance.lynx.hybrid.resource.d.e loadSync(com.bytedance.lynx.hybrid.resource.d.e eVar, com.bytedance.lynx.hybrid.resource.config.j jVar) {
        l.c(eVar, "");
        l.c(jVar, "");
        com.bytedance.lynx.hybrid.j.c.a("start to sync load from cdn", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        z.e eVar2 = new z.e();
        eVar2.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(eVar.f41131m, true, jVar, (h.f.a.b<? super n, h.z>) new e(this, eVar2, eVar, countDownLatch), (h.f.a.b<? super Throwable, h.z>) new f(this, eVar, countDownLatch));
        countDownLatch.await(jVar.f41108d, TimeUnit.MILLISECONDS);
        return eVar2.element;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(com.bytedance.lynx.hybrid.resource.d.e eVar, com.bytedance.lynx.hybrid.resource.config.j jVar, h.f.a.b<? super com.bytedance.lynx.hybrid.resource.d.e, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        Uri parse;
        l.c(eVar, "");
        l.c(jVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        new com.bytedance.lynx.hybrid.resource.i.c();
        com.bytedance.lynx.hybrid.j.c.a("start to async load from cdn", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        if (jVar.f41114j.length() == 0) {
            parse = eVar.f41131m;
        } else {
            parse = Uri.parse(jVar.f41114j);
        }
        l.a((Object) parse, "");
        a(parse, false, jVar, (h.f.a.b<? super n, h.z>) new c(bVar, eVar, bVar2), (h.f.a.b<? super Throwable, h.z>) new d(eVar, bVar2));
    }

    private final void a(String str, boolean z, com.bytedance.lynx.hybrid.resource.config.j jVar, h.f.a.b<? super n, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        com.bytedance.lynx.hybrid.resource.config.d dVar = f.b.f41155a.a(getService()).f41089a;
        if (dVar == null) {
            l.a();
        }
        dVar.a(str, z, jVar, new C0999b(this, bVar, str, bVar2));
    }

    private final void a(Uri uri, boolean z, com.bytedance.lynx.hybrid.resource.config.j jVar, h.f.a.b<? super n, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
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
