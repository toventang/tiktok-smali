package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.j.cz;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL2SlotWidget f12779a;

    static {
        Covode.recordClassIndex(7105);
    }

    i(FrameL2SlotWidget frameL2SlotWidget) {
        this.f12779a = frameL2SlotWidget;
    }

    public final void run() {
        FrameL2SlotWidget frameL2SlotWidget = this.f12779a;
        frameL2SlotWidget.f12651a = new FrameSlotController((e) frameL2SlotWidget.getContext(), frameL2SlotWidget, IFrameSlot.c.LAST);
        frameL2SlotWidget.f12651a.a(frameL2SlotWidget);
        frameL2SlotWidget.f12651a.a((e) frameL2SlotWidget.getContext(), IFrameSlot.b.SLOT_LIVE_WATCHER_L2_POP);
        frameL2SlotWidget.dataChannel.b((m) frameL2SlotWidget, cz.class, (b) new j(frameL2SlotWidget));
        frameL2SlotWidget.f12656f = a.a().a(s.class).d(new k(frameL2SlotWidget));
        frameL2SlotWidget.getLifecycle().a(frameL2SlotWidget.f12651a);
    }
}
