package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import androidx.fragment.app.e;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f16417a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f16418b;

    static {
        Covode.recordClassIndex(9073);
    }

    g(f fVar, DataChannel dataChannel) {
        this.f16417a = fVar;
        this.f16418b = dataChannel;
    }

    public final void run() {
        f fVar = this.f16417a;
        DataChannel dataChannel = this.f16418b;
        fVar.f16390c = ((ISlotService) a.a(ISlotService.class)).createIconSlotController((e) fVar.f16389b, fVar, IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR, IIconSlot.c.AGGREGATE);
        fVar.f16390c.a(dataChannel);
        fVar.f16390c.a((e) fVar.f16389b, IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR);
        fVar.f16388a.getLifecycle().a(fVar.f16390c);
    }
}
