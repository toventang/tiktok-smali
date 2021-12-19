package com.bytedance.ies.ugc.aweme.rich.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35132a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final List<c> f35133b = new ArrayList();

    private b() {
    }

    static {
        Covode.recordClassIndex(21053);
    }

    public final synchronized void a(c cVar) {
        MethodCollector.i(1036);
        if (cVar != null) {
            List<c> list = f35133b;
            if (!list.contains(cVar)) {
                list.add(cVar);
                MethodCollector.o(1036);
                return;
            }
        }
        MethodCollector.o(1036);
    }

    public final synchronized void b(c cVar) {
        MethodCollector.i(1039);
        if (cVar != null) {
            List<c> list = f35133b;
            if (list.contains(cVar)) {
                list.remove(cVar);
                MethodCollector.o(1039);
                return;
            }
        }
        MethodCollector.o(1039);
    }

    public static final synchronized a.C0791a a(AwemeRawAd awemeRawAd, a.C0791a aVar) {
        synchronized (b.class) {
            MethodCollector.i(1042);
            l.d(awemeRawAd, "");
            l.d(aVar, "");
            List<c> list = f35133b;
            if (list.isEmpty()) {
                MethodCollector.o(1042);
                return aVar;
            }
            for (c cVar : list) {
                try {
                    cVar.a(awemeRawAd, aVar);
                } catch (Throwable unused) {
                }
            }
            MethodCollector.o(1042);
            return aVar;
        }
    }
}
