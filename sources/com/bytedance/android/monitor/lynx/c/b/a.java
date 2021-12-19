package com.bytedance.android.monitor.lynx.c.b;

import android.view.View;
import com.bytedance.android.monitor.b.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class a<C extends com.bytedance.android.monitor.b.a> implements b<LynxView, C> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<LynxView, C> f23661a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14021);
    }

    public C a(LynxView lynxView) {
        l.c(lynxView, "");
        C a2 = a((View) lynxView);
        this.f23661a.put(lynxView, a2);
        return a2;
    }

    public C b(LynxView lynxView) {
        l.c(lynxView, "");
        return this.f23661a.get(lynxView);
    }
}
