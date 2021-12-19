package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FrameL3SlotWidget f12787a;

    static {
        Covode.recordClassIndex(7112);
    }

    p(FrameL3SlotWidget frameL3SlotWidget) {
        this.f12787a = frameL3SlotWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        FrameL3SlotWidget frameL3SlotWidget = this.f12787a;
        frameL3SlotWidget.f12670g = ((s) obj).f15147b;
        frameL3SlotWidget.a();
    }
}
