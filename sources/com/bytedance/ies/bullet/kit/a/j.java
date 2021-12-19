package com.bytedance.ies.bullet.kit.a;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.b.a;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.aj;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class j extends com.bytedance.ies.bullet.service.base.b.a implements IResourceLoaderService {

    /* renamed from: c  reason: collision with root package name */
    public static final a f32264c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.base.resourceloader.config.i f32265a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<aj, com.bytedance.ies.bullet.kit.a.c.a> f32266b = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final List<Class<? extends IXResourceLoader>> f32267f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<Class<? extends IXResourceLoader>> f32268g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f32269h;

    /* renamed from: i  reason: collision with root package name */
    private int f32270i;

    /* renamed from: j  reason: collision with root package name */
    private final List<com.bytedance.ies.bullet.service.base.resourceloader.config.e> f32271j = n.c(com.bytedance.ies.bullet.service.base.resourceloader.config.e.GECKO, com.bytedance.ies.bullet.service.base.resourceloader.config.e.BUILTIN, com.bytedance.ies.bullet.service.base.resourceloader.config.e.CDN);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f32272k = h.i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(18914);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void deleteResource(ap apVar) {
        l.c(apVar, "");
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j, com.bytedance.ies.bullet.service.base.b.a
    public q getLoggerWrapper() {
        return (q) this.f32272k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18915);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public com.bytedance.ies.bullet.service.base.resourceloader.config.i getResourceConfig() {
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = this.f32265a;
        if (iVar == null) {
            l.a("mConfig");
        }
        return iVar;
    }

    static final class f extends m implements h.f.a.a<q> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) e.a.a().a(this.this$0.f32574d, com.bytedance.ies.bullet.service.base.m.class), "res-Service");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ap f32278b;

        static {
            Covode.recordClassIndex(18922);
        }

        h(j jVar, ap apVar) {
            this.f32277a = jVar;
            this.f32278b = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            o oVar;
            if (!(this.f32278b.f32563l.f32555h == null || (oVar = (o) this.f32277a.a(o.class)) == null)) {
                an anVar = this.f32278b.f32563l;
                com.bytedance.ies.bullet.service.base.resourceloader.config.i a2 = j.a(this.f32277a);
                String uri = this.f32278b.n.toString();
                l.a((Object) uri, "");
                anVar.f32556i = Boolean.valueOf(n.a(a2, uri));
                oVar.a(anVar);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public Map<String, String> getPreloadConfigs() {
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = this.f32265a;
        if (iVar == null) {
            l.a("mConfig");
        }
        String accessKey = iVar.f32632m.getAccessKey();
        GeckoConfig a2 = com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this), accessKey);
        return a2.getLoaderDepender().a(a2.getOfflineDir(), accessKey);
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ap f32274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j f32275c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32276d;

        static {
            Covode.recordClassIndex(18921);
        }

        g(j jVar, ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, String str) {
            this.f32273a = jVar;
            this.f32274b = apVar;
            this.f32275c = jVar2;
            this.f32276d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            o oVar;
            Object obj;
            n.a(this.f32274b, this.f32275c);
            if (this.f32274b.t && (oVar = (o) this.f32273a.a(o.class)) != null) {
                String str = null;
                an anVar = new an("bdx_resourceloader_fetch", null, null, 254);
                try {
                    obj = h.q.m223constructorimpl(this.f32274b.n.getQueryParameter("surl"));
                } catch (Throwable th) {
                    obj = h.q.m223constructorimpl(r.a(th));
                }
                if (!h.q.m228isFailureimpl(obj)) {
                    str = obj;
                }
                String str2 = str;
                if (str2 == null) {
                    str2 = this.f32274b.n.toString();
                }
                anVar.f32552e = str2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", this.f32274b.n.toString());
                jSONObject.put("res_state", "fail");
                jSONObject.put("res_message", this.f32276d);
                ap apVar = this.f32274b;
                if (apVar instanceof f) {
                    jSONObject.put("res_gfm", ((f) apVar).f32240a);
                    jSONObject.put("res_bfm", ((f) this.f32274b).f32243d);
                    jSONObject.put("res_cfm", ((f) this.f32274b).f32244e);
                }
                jSONObject.put("res_tag", this.f32275c.t);
                anVar.f32554g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("res_duration", SystemClock.uptimeMillis() - this.f32274b.x);
                anVar.f32555h = jSONObject2;
                com.bytedance.ies.bullet.service.base.resourceloader.config.i a2 = j.a(this.f32273a);
                String uri = this.f32274b.n.toString();
                l.a((Object) uri, "");
                anVar.f32556i = Boolean.valueOf(n.a(a2, uri));
                oVar.a(anVar);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.b.a, com.bytedance.ies.bullet.service.base.a.c
    public final void a() {
        g gVar = g.b.f32252a;
        l.c(this, "");
        gVar.f32249a.remove(this);
        Map<aj, com.bytedance.ies.bullet.kit.a.c.a> map = this.f32266b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<aj, com.bytedance.ies.bullet.kit.a.c.a> entry : map.entrySet()) {
            entry.getValue().a();
            arrayList.add(z.f158842a);
        }
        this.f32266b.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class i<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ap f32280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j f32281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f32282d;

        static {
            Covode.recordClassIndex(18923);
        }

        i(j jVar, ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, long j2) {
            this.f32279a = jVar;
            this.f32280b = apVar;
            this.f32281c = jVar2;
            this.f32282d = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01df  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z call() {
            /*
            // Method dump skipped, instructions count: 806
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.j.i.call():java.lang.Object");
        }
    }

    public static final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.i a(j jVar) {
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = jVar.f32265a;
        if (iVar == null) {
            l.a("mConfig");
        }
        return iVar;
    }

    private static String a(String str) {
        if (p.a((CharSequence) str, "/") != str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, str.length() - 1);
        l.a((Object) substring, "");
        return substring;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void cancel(aj ajVar) {
        l.c(ajVar, "");
        com.bytedance.ies.bullet.kit.a.c.a aVar = this.f32266b.get(ajVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f32266b.remove(ajVar);
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void unRegisterConfig(String str) {
        l.c(str, "");
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = this.f32265a;
        if (iVar == null) {
            l.a("mConfig");
        }
        iVar.n.remove(str);
    }

    static final class e extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $config;
        final /* synthetic */ p $interval;
        final /* synthetic */ f $resInfo;
        final /* synthetic */ String $uri;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar, String str, f fVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, p pVar) {
            super(1);
            this.this$0 = jVar;
            this.$uri = str;
            this.$resInfo = fVar;
            this.$config = jVar2;
            this.$interval = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            j jVar = this.this$0;
            f fVar = this.$resInfo;
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2 = this.$config;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            jVar.a(fVar, jVar2, message);
            j jVar3 = this.this$0;
            String jSONArray = this.$resInfo.f32564m.toString();
            l.a((Object) jSONArray, "");
            j.b.a(jVar3, jSONArray, null, null, 6);
            JSONObject jSONObject = this.$resInfo.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("m_total", this.$interval.b());
            }
            return z.f158842a;
        }
    }

    public final void a(ap apVar) {
        b.i.b(new h(this, apVar), b.i.f4824a);
    }

    public j(Application application) {
        l.c(application, "");
        g.b.f32252a.f32250b = application;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void init(com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar) {
        l.c(iVar, "");
        if (this.f32269h) {
            j.b.a(this, "init# service is already init", null, null, 6);
            return;
        }
        j.b.a(this, "init globalConfig = ".concat(String.valueOf(iVar)), null, null, 6);
        this.f32269h = true;
        com.bytedance.ies.bullet.kit.a.b.a aVar = a.b.f32215a;
        int i2 = iVar.f32621b;
        if (aVar.f32212a == null && i2 > 0) {
            aVar.f32212a = new a.c(i2, i2);
        }
        g gVar = g.b.f32252a;
        l.c(this, "");
        l.c(iVar, "");
        gVar.f32249a.put(this, iVar);
        this.f32265a = iVar;
        registerConfig(iVar.f32632m.getAccessKey(), iVar.f32632m);
    }

    static final class b extends m implements h.f.a.b<h, z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $config;
        final /* synthetic */ p $interval;
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $mergedConfig;
        final /* synthetic */ f $resInfo;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ aj $task;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, aj ajVar, p pVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, f fVar, h.f.a.b bVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar3) {
            super(1);
            this.this$0 = jVar;
            this.$task = ajVar;
            this.$interval = pVar;
            this.$config = jVar2;
            this.$resInfo = fVar;
            this.$resolve = bVar;
            this.$mergedConfig = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h hVar) {
            com.bytedance.ies.bullet.service.base.e.d dVar;
            h hVar2 = hVar;
            l.c(hVar2, "");
            this.this$0.f32266b.remove(this.$task);
            this.$interval.a();
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = this.$config;
            String jSONArray = this.$resInfo.f32564m.toString();
            l.a((Object) jSONArray, "");
            jVar.e(jSONArray);
            this.$resolve.invoke(hVar2.f32256b);
            JSONObject jSONObject = this.$resInfo.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("m_resolve", this.$interval.a());
            }
            JSONObject jSONObject2 = this.$resInfo.f32563l.f32555h;
            if (jSONObject2 != null) {
                jSONObject2.put("m_total", this.$interval.b());
            }
            this.this$0.a(hVar2.f32256b, this.$config, SystemClock.uptimeMillis() - this.$resInfo.x);
            j jVar2 = this.this$0;
            ap apVar = hVar2.f32256b;
            an anVar = hVar2.f32256b.f32563l;
            com.bytedance.ies.bullet.service.base.a.o oVar = this.$config.s;
            if (oVar != null) {
                dVar = (com.bytedance.ies.bullet.service.base.e.d) oVar.a_(com.bytedance.ies.bullet.service.base.e.d.class);
            } else {
                dVar = null;
            }
            anVar.f32550c = dVar;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("res_state", "success");
            anVar.f32554g = jSONObject3;
            jVar2.a(apVar);
            ao aoVar = hVar2.f32256b.q;
            if (aoVar != null && k.f32287e[aoVar.ordinal()] == 1 && this.$resInfo.f32241b != null && this.$config.x) {
                a.b.f32215a.a(com.bytedance.ies.bullet.kit.a.b.b.a(hVar2.f32256b, this.$mergedConfig), hVar2.f32256b);
            }
            j jVar3 = this.this$0;
            String jSONArray2 = hVar2.f32256b.f32564m.toString();
            l.a((Object) jSONArray2, "");
            j.b.a(jVar3, jSONArray2, null, null, 6);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $config;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ f $resInfo;
        final /* synthetic */ aj $task;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, f fVar, p pVar, aj ajVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, h.f.a.b bVar) {
            super(1);
            this.this$0 = jVar;
            this.$resInfo = fVar;
            this.$interval = pVar;
            this.$task = ajVar;
            this.$config = jVar2;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            j jVar = this.this$0;
            String jSONArray = this.$resInfo.f32564m.toString();
            l.a((Object) jSONArray, str);
            com.bytedance.ies.bullet.service.base.e.d dVar = null;
            j.b.a(jVar, jSONArray, null, null, 6);
            JSONObject jSONObject = this.$resInfo.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("m_total", this.$interval.b());
            }
            this.this$0.f32266b.remove(this.$task);
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2 = this.$config;
            String jSONArray2 = this.$resInfo.f32564m.toString();
            l.a((Object) jSONArray2, str);
            jVar2.e(jSONArray2);
            this.$reject.invoke(th2);
            j jVar3 = this.this$0;
            f fVar = this.$resInfo;
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar4 = this.$config;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            jVar3.a(fVar, jVar4, str);
            j jVar5 = this.this$0;
            f fVar2 = this.$resInfo;
            an anVar = fVar2.f32563l;
            com.bytedance.ies.bullet.service.base.a.o oVar = this.$config.s;
            if (oVar != null) {
                dVar = (com.bytedance.ies.bullet.service.base.e.d) oVar.a_(com.bytedance.ies.bullet.service.base.e.d.class);
            }
            anVar.f32550c = dVar;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("res_state", "failed");
            anVar.f32554g = jSONObject2;
            jVar5.a(fVar2);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<h, z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $config;
        final /* synthetic */ z.e $info;
        final /* synthetic */ p $interval;
        final /* synthetic */ com.bytedance.ies.bullet.service.base.resourceloader.config.j $mergedConfig;
        final /* synthetic */ f $resInfo;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(18918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, z.e eVar, f fVar, p pVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar2, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar3) {
            super(1);
            this.this$0 = jVar;
            this.$info = eVar;
            this.$resInfo = fVar;
            this.$interval = pVar;
            this.$config = jVar2;
            this.$mergedConfig = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h hVar) {
            h hVar2 = hVar;
            l.c(hVar2, "");
            this.$info.element = (T) hVar2.f32256b;
            JSONObject jSONObject = this.$resInfo.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("m_resolve", this.$interval.a());
            }
            JSONObject jSONObject2 = this.$resInfo.f32563l.f32555h;
            if (jSONObject2 != null) {
                jSONObject2.put("m_total", this.$interval.b());
            }
            this.this$0.a(hVar2.f32256b, this.$config, SystemClock.uptimeMillis() - this.$resInfo.x);
            ao aoVar = hVar2.f32256b.q;
            if (!(aoVar == null || k.f32286d[aoVar.ordinal()] != 1 || this.$resInfo.f32241b == null)) {
                a.b.f32215a.a(com.bytedance.ies.bullet.kit.a.b.b.a(hVar2.f32256b, this.$mergedConfig), hVar2.f32256b);
            }
            j jVar = this.this$0;
            String jSONArray = hVar2.f32256b.f32564m.toString();
            l.a((Object) jSONArray, "");
            j.b.a(jVar, jSONArray, null, null, 6);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void registerCustomLoader(Class<? extends IXResourceLoader> cls, com.bytedance.ies.bullet.service.base.e eVar) {
        l.c(cls, "");
        l.c(eVar, "");
        int i2 = k.f32283a[eVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && !this.f32267f.contains(cls)) {
                this.f32268g.add(cls);
            }
        } else if (!this.f32267f.contains(cls)) {
            this.f32267f.add(cls);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, com.bytedance.ies.bullet.service.base.e eVar) {
        l.c(cls, "");
        l.c(eVar, "");
        int i2 = k.f32284b[eVar.ordinal()];
        if (i2 == 1) {
            this.f32267f.remove(cls);
        } else if (i2 == 2) {
            this.f32268g.remove(cls);
        }
    }

    private final boolean a(Uri uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar) {
        com.bytedance.ies.bullet.service.base.a.o oVar;
        com.bytedance.ies.bullet.service.base.a.m g2;
        String queryParameter = uri.getQueryParameter("__dev");
        if (l.a((Object) queryParameter, (Object) "1") || ((queryParameter == null || queryParameter.length() == 0) && (oVar = jVar.s) != null && (g2 = oVar.g()) != null && g2.c())) {
            return false;
        }
        if (!l.a((Object) com.bytedance.ies.bullet.service.base.e.c.a(uri, "enable_memory_cache"), (Object) "1")) {
            com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = this.f32265a;
            if (iVar == null) {
                l.a("mConfig");
            }
            if (iVar.f32623d) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    public void registerConfig(String str, GeckoConfig geckoConfig) {
        l.c(str, "");
        l.c(geckoConfig, "");
        geckoConfig.getLoaderDepender().a(this);
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar = this.f32265a;
        if (iVar == null) {
            l.a("mConfig");
        }
        iVar.n.put(str, geckoConfig);
        if (geckoConfig.getNetworkImpl() != null) {
            return;
        }
        if (geckoConfig.getLocalInfo().length() > 0) {
            com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar2 = this.f32265a;
            if (iVar2 == null) {
                l.a("mConfig");
            }
            geckoConfig.setNetworkImpl(iVar2.p);
            return;
        }
        com.bytedance.ies.bullet.service.base.resourceloader.config.i iVar3 = this.f32265a;
        if (iVar3 == null) {
            l.a("mConfig");
        }
        geckoConfig.setNetworkImpl(iVar3.q);
    }

    private final com.bytedance.ies.bullet.kit.a.c.a b(Uri uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar) {
        int i2;
        ArrayList arrayList = new ArrayList();
        List<? extends Class<? extends IXResourceLoader>> list = jVar.f32633g.f32612b;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(this.f32267f);
        int size = arrayList.size();
        if (jVar.f32633g.f32611a.isEmpty() && !jVar.f32633g.f32615e) {
            jVar.f32633g.a(this.f32271j);
        }
        if (a(uri, jVar)) {
            arrayList.add(com.bytedance.ies.bullet.kit.a.a.g.class);
        }
        for (com.bytedance.ies.bullet.service.base.resourceloader.config.e eVar : jVar.f32633g.f32611a) {
            int i3 = k.f32285c[eVar.ordinal()];
            if (i3 == 1) {
                arrayList.add(com.bytedance.ies.bullet.kit.a.a.e.class);
            } else if (i3 == 2) {
                arrayList.add(com.bytedance.ies.bullet.kit.a.a.a.class);
            } else if (i3 == 3) {
                arrayList.add(com.bytedance.ies.bullet.kit.a.a.b.class);
            }
        }
        arrayList.addAll(this.f32268g);
        List<? extends Class<? extends IXResourceLoader>> list2 = jVar.f32633g.f32613c;
        if (list2 != null) {
            i2 = arrayList.size();
            arrayList.addAll(list2);
        } else {
            i2 = -1;
        }
        List<? extends Class<? extends IXResourceLoader>> list3 = jVar.f32633g.f32614d;
        if (list3 != null) {
            arrayList.removeAll(list3);
        }
        com.bytedance.ies.bullet.kit.a.c.a aVar = new com.bytedance.ies.bullet.kit.a.c.a(arrayList, getLoggerWrapper(), this);
        aVar.f32230a = size;
        aVar.f32231b = i2;
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c6  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ies.bullet.service.base.ap loadSync(java.lang.String r22, com.bytedance.ies.bullet.service.base.resourceloader.config.j r23) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.j.loadSync(java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.j):com.bytedance.ies.bullet.service.base.ap");
    }

    public final void a(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, long j2) {
        boolean z;
        j.b.a(this, "reportSuccess " + com.bytedance.ies.bullet.kit.a.a.f.a(apVar.n) + ",message=" + apVar.f32564m, null, null, 6);
        StringBuilder sb = new StringBuilder("load success: isMemory = ");
        if (apVar instanceof f) {
            z = ((f) apVar).f32242c;
        } else {
            z = false;
        }
        j.b.a(this, sb.append(z).append(",duration:").append(j2).append('\n').append(apVar.f32563l.f32555h).toString(), null, null, 6);
        b.i.b(new i(this, apVar, jVar, j2), b.i.f4824a);
    }

    public final void a(ap apVar, com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar, String str) {
        j.b.a(this, "reportFailed " + apVar.n.getScheme() + apVar.n.getAuthority() + apVar.n.getHost() + apVar.n.getPath(), null, null, 6);
        b.i.b(new g(this, apVar, jVar, str), b.i.f4824a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0157, code lost:
        if (r0 != null) goto L_0x015a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r10, com.bytedance.ies.bullet.kit.a.f r11, com.bytedance.ies.bullet.service.base.resourceloader.config.j r12, com.bytedance.ies.bullet.kit.a.p r13) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.j.a(java.lang.String, com.bytedance.ies.bullet.kit.a.f, com.bytedance.ies.bullet.service.base.resourceloader.config.j, com.bytedance.ies.bullet.kit.a.p):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ies.bullet.service.base.aj loadAsync(java.lang.String r21, com.bytedance.ies.bullet.service.base.resourceloader.config.j r22, h.f.a.b<? super com.bytedance.ies.bullet.service.base.ap, h.z> r23, h.f.a.b<? super java.lang.Throwable, h.z> r24) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.j.loadAsync(java.lang.String, com.bytedance.ies.bullet.service.base.resourceloader.config.j, h.f.a.b, h.f.a.b):com.bytedance.ies.bullet.service.base.aj");
    }
}
