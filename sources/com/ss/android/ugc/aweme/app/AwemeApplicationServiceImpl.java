package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class AwemeApplicationServiceImpl implements IAwemeApplicationService {
    static {
        Covode.recordClassIndex(40860);
    }

    @Override // com.ss.android.ugc.aweme.app.IAwemeApplicationService
    public final boolean a() {
        return o.a().f66861a.f99089b;
    }

    @Override // com.ss.android.ugc.aweme.app.IAwemeApplicationService
    public final boolean b() {
        return o.a().f66861a.a();
    }

    public static IAwemeApplicationService c() {
        MethodCollector.i(4923);
        Object a2 = b.a(IAwemeApplicationService.class, false);
        if (a2 != null) {
            IAwemeApplicationService iAwemeApplicationService = (IAwemeApplicationService) a2;
            MethodCollector.o(4923);
            return iAwemeApplicationService;
        }
        if (b.K == null) {
            synchronized (IAwemeApplicationService.class) {
                try {
                    if (b.K == null) {
                        b.K = new AwemeApplicationServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4923);
                    throw th;
                }
            }
        }
        AwemeApplicationServiceImpl awemeApplicationServiceImpl = (AwemeApplicationServiceImpl) b.K;
        MethodCollector.o(4923);
        return awemeApplicationServiceImpl;
    }
}
