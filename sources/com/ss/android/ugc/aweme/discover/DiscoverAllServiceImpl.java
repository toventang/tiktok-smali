package com.ss.android.ugc.aweme.discover;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.b;

public final class DiscoverAllServiceImpl implements IDiscoverAllService {
    static {
        Covode.recordClassIndex(49863);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoverAllService
    public final a<Aweme, ?> a() {
        return PropReuseServiceImpl.c().a();
    }

    public static IDiscoverAllService b() {
        MethodCollector.i(3172);
        Object a2 = b.a(IDiscoverAllService.class, false);
        if (a2 != null) {
            IDiscoverAllService iDiscoverAllService = (IDiscoverAllService) a2;
            MethodCollector.o(3172);
            return iDiscoverAllService;
        }
        if (b.ba == null) {
            synchronized (IDiscoverAllService.class) {
                try {
                    if (b.ba == null) {
                        b.ba = new DiscoverAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3172);
                    throw th;
                }
            }
        }
        DiscoverAllServiceImpl discoverAllServiceImpl = (DiscoverAllServiceImpl) b.ba;
        MethodCollector.o(3172);
        return discoverAllServiceImpl;
    }
}
