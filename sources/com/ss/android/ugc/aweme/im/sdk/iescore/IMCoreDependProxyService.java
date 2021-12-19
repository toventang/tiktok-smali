package com.ss.android.ugc.aweme.im.sdk.iescore;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.d.a;
import com.bytedance.ies.im.core.api.d.b;
import com.bytedance.ies.im.core.api.d.c;
import com.bytedance.ies.im.core.api.d.d;
import com.bytedance.ies.im.core.api.d.e;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.ss.android.ugc.aweme.im.sdk.iescore.b.f;

public class IMCoreDependProxyService implements IIMCoreDependProxyService {
    static {
        Covode.recordClassIndex(65900);
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final d a() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.b.d.f102814a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final b b() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.b.b.f102810a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final c c() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.b.c.f102811a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final e d() {
        return f.f102816a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final a e() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.b.a.f102807a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final com.bytedance.ies.im.core.api.b.c f() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.a.a.f102790a;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService
    public final com.bytedance.im.core.h.c g() {
        return com.ss.android.ugc.aweme.im.sdk.iescore.b.e.f102815a;
    }

    public static IIMCoreDependProxyService h() {
        MethodCollector.i(5550);
        Object a2 = com.ss.android.ugc.b.a(IIMCoreDependProxyService.class, false);
        if (a2 != null) {
            IIMCoreDependProxyService iIMCoreDependProxyService = (IIMCoreDependProxyService) a2;
            MethodCollector.o(5550);
            return iIMCoreDependProxyService;
        }
        if (com.ss.android.ugc.b.bB == null) {
            synchronized (IIMCoreDependProxyService.class) {
                try {
                    if (com.ss.android.ugc.b.bB == null) {
                        com.ss.android.ugc.b.bB = new IMCoreDependProxyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5550);
                    throw th;
                }
            }
        }
        IMCoreDependProxyService iMCoreDependProxyService = (IMCoreDependProxyService) com.ss.android.ugc.b.bB;
        MethodCollector.o(5550);
        return iMCoreDependProxyService;
    }
}
