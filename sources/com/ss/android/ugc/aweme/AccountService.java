package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class AccountService extends an {
    static {
        Covode.recordClassIndex(38338);
    }

    public static IAccountService a() {
        MethodCollector.i(9261);
        Object a2 = b.a(IAccountService.class, false);
        if (a2 != null) {
            IAccountService iAccountService = (IAccountService) a2;
            MethodCollector.o(9261);
            return iAccountService;
        }
        if (b.f145536k == null) {
            synchronized (IAccountService.class) {
                try {
                    if (b.f145536k == null) {
                        b.f145536k = new AccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9261);
                    throw th;
                }
            }
        }
        an anVar = (an) b.f145536k;
        MethodCollector.o(9261);
        return anVar;
    }
}
