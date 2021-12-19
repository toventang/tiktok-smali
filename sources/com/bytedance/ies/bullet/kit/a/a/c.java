package com.bytedance.ies.bullet.kit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.a.b;
import h.f.b.l;
import h.w;
import h.z;

public abstract class c extends IXResourceLoader {
    static {
        Covode.recordClassIndex(18874);
    }

    public abstract ap a(ap apVar, d dVar);

    public abstract void a(ap apVar, d dVar, b<? super ap, z> bVar, b<? super Throwable, z> bVar2);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public ap loadSync(ap apVar, j jVar) {
        l.c(apVar, "");
        l.c(jVar, "");
        if ((jVar instanceof d) || (jVar = new d(jVar.y).a(jVar)) != null) {
            return a(apVar, (d) jVar);
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void loadAsync(ap apVar, j jVar, b<? super ap, z> bVar, b<? super Throwable, z> bVar2) {
        l.c(apVar, "");
        l.c(jVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        if (!(jVar instanceof d) && (jVar = new d(jVar.y).a(jVar)) == null) {
            throw new w("null cannot be cast to non-null type");
        }
        a(apVar, (d) jVar, bVar, bVar2);
    }
}
