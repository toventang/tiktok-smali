package com.bytedance.ies.bullet.kit.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.h;
import com.bytedance.ies.bullet.kit.a.p;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public int f32230a;

    /* renamed from: b  reason: collision with root package name */
    public int f32231b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32232c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32233d;

    /* renamed from: e  reason: collision with root package name */
    public IXResourceLoader f32234e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f32235f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Class<? extends IXResourceLoader>> f32236g;

    /* renamed from: h  reason: collision with root package name */
    private final q f32237h;

    /* renamed from: i  reason: collision with root package name */
    private final IResourceLoaderService f32238i;

    static {
        Covode.recordClassIndex(18901);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return this.f32237h;
    }

    public final void a() {
        this.f32232c = true;
        CountDownLatch countDownLatch = this.f32235f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        IXResourceLoader iXResourceLoader = this.f32234e;
        if (iXResourceLoader != null) {
            iXResourceLoader.cancelLoad();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.a.c.a$a  reason: collision with other inner class name */
    public static final class C0688a extends m implements h.f.a.b<ap, z> {
        final /* synthetic */ Class $clz;
        final /* synthetic */ IXResourceLoader $impl;
        final /* synthetic */ h $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0688a(a aVar, h.f.a.b bVar, h hVar, Class cls, p pVar, h.f.a.b bVar2, IXResourceLoader iXResourceLoader) {
            super(1);
            this.this$0 = aVar;
            this.$reject = bVar;
            this.$input = hVar;
            this.$clz = cls;
            this.$interval = pVar;
            this.$resolve = bVar2;
            this.$impl = iXResourceLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            JSONObject jSONObject;
            ap apVar2 = apVar;
            l.c(apVar2, "");
            if (this.this$0.f32232c) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else {
                this.$input.a(apVar2);
                ap apVar3 = this.$input.f32256b;
                String simpleName = this.$clz.getSimpleName();
                l.a((Object) simpleName, "");
                apVar3.f(simpleName);
                if (this.this$0.f32233d && (jSONObject = this.$input.f32256b.f32563l.f32555h) != null) {
                    jSONObject.put("l_total", this.$interval.a());
                }
                this.$resolve.invoke(this.$input);
                JSONArray jSONArray = this.$input.f32256b.f32564m;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, this.$impl.getTAG());
                jSONObject2.put("status", "success");
                jSONArray.put(jSONObject2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ boolean $hasNext;
        final /* synthetic */ IXResourceLoader $impl;
        final /* synthetic */ int $index;
        final /* synthetic */ h $input;
        final /* synthetic */ p $interval;
        final /* synthetic */ Iterator $iter;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, h hVar, IXResourceLoader iXResourceLoader, h.f.a.b bVar, boolean z, Iterator it, h.f.a.b bVar2, p pVar, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$input = hVar;
            this.$impl = iXResourceLoader;
            this.$reject = bVar;
            this.$hasNext = z;
            this.$iter = it;
            this.$resolve = bVar2;
            this.$interval = pVar;
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            JSONObject jSONObject;
            Throwable th2 = th;
            String str = "";
            l.c(th2, str);
            JSONArray jSONArray = this.$input.f32256b.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, this.$impl.getTAG());
            jSONObject2.put("status", "fail");
            jSONObject2.put("message", String.valueOf(th2.getMessage()));
            jSONArray.put(jSONObject2);
            a aVar = this.this$0;
            String message = th2.getMessage();
            if (message != null) {
                str = message;
            }
            j.b.a(aVar, str, null, null, 6);
            if (this.this$0.f32232c) {
                this.$reject.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
            } else if (this.$hasNext) {
                this.this$0.a(this.$input, this.$iter, this.$resolve, this.$reject, this.$interval, this.$index + 1);
            } else {
                if (this.this$0.f32233d && (jSONObject = this.$input.f32256b.f32563l.f32555h) != null) {
                    jSONObject.put("l_total", this.$interval.a());
                }
                this.$reject.invoke(th2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Class<? extends IXResourceLoader>> list, q qVar, IResourceLoaderService iResourceLoaderService) {
        l.c(list, "");
        l.c(qVar, "");
        l.c(iResourceLoaderService, "");
        this.f32236g = list;
        this.f32237h = qVar;
        this.f32238i = iResourceLoaderService;
    }

    public final void a(h hVar, h.f.a.b<? super h, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.c(hVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        if (hVar.f32255a) {
            Iterator<Class<? extends IXResourceLoader>> it = this.f32236g.iterator();
            if (!it.hasNext()) {
                bVar2.invoke(new Throwable("ResourceLoaderChain# no processor for " + hVar.f32256b.n));
                return;
            }
            a(hVar, it, bVar, bVar2, new p(), 0);
        } else {
            b(hVar, bVar, bVar2);
        }
        j.b.a(this, "Load url = " + hVar.f32256b.n + ", message = " + hVar.f32256b.f32564m, null, null, 6);
    }

    private final void b(h hVar, h.f.a.b<? super h, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        p pVar = new p();
        int i2 = 0;
        for (T t : this.f32236g) {
            try {
                if (i2 == this.f32230a && (jSONObject4 = hVar.f32256b.f32563l.f32555h) != null) {
                    jSONObject4.put("h_total", pVar.a());
                }
                if (i2 == this.f32231b) {
                    pVar.a();
                    this.f32233d = true;
                }
                IXResourceLoader iXResourceLoader = (IXResourceLoader) t.newInstance();
                iXResourceLoader.setService(this.f32238i);
                iXResourceLoader.setLoaderLogger(getLoggerWrapper());
                this.f32234e = iXResourceLoader;
                ap loadSync = iXResourceLoader.loadSync(hVar.f32256b, hVar.f32257c);
                if (loadSync == null) {
                    Throwable th = new Throwable(l.a(t.getCanonicalName(), (Object) " return null"));
                    if (i2 == this.f32236g.size() - 1) {
                        if (this.f32233d && (jSONObject3 = hVar.f32256b.f32563l.f32555h) != null) {
                            jSONObject3.put("l_total", pVar.a());
                        }
                        bVar2.invoke(th);
                    }
                    printReject(th, "");
                    if (this.f32232c) {
                        bVar2.invoke(new Throwable("ResourceLoaderChain# on cancel load"));
                        return;
                    }
                    i2++;
                } else {
                    hVar.a(loadSync);
                    ap apVar = hVar.f32256b;
                    String simpleName = t.getSimpleName();
                    l.a((Object) simpleName, "");
                    apVar.f(simpleName);
                    if (this.f32233d && (jSONObject2 = hVar.f32256b.f32563l.f32555h) != null) {
                        jSONObject2.put("l_total", pVar.a());
                    }
                    bVar.invoke(hVar);
                    return;
                }
            } catch (Throwable th2) {
                if (i2 == this.f32236g.size() - 1) {
                    if (this.f32233d && (jSONObject = hVar.f32256b.f32563l.f32555h) != null) {
                        jSONObject.put("l_total", pVar.a());
                    }
                    bVar2.invoke(th2);
                }
                j.b.a(this, "ResourceLoaderChain# onException " + th2.getMessage(), null, null, 6);
            }
        }
    }

    public final void a(h hVar, Iterator<? extends Class<? extends IXResourceLoader>> it, h.f.a.b<? super h, z> bVar, h.f.a.b<? super Throwable, z> bVar2, p pVar, int i2) {
        boolean z;
        Throwable th;
        JSONObject jSONObject;
        int i3 = i2;
        while (true) {
            Class cls = (Class) it.next();
            boolean hasNext = it.hasNext();
            IXResourceLoader iXResourceLoader = (IXResourceLoader) cls.newInstance();
            iXResourceLoader.setService(this.f32238i);
            iXResourceLoader.setLoaderLogger(getLoggerWrapper());
            this.f32234e = iXResourceLoader;
            try {
                if (i3 == this.f32230a && (jSONObject = hVar.f32256b.f32563l.f32555h) != null) {
                    jSONObject.put("h_total", pVar.a());
                }
                if (i3 == this.f32231b) {
                    this.f32233d = true;
                    pVar.a();
                }
                ap apVar = hVar.f32256b;
                com.bytedance.ies.bullet.service.base.resourceloader.config.j jVar = hVar.f32257c;
                C0688a aVar = new C0688a(this, bVar2, hVar, cls, pVar, bVar, iXResourceLoader);
                z = hasNext;
                try {
                    iXResourceLoader.loadAsync(apVar, jVar, aVar, new b(this, hVar, iXResourceLoader, bVar2, hasNext, it, bVar, pVar, i3));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z = hasNext;
                j.b.a(this, "ResourceLoaderChain# onException " + th.getMessage(), null, null, 6);
                if (z) {
                    i3++;
                } else {
                    bVar2.invoke(new Throwable("ResourceLoaderChain# " + th.getMessage()));
                    return;
                }
            }
            i3++;
        }
    }
}
