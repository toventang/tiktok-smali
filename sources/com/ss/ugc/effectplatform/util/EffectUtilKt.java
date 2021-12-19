package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.algorithm.b;
import h.f.b.l;

public final class EffectUtilKt {
    static {
        Covode.recordClassIndex(102662);
    }

    public static final native boolean nativeCheckEffectChildrenFile(String str);

    public static final boolean a(String str) {
        MethodCollector.i(9173);
        l.c(str, "");
        b.f153450b.a();
        boolean nativeCheckEffectChildrenFile = nativeCheckEffectChildrenFile(str);
        MethodCollector.o(9173);
        return nativeCheckEffectChildrenFile;
    }
}
