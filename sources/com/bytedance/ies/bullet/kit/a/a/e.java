package com.bytedance.ies.bullet.kit.a.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.kit.a.l;
import com.bytedance.ies.bullet.kit.a.m;
import com.bytedance.ies.bullet.kit.a.p;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.ar;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.kakao.usermgmt.StringSet;
import h.f.b.z;
import h.q;
import h.r;
import h.w;
import h.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32190a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f32191b = "GECKO";

    static {
        Covode.recordClassIndex(18876);
    }

    @Override // com.bytedance.ies.bullet.kit.a.a.c, com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18877);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public String getTAG() {
        return this.f32191b;
    }

    public final void a(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, String str, String str2, boolean z, h.f.a.b<? super ap, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        String concat;
        com.bytedance.ies.bullet.kit.a.f fVar;
        String str3;
        Long l2;
        MethodCollector.i(11377);
        p pVar = new p();
        Uri a2 = m.a(f.a(str, str2));
        l a3 = a(a2, jVar, str);
        com.bytedance.ies.bullet.kit.a.c a4 = a3 != null ? a3.a() : null;
        JSONObject jSONObject = apVar.f32563l.f32555h;
        long j2 = 0;
        if (jSONObject != null) {
            try {
                l2 = q.m223constructorimpl(Long.valueOf(jSONObject.getLong("g_local")));
            } catch (Throwable th) {
                l2 = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(l2)) {
                l2 = 0L;
            }
            jSONObject.put("g_local", ((Number) l2).longValue() + pVar.a());
        }
        if (a4 == null || !a4.f32228c.exists()) {
            boolean z2 = apVar instanceof com.bytedance.ies.bullet.kit.a.f;
            if (z2) {
                if (jVar.y.length() == 0 && ((str3 = (fVar = (com.bytedance.ies.bullet.kit.a.f) apVar).f32240a) == null || str3.length() == 0)) {
                    fVar.f32240a = "gecko accessKey invalid";
                } else {
                    ((com.bytedance.ies.bullet.kit.a.f) apVar).f32240a = "gecko File Not Found";
                }
            }
            if (z2) {
                concat = ((com.bytedance.ies.bullet.kit.a.f) apVar).f32240a;
            } else {
                concat = "file not find ".concat(String.valueOf(a2));
            }
            bVar2.invoke(new FileNotFoundException(concat));
            MethodCollector.o(11377);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(a4.f32228c);
            if (fileInputStream.available() == 0) {
                if (apVar instanceof com.bytedance.ies.bullet.kit.a.f) {
                    ((com.bytedance.ies.bullet.kit.a.f) apVar).f32240a = "gecko size 0";
                }
                bVar2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                MethodCollector.o(11377);
                return;
            }
            fileInputStream.close();
            q.m223constructorimpl(z.f158842a);
            apVar.o = a4.f32228c.getAbsolutePath();
            apVar.p = ar.DISK;
            apVar.q = ao.GECKO;
            Long l3 = a4.f32227b;
            if (l3 != null) {
                j2 = l3.longValue();
            }
            apVar.s = j2;
            apVar.r = z;
            JSONArray jSONArray = apVar.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            apVar.e(a(jVar));
            bVar.invoke(apVar);
            MethodCollector.o(11377);
        } catch (Throwable th2) {
            q.m223constructorimpl(r.a(th2));
        }
    }

    public static final class k implements com.bytedance.ies.bullet.service.base.resourceloader.config.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ap f32197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f32198c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32199d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f32200e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f32201f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f32202g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f32203h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f32204i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f32205j;

        static {
            Covode.recordClassIndex(18887);
        }

        static final class a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f32206a;

            static {
                Covode.recordClassIndex(18888);
            }

            a(k kVar) {
                this.f32206a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                this.f32206a.f32196a.a(this.f32206a.f32197b, (com.bytedance.ies.bullet.service.base.resourceloader.config.j) this.f32206a.f32203h, this.f32206a.f32200e, this.f32206a.f32201f, false, this.f32206a.f32204i, this.f32206a.f32205j);
                return z.f158842a;
            }
        }

        static final class b<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f32207a;

            static {
                Covode.recordClassIndex(18889);
            }

            b(k kVar) {
                this.f32207a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                this.f32207a.f32196a.a(this.f32207a.f32197b, (com.bytedance.ies.bullet.service.base.resourceloader.config.j) this.f32207a.f32203h, this.f32207a.f32200e, this.f32207a.f32201f, false, this.f32207a.f32204i, this.f32207a.f32205j);
                return z.f158842a;
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.f
        public final void a(List<String> list) {
            h.f.b.l.c(list, "");
            JSONObject jSONObject = this.f32197b.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_update", this.f32198c.a());
            }
            j.b.a(this.f32196a, "download success with dynamic=" + this.f32199d + " , channel=" + this.f32200e + ",bundle=" + this.f32201f, null, null, 6);
            if (this.f32202g) {
                j.b.a(this.f32196a, "success, skip callbacks when onlyLocal is true", null, null, 6);
            } else {
                b.i.b(new b(this), b.i.f4826c);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.f
        public final void a(List<String> list, Throwable th) {
            String str;
            h.f.b.l.c(list, "");
            JSONObject jSONObject = this.f32197b.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_update", this.f32198c.a());
            }
            e eVar = this.f32196a;
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f32199d).append(" ,channel = ").append(this.f32200e).append(",bundle = ").append(this.f32201f).append(',');
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            j.b.a(eVar, append.append(str).toString(), null, null, 6);
            ap apVar = this.f32197b;
            if (apVar instanceof com.bytedance.ies.bullet.kit.a.f) {
                ((com.bytedance.ies.bullet.kit.a.f) apVar).f32240a = "gecko CheckUpdate Failed ";
            }
            if (this.f32202g) {
                j.b.a(this.f32196a, "failed, skip callbacks when onlyLocal is true", null, null, 6);
            } else {
                b.i.b(new a(this), b.i.f4826c);
            }
        }

        k(e eVar, ap apVar, p pVar, String str, String str2, String str3, boolean z, d dVar, h.f.a.b bVar, h.f.a.b bVar2) {
            this.f32196a = eVar;
            this.f32197b = apVar;
            this.f32198c = pVar;
            this.f32199d = str;
            this.f32200e = str2;
            this.f32201f = str3;
            this.f32202g = z;
            this.f32203h = dVar;
            this.f32204i = bVar;
            this.f32205j = bVar2;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ CountDownLatch $countDownLatch;

        static {
            Covode.recordClassIndex(18886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CountDownLatch countDownLatch) {
            super(1);
            this.$countDownLatch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.c(th, "");
            this.$countDownLatch.countDown();
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ap, z> {
        final /* synthetic */ CountDownLatch $countDownLatch;
        final /* synthetic */ z.e $result;

        static {
            Covode.recordClassIndex(18885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(z.e eVar, CountDownLatch countDownLatch) {
            super(1);
            this.$result = eVar;
            this.$countDownLatch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.bullet.service.base.ap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            h.f.b.l.c(apVar, "");
            this.$result.element = apVar;
            this.$countDownLatch.countDown();
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ap, h.z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, p pVar, h.f.a.b bVar, ap apVar) {
            super(1);
            this.this$0 = eVar;
            this.$interval = pVar;
            this.$resolve = bVar;
            this.$input = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            ap apVar2 = apVar;
            h.f.b.l.c(apVar2, "");
            JSONObject jSONObject = apVar2.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            h.f.a.b bVar = this.$resolve;
            ap apVar3 = this.$input;
            JSONArray jSONArray = apVar3.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            bVar.invoke(apVar3);
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.a.e$e  reason: collision with other inner class name */
    public static final class C0686e implements com.bytedance.ies.bullet.service.base.resourceloader.config.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32194c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32195d;

        static {
            Covode.recordClassIndex(18881);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.f
        public final void a(List<String> list) {
            h.f.b.l.c(list, "");
            j.b.a(this.f32192a, "download success with dynamic=" + this.f32193b + " , channel=" + this.f32194c + ",bundle=" + this.f32195d, null, null, 6);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.f
        public final void a(List<String> list, Throwable th) {
            String str;
            h.f.b.l.c(list, "");
            e eVar = this.f32192a;
            StringBuilder append = new StringBuilder("download failed with dynamic=").append(this.f32193b).append(" ,channel = ").append(this.f32194c).append(",bundle = ").append(this.f32195d).append(",errorMessage=");
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            j.b.a(eVar, append.append(str).toString(), null, null, 6);
        }

        C0686e(e eVar, int i2, String str, String str2) {
            this.f32192a = eVar;
            this.f32193b = i2;
            this.f32194c = str;
            this.f32195d = str2;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ap, h.z> {
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$interval = pVar;
            this.$resolve = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            ap apVar2 = apVar;
            h.f.b.l.c(apVar2, "");
            JSONObject jSONObject = apVar2.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            JSONArray jSONArray = apVar2.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            this.$resolve.invoke(apVar2);
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ap, h.z> {
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$interval = pVar;
            this.$resolve = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ap apVar) {
            ap apVar2 = apVar;
            h.f.b.l.c(apVar2, "");
            JSONObject jSONObject = apVar2.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            JSONArray jSONArray = apVar2.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            this.$resolve.invoke(apVar2);
            return h.z.f158842a;
        }
    }

    private final String a(com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar) {
        GeckoConfig a2 = f.a(g.b.f32252a.a(getService()), jVar.y);
        if (!(a2.getLoaderDepender() instanceof com.bytedance.ies.bullet.kit.a.d)) {
            return "";
        }
        com.bytedance.ies.bullet.service.base.resourceloader.config.d loaderDepender = a2.getLoaderDepender();
        if (loaderDepender != null) {
            return ((com.bytedance.ies.bullet.kit.a.d) loaderDepender).a();
        }
        throw new w("null cannot be cast to non-null type");
    }

    static final class b extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, ap apVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$input = apVar;
            this.$interval = pVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.c(th2, "");
            JSONObject jSONObject = this.$input.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            JSONArray jSONArray = this.$input.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            this.$reject.invoke(th2);
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, ap apVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$input = apVar;
            this.$interval = pVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.c(th2, "");
            JSONObject jSONObject = this.$input.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            h.f.a.b bVar = this.$reject;
            JSONArray jSONArray = this.$input.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            bVar.invoke(th2);
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ ap $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(18883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, ap apVar, p pVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = eVar;
            this.$input = apVar;
            this.$interval = pVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.c(th2, "");
            JSONObject jSONObject = this.$input.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("g_total", this.$interval.b());
            }
            JSONArray jSONArray = this.$input.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.this$0.getTAG());
            jSONObject2.put("status", "failed");
            jSONObject2.put("detail", th2.getMessage());
            jSONArray.put(jSONObject2);
            this.$reject.invoke(th2);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.a.a.c
    public final ap a(ap apVar, d dVar) {
        h.f.b.l.c(apVar, "");
        h.f.b.l.c(dVar, "");
        j.b.a(this, "start to loadSync load  channel = " + dVar.f32638l + ",bundle = " + dVar.f32639m + " from gecko", null, null, 6);
        z.e eVar = new z.e();
        eVar.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(apVar, dVar, new i(eVar, countDownLatch), new j(countDownLatch));
        countDownLatch.await(dVar.f32635i, TimeUnit.MILLISECONDS);
        return eVar.element;
    }

    private final void a(Uri uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, com.bytedance.ies.bullet.service.base.resourceloader.config.f fVar) {
        if (h.f.b.l.a((Object) uri.getScheme(), (Object) "local_file") && h.f.b.l.a((Object) uri.getAuthority(), (Object) "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && h.m.p.b(path, "/", false)) {
                String substring = path.substring(1);
                h.f.b.l.a((Object) substring, "");
                if (substring != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(substring);
                    f.a(g.b.f32252a.a(getService()), jVar.y).getLoaderDepender().a(jVar, arrayList, fVar);
                    return;
                }
            }
            fVar.a(new ArrayList(), new Exception("update failed because channel is null"));
        }
    }

    private final l a(Uri uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, String str) {
        File file;
        try {
            String scheme = uri.getScheme();
            if (scheme == null || scheme.hashCode() != 1303296464 || !scheme.equals("local_file")) {
                throw new FileNotFoundException(uri + " not found");
            }
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                String str2 = "";
                if (hashCode != -554435892) {
                    if (hashCode == 1728122231 && authority.equals("absolute")) {
                        String path = uri.getPath();
                        if (path != null) {
                            str2 = path;
                        }
                        file = new File(str2);
                    }
                } else if (authority.equals("relative")) {
                    String path2 = uri.getPath();
                    if (path2 != null) {
                        str2 = path2;
                    }
                    String str3 = jVar.y;
                    GeckoConfig a2 = f.a(g.b.f32252a.a(getService()), jVar.y);
                    String b2 = a2.getLoaderDepender().b(a2.getOfflineDir(), str3, str2);
                    j.b.a(this, "using gecko info [accessKey=" + str3 + ",filePath=" + b2 + ']', null, null, 6);
                    if (b2 == null || b2.length() == 0) {
                        return null;
                    }
                    file = new File(b2);
                }
                l lVar = new l(uri);
                j.b.a(this, "load from gecko success", null, null, 6);
                com.bytedance.ies.bullet.kit.a.c cVar = new com.bytedance.ies.bullet.kit.a.c(file);
                cVar.f32229d = ao.GECKO;
                GeckoConfig a3 = f.a(g.b.f32252a.a(getService()), jVar.y);
                if (a3.getLoaderDepender() instanceof com.bytedance.ies.bullet.kit.a.d) {
                    com.bytedance.ies.bullet.service.base.resourceloader.config.d loaderDepender = a3.getLoaderDepender();
                    if (loaderDepender != null) {
                        cVar.f32227b = Long.valueOf(((com.bytedance.ies.bullet.kit.a.d) loaderDepender).a(a3.getOfflineDir(), jVar.y, str));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                lVar.f32288a = cVar;
                return lVar;
            }
            throw new FileNotFoundException(uri + " not found");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        if (r4 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f8, code lost:
        if (r8 != null) goto L_0x01fa;
     */
    @Override // com.bytedance.ies.bullet.kit.a.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.bullet.service.base.ap r21, com.bytedance.ies.bullet.kit.a.a.d r22, h.f.a.b<? super com.bytedance.ies.bullet.service.base.ap, h.z> r23, h.f.a.b<? super java.lang.Throwable, h.z> r24) {
        /*
        // Method dump skipped, instructions count: 649
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.a.e.a(com.bytedance.ies.bullet.service.base.ap, com.bytedance.ies.bullet.kit.a.a.d, h.f.a.b, h.f.a.b):void");
    }

    private final void a(ap apVar, d dVar, String str, String str2, String str3, h.f.a.b<? super ap, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        boolean z;
        p pVar = new p();
        if (h.f.b.l.a((Object) apVar.n.getQueryParameter("onlyLocal"), (Object) "1") || dVar.f32637k) {
            z = true;
            if (apVar instanceof com.bytedance.ies.bullet.kit.a.f) {
                ((com.bytedance.ies.bullet.kit.a.f) apVar).f32240a = "gecko only local";
                JSONArray jSONArray = apVar.f32564m;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, getTAG());
                jSONObject.put("status", "failed");
                jSONObject.put("detail", apVar);
                jSONArray.put(jSONObject);
            }
            bVar2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        Uri a2 = m.a(str);
        dVar.f32189f = 1;
        a(a2, dVar, new k(this, apVar, pVar, str3, str, str2, z, dVar, bVar, bVar2));
    }
}
