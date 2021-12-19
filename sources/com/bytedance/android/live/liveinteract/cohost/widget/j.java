package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.p.l;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10484a;

    static {
        Covode.recordClassIndex(5571);
    }

    j(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10484a = linkCrossRoomWidget;
    }

    public final void run() {
        l.INTERACTION_PK.unload(this.f10484a.dataChannel);
    }
}
