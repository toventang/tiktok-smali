package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.api.c;
import com.ss.android.ugc.b;

public class PreloadApiServiceImpl implements IPreloadApiService {
    static {
        Covode.recordClassIndex(38397);
    }

    public static IPreloadApiService a() {
        MethodCollector.i(4896);
        Object a2 = b.a(IPreloadApiService.class, false);
        if (a2 != null) {
            IPreloadApiService iPreloadApiService = (IPreloadApiService) a2;
            MethodCollector.o(4896);
            return iPreloadApiService;
        }
        if (b.r == null) {
            synchronized (IPreloadApiService.class) {
                try {
                    if (b.r == null) {
                        b.r = new PreloadApiServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4896);
                    throw th;
                }
            }
        }
        PreloadApiServiceImpl preloadApiServiceImpl = (PreloadApiServiceImpl) b.r;
        MethodCollector.o(4896);
        return preloadApiServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void a(Aweme aweme, String str) {
        c.a(c.b(null, aweme.getAuthorUid()), str);
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void a(String str, String str2, String str3) {
        AwemeApi.a(true, str, str2, 0, 0, 20, str3, 0, 0, null, new e());
    }
}
