package com.ss.android.ugc.aweme.commercialize.media.impl.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.b.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class CommerceMediaServiceImpl implements ICommerceMediaService {
    static {
        Covode.recordClassIndex(46141);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean e() {
        return a.f74848a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean a() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean b() {
        return a.c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean c() {
        return a.b();
    }

    public static ICommerceMediaService f() {
        MethodCollector.i(3146);
        Object a2 = b.a(ICommerceMediaService.class, false);
        if (a2 != null) {
            ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) a2;
            MethodCollector.o(3146);
            return iCommerceMediaService;
        }
        if (b.as == null) {
            synchronized (ICommerceMediaService.class) {
                try {
                    if (b.as == null) {
                        b.as = new CommerceMediaServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3146);
                    throw th;
                }
            }
        }
        CommerceMediaServiceImpl commerceMediaServiceImpl = (CommerceMediaServiceImpl) b.as;
        MethodCollector.o(3146);
        return commerceMediaServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean d() {
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a2;
        com.ss.android.ugc.aweme.commercialize.media.api.a.a a3 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a();
        if ((a3 == null || !a3.d()) && (a2 = com.ss.android.ugc.aweme.commercialize.media.impl.a.a.a()) != null && a2.f() != null && !a.c()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final void a(boolean z) {
        a.f74848a = z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final void a(com.ss.android.ugc.aweme.commercialize.media.api.a.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.commercialize.media.impl.a.a.f74845a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean b(Music music) {
        if (!a.a() || !a.a(music)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean a(Music music) {
        return a.a(music);
    }
}
