package com.bytedance.lynx.hybrid.resource;

import android.os.FileObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.c.a;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.d.g;
import h.f.b.m;
import h.f.b.z;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<? extends IHybridResourceLoader>> f41226a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<? extends IHybridResourceLoader>> f41227b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    static final Map<com.bytedance.lynx.hybrid.resource.d.b, com.bytedance.lynx.hybrid.resource.f.d> f41228c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final l f41229d = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(25248);
    }

    static final class c extends m implements h.f.a.b<g, z> {
        final /* synthetic */ j $config;
        final /* synthetic */ g $resourceLoadTask;
        final /* synthetic */ z.e $resultInfo;

        static {
            Covode.recordClassIndex(25251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z.e eVar, j jVar, g gVar) {
            super(1);
            this.$resultInfo = eVar;
            this.$config = jVar;
            this.$resourceLoadTask = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(g gVar) {
            g gVar2 = gVar;
            h.f.b.l.c(gVar2, "");
            this.$resultInfo.element = (T) gVar2.f41135b;
            com.bytedance.lynx.hybrid.resource.e.a.a(gVar2.f41135b, this.$config);
            e eVar = this.$resourceLoadTask.f41135b;
            if (eVar != null) {
                l.a(gVar2, (j) eVar, this.$resourceLoadTask.f41136c);
                String jSONArray = gVar2.f41135b.f41130l.toString();
                h.f.b.l.a((Object) jSONArray, "");
                com.bytedance.lynx.hybrid.j.c.a(jSONArray, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                return h.z.f158842a;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class a extends m implements h.f.a.b<g, h.z> {
        final /* synthetic */ j $config;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.i.c $interval;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ g $resourceLoadTask;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.b $task;

        static {
            Covode.recordClassIndex(25249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.lynx.hybrid.resource.d.b bVar, com.bytedance.lynx.hybrid.resource.i.c cVar, j jVar, g gVar, h.f.a.b bVar2) {
            super(1);
            this.$task = bVar;
            this.$interval = cVar;
            this.$config = jVar;
            this.$resourceLoadTask = gVar;
            this.$resolve = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(g gVar) {
            g gVar2 = gVar;
            h.f.b.l.c(gVar2, "");
            l.f41228c.remove(this.$task);
            this.$interval.a();
            j jVar = this.$config;
            String jSONArray = this.$resourceLoadTask.f41135b.f41130l.toString();
            h.f.b.l.a((Object) jSONArray, "");
            jVar.e(jSONArray);
            this.$resolve.invoke(gVar2.f41135b);
            com.bytedance.lynx.hybrid.resource.e.a.a(gVar2.f41135b, this.$config);
            e eVar = this.$resourceLoadTask.f41135b;
            if (eVar != null) {
                l.a(gVar2, (j) eVar, this.$resourceLoadTask.f41136c);
                String jSONArray2 = gVar2.f41135b.f41130l.toString();
                h.f.b.l.a((Object) jSONArray2, "");
                com.bytedance.lynx.hybrid.j.c.a(jSONArray2, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                return h.z.f158842a;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class b extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ j $config;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ g $resourceLoadTask;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.b $task;

        static {
            Covode.recordClassIndex(25250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, com.bytedance.lynx.hybrid.resource.d.b bVar, j jVar, h.f.a.b bVar2) {
            super(1);
            this.$resourceLoadTask = gVar;
            this.$task = bVar;
            this.$config = jVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            h.f.b.l.c(th2, str);
            String jSONArray = this.$resourceLoadTask.f41135b.f41130l.toString();
            h.f.b.l.a((Object) jSONArray, str);
            com.bytedance.lynx.hybrid.j.c.a(jSONArray, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            l.f41228c.remove(this.$task);
            j jVar = this.$config;
            String jSONArray2 = this.$resourceLoadTask.f41135b.f41130l.toString();
            h.f.b.l.a((Object) jSONArray2, str);
            jVar.e(jSONArray2);
            this.$reject.invoke(th2);
            e eVar = this.$resourceLoadTask.f41135b;
            j jVar2 = this.$config;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            com.bytedance.lynx.hybrid.resource.e.a.a(eVar, jVar2, str);
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ j $config;
        final /* synthetic */ g $resourceLoadTask;
        final /* synthetic */ String $uri;

        static {
            Covode.recordClassIndex(25252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, g gVar, j jVar) {
            super(1);
            this.$uri = str;
            this.$resourceLoadTask = gVar;
            this.$config = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.c(th2, "");
            com.bytedance.lynx.hybrid.j.c.a("loadSync: reject uri =" + this.$uri, com.bytedance.lynx.hybrid.j.b.D, "ResourceLoader");
            e eVar = this.$resourceLoadTask.f41135b;
            j jVar = this.$config;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            com.bytedance.lynx.hybrid.resource.e.a.a(eVar, jVar, message);
            String jSONArray = this.$resourceLoadTask.f41135b.f41130l.toString();
            h.f.b.l.a((Object) jSONArray, "");
            com.bytedance.lynx.hybrid.j.c.a(jSONArray, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            return h.z.f158842a;
        }
    }

    public static void a(g gVar, j jVar, j jVar2) {
        String str;
        if (gVar.f41135b.p == com.bytedance.lynx.hybrid.resource.d.d.GECKO && jVar.f41214b != null && jVar2.r) {
            String a2 = com.bytedance.lynx.hybrid.resource.c.b.a(jVar2);
            com.bytedance.lynx.hybrid.resource.c.a aVar = a.b.f41072a;
            e eVar = gVar.f41135b;
            h.f.b.l.c(a2, "");
            h.f.b.l.c(eVar, "");
            if (a2.length() != 0 && (str = eVar.n) != null && str.length() != 0) {
                try {
                    a.e eVar2 = new a.e(aVar, a2, eVar, eVar.n);
                    aVar.f41070b.put(a2, eVar);
                    FileObserver fileObserver = aVar.f41071c.get(a2);
                    if (fileObserver != null) {
                        fileObserver.stopWatching();
                    }
                    eVar2.startWatching();
                    aVar.f41071c.put(a2, eVar2);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
