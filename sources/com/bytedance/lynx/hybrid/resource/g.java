package com.bytedance.lynx.hybrid.resource;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.j;
import com.bytedance.lynx.hybrid.resource.c.a;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.config.c;
import com.bytedance.lynx.hybrid.resource.d.b;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.f;
import com.bytedance.lynx.hybrid.resource.l;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.d;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g extends d implements IResourceService {

    /* renamed from: a  reason: collision with root package name */
    public final Application f41170a;

    /* renamed from: c  reason: collision with root package name */
    private c f41171c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f41172d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(25225);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void deleteResource(e eVar) {
        l.c(eVar, "");
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final c getResourceConfig() {
        c cVar = this.f41171c;
        if (cVar == null) {
            l.a("mConfigHybrid");
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r0 == null) goto L_0x002a;
     */
    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> getPreloadConfigs() {
        /*
            r3 = this;
            com.bytedance.lynx.hybrid.resource.config.c r1 = r3.f41171c
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mConfigHybrid"
            h.f.b.l.a(r0)
        L_0x0009:
            com.bytedance.lynx.hybrid.resource.config.GeckoConfig r0 = r1.f41098j
            java.lang.String r2 = r0.getAccessKey()
            com.bytedance.lynx.hybrid.resource.f r1 = com.bytedance.lynx.hybrid.resource.f.b.f41155a
            r0 = r3
            com.bytedance.lynx.hybrid.resource.config.c r0 = r1.a(r0)
            com.bytedance.lynx.hybrid.resource.config.GeckoConfig r0 = com.bytedance.lynx.hybrid.resource.b.f.a(r0, r2)
            com.bytedance.lynx.hybrid.resource.config.e r1 = r0.getGeckoDepender()
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = r0.getOfflineDir()
            java.util.Map r0 = r1.a(r0, r2)
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            h.f.b.l.a()
        L_0x002d:
            return r0
        L_0x002e:
            r0 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.g.getPreloadConfigs():java.util.Map");
    }

    @Override // com.bytedance.lynx.hybrid.service.b.d, com.bytedance.lynx.hybrid.service.a.a
    public final void u_() {
        f fVar = f.b.f41155a;
        l.c(this, "");
        fVar.f41150a.remove(this);
        Map<b, com.bytedance.lynx.hybrid.resource.f.d> map = l.f41228c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<b, com.bytedance.lynx.hybrid.resource.f.d> entry : map.entrySet()) {
            entry.getValue().a();
            arrayList.add(z.f158842a);
        }
        l.f41228c.clear();
    }

    public g(Application application) {
        l.c(application, "");
        this.f41170a = application;
        f.b.f41155a.f41151b = application;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void cancel(b bVar) {
        l.c(bVar, "");
        l.c(bVar, "");
        com.bytedance.lynx.hybrid.resource.f.d dVar = l.f41228c.get(bVar);
        if (dVar != null) {
            dVar.a();
        }
        l.f41228c.remove(bVar);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unRegisterConfig(String str) {
        l.c(str, "");
        c cVar = this.f41171c;
        if (cVar == null) {
            l.a("mConfigHybrid");
        }
        cVar.f41099k.remove(str);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void init(j jVar) {
        c cVar;
        l.c(jVar, "");
        if (!this.f41172d.compareAndSet(false, true)) {
            com.bytedance.lynx.hybrid.j.c.a("init# service is already init", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        } else if ((jVar instanceof c) && jVar != null && (cVar = (c) jVar) != null) {
            a aVar = a.b.f41072a;
            int i2 = cVar.f41091c;
            if (aVar.f41069a == null && i2 > 0) {
                aVar.f41069a = new a.c(i2, i2);
            }
            f fVar = f.b.f41155a;
            l.c(this, "");
            l.c(cVar, "");
            fVar.f41150a.put(this, cVar);
            this.f41171c = cVar;
            registerConfig(cVar.f41098j.getAccessKey(), cVar.f41098j);
            com.bytedance.lynx.hybrid.j.c.a("init globalConfig = ".concat(String.valueOf(cVar)), (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void unregisterCustomLoader(Class<? extends IHybridResourceLoader> cls, com.bytedance.lynx.hybrid.resource.d.c cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        l.c(cls, "");
        l.c(cVar, "");
        int i2 = m.f41231b[cVar.ordinal()];
        if (i2 == 1) {
            l.f41226a.remove(cls);
        } else if (i2 == 2) {
            l.f41227b.remove(cls);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerConfig(String str, GeckoConfig geckoConfig) {
        l.c(str, "");
        l.c(geckoConfig, "");
        com.bytedance.lynx.hybrid.resource.config.e geckoDepender = geckoConfig.getGeckoDepender();
        if (geckoDepender == null) {
            l.a();
        }
        geckoDepender.a(this);
        c cVar = this.f41171c;
        if (cVar == null) {
            l.a("mConfigHybrid");
        }
        cVar.f41099k.put(str, geckoConfig);
        if (geckoConfig.getNetworkImpl() != null) {
            return;
        }
        if (geckoConfig.getLocalInfo().length() > 0) {
            c cVar2 = this.f41171c;
            if (cVar2 == null) {
                l.a("mConfigHybrid");
            }
            geckoConfig.setNetworkImpl(cVar2.f41100l);
            return;
        }
        c cVar3 = this.f41171c;
        if (cVar3 == null) {
            l.a("mConfigHybrid");
        }
        geckoConfig.setNetworkImpl(cVar3.f41101m);
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final void registerCustomLoader(Class<? extends IHybridResourceLoader> cls, com.bytedance.lynx.hybrid.resource.d.c cVar) {
        l.c(cls, "");
        l.c(cVar, "");
        l.c(cls, "");
        l.c(cVar, "");
        int i2 = m.f41230a[cVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && !l.f41227b.contains(cls)) {
                l.f41227b.add(cls);
                com.bytedance.lynx.hybrid.resource.f.a.a(cls, com.bytedance.lynx.hybrid.resource.d.c.LOW);
            }
        } else if (!l.f41226a.contains(cls)) {
            l.f41226a.add(cls);
            com.bytedance.lynx.hybrid.resource.f.a.a(cls, com.bytedance.lynx.hybrid.resource.d.c.HIGH);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final e loadSync(String str, com.bytedance.lynx.hybrid.resource.config.j jVar) {
        l.c(str, "");
        l.c(jVar, "");
        com.bytedance.lynx.hybrid.j.c.a("loadSync# url=" + str + ",taskConfig=" + jVar, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        if (!this.f41172d.get()) {
            com.bytedance.lynx.hybrid.j.c.a("call loadSync# but not init ", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            return null;
        }
        l.c(this, "");
        l.c(str, "");
        l.c(jVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        new com.bytedance.lynx.hybrid.resource.i.c();
        com.bytedance.lynx.hybrid.j.c.a("loadSync# url=" + str + ",taskConfig=" + jVar, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        if (!com.bytedance.lynx.hybrid.resource.h.b.a(parse)) {
            return null;
        }
        z.e eVar = new z.e();
        eVar.element = null;
        com.bytedance.lynx.hybrid.resource.d.g a2 = com.bytedance.lynx.hybrid.resource.h.c.f41201a.a(false, uptimeMillis, str, parse, jVar, this);
        com.bytedance.lynx.hybrid.resource.f.d a3 = com.bytedance.lynx.hybrid.resource.f.b.a(this, a2);
        com.bytedance.lynx.hybrid.j.c.a("loadSync# start load taskConfig=" + jVar + ",resInfo = " + a2.f41135b, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        a3.a(a2, new l.c(eVar, jVar, a2), new l.d(str, a2, jVar));
        String jSONArray = a2.f41135b.f41130l.toString();
        h.f.b.l.a((Object) jSONArray, "");
        jVar.e(jSONArray);
        String jSONArray2 = a2.f41135b.f41130l.toString();
        h.f.b.l.a((Object) jSONArray2, "");
        com.bytedance.lynx.hybrid.j.c.a(jSONArray2, (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        return eVar.element;
    }

    @Override // com.bytedance.lynx.hybrid.service.IResourceService
    public final b loadAsync(String str, com.bytedance.lynx.hybrid.resource.config.j jVar, h.f.a.b<? super e, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(bVar2, "");
        Uri parse = Uri.parse(str);
        h.f.b.l.a((Object) parse, "");
        b bVar3 = new b(parse);
        if (!this.f41172d.get()) {
            com.bytedance.lynx.hybrid.j.c.a("call loadAsync# but not init ", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
            bVar2.invoke(new Throwable("resource loader service not init"));
            return bVar3;
        }
        h.f.b.l.c(this, "");
        h.f.b.l.c(bVar3, "");
        h.f.b.l.c(str, "");
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(bVar2, "");
        com.bytedance.lynx.hybrid.j.c.a("loadAsync#begin", (com.bytedance.lynx.hybrid.j.b) null, (String) null, 6);
        long uptimeMillis = SystemClock.uptimeMillis();
        Uri uri = bVar3.f41124a;
        com.bytedance.lynx.hybrid.resource.i.c cVar = new com.bytedance.lynx.hybrid.resource.i.c();
        if (!com.bytedance.lynx.hybrid.resource.h.b.a(uri)) {
            bVar2.invoke(new Throwable("is not hierarchical url"));
            return bVar3;
        }
        com.bytedance.lynx.hybrid.resource.d.g a2 = com.bytedance.lynx.hybrid.resource.h.c.f41201a.a(true, uptimeMillis, str, uri, jVar, this);
        com.bytedance.lynx.hybrid.resource.f.d a3 = com.bytedance.lynx.hybrid.resource.f.b.a(this, a2);
        a3.a(a2, new l.a(bVar3, cVar, jVar, a2, bVar), new l.b(a2, bVar3, jVar, bVar2));
        l.f41228c.put(bVar3, a3);
        return bVar3;
    }
}
