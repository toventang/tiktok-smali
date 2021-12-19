package com.ss.android.ugc.aweme.account;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IPreLoginHandleService;
import com.ss.android.ugc.aweme.app.ac;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class PreLoginHandleService implements IPreLoginHandleService {
    static {
        Covode.recordClassIndex(38503);
    }

    public static IPreLoginHandleService a() {
        MethodCollector.i(56);
        Object a2 = b.a(IPreLoginHandleService.class, false);
        if (a2 != null) {
            IPreLoginHandleService iPreLoginHandleService = (IPreLoginHandleService) a2;
            MethodCollector.o(56);
            return iPreLoginHandleService;
        }
        if (b.y == null) {
            synchronized (IPreLoginHandleService.class) {
                try {
                    if (b.y == null) {
                        b.y = new PreLoginHandleService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(56);
                    throw th;
                }
            }
        }
        PreLoginHandleService preLoginHandleService = (PreLoginHandleService) b.y;
        MethodCollector.o(56);
        return preLoginHandleService;
    }

    @Override // com.ss.android.ugc.aweme.IPreLoginHandleService
    public final Intent a(Activity activity, Intent intent, String str) {
        l.d(activity, "");
        return ac.a.a(activity, intent, str);
    }
}
