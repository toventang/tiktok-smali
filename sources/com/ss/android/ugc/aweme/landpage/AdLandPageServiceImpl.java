package com.ss.android.ugc.aweme.landpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public final class AdLandPageServiceImpl implements IAdLandPageService {
    static {
        Covode.recordClassIndex(68624);
    }

    @Override // com.ss.android.ugc.aweme.landpage.IAdLandPageService
    public final String a() {
        return "ad_commerce";
    }

    public static IAdLandPageService b() {
        MethodCollector.i(12889);
        Object a2 = b.a(IAdLandPageService.class, false);
        if (a2 != null) {
            IAdLandPageService iAdLandPageService = (IAdLandPageService) a2;
            MethodCollector.o(12889);
            return iAdLandPageService;
        }
        if (b.ca == null) {
            synchronized (IAdLandPageService.class) {
                try {
                    if (b.ca == null) {
                        b.ca = new AdLandPageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12889);
                    throw th;
                }
            }
        }
        AdLandPageServiceImpl adLandPageServiceImpl = (AdLandPageServiceImpl) b.ca;
        MethodCollector.o(12889);
        return adLandPageServiceImpl;
    }
}
