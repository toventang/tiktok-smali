package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.liveinteract.api.b.h;
import com.bytedance.android.live.liveinteract.api.b.i;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class k implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10645a;

    static {
        Covode.recordClassIndex(5674);
    }

    k(LinkControlWidget linkControlWidget) {
        this.f10645a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10645a;
        c cVar = (c) obj;
        a.a(3, "LinkControlWidget", "Match state: " + cVar.name());
        if (linkControlWidget.f10616m == null || !linkControlWidget.f10616m.equals(cVar)) {
            linkControlWidget.f10616m = cVar;
            int i2 = LinkControlWidget.AnonymousClass3.f10620a[cVar.ordinal()];
            if (i2 == 1) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9990g));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9990g);
            } else if (i2 == 2 || i2 == 3) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9987d));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9987d);
            } else if (i2 == 4) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9989f));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9989f);
            } else if (i2 == 5) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9991h));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9991h);
            }
        }
        return z.f158842a;
    }
}
