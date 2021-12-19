package com.ss.android.ugc.aweme.di;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.a;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.b;

public class ImEntranceService implements IIMEntranceService {
    static {
        Covode.recordClassIndex(49862);
    }

    public static IIMEntranceService a() {
        MethodCollector.i(4927);
        Object a2 = b.a(IIMEntranceService.class, false);
        if (a2 != null) {
            IIMEntranceService iIMEntranceService = (IIMEntranceService) a2;
            MethodCollector.o(4927);
            return iIMEntranceService;
        }
        if (b.aZ == null) {
            synchronized (IIMEntranceService.class) {
                try {
                    if (b.aZ == null) {
                        b.aZ = new ImEntranceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4927);
                    throw th;
                }
            }
        }
        ImEntranceService imEntranceService = (ImEntranceService) b.aZ;
        MethodCollector.o(4927);
        return imEntranceService;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService
    public void init(IIMService iIMService) {
        Application a2 = g.a();
        if (iIMService != null) {
            a aVar = new a();
            aVar.f103821g = (int) d.e();
            aVar.f103820f = d.s;
            aVar.f103819e = "https://api-va.tiktokv.com/aweme/v1/";
            aVar.f103818d = "https://api-va.tiktokv.com/";
            aVar.f103817c = "https://im-va.tiktokv.com/";
            aVar.f103816b = q.f112735a;
            aVar.f103822h = d.b();
            aVar.f103815a = false;
            iIMService.initialize(a2, aVar, new com.ss.android.ugc.aweme.im.d());
        }
    }
}
