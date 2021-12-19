package com.bytedance.android.monitorV2.lynx.b;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<LynxView, b> f24065a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14183);
    }

    public final b a(LynxView lynxView) {
        l.c(lynxView, "");
        return this.f24065a.get(lynxView);
    }
}
