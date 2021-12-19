package com.facebook.drawee.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.a.a.b.b;
import com.facebook.drawee.a.a.b.g;
import com.facebook.drawee.a.a.b.h;
import com.facebook.drawee.c.a;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;

public class d extends a<com.facebook.common.h.a<c>, f> {
    private static final Class<?> q = d.class;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f47268a;

    /* renamed from: b  reason: collision with root package name */
    public e f47269b;

    /* renamed from: c  reason: collision with root package name */
    public k<com.facebook.d.c<com.facebook.common.h.a<c>>> f47270c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47271d;

    /* renamed from: e  reason: collision with root package name */
    public com.facebook.common.d.e<com.facebook.imagepipeline.h.a> f47272e;
    private final com.facebook.imagepipeline.h.a r;
    private final com.facebook.common.d.e<com.facebook.imagepipeline.h.a> s;
    private final p<e, c> t;
    private g u;
    private Set<com.facebook.imagepipeline.k.c> v;
    private b w;
    private com.facebook.drawee.a.a.a.a x;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.c.a
    public final /* synthetic */ void a(com.facebook.common.h.a<c> aVar) {
        com.facebook.common.h.a.c(aVar);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(com.facebook.drawee.a.a.b.f fVar) {
        MethodCollector.i(3885);
        g gVar = this.u;
        if (gVar != null) {
            if (gVar.f47238b != null) {
                gVar.f47238b.clear();
            }
            gVar.a(false);
            h hVar = gVar.f47237a;
            hVar.f47248b = null;
            hVar.f47249c = null;
            hVar.f47250d = null;
            hVar.f47251e = null;
            hVar.f47252f = -1;
            hVar.f47254h = -1;
            hVar.f47255i = -1;
            hVar.f47256j = -1;
            hVar.f47257k = -1;
            hVar.f47258l = -1;
            hVar.f47259m = 1;
            hVar.n = false;
            hVar.o = -1;
            hVar.p = -1;
            hVar.q = -1;
            hVar.r = -1;
            hVar.s = -1;
            hVar.t = -1;
        }
        if (fVar != null) {
            if (this.u == null) {
                this.u = new g(AwakeTimeSinceBootClock.get(), this);
            }
            g gVar2 = this.u;
            if (gVar2.f47238b == null) {
                gVar2.f47238b = new LinkedList();
            }
            gVar2.f47238b.add(fVar);
            this.u.a(true);
        }
        MethodCollector.o(3885);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.c.a
    public final /* bridge */ /* synthetic */ void a(String str, com.facebook.common.h.a<c> aVar) {
        MethodCollector.i(4132);
        super.a(str, aVar);
        synchronized (this) {
            try {
                b bVar = this.w;
                if (bVar != null) {
                    bVar.a(str, 5, true);
                }
            } finally {
                MethodCollector.o(4132);
            }
        }
    }

    static {
        Covode.recordClassIndex(28735);
    }

    @Override // com.facebook.drawee.c.a
    public String toString() {
        return com.facebook.common.d.h.a(this).a("super", super.toString()).a("dataSourceSupplier", this.f47270c).toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public com.facebook.common.h.a<c> c() {
        com.facebook.imagepipeline.p.b.a();
        try {
            p<e, c> pVar = this.t;
            if (pVar != null) {
                e eVar = this.f47269b;
                if (eVar != null) {
                    com.facebook.common.h.a<c> a2 = pVar.a(eVar);
                    if (a2 == null || a2.a().e().c()) {
                        com.facebook.imagepipeline.p.b.a();
                        return a2;
                    }
                    a2.close();
                    com.facebook.imagepipeline.p.b.a();
                    return null;
                }
            }
            return null;
        } finally {
            com.facebook.imagepipeline.p.b.a();
        }
    }

    @Override // com.facebook.drawee.c.a
    public final com.facebook.d.c<com.facebook.common.h.a<c>> b() {
        com.facebook.imagepipeline.p.b.a();
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(q, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.d.c<com.facebook.common.h.a<c>> b2 = this.f47270c.b();
        com.facebook.imagepipeline.p.b.a();
        return b2;
    }

    public final synchronized com.facebook.imagepipeline.k.c a() {
        MethodCollector.i(4108);
        com.facebook.drawee.a.a.b.c cVar = null;
        if (this.w != null) {
            cVar = new com.facebook.drawee.a.a.b.c(this.f47307k, this.w);
        }
        if (this.v != null) {
            com.facebook.imagepipeline.k.b bVar = new com.facebook.imagepipeline.k.b(this.v);
            if (cVar != null) {
                bVar.f48004a.add(cVar);
            }
            MethodCollector.o(4108);
            return bVar;
        }
        MethodCollector.o(4108);
        return cVar;
    }

    @Override // com.facebook.drawee.c.a, com.facebook.drawee.h.a
    public final void a(com.facebook.drawee.h.b bVar) {
        super.a(bVar);
        a((c) null);
    }

    @Override // com.facebook.drawee.c.a
    public final void a(Drawable drawable) {
        if (drawable instanceof com.facebook.f.a.a) {
            ((com.facebook.f.a.a) drawable).a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.c.a
    public final /* synthetic */ f c(com.facebook.common.h.a<c> aVar) {
        com.facebook.common.h.a<c> aVar2 = aVar;
        i.b(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar2));
        return aVar2.a();
    }

    public final synchronized void a(com.facebook.imagepipeline.k.c cVar) {
        MethodCollector.i(3888);
        if (this.v == null) {
            this.v = new HashSet();
        }
        this.v.add(cVar);
        MethodCollector.o(3888);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.drawee.c.a
    public final /* synthetic */ int b(com.facebook.common.h.a<c> aVar) {
        com.facebook.common.h.a<c> aVar2 = aVar;
        if (aVar2 == null || !aVar2.d()) {
            return 0;
        }
        return System.identityHashCode(aVar2.f47104a.a());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable d(com.facebook.common.h.a<c> aVar) {
        try {
            com.facebook.imagepipeline.p.b.a();
            i.b(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
            c a2 = aVar.a();
            a(a2);
            Drawable a3 = a(this.f47272e, a2);
            if (a3 != null) {
                com.facebook.imagepipeline.p.b.a();
                return a3;
            }
            Drawable a4 = a(this.s, a2);
            if (a4 != null) {
                com.facebook.imagepipeline.p.b.a();
                return a4;
            }
            Drawable b2 = this.r.b(a2);
            if (b2 != null) {
                com.facebook.imagepipeline.p.b.a();
                return b2;
            }
            throw new UnsupportedOperationException("Unrecognized image class: ".concat(String.valueOf(a2)));
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    public final synchronized void b(b bVar) {
        MethodCollector.i(4106);
        b bVar2 = this.w;
        if (bVar2 instanceof com.facebook.drawee.a.a.b.a) {
            ((com.facebook.drawee.a.a.b.a) bVar2).b(bVar);
            MethodCollector.o(4106);
        } else if (bVar2 != null) {
            this.w = new com.facebook.drawee.a.a.b.a(this.w, bVar);
            MethodCollector.o(4106);
        } else {
            this.w = bVar;
            MethodCollector.o(4106);
        }
    }

    private void a(c cVar) {
        com.facebook.drawee.e.p a2;
        if (this.f47271d) {
            if (this.f47306j == null) {
                com.facebook.drawee.d.a aVar = new com.facebook.drawee.d.a();
                com.facebook.drawee.d.a.a aVar2 = new com.facebook.drawee.d.a.a(aVar);
                this.x = new com.facebook.drawee.a.a.a.a();
                a((com.facebook.drawee.c.d) aVar2);
                b((Drawable) aVar);
            }
            if (this.w == null) {
                a(this.x);
            }
            if (this.f47306j instanceof com.facebook.drawee.d.a) {
                com.facebook.drawee.d.a aVar3 = (com.facebook.drawee.d.a) this.f47306j;
                aVar3.a(this.f47307k);
                com.facebook.drawee.h.c cVar2 = this.f47305i;
                q.b bVar = null;
                if (!(cVar2 == null || (a2 = q.a(cVar2.a())) == null)) {
                    bVar = a2.f47429a;
                }
                aVar3.f47336c = bVar;
                aVar3.b(com.facebook.drawee.a.a.b.d.a(this.x.f47210a));
                if (cVar != null) {
                    aVar3.a(cVar.getWidth(), cVar.getHeight());
                    aVar3.f47334a = cVar.b();
                    return;
                }
                aVar3.a();
            }
        }
    }

    public final synchronized void b(com.facebook.imagepipeline.k.c cVar) {
        MethodCollector.i(3889);
        Set<com.facebook.imagepipeline.k.c> set = this.v;
        if (set == null) {
            MethodCollector.o(3889);
            return;
        }
        set.remove(cVar);
        MethodCollector.o(3889);
    }

    public final synchronized void a(b bVar) {
        MethodCollector.i(3891);
        b bVar2 = this.w;
        if (bVar2 instanceof com.facebook.drawee.a.a.b.a) {
            ((com.facebook.drawee.a.a.b.a) bVar2).a(bVar);
            MethodCollector.o(3891);
        } else if (bVar2 != null) {
            this.w = new com.facebook.drawee.a.a.b.a(this.w, bVar);
            MethodCollector.o(3891);
        } else {
            this.w = bVar;
            MethodCollector.o(3891);
        }
    }

    private static Drawable a(com.facebook.common.d.e<com.facebook.imagepipeline.h.a> eVar, c cVar) {
        Drawable b2;
        if (eVar == null) {
            return null;
        }
        Iterator<com.facebook.imagepipeline.h.a> it = eVar.iterator();
        while (it.hasNext()) {
            com.facebook.imagepipeline.h.a next = it.next();
            if (next.a(cVar) && (b2 = next.b(cVar)) != null) {
                return b2;
            }
        }
        return null;
    }

    public d(Resources resources, com.facebook.drawee.b.a aVar, com.facebook.imagepipeline.h.a aVar2, Executor executor, p<e, c> pVar, com.facebook.common.d.e<com.facebook.imagepipeline.h.a> eVar) {
        super(aVar, executor);
        this.f47268a = resources;
        this.r = new a(resources, aVar2);
        this.s = eVar;
        this.t = pVar;
    }

    public final void a(k<com.facebook.d.c<com.facebook.common.h.a<c>>> kVar, String str, e eVar, Object obj, com.facebook.common.d.e<com.facebook.imagepipeline.h.a> eVar2, b bVar) {
        MethodCollector.i(3883);
        com.facebook.imagepipeline.p.b.a();
        super.b(str, obj);
        this.f47270c = kVar;
        a((c) null);
        this.f47269b = eVar;
        this.f47272e = eVar2;
        synchronized (this) {
            try {
                this.w = null;
            } catch (Throwable th) {
                MethodCollector.o(3883);
                throw th;
            }
        }
        a((c) null);
        a(bVar);
        com.facebook.imagepipeline.p.b.a();
        MethodCollector.o(3883);
    }
}
