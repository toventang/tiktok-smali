package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.liveinteract.api.b.h;
import com.bytedance.android.live.liveinteract.api.b.i;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10646a;

    static {
        Covode.recordClassIndex(5675);
    }

    l(LinkControlWidget linkControlWidget) {
        this.f10646a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        c a2;
        LinkControlWidget linkControlWidget = this.f10646a;
        c cVar = (c) obj;
        a.a(3, "LinkControlWidget", "Rematch state: " + cVar.name());
        if (linkControlWidget.n == null || !linkControlWidget.n.equals(cVar)) {
            linkControlWidget.n = cVar;
            int i2 = LinkControlWidget.AnonymousClass3.f10620a[cVar.ordinal()];
            if (i2 == 1) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9992i));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9992i);
            } else if (i2 == 2 && (a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a()) != null && a2.equals(c.PUNISH)) {
                linkControlWidget.dataChannel.c(i.class, new h(h.f9991h));
                com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9991h);
            }
        }
        return z.f158842a;
    }
}
