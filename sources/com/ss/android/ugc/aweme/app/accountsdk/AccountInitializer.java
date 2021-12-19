package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountInitializer;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class AccountInitializer implements IAccountInitializer {
    static {
        Covode.recordClassIndex(40894);
    }

    public static IAccountInitializer a() {
        MethodCollector.i(6117);
        Object a2 = b.a(IAccountInitializer.class, false);
        if (a2 != null) {
            IAccountInitializer iAccountInitializer = (IAccountInitializer) a2;
            MethodCollector.o(6117);
            return iAccountInitializer;
        }
        if (b.M == null) {
            synchronized (IAccountInitializer.class) {
                try {
                    if (b.M == null) {
                        b.M = new AccountInitializer();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6117);
                    throw th;
                }
            }
        }
        AccountInitializer accountInitializer = (AccountInitializer) b.M;
        MethodCollector.o(6117);
        return accountInitializer;
    }

    @Override // com.ss.android.ugc.aweme.IAccountInitializer
    public final void a(Application application) {
        l.d(application, "");
        b bVar = new b();
        c cVar = new c();
        l lVar = new l();
        l.b("api-va.tiktokv.com", "");
        a aVar = new a();
        l.d(application, "");
        l.d(bVar, "");
        l.d("", "");
        l.d(cVar, "");
        l.d(lVar, "");
        l.d("api-va.tiktokv.com", "");
        l.d(aVar, "");
        a.f62426a = application;
        a.f62427b = bVar;
        a.f62429d = lVar;
        a.f62428c = cVar;
        a.f62430e = new ConcurrentHashMap<>();
        a.f62431f = aVar;
        a.f62432g = "";
        a.f62433h = "api-va.tiktokv.com";
    }
}
