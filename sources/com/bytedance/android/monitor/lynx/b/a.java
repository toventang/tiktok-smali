package com.bytedance.android.monitor.lynx.b;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<LynxView, b> f23592a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14008);
    }

    public final b a(LynxView lynxView) {
        l.c(lynxView, "");
        return this.f23592a.get(lynxView);
    }
}
