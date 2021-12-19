package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.a.e;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.b.l;
import h.z;

public final class b extends IXResourceLoader {

    /* renamed from: a  reason: collision with root package name */
    public static String f74177a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final a f74178b = new a((byte) 0);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45771);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(45770);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final ap loadSync(ap apVar, j jVar) {
        l.d(apVar, "");
        l.d(jVar, "");
        j a2 = new j().a(jVar);
        a2.f(f74177a);
        e eVar = new e();
        eVar.setService(getService());
        return eVar.loadSync(apVar, a2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(ap apVar, j jVar, h.f.a.b<? super ap, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.d(apVar, "");
        l.d(jVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        j a2 = new j().a(jVar);
        a2.f(f74177a);
        e eVar = new e();
        eVar.setService(getService());
        eVar.loadAsync(apVar, a2, bVar, bVar2);
    }
}
