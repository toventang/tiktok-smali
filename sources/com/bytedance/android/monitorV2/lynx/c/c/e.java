package com.bytedance.android.monitorV2.lynx.c.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<LynxView, String> f24135a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14208);
    }

    public final synchronized String a(LynxView lynxView) {
        String str;
        MethodCollector.i(8996);
        l.c(lynxView, "");
        str = this.f24135a.get(lynxView);
        MethodCollector.o(8996);
        return str;
    }

    public final synchronized void a(LynxView lynxView, String str) {
        MethodCollector.i(8997);
        l.c(lynxView, "");
        l.c(str, "");
        if (str.length() != 0) {
            this.f24135a.put(lynxView, str);
        }
        MethodCollector.o(8997);
    }
}
