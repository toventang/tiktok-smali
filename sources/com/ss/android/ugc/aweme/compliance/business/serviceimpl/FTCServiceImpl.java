package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService;
import com.ss.android.ugc.aweme.compliance.common.b;

public final class FTCServiceImpl implements IFTCService {
    static {
        Covode.recordClassIndex(47706);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    public final void c() {
        b.f77288b.f77301a.storeString("traffic_control", "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    public final void a() {
        Context a2 = d.a();
        FirebaseAnalytics.getInstance(a2).setAnalyticsCollectionEnabled(false);
        AppsFlyerLib.getInstance().stopTracking(true, a2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService
    public final void b() {
        Context a2 = d.a();
        FirebaseAnalytics.getInstance(a2).setAnalyticsCollectionEnabled(true);
        AppsFlyerLib.getInstance().stopTracking(false, a2);
        AppsFlyerLib.getInstance().startTracking(a2);
    }

    public static IFTCService d() {
        MethodCollector.i(5650);
        Object a2 = com.ss.android.ugc.b.a(IFTCService.class, false);
        if (a2 != null) {
            IFTCService iFTCService = (IFTCService) a2;
            MethodCollector.o(5650);
            return iFTCService;
        }
        if (com.ss.android.ugc.b.aF == null) {
            synchronized (IFTCService.class) {
                try {
                    if (com.ss.android.ugc.b.aF == null) {
                        com.ss.android.ugc.b.aF = new FTCServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5650);
                    throw th;
                }
            }
        }
        FTCServiceImpl fTCServiceImpl = (FTCServiceImpl) com.ss.android.ugc.b.aF;
        MethodCollector.o(5650);
        return fTCServiceImpl;
    }
}
