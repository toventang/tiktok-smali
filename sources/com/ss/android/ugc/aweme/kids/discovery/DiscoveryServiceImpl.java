package com.ss.android.ugc.aweme.kids.discovery;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService;
import com.ss.android.ugc.aweme.kids.discovery.list.e;
import com.ss.android.ugc.b;

public final class DiscoveryServiceImpl implements IDiscoveryService {
    static {
        Covode.recordClassIndex(67984);
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService
    public final Fragment a() {
        return new e();
    }

    public static IDiscoveryService b() {
        MethodCollector.i(6112);
        Object a2 = b.a(IDiscoveryService.class, false);
        if (a2 != null) {
            IDiscoveryService iDiscoveryService = (IDiscoveryService) a2;
            MethodCollector.o(6112);
            return iDiscoveryService;
        }
        if (b.bR == null) {
            synchronized (IDiscoveryService.class) {
                try {
                    if (b.bR == null) {
                        b.bR = new DiscoveryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6112);
                    throw th;
                }
            }
        }
        DiscoveryServiceImpl discoveryServiceImpl = (DiscoveryServiceImpl) b.bR;
        MethodCollector.o(6112);
        return discoveryServiceImpl;
    }
}
