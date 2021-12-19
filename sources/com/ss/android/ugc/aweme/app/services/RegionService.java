package com.ss.android.ugc.aweme.app.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class RegionService implements IRegionService {
    static {
        Covode.recordClassIndex(41189);
    }

    @Override // com.ss.android.ugc.aweme.app.services.IRegionService
    public final String a() {
        String g2 = d.g();
        l.b(g2, "");
        return g2;
    }

    public static IRegionService b() {
        MethodCollector.i(6334);
        Object a2 = b.a(IRegionService.class, false);
        if (a2 != null) {
            IRegionService iRegionService = (IRegionService) a2;
            MethodCollector.o(6334);
            return iRegionService;
        }
        if (b.P == null) {
            synchronized (IRegionService.class) {
                try {
                    if (b.P == null) {
                        b.P = new RegionService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6334);
                    throw th;
                }
            }
        }
        RegionService regionService = (RegionService) b.P;
        MethodCollector.o(6334);
        return regionService;
    }
}
