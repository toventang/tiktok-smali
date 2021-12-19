package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.p.l;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10652a;

    static {
        Covode.recordClassIndex(5681);
    }

    r(LinkControlWidget linkControlWidget) {
        this.f10652a = linkControlWidget;
    }

    public final void run() {
        l.INTERACTION_PK.unload(this.f10652a.dataChannel);
    }
}
