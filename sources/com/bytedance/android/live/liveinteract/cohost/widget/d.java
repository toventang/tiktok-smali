package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.liveinteract.linkroom.widget.ad;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10478a;

    static {
        Covode.recordClassIndex(5565);
    }

    d(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10478a = linkCrossRoomWidget;
    }

    public final void run() {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10478a;
        ad.b(linkCrossRoomWidget.f10473l.f10831a, new f(linkCrossRoomWidget), ad.b.PK);
    }
}
