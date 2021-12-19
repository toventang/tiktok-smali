package com.ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.legoapi.ICrashSdkTaskApi;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthExtentTask;
import com.ss.android.ugc.aweme.legoImp.task.SafeViewInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ViewHolderLogTask;
import com.ss.android.ugc.b;

public final class CrashSdkTaskImpl implements ICrashSdkTaskApi {
    static {
        Covode.recordClassIndex(68864);
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w a() {
        return new AnalysisHprofTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w b() {
        return new AnrTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w c() {
        return new CrashSdkInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w d() {
        return new LeakReporterInjectTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w e() {
        return new MemoryMonitorTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w f() {
        return new NpthCoreInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w g() {
        return new NpthExtentTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w h() {
        return new SafeViewInitTask();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final w i() {
        return new ViewHolderLogTask();
    }

    public static ICrashSdkTaskApi j() {
        MethodCollector.i(6289);
        Object a2 = b.a(ICrashSdkTaskApi.class, false);
        if (a2 != null) {
            ICrashSdkTaskApi iCrashSdkTaskApi = (ICrashSdkTaskApi) a2;
            MethodCollector.o(6289);
            return iCrashSdkTaskApi;
        }
        if (b.cj == null) {
            synchronized (ICrashSdkTaskApi.class) {
                try {
                    if (b.cj == null) {
                        b.cj = new CrashSdkTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6289);
                    throw th;
                }
            }
        }
        CrashSdkTaskImpl crashSdkTaskImpl = (CrashSdkTaskImpl) b.cj;
        MethodCollector.o(6289);
        return crashSdkTaskImpl;
    }
}
