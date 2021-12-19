package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.linkroom.widget.ad;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10639a;

    static {
        Covode.recordClassIndex(5668);
    }

    e(LinkControlWidget linkControlWidget) {
        this.f10639a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10639a;
        Runnable runnable = (Runnable) obj;
        if (linkControlWidget.f10608e && LinkEntranceExperiment.INSTANCE.getValue() && (linkControlWidget.f10612i instanceof com.bytedance.android.live.liveinteract.linkroom.c.b)) {
            ad.a(((com.bytedance.android.live.liveinteract.linkroom.c.b) linkControlWidget.f10612i).f10541c.f10584c, new v(linkControlWidget), ad.b.MULTIGUEST);
        }
        runnable.run();
        ad.a(ad.a.COHOST);
        return z.f158842a;
    }
}
