package com.ss.android.ugc.aweme.legoImpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImpl.task.FrescoTask;
import com.ss.android.ugc.b;

public final class FrescoLegoTaskImpl implements IFrescoLegoTaskApi {
    static {
        Covode.recordClassIndex(69243);
    }

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final w a() {
        return new FrescoTask();
    }

    public static IFrescoLegoTaskApi b() {
        MethodCollector.i(6768);
        Object a2 = b.a(IFrescoLegoTaskApi.class, false);
        if (a2 != null) {
            IFrescoLegoTaskApi iFrescoLegoTaskApi = (IFrescoLegoTaskApi) a2;
            MethodCollector.o(6768);
            return iFrescoLegoTaskApi;
        }
        if (b.cr == null) {
            synchronized (IFrescoLegoTaskApi.class) {
                try {
                    if (b.cr == null) {
                        b.cr = new FrescoLegoTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6768);
                    throw th;
                }
            }
        }
        FrescoLegoTaskImpl frescoLegoTaskImpl = (FrescoLegoTaskImpl) b.cr;
        MethodCollector.o(6768);
        return frescoLegoTaskImpl;
    }
}
