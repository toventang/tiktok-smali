package com.ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.IPowerContext;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class PowerContextImpl implements IPowerContext {
    static {
        Covode.recordClassIndex(79542);
    }

    @Override // com.bytedance.ies.powerlist.IPowerContext
    public final Application getApplication() {
        Application a2 = g.a();
        l.b(a2, "");
        return a2;
    }

    public static IPowerContext createIPowerContextbyMonsterPlugin(boolean z) {
        MethodCollector.i(5835);
        Object a2 = b.a(IPowerContext.class, z);
        if (a2 != null) {
            IPowerContext iPowerContext = (IPowerContext) a2;
            MethodCollector.o(5835);
            return iPowerContext;
        }
        if (b.dz == null) {
            synchronized (IPowerContext.class) {
                try {
                    if (b.dz == null) {
                        b.dz = new PowerContextImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5835);
                    throw th;
                }
            }
        }
        PowerContextImpl powerContextImpl = (PowerContextImpl) b.dz;
        MethodCollector.o(5835);
        return powerContextImpl;
    }
}
