package com.bytedance.android.live.slot;

import com.bytedance.android.live.liveinteract.api.b.j;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL3SlotWidget f12785a;

    static {
        Covode.recordClassIndex(7110);
    }

    n(FrameL3SlotWidget frameL3SlotWidget) {
        this.f12785a = frameL3SlotWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        FrameL3SlotWidget frameL3SlotWidget = this.f12785a;
        j jVar = (j) obj;
        frameL3SlotWidget.f12671h = jVar.f9996a;
        frameL3SlotWidget.a();
        frameL3SlotWidget.a(jVar.f9997b);
        return z.f158842a;
    }
}
