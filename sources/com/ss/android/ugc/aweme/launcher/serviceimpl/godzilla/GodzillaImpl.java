package com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.platform.godzilla.c.d;
import com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;
import com.ss.android.ugc.aweme.s.a;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.b;

public final class GodzillaImpl implements IGodzillaApi {
    static {
        Covode.recordClassIndex(68655);
    }

    public static IGodzillaApi b() {
        MethodCollector.i(6257);
        Object a2 = b.a(IGodzillaApi.class, false);
        if (a2 != null) {
            IGodzillaApi iGodzillaApi = (IGodzillaApi) a2;
            MethodCollector.o(6257);
            return iGodzillaApi;
        }
        if (b.ce == null) {
            synchronized (IGodzillaApi.class) {
                try {
                    if (b.ce == null) {
                        b.ce = new GodzillaImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6257);
                    throw th;
                }
            }
        }
        GodzillaImpl godzillaImpl = (GodzillaImpl) b.ce;
        MethodCollector.o(6257);
        return godzillaImpl;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    public final void a() {
        if (com.ss.android.ugc.aweme.lego.b.b() && !a.i()) {
            df.a(g.a());
        }
        if (!df.f142819a) {
            return;
        }
        if (com.bytedance.platform.godzilla.a.f41939a != null) {
            com.bytedance.platform.godzilla.a.f41939a.a(d.REGISTER_EXCEPTION);
            if (com.ss.android.ugc.aweme.lego.b.f() && g.a() != null) {
                new com.bytedance.platform.godzilla.b.a(g.a()).a();
                return;
            }
            return;
        }
        throw new RuntimeException("Godzilla.init() method must be called first");
    }
}
