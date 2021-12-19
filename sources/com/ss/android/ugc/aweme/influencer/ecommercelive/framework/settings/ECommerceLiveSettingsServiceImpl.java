package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ECommerceLiveSettingsServiceImpl implements IECommerceLiveSettingsService {
    static {
        Covode.recordClassIndex(67001);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService
    public final boolean a() {
        return l.a((Object) e.a().f104587a, (Object) true);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService
    public final long b() {
        Long l2 = e.a().f104589c;
        if (l2 != null) {
            return l2.longValue();
        }
        return 30000;
    }

    public static IECommerceLiveSettingsService c() {
        MethodCollector.i(10553);
        Object a2 = b.a(IECommerceLiveSettingsService.class, false);
        if (a2 != null) {
            IECommerceLiveSettingsService iECommerceLiveSettingsService = (IECommerceLiveSettingsService) a2;
            MethodCollector.o(10553);
            return iECommerceLiveSettingsService;
        }
        if (b.bG == null) {
            synchronized (IECommerceLiveSettingsService.class) {
                try {
                    if (b.bG == null) {
                        b.bG = new ECommerceLiveSettingsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10553);
                    throw th;
                }
            }
        }
        ECommerceLiveSettingsServiceImpl eCommerceLiveSettingsServiceImpl = (ECommerceLiveSettingsServiceImpl) b.bG;
        MethodCollector.o(10553);
        return eCommerceLiveSettingsServiceImpl;
    }
}
