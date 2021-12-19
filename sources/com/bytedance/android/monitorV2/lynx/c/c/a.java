package com.bytedance.android.monitorV2.lynx.c.c;

import android.view.View;
import com.bytedance.android.monitorV2.a.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class a<C extends com.bytedance.android.monitorV2.a.a> implements b<LynxView, C> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<LynxView, C> f24134a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14204);
    }

    public C a(LynxView lynxView) {
        l.c(lynxView, "");
        C a2 = a((View) lynxView);
        this.f24134a.put(lynxView, a2);
        return a2;
    }

    public C b(LynxView lynxView) {
        l.c(lynxView, "");
        return this.f24134a.get(lynxView);
    }
}
