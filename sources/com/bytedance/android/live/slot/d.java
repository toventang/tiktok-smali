package com.bytedance.android.live.slot;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BarrageWidget f12766a;

    static {
        Covode.recordClassIndex(7098);
    }

    d(BarrageWidget barrageWidget) {
        this.f12766a = barrageWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        BarrageWidget barrageWidget = this.f12766a;
        barrageWidget.f12611d = !((Boolean) obj).booleanValue();
        if (!(barrageWidget.f12611d || barrageWidget.f12609b == null || barrageWidget.f12609b.getVisibility() == 0)) {
            barrageWidget.f12609b.setVisibility(8);
        }
        return z.f158842a;
    }
}
