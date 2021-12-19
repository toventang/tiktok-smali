package com.bytedance.lynx.hybrid.resource.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.d.c;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.d.g;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f41162a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f41163b;

    /* renamed from: c  reason: collision with root package name */
    public IHybridResourceLoader f41164c;

    /* renamed from: d  reason: collision with root package name */
    private c f41165d;

    /* renamed from: e  reason: collision with root package name */
    private c f41166e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f41167f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Class<? extends IHybridResourceLoader>> f41168g;

    /* renamed from: h  reason: collision with root package name */
    private final IResourceService f41169h;

    static {
        Covode.recordClassIndex(25222);
    }

    private final boolean b() {
        if (this.f41165d == c.LOW || this.f41166e != c.LOW) {
            return false;
        }
        return true;
    }

    public final void a() {
        this.f41162a = true;
        CountDownLatch countDownLatch = this.f41167f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        IHybridResourceLoader iHybridResourceLoader = this.f41164c;
        if (iHybridResourceLoader != null) {
            iHybridResourceLoader.cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ Class $clz;
        final /* synthetic */ IHybridResourceLoader $impl;
        final /* synthetic */ g $input;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(25223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, h.f.a.b bVar, g gVar, Class cls, h.f.a.b bVar2, IHybridResourceLoader iHybridResourceLoader) {
            super(1);
            this.this$0 = dVar;
            this.$reject = bVar;
            this.$input = gVar;
            this.$clz = cls;
            this.$resolve = bVar2;
            this.$impl = iHybridResourceLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.c(eVar2, "");
            if (this.this$0.f41162a) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else {
                this.$input.a(eVar2);
                e eVar3 = this.$input.f41135b;
                String simpleName = this.$clz.getSimpleName();
                l.a((Object) simpleName, "");
                eVar3.f(simpleName);
                this.$resolve.invoke(this.$input);
                JSONArray jSONArray = this.$input.f41135b.f41130l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.name, this.$impl.getTAG());
                jSONObject.put("status", "success");
                jSONArray.put(jSONObject);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ boolean $hasNext;
        final /* synthetic */ IHybridResourceLoader $impl;
        final /* synthetic */ int $index;
        final /* synthetic */ g $input;
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.i.c $interval;
        final /* synthetic */ Iterator $iter;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(25224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, g gVar, IHybridResourceLoader iHybridResourceLoader, h.f.a.b bVar, boolean z, Iterator it, h.f.a.b bVar2, com.bytedance.lynx.hybrid.resource.i.c cVar, int i2) {
            super(1);
            this.this$0 = dVar;
            this.$input = gVar;
            this.$impl = iHybridResourceLoader;
            this.$reject = bVar;
            this.$hasNext = z;
            this.$iter = it;
            this.$resolve = bVar2;
            this.$interval = cVar;
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            JSONArray jSONArray = this.$input.f41135b.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, this.$impl.getTAG());
            jSONObject.put("status", "fail");
            jSONObject.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject);
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            com.bytedance.lynx.hybrid.j.c.a(str, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            if (this.this$0.f41162a) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (this.$hasNext) {
                this.this$0.a(this.$input, this.$iter, this.$resolve, this.$reject, this.$interval, this.$index + 1);
            } else {
                this.$reject.invoke(th2);
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<? extends com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader>> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends Class<? extends IHybridResourceLoader>> list, IResourceService iResourceService) {
        l.c(list, "");
        l.c(iResourceService, "");
        this.f41168g = list;
        this.f41169h = iResourceService;
    }

    public final void a(g gVar, h.f.a.b<? super g, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.c(gVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        if (gVar.f41137d) {
            Iterator<Class<? extends IHybridResourceLoader>> it = this.f41168g.iterator();
            if (!it.hasNext()) {
                bVar2.invoke(new Throwable("ResourceLoaderChain# no processor for " + gVar.f41135b.f41131m));
                return;
            }
            a(gVar, it, bVar, bVar2, new com.bytedance.lynx.hybrid.resource.i.c(), 0);
        } else {
            b(gVar, bVar, bVar2);
        }
        com.bytedance.lynx.hybrid.j.c.a("Load url = " + gVar.f41135b.f41131m + ", message = " + gVar.f41135b.f41130l, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
    }

    private final void b(g gVar, h.f.a.b<? super g, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        com.bytedance.lynx.hybrid.resource.i.c cVar = new com.bytedance.lynx.hybrid.resource.i.c();
        int i2 = 0;
        for (T t : this.f41168g) {
            try {
                this.f41166e = a.a(t);
                if (b()) {
                    this.f41163b = true;
                    cVar.a();
                }
                this.f41165d = this.f41166e;
                IHybridResourceLoader iHybridResourceLoader = (IHybridResourceLoader) t.newInstance();
                iHybridResourceLoader.setService(this.f41169h);
                this.f41164c = iHybridResourceLoader;
                e loadSync = iHybridResourceLoader.loadSync(gVar.f41135b, gVar.f41136c);
                if (loadSync == null) {
                    Throwable th = new Throwable(t.getCanonicalName() + " return null");
                    if (i2 == this.f41168g.size() - 1) {
                        bVar2.invoke(th);
                    }
                    com.bytedance.lynx.hybrid.j.c.a(th, (String) null, (String) null, 6);
                    if (this.f41162a) {
                        bVar2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        return;
                    }
                    i2++;
                } else {
                    gVar.a(loadSync);
                    e eVar = gVar.f41135b;
                    String simpleName = t.getSimpleName();
                    l.a((Object) simpleName, "");
                    eVar.f(simpleName);
                    bVar.invoke(gVar);
                    return;
                }
            } catch (Throwable th2) {
                if (i2 == this.f41168g.size() - 1) {
                    bVar2.invoke(th2);
                }
                com.bytedance.lynx.hybrid.j.c.a("ResourceLoaderChain# onException " + th2.getMessage(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            }
        }
    }

    public final void a(g gVar, Iterator<? extends Class<? extends IHybridResourceLoader>> it, h.f.a.b<? super g, z> bVar, h.f.a.b<? super Throwable, z> bVar2, com.bytedance.lynx.hybrid.resource.i.c cVar, int i2) {
        int i3 = i2;
        while (true) {
            Class cls = (Class) it.next();
            this.f41166e = a.a(cls);
            if (b()) {
                this.f41163b = true;
                cVar.a();
            }
            this.f41165d = this.f41166e;
            boolean hasNext = it.hasNext();
            IHybridResourceLoader iHybridResourceLoader = (IHybridResourceLoader) cls.newInstance();
            iHybridResourceLoader.setService(this.f41169h);
            this.f41164c = iHybridResourceLoader;
            try {
                iHybridResourceLoader.loadAsync(gVar.f41135b, gVar.f41136c, new a(this, bVar2, gVar, cls, bVar, iHybridResourceLoader), new b(this, gVar, iHybridResourceLoader, bVar2, hasNext, it, bVar, cVar, i3));
                return;
            } catch (Throwable th) {
                com.bytedance.lynx.hybrid.j.c.a("ResourceLoaderChain# onException " + th.getMessage(), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
                if (hasNext) {
                    i3++;
                } else {
                    bVar2.invoke(new Throwable("ResourceLoaderChain# " + th.getMessage()));
                    return;
                }
            }
        }
    }
}
