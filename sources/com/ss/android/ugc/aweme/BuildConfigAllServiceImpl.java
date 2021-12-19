package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.k.a;
import com.ss.android.ugc.b;
import h.m.p;

public class BuildConfigAllServiceImpl implements IBuildConfigAllService {
    static {
        Covode.recordClassIndex(38340);
    }

    public static IBuildConfigAllService b() {
        MethodCollector.i(4917);
        Object a2 = b.a(IBuildConfigAllService.class, false);
        if (a2 != null) {
            IBuildConfigAllService iBuildConfigAllService = (IBuildConfigAllService) a2;
            MethodCollector.o(4917);
            return iBuildConfigAllService;
        }
        if (b.f145538m == null) {
            synchronized (IBuildConfigAllService.class) {
                try {
                    if (b.f145538m == null) {
                        b.f145538m = new BuildConfigAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4917);
                    throw th;
                }
            }
        }
        BuildConfigAllServiceImpl buildConfigAllServiceImpl = (BuildConfigAllServiceImpl) b.f145538m;
        MethodCollector.o(4917);
        return buildConfigAllServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IBuildConfigAllService
    public final boolean a() {
        if (p.a("startupTest", a.f66814a, true) || p.a("MTraceStartup", a.f66814a, true) || p.a("MTraceStartupDiff", a.f66814a, true)) {
            return true;
        }
        return false;
    }
}
