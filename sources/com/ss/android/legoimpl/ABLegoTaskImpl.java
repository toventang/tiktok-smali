package com.ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.legoapi.abtest.IABLegoTaskApi;
import com.ss.android.sdk.app.AbTestSdkInitTask;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.ABTask;
import com.ss.android.ugc.aweme.legoImp.task.AsyncABAndPreloadRepoTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask;
import com.ss.android.ugc.b;

public final class ABLegoTaskImpl implements IABLegoTaskApi {
    static {
        Covode.recordClassIndex(36801);
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w a() {
        return new ABTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w b() {
        return new AbTestSdkInitTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w c() {
        return new AsyncABAndPreloadRepoTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final w d() {
        return new PreloadInstanceOnAttachTask();
    }

    public static IABLegoTaskApi e() {
        MethodCollector.i(7978);
        Object a2 = b.a(IABLegoTaskApi.class, false);
        if (a2 != null) {
            IABLegoTaskApi iABLegoTaskApi = (IABLegoTaskApi) a2;
            MethodCollector.o(7978);
            return iABLegoTaskApi;
        }
        if (b.f145534i == null) {
            synchronized (IABLegoTaskApi.class) {
                try {
                    if (b.f145534i == null) {
                        b.f145534i = new ABLegoTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7978);
                    throw th;
                }
            }
        }
        ABLegoTaskImpl aBLegoTaskImpl = (ABLegoTaskImpl) b.f145534i;
        MethodCollector.o(7978);
        return aBLegoTaskImpl;
    }
}
