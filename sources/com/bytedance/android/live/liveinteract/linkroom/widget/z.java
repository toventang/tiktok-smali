package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.platform.common.c.c;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class z implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10660a;

    static {
        Covode.recordClassIndex(5689);
    }

    z(LinkControlWidget linkControlWidget) {
        this.f10660a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Object b2;
        LinkControlWidget linkControlWidget = this.f10660a;
        if (!(((Boolean) obj).booleanValue() || (b2 = linkControlWidget.dataChannel.b(c.class)) == null || b2 == LinkApi.c.USER_CLICK)) {
            linkControlWidget.f10607d.a(LinkApi.e.RESTART_AFTER_CO_HOST);
        }
        return h.z.f158842a;
    }
}
