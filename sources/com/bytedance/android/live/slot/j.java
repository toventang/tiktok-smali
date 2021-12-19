package com.bytedance.android.live.slot;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL2SlotWidget f12780a;

    static {
        Covode.recordClassIndex(7106);
    }

    j(FrameL2SlotWidget frameL2SlotWidget) {
        this.f12780a = frameL2SlotWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Pair<Boolean, String> value;
        FrameL2SlotWidget frameL2SlotWidget = this.f12780a;
        if (((Boolean) obj).booleanValue() && frameL2SlotWidget.f12653c != null && (value = frameL2SlotWidget.f12653c.f12709a.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL2SlotWidget.f12653c.f12709a.setValue(new Pair<>(false, "visibility_reason_conflict"));
        }
        return z.f158842a;
    }
}
