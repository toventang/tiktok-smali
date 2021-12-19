package com.bytedance.lynx.hybrid.resource.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import h.f.a.b;
import h.f.b.l;
import h.w;
import h.z;

public abstract class c extends IHybridResourceLoader {
    static {
        Covode.recordClassIndex(25156);
    }

    public abstract e a(e eVar, d dVar);

    public abstract void a(e eVar, d dVar, b<? super e, z> bVar, b<? super Throwable, z> bVar2);

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public e loadSync(e eVar, j jVar) {
        l.c(eVar, "");
        l.c(jVar, "");
        if ((jVar instanceof d) || (jVar = new d(jVar.t).a(jVar)) != null) {
            return a(eVar, (d) jVar);
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public void loadAsync(e eVar, j jVar, b<? super e, z> bVar, b<? super Throwable, z> bVar2) {
        l.c(eVar, "");
        l.c(jVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        if (!(jVar instanceof d) && (jVar = new d(jVar.t).a(jVar)) == null) {
            throw new w("null cannot be cast to non-null type");
        }
        a(eVar, (d) jVar, bVar, bVar2);
    }
}
