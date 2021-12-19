package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import h.f.a.b;
import h.f.b.l;
import h.z;

public abstract class IHybridResourceLoader {
    private final String TAG;
    public IResourceService service;

    static {
        Covode.recordClassIndex(25185);
    }

    public abstract void cancelLoad();

    public abstract void loadAsync(e eVar, j jVar, b<? super e, z> bVar, b<? super Throwable, z> bVar2);

    public abstract e loadSync(e eVar, j jVar);

    public String getTAG() {
        return this.TAG;
    }

    public final IResourceService getService() {
        IResourceService iResourceService = this.service;
        if (iResourceService == null) {
            l.a("service");
        }
        return iResourceService;
    }

    public IHybridResourceLoader() {
        String simpleName = getClass().getSimpleName();
        l.a((Object) simpleName, "");
        this.TAG = simpleName;
    }

    public final void setService(IResourceService iResourceService) {
        l.c(iResourceService, "");
        this.service = iResourceService;
    }
}
