package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    final Map<Long, AugmentedFace> f53396a = new ab();

    static {
        Covode.recordClassIndex(33053);
    }

    ac() {
    }

    public final synchronized AugmentedFace a(long j2, Session session) {
        MethodCollector.i(11491);
        Map<Long, AugmentedFace> map = this.f53396a;
        Long valueOf = Long.valueOf(j2);
        AugmentedFace augmentedFace = map.get(valueOf);
        if (augmentedFace == null) {
            AugmentedFace augmentedFace2 = new AugmentedFace(j2, session);
            this.f53396a.put(valueOf, augmentedFace2);
            MethodCollector.o(11491);
            return augmentedFace2;
        }
        MethodCollector.o(11491);
        return augmentedFace;
    }
}
