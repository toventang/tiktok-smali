package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.b;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public abstract class a<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    public g f33150a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f33151b;

    /* renamed from: c  reason: collision with root package name */
    public i f33152c;

    /* renamed from: d  reason: collision with root package name */
    public f f33153d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends p> f33154e;

    /* renamed from: f  reason: collision with root package name */
    public h f33155f;

    /* renamed from: g  reason: collision with root package name */
    public k f33156g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f33157h;

    /* renamed from: i  reason: collision with root package name */
    public int f33158i = 32;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<h.f.a.a<z>> f33159j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, h.f.a.a<Boolean>> f33160k;

    /* renamed from: l  reason: collision with root package name */
    private final String f33161l;

    static {
        Covode.recordClassIndex(19809);
    }

    /* access modifiers changed from: protected */
    public abstract T a(String str, j jVar, e eVar);

    public final T a() {
        f fVar = this.f33153d;
        if (fVar != null) {
            i iVar = this.f33152c;
            if (iVar != null) {
                Executor executor = this.f33151b;
                if (executor != null) {
                    k kVar = this.f33156g;
                    if (kVar != null) {
                        l.c(kVar, "");
                        q.f33244a = kVar;
                    }
                    c cVar = new c(executor, fVar, this.f33155f);
                    ab abVar = new ab(this.f33150a, iVar, executor, this.f33158i);
                    T a2 = a(this.f33161l, new w(abVar, cVar, this.f33155f, this.f33160k, this.f33154e, this.f33159j), cVar);
                    if (this.f33157h) {
                        String str = this.f33161l + "@" + a2.hashCode();
                        l.c(str, "");
                        cVar.f33225d = str;
                        cVar.f33224c = true;
                        ah<String, y> ahVar = abVar.f33170a;
                        l.c(str, "");
                        l.c(ahVar, "");
                        ((ConcurrentHashMap) v.f33254b.getValue()).put(str, ahVar);
                    }
                    return a2;
                }
                throw new IllegalStateException("workerExecutor must be provided.".toString());
            }
            throw new IllegalStateException("networkExecutor must be provided.".toString());
        }
        throw new IllegalStateException("configProvider must be provided.".toString());
    }

    public final a<T> a(f fVar) {
        l.c(fVar, "");
        this.f33153d = fVar;
        return this;
    }

    public a(String str) {
        l.c(str, "");
        this.f33161l = str;
    }

    public final a<T> a(g gVar) {
        l.c(gVar, "");
        this.f33150a = gVar;
        return this;
    }

    public final a<T> a(h hVar) {
        l.c(hVar, "");
        this.f33155f = hVar;
        return this;
    }

    public final a<T> a(i iVar) {
        l.c(iVar, "");
        this.f33152c = iVar;
        return this;
    }

    public final a<T> a(k kVar) {
        l.c(kVar, "");
        this.f33156g = kVar;
        return this;
    }

    public final a<T> a(Executor executor) {
        l.c(executor, "");
        this.f33151b = executor;
        return this;
    }
}
