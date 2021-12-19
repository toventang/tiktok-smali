package com.bytedance.ies.ugc.aweme.commercialize.scene.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;

public final class AdSceneServiceImpl implements IAdSceneService {
    static {
        Covode.recordClassIndex(20789);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final a c() {
        return com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a.f34720a;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final IMainAdScene a() {
        return new com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final b b() {
        return new com.bytedance.ies.ugc.aweme.commercialize.scene.impl.b.a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a d() {
        return new com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    public final com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a e() {
        return new com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.a();
    }

    public static IAdSceneService f() {
        MethodCollector.i(5692);
        Object a2 = com.ss.android.ugc.b.a(IAdSceneService.class, false);
        if (a2 != null) {
            IAdSceneService iAdSceneService = (IAdSceneService) a2;
            MethodCollector.o(5692);
            return iAdSceneService;
        }
        if (com.ss.android.ugc.b.f145527b == null) {
            synchronized (IAdSceneService.class) {
                try {
                    if (com.ss.android.ugc.b.f145527b == null) {
                        com.ss.android.ugc.b.f145527b = new AdSceneServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5692);
                    throw th;
                }
            }
        }
        AdSceneServiceImpl adSceneServiceImpl = (AdSceneServiceImpl) com.ss.android.ugc.b.f145527b;
        MethodCollector.o(5692);
        return adSceneServiceImpl;
    }
}
