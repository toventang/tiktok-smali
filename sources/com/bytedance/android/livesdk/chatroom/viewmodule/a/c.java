package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import androidx.fragment.app.e;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f16381a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f16382b;

    static {
        Covode.recordClassIndex(9058);
    }

    c(b bVar, DataChannel dataChannel) {
        this.f16381a = bVar;
        this.f16382b = dataChannel;
    }

    public final void run() {
        b bVar = this.f16381a;
        DataChannel dataChannel = this.f16382b;
        bVar.f16350c = ((ISlotService) a.a(ISlotService.class)).createIconSlotController((e) bVar.f16349b, bVar, IIconSlot.b.SLOT_LIVE_WATCHER_L2_TOOLBAR, IIconSlot.c.PREEMPTION);
        bVar.f16350c.a(dataChannel);
        bVar.f16350c.a((e) bVar.f16349b, IIconSlot.b.SLOT_LIVE_WATCHER_L2_TOOLBAR);
        bVar.f16348a.getLifecycle().a(bVar.f16350c);
    }
}
