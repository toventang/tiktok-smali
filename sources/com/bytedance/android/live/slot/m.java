package com.bytedance.android.live.slot;

import androidx.fragment.app.e;
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.i;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.j.cz;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL3SlotWidget f12784a;

    static {
        Covode.recordClassIndex(7109);
    }

    m(FrameL3SlotWidget frameL3SlotWidget) {
        this.f12784a = frameL3SlotWidget;
    }

    public final void run() {
        FrameL3SlotWidget frameL3SlotWidget = this.f12784a;
        frameL3SlotWidget.f12664a = new FrameSlotController((e) frameL3SlotWidget.getContext(), frameL3SlotWidget, IFrameSlot.c.LAST);
        frameL3SlotWidget.f12664a.a(frameL3SlotWidget);
        frameL3SlotWidget.f12664a.a((e) frameL3SlotWidget.getContext(), IFrameSlot.b.SLOT_LIVE_WATCHER_L3_POP);
        frameL3SlotWidget.dataChannel.b((Object) frameL3SlotWidget, i.class, (b) new n(frameL3SlotWidget));
        frameL3SlotWidget.dataChannel.b((androidx.lifecycle.m) frameL3SlotWidget, cz.class, (b) new o(frameL3SlotWidget));
        frameL3SlotWidget.f12668e = a.a().a(s.class).d(new p(frameL3SlotWidget));
        frameL3SlotWidget.f12669f = a.a().a(k.class).d(new q(frameL3SlotWidget));
        frameL3SlotWidget.getLifecycle().a(frameL3SlotWidget.f12664a);
    }
}
