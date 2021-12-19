package com.ss.android.ugc.aweme.commercialize.e_commerce.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.a.e;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a extends IXResourceLoader {
    static {
        Covode.recordClassIndex(45451);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final ap loadSync(ap apVar, j jVar) {
        String g2;
        String str = "";
        l.d(apVar, str);
        l.d(jVar, str);
        j a2 = new j().a(jVar);
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (!(f2 == null || (g2 = f2.g("lynx_feed")) == null)) {
            str = g2;
        }
        a2.f(str);
        e eVar = new e();
        eVar.setService(getService());
        return eVar.loadSync(apVar, a2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(ap apVar, j jVar, b<? super ap, z> bVar, b<? super Throwable, z> bVar2) {
        String g2;
        String str = "";
        l.d(apVar, str);
        l.d(jVar, str);
        l.d(bVar, str);
        l.d(bVar2, str);
        j a2 = new j().a(jVar);
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (!(f2 == null || (g2 = f2.g("lynx_feed")) == null)) {
            str = g2;
        }
        a2.f(str);
        e eVar = new e();
        eVar.setService(getService());
        eVar.loadAsync(apVar, a2, bVar, bVar2);
    }
}
