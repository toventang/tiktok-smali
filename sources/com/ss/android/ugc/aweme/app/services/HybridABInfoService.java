package com.ss.android.ugc.aweme.app.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class HybridABInfoService implements IHybridABInfoService {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f66881a;

    static {
        Covode.recordClassIndex(41180);
    }

    public static IHybridABInfoService b() {
        MethodCollector.i(6698);
        Object a2 = b.a(IHybridABInfoService.class, false);
        if (a2 != null) {
            IHybridABInfoService iHybridABInfoService = (IHybridABInfoService) a2;
            MethodCollector.o(6698);
            return iHybridABInfoService;
        }
        if (b.N == null) {
            synchronized (IHybridABInfoService.class) {
                try {
                    if (b.N == null) {
                        b.N = new HybridABInfoService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6698);
                    throw th;
                }
            }
        }
        HybridABInfoService hybridABInfoService = (HybridABInfoService) b.N;
        MethodCollector.o(6698);
        return hybridABInfoService;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final Integer a() {
        Boolean bool = this.f66881a;
        if (l.a((Object) bool, (Object) true)) {
            return 1;
        }
        if (l.a((Object) bool, (Object) false)) {
            return 0;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final void a(boolean z) {
        this.f66881a = Boolean.valueOf(z);
    }
}
