package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.liveinteract.api.b.h;
import com.bytedance.android.live.liveinteract.api.b.i;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.a.b;
import h.z;

final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10644a;

    static {
        Covode.recordClassIndex(5673);
    }

    j(LinkControlWidget linkControlWidget) {
        this.f10644a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10644a;
        k kVar = (k) obj;
        a.a(3, "LinkControlWidget", "co-host state: " + kVar.name());
        if (linkControlWidget.f10615l == null || kVar.getState() != linkControlWidget.f10615l.getState()) {
            linkControlWidget.f10615l = kVar;
            switch (LinkControlWidget.AnonymousClass3.f10621b[kVar.ordinal()]) {
                case 1:
                case 2:
                    linkControlWidget.dataChannel.c(i.class, new h(h.f9985b));
                    com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9985b);
                    break;
                case 3:
                case 4:
                    linkControlWidget.dataChannel.c(i.class, new h(h.f9988e));
                    com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9988e);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    linkControlWidget.dataChannel.c(i.class, new h(h.f9987d));
                    com.bytedance.android.live.liveinteract.linkroom.b.a.a(h.f9987d);
                    break;
            }
        }
        return z.f158842a;
    }
}
