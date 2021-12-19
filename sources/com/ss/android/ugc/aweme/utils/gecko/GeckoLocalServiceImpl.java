package com.ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.b;

public class GeckoLocalServiceImpl implements GeckoLocalService {
    static {
        Covode.recordClassIndex(93574);
    }

    @Override // com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService
    public final void a() {
        dc.e();
    }

    public static GeckoLocalService b() {
        MethodCollector.i(10082);
        Object a2 = b.a(GeckoLocalService.class, false);
        if (a2 != null) {
            GeckoLocalService geckoLocalService = (GeckoLocalService) a2;
            MethodCollector.o(10082);
            return geckoLocalService;
        }
        if (b.eD == null) {
            synchronized (GeckoLocalService.class) {
                try {
                    if (b.eD == null) {
                        b.eD = new GeckoLocalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10082);
                    throw th;
                }
            }
        }
        GeckoLocalServiceImpl geckoLocalServiceImpl = (GeckoLocalServiceImpl) b.eD;
        MethodCollector.o(10082);
        return geckoLocalServiceImpl;
    }
}
