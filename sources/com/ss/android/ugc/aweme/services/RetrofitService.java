package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.b;

public class RetrofitService implements IRetrofitService {
    static {
        Covode.recordClassIndex(79557);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IRetrofitService
    public IRetrofit createNewRetrofit(final String str) {
        return new IRetrofit() {
            /* class com.ss.android.ugc.aweme.services.RetrofitService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79558);
            }

            @Override // com.ss.android.ugc.aweme.framework.services.IRetrofit
            public <T> T create(Class<T> cls) {
                return (T) a.a(str).a(cls);
            }
        };
    }

    public static IRetrofitService createIRetrofitServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(5559);
        Object a2 = b.a(IRetrofitService.class, z);
        if (a2 != null) {
            IRetrofitService iRetrofitService = (IRetrofitService) a2;
            MethodCollector.o(5559);
            return iRetrofitService;
        }
        if (b.dA == null) {
            synchronized (IRetrofitService.class) {
                try {
                    if (b.dA == null) {
                        b.dA = new RetrofitService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5559);
                    throw th;
                }
            }
        }
        RetrofitService retrofitService = (RetrofitService) b.dA;
        MethodCollector.o(5559);
        return retrofitService;
    }
}
