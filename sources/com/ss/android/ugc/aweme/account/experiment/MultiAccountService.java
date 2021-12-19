package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.login.w;

public final class MultiAccountService implements IMultiAccountService {
    static {
        Covode.recordClassIndex(38790);
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final boolean b() {
        return w.a.a();
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void a() {
        b.b().uploadAccountNum(false);
    }

    public static IMultiAccountService c() {
        MethodCollector.i(9403);
        Object a2 = com.ss.android.ugc.b.a(IMultiAccountService.class, false);
        if (a2 != null) {
            IMultiAccountService iMultiAccountService = (IMultiAccountService) a2;
            MethodCollector.o(9403);
            return iMultiAccountService;
        }
        if (com.ss.android.ugc.b.A == null) {
            synchronized (IMultiAccountService.class) {
                try {
                    if (com.ss.android.ugc.b.A == null) {
                        com.ss.android.ugc.b.A = new MultiAccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9403);
                    throw th;
                }
            }
        }
        MultiAccountService multiAccountService = (MultiAccountService) com.ss.android.ugc.b.A;
        MethodCollector.o(9403);
        return multiAccountService;
    }
}
