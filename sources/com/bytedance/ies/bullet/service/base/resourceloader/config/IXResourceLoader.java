package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.b.a;
import h.f.a.b;
import h.f.b.l;
import h.w;
import h.z;

public abstract class IXResourceLoader implements j {
    private final String TAG;
    private q loaderLogger;
    public IResourceLoaderService service;

    static {
        Covode.recordClassIndex(19373);
    }

    public abstract void cancelLoad();

    public abstract void loadAsync(ap apVar, j jVar, b<? super ap, z> bVar, b<? super Throwable, z> bVar2);

    public abstract ap loadSync(ap apVar, j jVar);

    public final q getLoaderLogger() {
        return this.loaderLogger;
    }

    public String getTAG() {
        return this.TAG;
    }

    public final IResourceLoaderService getService() {
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService == null) {
            l.a("service");
        }
        return iResourceLoaderService;
    }

    public IXResourceLoader() {
        String simpleName = getClass().getSimpleName();
        l.a((Object) simpleName, "");
        this.TAG = simpleName;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public q getLoggerWrapper() {
        q qVar = this.loaderLogger;
        if (qVar != null) {
            return qVar;
        }
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService != null) {
            return ((a) iResourceLoaderService).getLoggerWrapper();
        }
        l.a("service");
        throw new w("null cannot be cast to non-null type");
    }

    public final void setLoaderLogger(q qVar) {
        this.loaderLogger = qVar;
    }

    public final void setService(IResourceLoaderService iResourceLoaderService) {
        l.c(iResourceLoaderService, "");
        this.service = iResourceLoaderService;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }
}
