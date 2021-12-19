package com.ss.android.ugc.aweme.hybridkit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitInitTask;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.b;

public final class HybridKitTaskImpl implements IHybridKitService {
    static {
        Covode.recordClassIndex(63568);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final w a() {
        return new HybridKitConfigTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final w b() {
        return new HybridKitInitTask();
    }

    public static IHybridKitService c() {
        MethodCollector.i(9967);
        Object a2 = b.a(IHybridKitService.class, false);
        if (a2 != null) {
            IHybridKitService iHybridKitService = (IHybridKitService) a2;
            MethodCollector.o(9967);
            return iHybridKitService;
        }
        if (b.bw == null) {
            synchronized (IHybridKitService.class) {
                try {
                    if (b.bw == null) {
                        b.bw = new HybridKitTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9967);
                    throw th;
                }
            }
        }
        HybridKitTaskImpl hybridKitTaskImpl = (HybridKitTaskImpl) b.bw;
        MethodCollector.o(9967);
        return hybridKitTaskImpl;
    }
}
