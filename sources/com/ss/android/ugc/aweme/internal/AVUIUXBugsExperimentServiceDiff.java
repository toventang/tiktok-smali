package com.ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IUIUXBugsExperimentService;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.ss.android.ugc.b;

public final class AVUIUXBugsExperimentServiceDiff implements IAVUIUXBugsExperimentService {

    /* renamed from: a  reason: collision with root package name */
    private final IUIUXBugsExperimentService f104772a = UIUXBugsExperimentService.b();

    static {
        Covode.recordClassIndex(67174);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService
    public final boolean a() {
        return this.f104772a.a();
    }

    public static IAVUIUXBugsExperimentService b() {
        MethodCollector.i(10248);
        Object a2 = b.a(IAVUIUXBugsExperimentService.class, false);
        if (a2 != null) {
            IAVUIUXBugsExperimentService iAVUIUXBugsExperimentService = (IAVUIUXBugsExperimentService) a2;
            MethodCollector.o(10248);
            return iAVUIUXBugsExperimentService;
        }
        if (b.bK == null) {
            synchronized (IAVUIUXBugsExperimentService.class) {
                try {
                    if (b.bK == null) {
                        b.bK = new AVUIUXBugsExperimentServiceDiff();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10248);
                    throw th;
                }
            }
        }
        AVUIUXBugsExperimentServiceDiff aVUIUXBugsExperimentServiceDiff = (AVUIUXBugsExperimentServiceDiff) b.bK;
        MethodCollector.o(10248);
        return aVUIUXBugsExperimentServiceDiff;
    }
}
