package com.ss.android.ugc.aweme.appsflyer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.utils.r;
import com.ss.android.ugc.b;

public final class AppsflyerImpl implements IAppsflyerApi {
    static {
        Covode.recordClassIndex(41269);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void a() {
        r.a();
    }

    public static IAppsflyerApi b() {
        MethodCollector.i(7802);
        Object a2 = b.a(IAppsflyerApi.class, false);
        if (a2 != null) {
            IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) a2;
            MethodCollector.o(7802);
            return iAppsflyerApi;
        }
        if (b.Q == null) {
            synchronized (IAppsflyerApi.class) {
                try {
                    if (b.Q == null) {
                        b.Q = new AppsflyerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7802);
                    throw th;
                }
            }
        }
        AppsflyerImpl appsflyerImpl = (AppsflyerImpl) b.Q;
        MethodCollector.o(7802);
        return appsflyerImpl;
    }
}
