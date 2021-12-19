package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class MainPageExperimentServiceImpl implements IMainPageExperimentService {
    static {
        Covode.recordClassIndex(69845);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageExperimentService
    public final boolean a() {
        return av.a();
    }

    public static IMainPageExperimentService b() {
        MethodCollector.i(2656);
        Object a2 = b.a(IMainPageExperimentService.class, false);
        if (a2 != null) {
            IMainPageExperimentService iMainPageExperimentService = (IMainPageExperimentService) a2;
            MethodCollector.o(2656);
            return iMainPageExperimentService;
        }
        if (b.cw == null) {
            synchronized (IMainPageExperimentService.class) {
                try {
                    if (b.cw == null) {
                        b.cw = new MainPageExperimentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2656);
                    throw th;
                }
            }
        }
        MainPageExperimentServiceImpl mainPageExperimentServiceImpl = (MainPageExperimentServiceImpl) b.cw;
        MethodCollector.o(2656);
        return mainPageExperimentServiceImpl;
    }
}
