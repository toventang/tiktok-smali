package com.bytedance.ies.bullet.kit.lynx;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.bytedance.ies.bullet.lynx_adapter_impl.d;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.m;
import com.bytedance.ies.bullet.service.base.ag;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.y;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.o;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.w;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.xml.transform.Transformer;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i extends com.bytedance.ies.bullet.ui.common.c.c<LynxView> implements b, com.lynx.tasm.navigator.b {
    private final h.h A;
    private long B;
    private long C;

    /* renamed from: j  reason: collision with root package name */
    public final List<a> f32353j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public Uri f32354k;

    /* renamed from: l  reason: collision with root package name */
    public volatile byte[] f32355l;

    /* renamed from: m  reason: collision with root package name */
    public Uri f32356m;
    public long n;
    long o;
    long p;
    long q;
    public long r;
    long s;
    boolean t;
    private final List<com.bytedance.ies.bullet.kit.lynx.c.a> u = new ArrayList();
    private final List<com.bytedance.ies.bullet.kit.lynx.c.b> v = new ArrayList();
    private Map<String, ? extends Object> w;
    private com.bytedance.ies.bullet.service.base.c.c x;
    private final a y = new a(this);
    private final Map<String, Object> z = new LinkedHashMap();

    static {
        Covode.recordClassIndex(18993);
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void c(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        l.c(list, "");
        l.c(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final Uri p_() {
        return this.f32354k;
    }

    @Override // com.lynx.tasm.navigator.b
    public final void a(com.lynx.tasm.navigator.d dVar, com.lynx.tasm.navigator.g gVar) {
        String str = "";
        l.c(gVar, str);
        if (dVar == null) {
            try {
                l.a();
            } catch (Exception e2) {
                j.b.a(this, "create lynxview failed with e:" + String.valueOf(e2.getMessage()), null, null, 6);
                return;
            }
        }
        String str2 = dVar.f56800b;
        if (str2 == null) {
            l.a();
        }
        if (this.f32057i.c(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class) != null) {
            m g2 = g();
            Object c2 = this.f32057i.c(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class);
            if (c2 == null) {
                l.a();
            }
            g2.a(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class, c2);
        }
        com.bytedance.ies.bullet.c.c.e s_ = s_();
        if (s_ == null) {
            l.a();
        }
        c a2 = a(s_);
        if (a2 == null) {
            l.a();
        }
        com.bytedance.ies.bullet.kit.lynx.c.c f2 = a2.f(this.f32057i);
        l.a();
        com.bytedance.ies.bullet.service.f.a.d a3 = f2.a();
        if (a3 == null) {
            l.a();
        }
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) b_(IResourceLoaderService.class);
        if (iResourceLoaderService != null) {
            com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
            com.bytedance.ies.bullet.service.base.resourceloader.config.a aVar = (com.bytedance.ies.bullet.service.base.resourceloader.config.a) this.f32057i.c(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class);
            int i2 = 0;
            if (aVar == null) {
                aVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.a(false);
            }
            jVar.a(aVar);
            String b2 = a3.Q.b();
            if (b2 == null) {
                b2 = str;
            }
            jVar.a(b2);
            String b3 = a3.R.b();
            if (b3 == null) {
                b3 = str;
            }
            jVar.b(b3);
            String b4 = b(a3);
            if (b4 != null) {
                str = b4;
            }
            jVar.c(str);
            jVar.s = this;
            Integer num = (Integer) a3.ad.b();
            if (num != null) {
                i2 = num.intValue();
            }
            jVar.f32636j = Integer.valueOf(i2);
            jVar.d("template");
            jVar.w = this.f32054f;
            iResourceLoaderService.loadAsync(str2, jVar, new c(a3, this, str2, gVar, dVar), new d(this, str2, gVar, dVar));
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void a(h.f.a.b<? super List<com.bytedance.ies.bullet.ui.common.c.d<LynxView>>, z> bVar) {
        l.c(bVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        LynxView a2 = a(t());
        if (a2 != null) {
            com.lynx.tasm.navigator.c.a().a(this, a2);
            bVar.invoke(n.a(new com.bytedance.ies.bullet.ui.common.c.d(a2)));
            j.b.a(this, "create and add view component success", null, null, 6);
        }
        this.s = System.currentTimeMillis() - currentTimeMillis;
    }

    @Override // com.lynx.tasm.navigator.b
    public final void a(LynxView lynxView) {
        LynxView lynxView2;
        com.bytedance.ies.bullet.ui.common.c.d dVar = (com.bytedance.ies.bullet.ui.common.c.d) n.h((List) this.H);
        if (dVar != null && (lynxView2 = (LynxView) dVar.f33078a) != null) {
            lynxView2.addView(lynxView);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final boolean a(Uri uri, h.f.a.b<? super Throwable, z> bVar) {
        l.c(uri, "");
        l.c(bVar, "");
        this.B = System.currentTimeMillis();
        return true;
    }

    private final f x() {
        return new f(this);
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.c.c.i
    public final void l() {
        super.l();
        Uri uri = this.f32354k;
        if (uri != null) {
            a(uri, true);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.ui.common.c.c
    public final void r() {
        super.r();
        com.bytedance.ies.bullet.ui.common.g z2 = z();
        if (z2 != null) {
            z2.a(this.y);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<File> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactory;

        static {
            Covode.recordClassIndex(18995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$providerFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ File invoke() {
            Application application = (Application) this.$providerFactory.c(Application.class);
            if (application != null) {
                return application.getFilesDir();
            }
            return null;
        }
    }

    public static final class f extends o {

        /* renamed from: a  reason: collision with root package name */
        public Uri f32359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f32360b;

        static {
            Covode.recordClassIndex(18999);
        }

        @Override // com.lynx.tasm.o
        public final void c() {
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().d(this.f32360b);
            }
        }

        @Override // com.lynx.tasm.o
        public final void d() {
            this.f32360b.y();
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().f(this.f32360b);
            }
            j.b.a(this.f32360b, "lynx client onRuntimeReady", null, null, 6);
        }

        @Override // com.lynx.tasm.o
        public final void a() {
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().b(this.f32360b);
            }
            for (T t : this.f32360b.H) {
                Uri uri = this.f32360b.f32354k;
                if (uri == null) {
                    uri = Uri.EMPTY;
                    l.a((Object) uri, "");
                }
                t.b(uri);
            }
            j.b.a(this.f32360b, "lynx client onLoadSuccess", null, null, 6);
        }

        @Override // com.lynx.tasm.o
        public final void b() {
            Long l2;
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().c(this.f32360b);
            }
            i iVar = this.f32360b;
            if (iVar.t) {
                iVar.t = false;
                iVar.p = System.currentTimeMillis();
                com.bytedance.ies.bullet.c.i iVar2 = (com.bytedance.ies.bullet.c.i) iVar.f32057i.c(com.bytedance.ies.bullet.c.i.class);
                if (!(iVar2 == null || (l2 = iVar2.f32090b) == null)) {
                    long longValue = l2.longValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", System.currentTimeMillis() - longValue);
                    com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) iVar.b_(com.bytedance.ies.bullet.service.base.o.class);
                    if (oVar != null) {
                        an anVar = new an("bdx_monitor_lynx_first_screen_duration", null, null, 254);
                        anVar.f32555h = jSONObject;
                        anVar.f32550c = iVar.f32054f;
                        oVar.a(anVar);
                    }
                    com.bytedance.ies.bullet.service.base.o oVar2 = (com.bytedance.ies.bullet.service.base.o) iVar.b_(com.bytedance.ies.bullet.service.base.o.class);
                    if (oVar2 != null) {
                        an anVar2 = new an("bdx_monitor_lynx_timeline", null, null, 254);
                        anVar2.f32550c = iVar.f32054f;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("init_to_start_render", iVar2.f32092d);
                        jSONObject2.put("lynx_render", iVar.p - iVar.o);
                        jSONObject2.put("resource_load", iVar2.f32095g);
                        jSONObject2.put("render_template_main", iVar.q);
                        jSONObject2.put("read_template", iVar.r);
                        jSONObject2.put("create_view_component", iVar.s);
                        anVar2.f32555h = jSONObject2;
                        oVar2.a(anVar2);
                    }
                }
            }
            j.b.a(this.f32360b, "lynx client onFirstScreen", null, null, 6);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(i iVar) {
            this.f32360b = iVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Object, z> {
            final /* synthetic */ f.a $handler;

            static {
                Covode.recordClassIndex(19000);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f.a aVar) {
                super(1);
                this.$handler = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                this.$handler.a(obj, null);
                return z.f158842a;
            }
        }

        @Override // com.lynx.tasm.o
        public final void a(LynxPerfMetric lynxPerfMetric) {
            l.c(lynxPerfMetric, "");
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().a(this.f32360b, lynxPerfMetric.toJSONObject());
            }
        }

        @Override // com.lynx.tasm.o
        public final void b(LynxPerfMetric lynxPerfMetric) {
            l.c(lynxPerfMetric, "");
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                i iVar = this.f32360b;
                lynxPerfMetric.toJSONObject();
                it.next().e(iVar);
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<Throwable, z> {
            final /* synthetic */ f.a $handler;
            final /* synthetic */ String $src;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(19001);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(f fVar, f.a aVar, String str) {
                super(1);
                this.this$0 = fVar;
                this.$handler = aVar;
                this.$src = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Throwable th) {
                String str;
                Throwable th2 = th;
                l.c(th2, "");
                this.$handler.a(null, th2);
                com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) this.this$0.f32360b.b_(com.bytedance.ies.bullet.service.base.o.class);
                if (oVar != null) {
                    an anVar = new an("bdx_monitor_preload_image_cache_miss", null, null, 254);
                    anVar.f32552e = this.$src;
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.ies.bullet.service.base.e.d dVar = this.this$0.f32360b.f32054f;
                    if (dVar == null || (str = dVar.b()) == null) {
                        str = "unknown";
                    }
                    jSONObject.put("schema", str);
                    anVar.f32554g = jSONObject;
                    oVar.a(anVar);
                }
                return z.f158842a;
            }
        }

        @Override // com.lynx.tasm.o
        public final void b(String str) {
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().a(this.f32360b, str);
            }
            com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32360b.f32057i.c(com.bytedance.ies.bullet.c.i.class);
            if (iVar != null) {
                iVar.f32097i = str;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Lynx#onLoadFailed ".concat(String.valueOf(str)));
            this.f32360b.a(illegalStateException);
            this.f32360b.c(illegalStateException);
            j.b.a(this.f32360b, "lynx client onLoadFailed on error:".concat(String.valueOf(str)), null, null, 6);
        }

        @Override // com.lynx.tasm.o
        public final void a(com.lynx.tasm.j jVar) {
            com.bytedance.ies.bullet.ui.common.c.d q_;
            if (jVar != null) {
                Iterator<T> it = this.f32360b.f32353j.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f32360b, new com.bytedance.ies.bullet.kit.lynx.b.b(jVar.a(), jVar.f56744a));
                }
                l.c(jVar, "");
                if (!(!n.b(100, 102, 103, 1201).contains(Integer.valueOf(jVar.f56744a)) || this.f32359a == null || (q_ = this.f32360b.q_()) == null)) {
                    Uri uri = this.f32359a;
                    if (uri == null) {
                        l.a();
                    }
                    q_.a(uri, new RuntimeException(jVar.toString()));
                }
                j.b.a(this.f32360b, "lynx client onReceivedError on error:".concat(String.valueOf(jVar)), null, null, 6);
            }
        }

        @Override // com.lynx.tasm.o
        public final void a(String str) {
            this.f32360b.n = System.currentTimeMillis();
            Iterator<T> it = this.f32360b.f32353j.iterator();
            while (it.hasNext()) {
                it.next().a(this.f32360b);
            }
            this.f32359a = Uri.parse(str);
        }

        @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
        public final void a(Context context, String str, String str2, float f2, float f3, Transformer transformer, f.a aVar) {
            l.c(context, "");
            l.c(aVar, "");
            if (this.f32360b.f32353j.isEmpty()) {
                super.a(context, str, str2, f2, f3, transformer, aVar);
                return;
            }
            i iVar = this.f32360b;
            f fVar = new f(iVar, iVar.f32353j);
            h hVar = new h(context, str, str2, f2, f3, transformer);
            a aVar2 = new a(aVar);
            b bVar = new b(this, aVar, str2);
            l.c(hVar, "");
            l.c(aVar2, "");
            l.c(bVar, "");
            Iterator<a> it = fVar.f32344a.iterator();
            if (!it.hasNext()) {
                bVar.invoke(new Throwable("None of ILynxClientDelegate processor for image " + hVar.f32349c));
            } else {
                fVar.a(it, hVar, aVar2, bVar);
            }
        }
    }

    private final boolean w() {
        com.bytedance.ies.bullet.service.base.a b2;
        ag agVar = (ag) b_(ag.class);
        if (agVar == null || (b2 = agVar.b()) == null) {
            return false;
        }
        return b2.f32514c;
    }

    public final com.bytedance.ies.bullet.service.f.a.d t() {
        q o_ = o_();
        if (o_ != null) {
            return (com.bytedance.ies.bullet.service.f.a.d) o_;
        }
        l.a();
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c, com.bytedance.ies.bullet.ui.common.c.b
    public final String u() {
        return "Lynx View(" + s().d() + ')';
    }

    @Override // com.lynx.tasm.navigator.b
    public final void v() {
        Activity activity;
        Context context = (Context) this.f32057i.c(Context.class);
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing() && (activity = (Activity) context) != null) {
            activity.finish();
        }
    }

    private final void A() {
        Map<String, Object> a2;
        if (!this.z.isEmpty()) {
            this.z.clear();
        }
        Map<String, Object> map = this.z;
        map.put("bullet_version", "2.1.4-rc.11-tiktok");
        for (T t2 : o()) {
            if (t2 != null) {
                Map<String, Object> a3 = t2.a(this, this.f32057i);
                if (a3 != null) {
                    map.putAll(a3);
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        com.bytedance.ies.bullet.c.c.m r_ = r_();
        if (!(r_ instanceof e)) {
            r_ = null;
        }
        e eVar = (e) r_;
        if (!(eVar == null || (a2 = eVar.a(this, this.f32057i)) == null)) {
            map.putAll(a2);
        }
    }

    public static final class a extends com.bytedance.ies.bullet.ui.common.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f32357a;

        static {
            Covode.recordClassIndex(18994);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(i iVar) {
            this.f32357a = iVar;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final boolean a(Activity activity) {
            l.c(activity, "");
            try {
                if (l.a((Object) this.f32357a.t().an.b(), (Object) false)) {
                    return true;
                }
            } catch (Exception e2) {
                this.f32357a.printReject(e2, " on uri " + this.f32357a.f32354k);
            }
            return com.lynx.tasm.navigator.c.a().b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<i, com.bytedance.ies.bullet.c.c.a.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f32358a = new e();

        static {
            Covode.recordClassIndex(18998);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.m invoke(i iVar) {
            i iVar2 = iVar;
            l.c(iVar2, "");
            return iVar2.f32051c;
        }
    }

    private static c a(com.bytedance.ies.bullet.c.c.e eVar) {
        if (eVar == null || !(eVar instanceof c)) {
            return null;
        }
        return (c) eVar;
    }

    static String b(com.bytedance.ies.bullet.service.f.a.d dVar) {
        String b2 = dVar.aq.b();
        if (b2 != null) {
            return b2;
        }
        String b3 = dVar.Z.b();
        if (b3 == null) {
            return dVar.ab.b();
        }
        return b3;
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void a(Activity activity) {
        Iterator<T> it = this.H.iterator();
        while (it.hasNext()) {
            ((LynxView) it.next().f33078a).onEnterForeground();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ com.lynx.tasm.navigator.g $listener$inlined;
        final /* synthetic */ com.lynx.tasm.navigator.d $route$inlined;
        final /* synthetic */ String $schema$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(18997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, String str, com.lynx.tasm.navigator.g gVar, com.lynx.tasm.navigator.d dVar) {
            super(1);
            this.this$0 = iVar;
            this.$schema$inlined = str;
            this.$listener$inlined = gVar;
            this.$route$inlined = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            j.b.a(this.this$0, "load resource for navigation failed with msg: " + th2.getMessage(), null, null, 6);
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$i  reason: collision with other inner class name */
    static final class C0690i extends h.f.b.m implements h.f.a.b<ap, z> {
        final /* synthetic */ Map $constants$inlined;
        final /* synthetic */ Uri $input$inlined;
        final /* synthetic */ boolean $reload$inlined;
        final /* synthetic */ byte[] $scriptBinary;
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.c.d $viewComponent$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(19004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0690i(byte[] bArr, com.bytedance.ies.bullet.ui.common.c.d dVar, i iVar, Uri uri, Map map, boolean z) {
            super(1);
            this.$scriptBinary = bArr;
            this.$viewComponent$inlined = dVar;
            this.this$0 = iVar;
            this.$input$inlined = uri;
            this.$constants$inlined = map;
            this.$reload$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            ap apVar2 = apVar;
            l.c(apVar2, "");
            String str = apVar2.o;
            if (str == null) {
                l.a();
            }
            this.this$0.a(this.$viewComponent$inlined, this.$scriptBinary, TemplateData.a(h.e.j.c(new File(str))), this.$reload$inlined);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ Map $constants$inlined;
        final /* synthetic */ Uri $input$inlined;
        final /* synthetic */ boolean $reload$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.c.d $viewComponent$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(19005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.bytedance.ies.bullet.ui.common.c.d dVar, i iVar, Uri uri, Map map, boolean z) {
            super(1);
            this.$viewComponent$inlined = dVar;
            this.this$0 = iVar;
            this.$input$inlined = uri;
            this.$constants$inlined = map;
            this.$reload$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            j.b.a(this.this$0, "load durl resource failed:" + th2.getMessage(), null, null, 6);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.b
    public final void a(com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar) {
        l.c(dVar, "");
        t b2 = t().f32695k.b();
        if (b2 != null) {
            Integer valueOf = Integer.valueOf(b2.f32728a);
            if (valueOf.intValue() != -2 && valueOf != null) {
                ((LynxView) dVar.f33078a).setBackgroundColor(valueOf.intValue());
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void b(Activity activity) {
        Iterator<T> it = this.H.iterator();
        while (it.hasNext()) {
            ((LynxView) it.next().f33078a).onEnterBackground();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ long $loadStart;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(19003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar, long j2, h.f.a.b bVar) {
            super(1);
            this.this$0 = iVar;
            this.$loadStart = j2;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.$loadStart);
            com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) this.this$0.b_(com.bytedance.ies.bullet.service.base.o.class);
            com.bytedance.ies.bullet.service.base.e.d dVar = this.this$0.f32054f;
            String message = th2.getMessage();
            Long valueOf = Long.valueOf(millis);
            if (oVar != null) {
                an anVar = new an("bdx_monitor_lynx_resource_load", null, null, 254);
                anVar.f32550c = dVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", "Unknown");
                jSONObject.put("res_version", "-1");
                jSONObject.put("res_status", "failure");
                jSONObject.put("fail_reason", message);
                anVar.f32554g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", valueOf);
                anVar.f32555h = jSONObject2;
                oVar.a(anVar);
            }
            this.$reject.invoke(th2);
            return z.f158842a;
        }
    }

    @Override // com.lynx.tasm.navigator.b
    public final void b(LynxView lynxView) {
        LynxView lynxView2;
        com.bytedance.ies.bullet.ui.common.c.d dVar = (com.bytedance.ies.bullet.ui.common.c.d) n.h((List) this.H);
        if (dVar != null && (lynxView2 = (LynxView) dVar.f33078a) != null) {
            lynxView2.removeView(lynxView);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ap, z> {
        final /* synthetic */ com.lynx.tasm.navigator.g $listener$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.service.f.a.d $params;
        final /* synthetic */ com.lynx.tasm.navigator.d $route$inlined;
        final /* synthetic */ String $schema$inlined;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(18996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.bullet.service.f.a.d dVar, i iVar, String str, com.lynx.tasm.navigator.g gVar, com.lynx.tasm.navigator.d dVar2) {
            super(1);
            this.$params = dVar;
            this.this$0 = iVar;
            this.$schema$inlined = str;
            this.$listener$inlined = gVar;
            this.$route$inlined = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0049 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.bytedance.ies.bullet.service.base.a.p, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.service.base.ap r8) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.lynx.i.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void b(Throwable th) {
        super.b(th);
        this.f32355l = null;
        com.bytedance.ies.bullet.ui.common.g z2 = z();
        if (z2 != null) {
            z2.b(this.y);
        }
        com.lynx.tasm.navigator.c.a().a(this);
        com.bytedance.ies.bullet.service.base.c.c cVar = this.x;
        if (cVar != null) {
            cVar.b();
        }
        j.b.a(this, "lynxview was destroy, currentUri: " + this.f32354k, null, null, 6);
    }

    static final class g extends h.f.b.m implements h.f.a.b<ap, z> {
        final /* synthetic */ Uri $input;
        final /* synthetic */ long $loadStart;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(19002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, long j2, h.f.a.b bVar, h.f.a.b bVar2, Uri uri) {
            super(1);
            this.this$0 = iVar;
            this.$loadStart = j2;
            this.$reject = bVar;
            this.$resolve = bVar2;
            this.$input = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            Uri b2;
            com.bytedance.ies.bullet.c.c.a.m mVar;
            com.bytedance.ies.bullet.c.c.a.m mVar2;
            com.bytedance.ies.bullet.service.a.e<String, Object> b3;
            boolean z;
            MethodCollector.i(8450);
            ap apVar2 = apVar;
            String str = "";
            l.c(apVar2, str);
            com.bytedance.ies.bullet.service.base.e.d dVar = (com.bytedance.ies.bullet.service.base.e.d) this.this$0.a_(com.bytedance.ies.bullet.service.base.e.d.class);
            byte[] bArr = null;
            if (dVar != null) {
                if (!(dVar instanceof com.bytedance.ies.bullet.service.base.e.a)) {
                    dVar = null;
                }
                com.bytedance.ies.bullet.service.base.e.a aVar = (com.bytedance.ies.bullet.service.base.e.a) dVar;
                if (!(aVar == null || !com.bytedance.ies.bullet.kit.a.a.f.a(aVar.f32600a) || (b3 = e.a.a().b(aVar.f32600a)) == null)) {
                    if (!(apVar2 instanceof com.bytedance.ies.bullet.kit.a.f) || !((com.bytedance.ies.bullet.kit.a.f) apVar2).f32242c) {
                        z = false;
                    } else {
                        z = true;
                    }
                    b3.putBooleanIfAbsent("res_memory", z);
                }
            }
            String str2 = apVar2.o;
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.$loadStart);
            com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.this$0.f32057i.c(com.bytedance.ies.bullet.c.i.class);
            if (iVar != null) {
                iVar.f32095g = Long.valueOf(millis);
            }
            com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) this.this$0.b_(com.bytedance.ies.bullet.service.base.o.class);
            com.bytedance.ies.bullet.service.base.e.d dVar2 = this.this$0.f32054f;
            String b4 = this.this$0.t().Q.b();
            String b5 = apVar2.b();
            String valueOf = String.valueOf(apVar2.s);
            Long valueOf2 = Long.valueOf(millis);
            l.c(b5, str);
            if (oVar != null) {
                an anVar = new an("bdx_monitor_lynx_resource_load", null, null, 254);
                anVar.f32550c = dVar2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_from", b5);
                jSONObject.put("res_url", str2);
                jSONObject.put("res_version", valueOf);
                jSONObject.put("res_status", "success");
                jSONObject.put("channel", b4);
                anVar.f32554g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", valueOf2);
                anVar.f32555h = jSONObject2;
                oVar.a(anVar);
            }
            y yVar = (y) this.this$0.b_(y.class);
            if (!(yVar == null || (mVar2 = this.this$0.f32051c) == null)) {
                Object a2 = yVar.a(this.this$0.f32057i);
                if (a2 != null) {
                    mVar2.a((com.bytedance.ies.bullet.c.c.a.q) a2);
                } else {
                    w wVar = new w("null cannot be cast to non-null type");
                    MethodCollector.o(8450);
                    throw wVar;
                }
            }
            com.bytedance.ies.bullet.service.base.web.f fVar = (com.bytedance.ies.bullet.service.base.web.f) this.this$0.b_(com.bytedance.ies.bullet.service.base.web.f.class);
            if (!(fVar == null || (mVar = this.this$0.f32051c) == null)) {
                Object a3 = fVar.a(this.this$0.f32057i);
                if (a3 != null) {
                    mVar.a((com.bytedance.ies.bullet.c.c.a.q) a3);
                } else {
                    w wVar2 = new w("null cannot be cast to non-null type");
                    MethodCollector.o(8450);
                    throw wVar2;
                }
            }
            InputStream a4 = apVar2.a();
            if (a4 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                h.f.a.b bVar = this.$reject;
                try {
                    InputStream inputStream = a4;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        long unused = h.e.b.a(inputStream, byteArrayOutputStream2, 8192);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        h.e.c.a(byteArrayOutputStream, null);
                        try {
                            h.e.c.a(a4, null);
                            bArr = byteArray;
                        } catch (Exception e2) {
                            bVar.invoke(new RuntimeException("Script decode error!", e2));
                        }
                        if (bArr != null) {
                            this.this$0.f32355l = bArr;
                            i iVar2 = this.this$0;
                            if (apVar2.q != ao.CDN || !this.this$0.g().c()) {
                                String str3 = apVar2.o;
                                if (str3 == null) {
                                    l.a();
                                }
                                b2 = com.bytedance.ies.bullet.kit.a.m.b(str3);
                            } else {
                                String b6 = i.b(this.this$0.t());
                                if (b6 != null) {
                                    str = b6;
                                }
                                b2 = Uri.parse(str);
                            }
                            iVar2.f32356m = b2;
                            this.this$0.r = System.currentTimeMillis() - currentTimeMillis;
                            this.$resolve.invoke(this.$input);
                        }
                    } catch (Throwable th) {
                        h.e.c.a(byteArrayOutputStream, th);
                        MethodCollector.o(8450);
                        throw th;
                    }
                } catch (Throwable th2) {
                    h.e.c.a(a4, th);
                    MethodCollector.o(8450);
                    throw th2;
                }
            } else {
                this.$reject.invoke(new FileNotFoundException(String.valueOf(apVar2)));
            }
            z zVar = z.f158842a;
            MethodCollector.o(8450);
            return zVar;
        }
    }

    public final LynxView a(com.bytedance.ies.bullet.service.f.a.d dVar) {
        boolean z2;
        View a2;
        com.bytedance.ies.bullet.c.e.a.b b2 = this.f32057i.b();
        b2.a(com.bytedance.ies.bullet.c.c.a.m.class, (com.bytedance.ies.bullet.c.e.a.c) new com.bytedance.ies.bullet.c.e.a.e(this, e.f32358a));
        boolean z3 = false;
        com.bytedance.j.a.c cVar = new com.bytedance.j.a.c((byte) 0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.u.iterator();
        while (true) {
            boolean z4 = true;
            com.bytedance.ies.bullet.service.base.c.c cVar2 = null;
            if (it.hasNext()) {
                List<?> a3 = it.next().a();
                if (a3 == null) {
                    a3 = h.a.z.INSTANCE;
                }
                if (true ^ a3.isEmpty()) {
                    if (a3.get(0) instanceof com.lynx.tasm.behavior.a) {
                        arrayList.addAll(a3);
                    } else if (a3.get(0) instanceof com.bytedance.ies.lynx.lynx_adapter.wrapper.c) {
                        for (T t2 : a3) {
                            if (t2 != null) {
                                arrayList.add(com.bytedance.ies.bullet.lynx_adapter_impl.a.a(t2));
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        }
                        continue;
                    } else if (a3.get(0) instanceof com.bytedance.ies.bullet.kit.lynx.api.d) {
                        for (T t3 : a3) {
                            if (t3 != null) {
                                arrayList.add(com.bytedance.ies.bullet.kit.lynx.model.a.a(t3));
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        }
                        continue;
                    } else {
                        j.b.a(this, "not supported type ".concat(String.valueOf(a3)), null, null, 6);
                    }
                }
            } else {
                cVar.o = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("bridge", new com.bytedance.j.a.e.b(LynxBridgeModule.class, b2));
                com.bytedance.j.a.e.c cVar3 = (com.bytedance.j.a.e.c) this.f32057i.c(com.bytedance.j.a.e.c.class);
                if (cVar3 != null) {
                    linkedHashMap.putAll(cVar3.f39033a);
                }
                cVar.n = linkedHashMap;
                cVar.f38962c = dVar.ak.b();
                cVar.f38964e = dVar.ag.b();
                cVar.f38963d = dVar.ah.b();
                Object b3 = dVar.aj.b();
                Integer num = (Integer) b3;
                if (num != null && num.intValue() == 0) {
                    b3 = null;
                }
                Integer num2 = (Integer) b3;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    com.bytedance.j.a.b bVar = new com.bytedance.j.a.b();
                    bVar.f38954a = dVar.ai.b();
                    bVar.f38955b = Integer.valueOf(intValue);
                    cVar.q = bVar;
                }
                cVar.f38968i = d.a.a(dVar.V.b()).f32491a;
                cVar.r = dVar.am.b();
                cVar.f38965f = dVar.ao.b();
                Boolean b4 = dVar.ar.b();
                if (b4 != null) {
                    z2 = b4.booleanValue();
                } else {
                    z2 = false;
                }
                cVar.f38969j = z2;
                cVar.a(this.w);
                cVar.a(x());
                g().a().a(com.bytedance.j.a.c.class, cVar);
                String b5 = dVar.S.b();
                if (b5 == null) {
                    l.a();
                }
                String str = b5;
                Boolean b6 = dVar.T.b();
                if (b6 != null) {
                    z4 = b6.booleanValue();
                }
                Boolean b7 = dVar.U.b();
                if (b7 != null) {
                    z3 = b7.booleanValue();
                }
                cVar.a(str, z4, z3, w() ? new String[]{"assets://bdlynx_core.js"} : null);
                com.bytedance.ies.bullet.service.base.c.b bVar2 = (com.bytedance.ies.bullet.service.base.c.b) b_(com.bytedance.ies.bullet.service.base.c.b.class);
                if (bVar2 != null) {
                    cVar2 = bVar2.b(this);
                }
                this.x = cVar2;
                if (cVar2 == null || (a2 = cVar2.a()) == null) {
                    throw new w("null cannot be cast to non-null type");
                }
                LynxView lynxView = (LynxView) a2;
                b2.a(LynxView.class, lynxView);
                this.f32057i.a(LynxView.class, lynxView);
                lynxView.setTag(R.id.a0k, "bullet");
                return lynxView;
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void onEvent(p pVar) {
        Map h2;
        String str;
        String str2;
        l.c(pVar, "");
        TemplateData templateData = null;
        if (l.a((Object) pVar.a(), (Object) "__updateData")) {
            Object b2 = pVar.b();
            if (b2 != null) {
                if ((b2 instanceof CharSequence) || (b2 instanceof JSONObject) || (b2 instanceof JSONArray)) {
                    str2 = String.valueOf(b2);
                } else if (b2 instanceof ReadableMap) {
                    str2 = String.valueOf(com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a((ReadableMap) b2));
                } else if (b2 instanceof ReadableArray) {
                    str2 = String.valueOf(com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a((ReadableArray) b2));
                } else {
                    return;
                }
                if (str2 != null) {
                    Iterator<T> it = this.H.iterator();
                    while (it.hasNext()) {
                        ((LynxView) it.next().f33078a).updateData(str2);
                    }
                }
            }
        } else if (l.a((Object) pVar.a(), (Object) "__updateGlobalProps") && this.w != null) {
            Object b3 = pVar.b();
            if (b3 != null && (b3 instanceof Map)) {
                Map map = (Map) b3;
                if (map.isEmpty()) {
                    j.b.a(this, "updateGlobalProps failed as diffProps is emtpy", null, null, 6);
                    return;
                }
                Map<String, ? extends Object> map2 = this.w;
                if (!(map2 == null || !ad.g(map2) || (h2 = ad.h(map2)) == null)) {
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key == null || !(key instanceof String) || (str = (String) key) == null || str.length() <= 0 || entry.getValue() == null)) {
                            j.b.a(this, "update globalProps item key: " + str + " from oldValue: " + h2.get(str) + " to newValue: " + entry.getValue(), null, null, 6);
                            Object value = entry.getValue();
                            if (value == null) {
                                l.a();
                            }
                            h2.put(str, value);
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, ? extends Object> map3 = this.w;
                if (map3 == null) {
                    l.a();
                }
                linkedHashMap.put("__globalProps", map3);
                Iterator<T> it2 = this.H.iterator();
                while (it2.hasNext()) {
                    ((LynxView) it2.next().f33078a).updateData(linkedHashMap);
                }
            }
        } else if (l.a((Object) "__updateTemplateData", (Object) pVar.a())) {
            Object b4 = pVar.b();
            if (b4 != null && (b4 instanceof com.bytedance.ies.lynx.lynx_adapter.wrapper.f)) {
                com.bytedance.ies.lynx.lynx_adapter.wrapper.f fVar = (com.bytedance.ies.lynx.lynx_adapter.wrapper.f) b4;
                if (fVar.f34206b != null) {
                    templateData = TemplateData.a(fVar.f34206b);
                    for (Map.Entry<String, Object> entry2 : fVar.f34205a.entrySet()) {
                        templateData.a(entry2.getKey(), entry2.getValue());
                    }
                } else {
                    templateData = TemplateData.a(fVar.f34205a);
                }
            }
            Iterator<T> it3 = this.H.iterator();
            while (it3.hasNext()) {
                ((LynxView) it3.next().f33078a).updateData(templateData);
            }
        } else {
            Iterator<T> it4 = this.H.iterator();
            while (it4.hasNext()) {
                LynxView lynxView = (LynxView) it4.next().f33078a;
                String a2 = pVar.a();
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                JSONObject jSONObject = new JSONObject();
                Object b5 = pVar.b();
                if (b5 != null) {
                    if ((b5 instanceof CharSequence) || (b5 instanceof JSONObject) || (b5 instanceof JSONArray)) {
                        jSONObject.put("data", b5);
                    } else if (b5 instanceof ReadableMap) {
                        jSONObject.put("data", com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a((ReadableMap) b5));
                    } else if (b5 instanceof ReadableArray) {
                        jSONObject.put("data", com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a((ReadableArray) b5));
                    } else {
                        jSONObject.put("data", new JSONObject());
                    }
                }
                com.bytedance.ies.bullet.kit.lynx.model.d dVar = new com.bytedance.ies.bullet.kit.lynx.model.d(this.f32056h.f32074a);
                l.c(jSONObject, "");
                l.c(dVar, "");
                jSONObject.put("containerID", dVar.f32377a);
                jSONObject.put("protocolVersion", dVar.f32378b);
                javaOnlyArray.pushMap(com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a(jSONObject));
                lynxView.sendGlobalEvent(a2, javaOnlyArray);
            }
        }
    }

    private final void a(com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar, Map<String, ? extends Object> map) {
        Object obj;
        this.w = map;
        ((LynxView) dVar.f33078a).setGlobalProps(map);
        if (l.a((Object) t().ap.b(), (Object) true) && !t().ao.c() && (obj = map.get("font_scale")) != null) {
            ((LynxView) dVar.f33078a).updateFontScacle(((Float) obj).floatValue());
        }
    }

    private final void a(Map<String, Object> map, Uri uri) {
        String str;
        Long l2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        l.a((Object) queryParameterNames, "");
        for (T t2 : queryParameterNames) {
            l.a((Object) t2, "");
            linkedHashMap.put(t2, uri.getQueryParameter(t2));
        }
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
        if (iVar == null || (l2 = iVar.f32090b) == null) {
            str = null;
        } else {
            str = String.valueOf(l2.longValue());
        }
        linkedHashMap.put("containerInitTime", str);
        map.put("queryItems", linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.List<com.bytedance.ies.bullet.kit.lynx.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.c.c.r
    public final void b(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        c a2;
        l.c(list, "");
        l.c(fVar, "");
        super.b(list, fVar);
        this.u.clear();
        this.f32353j.clear();
        this.v.clear();
        for (T t2 : p()) {
            if (t2 != null) {
                T t3 = t2;
                this.f32353j.add(t3.b(this.f32057i));
                com.bytedance.ies.bullet.kit.lynx.c.a c2 = t3.c(this.f32057i);
                if (c2 != null) {
                    this.u.add(c2);
                }
                t3.d(this.f32057i);
                t3.e(this.f32057i);
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        com.bytedance.ies.bullet.c.c.e s_ = s_();
        if (!(s_ == null || (a2 = a(s_)) == null)) {
            this.f32353j.add(a2.b(this.f32057i));
            com.bytedance.ies.bullet.kit.lynx.c.a c3 = a2.c(this.f32057i);
            if (c3 != null) {
                this.u.add(c3);
            }
            a2.d(this.f32057i);
            a2.e(this.f32057i);
        }
        Object c4 = this.f32057i.c(a.class);
        if (c4 != null) {
            this.f32353j.add(c4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: com.bytedance.ies.bullet.lynx_adapter_impl.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.c.c.r
    public final void a(Uri uri, boolean z2) {
        boolean z3;
        String str;
        JSONObject jSONObject;
        boolean z4;
        com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar;
        Object obj;
        com.bytedance.ies.bullet.service.base.a b2;
        Map<String, ? extends Object> map;
        com.bytedance.ies.bullet.c.a.a aVar;
        com.bytedance.ies.bullet.c.a.b bVar;
        com.bytedance.ies.bullet.service.base.a b3;
        l.c(uri, "");
        Uri uri2 = this.f32354k;
        boolean z5 = true;
        if (uri2 == null || (!l.a(uri2, uri))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f32354k = uri;
        JSONObject jSONObject2 = null;
        j.b.a(this, "start to load lynxview", null, null, 6);
        if (z3) {
            A();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.z);
        com.bytedance.ies.bullet.service.base.e.d dVar2 = this.f32054f;
        if (dVar2 == null || (str = dVar2.a()) == null) {
            str = "";
        }
        linkedHashMap.put("resolvedUrl", str);
        for (com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar3 : this.H) {
            dVar3.a(uri);
            byte[] bArr = this.f32355l;
            if (bArr != null) {
                String b4 = t().V.b();
                if (b4 != null) {
                    jSONObject = new JSONObject(b4);
                } else {
                    jSONObject = jSONObject2;
                }
                TemplateData templateData = (TemplateData) this.f32057i.c(TemplateData.class);
                ag agVar = (ag) b_(ag.class);
                if (agVar == null || (b3 = agVar.b()) == null) {
                    z4 = false;
                } else {
                    z4 = b3.f32513b;
                }
                com.bytedance.ies.bullet.lynx_adapter_impl.d dVar4 = (com.bytedance.ies.bullet.lynx_adapter_impl.d) this.f32057i.c(com.bytedance.ies.bullet.lynx_adapter_impl.d.class);
                com.bytedance.ies.bullet.lynx_adapter_impl.d dVar5 = dVar4;
                if (dVar4 == null) {
                    com.bytedance.ies.bullet.lynx_adapter_impl.d a2 = com.bytedance.ies.bullet.lynx_adapter_impl.b.a((com.bytedance.ies.lynx.lynx_adapter.wrapper.f) this.f32057i.c(com.bytedance.ies.lynx.lynx_adapter.wrapper.f.class));
                    dVar5 = a2;
                    if (a2 == null) {
                        Boolean valueOf = Boolean.valueOf(z4);
                        if (!valueOf.booleanValue() || jSONObject == null) {
                            dVar5 = jSONObject2;
                        } else {
                            valueOf.booleanValue();
                            dVar5 = d.a.a(String.valueOf(jSONObject));
                        }
                    }
                }
                Map<String, Object> linkedHashMap2 = new LinkedHashMap<>();
                com.bytedance.ies.bullet.kit.lynx.model.e.a(linkedHashMap2, new com.bytedance.ies.bullet.kit.lynx.model.d(this.f32056h.f32074a));
                a(linkedHashMap2, uri);
                for (Map.Entry entry : h.a.ag.c(linkedHashMap).entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                String b5 = t().aa.b();
                if (b5 != null && b5.length() > 0 && (aVar = (com.bytedance.ies.bullet.c.a.a) this.f32057i.c(com.bytedance.ies.bullet.c.a.a.class)) != null && (bVar = aVar.f31976b) != null && bVar.f31978a == z5) {
                    IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) b_(IResourceLoaderService.class);
                    if (iResourceLoaderService != null) {
                        String uri3 = Uri.parse(b5).toString();
                        l.a((Object) uri3, "");
                        com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
                        jVar.s = this;
                        com.bytedance.ies.bullet.service.base.resourceloader.config.a aVar2 = (com.bytedance.ies.bullet.service.base.resourceloader.config.a) this.f32057i.c(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class);
                        if (aVar2 == null) {
                            aVar2 = new com.bytedance.ies.bullet.service.base.resourceloader.config.a(false);
                        }
                        jVar.a(aVar2);
                        jVar.d("template");
                        jVar.w = this.f32054f;
                        dVar = dVar3;
                        iResourceLoaderService.loadAsync(uri3, jVar, new C0690i(bArr, dVar, this, uri, linkedHashMap, z2), new j(dVar, this, uri, linkedHashMap, z2));
                    } else {
                        dVar = dVar3;
                    }
                } else if (dVar5 != null) {
                    Map<String, Object> linkedHashMap3 = new LinkedHashMap<>();
                    linkedHashMap3.put("containerID", this.f32056h.f32074a);
                    linkedHashMap3.put("protocolVersion", "1.0");
                    a(linkedHashMap3, uri);
                    for (Map.Entry entry2 : h.a.ag.c(linkedHashMap).entrySet()) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                    dVar = dVar3;
                    a(dVar, linkedHashMap3);
                    a(dVar, bArr, dVar5.f32491a, z2);
                } else {
                    dVar = dVar3;
                    if (jSONObject == null) {
                        if (templateData != null) {
                            Map<String, Object> linkedHashMap4 = new LinkedHashMap<>();
                            linkedHashMap4.put("containerID", this.f32056h.f32074a);
                            linkedHashMap4.put("protocolVersion", "1.0");
                            a(linkedHashMap4, uri);
                            for (Map.Entry entry3 : h.a.ag.c(linkedHashMap).entrySet()) {
                                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                            }
                            ag agVar2 = (ag) b_(ag.class);
                            if (agVar2 == null || (b2 = agVar2.b()) == null || !b2.f32513b) {
                                a(dVar, linkedHashMap4);
                            } else {
                                Object a3 = d.a.a(linkedHashMap4);
                                if (!(a3 == null || (map = (Map) a3) == null)) {
                                    a(dVar, map);
                                }
                            }
                            a(dVar, bArr, templateData, z2);
                        } else {
                            y yVar = (y) b_(y.class);
                            if (yVar != null) {
                                obj = yVar.c(uri);
                            } else {
                                obj = null;
                            }
                            jSONObject = new JSONObject();
                            if (obj != null) {
                                jSONObject.put("prefetchInitData", obj);
                            }
                            com.bytedance.ies.bullet.service.base.e.d dVar6 = this.f32054f;
                            if (dVar6 != null) {
                                Uri parse = Uri.parse(dVar6.a());
                                y yVar2 = (y) b_(y.class);
                                if (yVar2 != null) {
                                    l.a((Object) parse, "");
                                    Object c2 = yVar2.c(parse);
                                    if (c2 != null) {
                                        jSONObject.put("localInitData", c2);
                                    }
                                }
                            }
                        }
                    }
                    a(dVar, linkedHashMap2);
                    a(dVar, bArr, jSONObject, z2);
                }
                if (z2) {
                    dVar.b(uri);
                }
                z5 = true;
                jSONObject2 = null;
            }
        }
        this.f32354k = uri;
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void c(Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        Long b2;
        MethodCollector.i(6892);
        String str = "";
        l.c(uri, str);
        l.c(bVar, str);
        l.c(bVar2, str);
        com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> s2 = s();
        if (s2 != null) {
            ILynxKitApi iLynxKitApi = (ILynxKitApi) s2;
            if (!iLynxKitApi.h()) {
                bVar2.invoke(new IllegalStateException("Lynx has not inited", iLynxKitApi.i()));
                MethodCollector.o(6892);
            } else if (l.a((Object) t().ae.b(), (Object) true)) {
                bVar2.invoke(new com.bytedance.ies.bullet.c.c.q(this, uri, null, 4, null));
                MethodCollector.o(6892);
            } else {
                Integer num = (Integer) t().ad.b();
                if (num != null) {
                    num.intValue();
                }
                this.C = System.currentTimeMillis();
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) b_(IResourceLoaderService.class);
                if (iResourceLoaderService == null) {
                    bVar2.invoke(new RuntimeException("loader service is null"));
                    MethodCollector.o(6892);
                    return;
                }
                this.t = true;
                long nanoTime = System.nanoTime();
                if (l.a((Object) t().H.b(), (Object) true) && (b2 = t().I.b()) != null) {
                    long longValue = b2.longValue();
                    if (longValue > 0) {
                        Thread.sleep(longValue);
                    }
                }
                String uri2 = uri.toString();
                l.a((Object) uri2, str);
                com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.j();
                com.bytedance.ies.bullet.service.base.resourceloader.config.a aVar = (com.bytedance.ies.bullet.service.base.resourceloader.config.a) this.f32057i.c(com.bytedance.ies.bullet.service.base.resourceloader.config.a.class);
                int i2 = 0;
                if (aVar == null) {
                    aVar = new com.bytedance.ies.bullet.service.base.resourceloader.config.a(false);
                }
                jVar.a(aVar);
                String b3 = t().Q.b();
                if (b3 == null) {
                    b3 = str;
                }
                jVar.a(b3);
                String b4 = t().R.b();
                if (b4 == null) {
                    b4 = str;
                }
                jVar.b(b4);
                String b5 = b(t());
                if (b5 != null) {
                    str = b5;
                }
                jVar.c(str);
                jVar.s = this;
                Integer num2 = (Integer) t().ad.b();
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                jVar.f32636j = Integer.valueOf(i2);
                jVar.d("template");
                jVar.w = this.f32054f;
                iResourceLoaderService.loadAsync(uri2, jVar, new g(this, nanoTime, bVar2, bVar, uri), new h(this, nanoTime, bVar2));
                MethodCollector.o(6892);
            }
        } else {
            w wVar = new w("null cannot be cast to non-null type");
            MethodCollector.o(6892);
            throw wVar;
        }
    }

    private final void a(com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar, byte[] bArr, JSONObject jSONObject, boolean z2) {
        String valueOf = String.valueOf(this.f32356m);
        j.b.a(this, "start to render js, templateUrl: " + valueOf + ", reload: " + z2, null, null, 6);
        if (z2) {
            ((LynxView) dVar.f33078a).updateData(String.valueOf(jSONObject));
            return;
        }
        this.o = System.currentTimeMillis();
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
        if (!(iVar == null || iVar.f32092d != null || iVar.f32090b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = iVar.f32090b;
            if (l2 == null) {
                l.a();
            }
            iVar.f32092d = Long.valueOf(currentTimeMillis - l2.longValue());
        }
        ((LynxView) dVar.f33078a).renderTemplateWithBaseUrl(bArr, String.valueOf(jSONObject), valueOf);
        this.q = System.currentTimeMillis() - this.o;
    }

    public final void a(com.bytedance.ies.bullet.ui.common.c.d<LynxView> dVar, byte[] bArr, TemplateData templateData, boolean z2) {
        String valueOf = String.valueOf(this.f32356m);
        j.b.a(this, "start to render js, templateUrl: " + valueOf + ", reload: " + z2, null, null, 6);
        if (z2) {
            ((LynxView) dVar.f33078a).updateData(templateData);
            return;
        }
        this.o = System.currentTimeMillis();
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
        if (!(iVar == null || iVar.f32092d != null || iVar.f32090b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = iVar.f32090b;
            if (l2 == null) {
                l.a();
            }
            iVar.f32092d = Long.valueOf(currentTimeMillis - l2.longValue());
        }
        ((LynxView) dVar.f33078a).renderTemplateWithBaseUrl(bArr, templateData, valueOf);
        this.q = System.currentTimeMillis() - this.o;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(LynxKitApi lynxKitApi, com.bytedance.ies.bullet.c.c.z zVar, List<String> list, com.bytedance.ies.bullet.c.f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(lynxKitApi, zVar, list, fVar, bVar);
        l.c(lynxKitApi, "");
        l.c(zVar, "");
        l.c(list, "");
        l.c(fVar, "");
        l.c(bVar, "");
        this.A = h.i.a((h.f.a.a) new b(bVar));
    }
}
