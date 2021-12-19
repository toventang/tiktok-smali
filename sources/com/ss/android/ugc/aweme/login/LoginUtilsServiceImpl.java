package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class LoginUtilsServiceImpl implements ILoginUtilsService {
    static {
        Covode.recordClassIndex(69806);
    }

    public static ILoginUtilsService a() {
        MethodCollector.i(2320);
        Object a2 = b.a(ILoginUtilsService.class, false);
        if (a2 != null) {
            ILoginUtilsService iLoginUtilsService = (ILoginUtilsService) a2;
            MethodCollector.o(2320);
            return iLoginUtilsService;
        }
        if (b.cv == null) {
            synchronized (ILoginUtilsService.class) {
                try {
                    if (b.cv == null) {
                        b.cv = new LoginUtilsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2320);
                    throw th;
                }
            }
        }
        LoginUtilsServiceImpl loginUtilsServiceImpl = (LoginUtilsServiceImpl) b.cv;
        MethodCollector.o(2320);
        return loginUtilsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.login.ILoginUtilsService
    public final void a(Bundle bundle) {
        d.a(bundle);
    }
}
