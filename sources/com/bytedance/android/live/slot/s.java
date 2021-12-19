package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameSlotWidget f12791a;

    static {
        Covode.recordClassIndex(7115);
    }

    s(FrameSlotWidget frameSlotWidget) {
        this.f12791a = frameSlotWidget;
    }

    public final void run() {
        FrameSlotWidget frameSlotWidget = this.f12791a;
        frameSlotWidget.f12696a = new FrameSlotController((e) frameSlotWidget.getContext(), frameSlotWidget, IFrameSlot.c.LAST);
        frameSlotWidget.f12696a.a(frameSlotWidget);
        frameSlotWidget.f12696a.a((e) frameSlotWidget.getContext(), IFrameSlot.b.SLOT_LIVE_BOTTOM_POP);
        frameSlotWidget.getLifecycle().a(frameSlotWidget.f12696a);
    }
}
