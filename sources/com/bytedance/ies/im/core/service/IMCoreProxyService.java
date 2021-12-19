package com.bytedance.ies.im.core.service;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.h.a;
import com.bytedance.ies.im.core.api.h.b;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;

public class IMCoreProxyService implements IIMCoreProxyService {

    /* renamed from: a  reason: collision with root package name */
    public static long f34192a = SystemClock.elapsedRealtime();

    static {
        Covode.recordClassIndex(20363);
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final a a() {
        return (a) c.f34195a.getValue();
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final b b() {
        return (b) c.f34196b.getValue();
    }

    public static IIMCoreProxyService c() {
        MethodCollector.i(3328);
        Object a2 = com.ss.android.ugc.b.a(IIMCoreProxyService.class, false);
        if (a2 != null) {
            IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) a2;
            MethodCollector.o(3328);
            return iIMCoreProxyService;
        }
        if (com.ss.android.ugc.b.f145526a == null) {
            synchronized (IIMCoreProxyService.class) {
                try {
                    if (com.ss.android.ugc.b.f145526a == null) {
                        com.ss.android.ugc.b.f145526a = new IMCoreProxyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3328);
                    throw th;
                }
            }
        }
        IMCoreProxyService iMCoreProxyService = (IMCoreProxyService) com.ss.android.ugc.b.f145526a;
        MethodCollector.o(3328);
        return iMCoreProxyService;
    }
}
