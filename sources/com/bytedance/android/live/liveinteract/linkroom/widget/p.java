package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.p.l;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10650a;

    static {
        Covode.recordClassIndex(5679);
    }

    p(LinkControlWidget linkControlWidget) {
        this.f10650a = linkControlWidget;
    }

    public final void run() {
        l.INTERACTION_PK.unload(this.f10650a.dataChannel);
    }
}
