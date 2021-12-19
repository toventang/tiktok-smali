package com.bytedance.android.live.slot;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL3SlotWidget f12786a;

    static {
        Covode.recordClassIndex(7111);
    }

    o(FrameL3SlotWidget frameL3SlotWidget) {
        this.f12786a = frameL3SlotWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Pair<Boolean, String> value;
        FrameL3SlotWidget frameL3SlotWidget = this.f12786a;
        if (((Boolean) obj).booleanValue() && frameL3SlotWidget.f12666c != null && (value = frameL3SlotWidget.f12666c.f12709a.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL3SlotWidget.f12666c.f12709a.setValue(new Pair<>(false, "visibility_reason_conflict"));
        }
        return z.f158842a;
    }
}
