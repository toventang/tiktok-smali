package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.liveinteract.api.d;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class be implements b {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16486a;

    static {
        Covode.recordClassIndex(9122);
    }

    be(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16486a = decorationWrapperWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f16486a;
        p pVar = (p) obj;
        if (pVar.f15136a == 0) {
            d linkCrossRoomWidget = ((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
            if (linkCrossRoomWidget != null) {
                decorationWrapperWidget.f16289c[1] = linkCrossRoomWidget.c() + linkCrossRoomWidget.b();
            }
        } else {
            if (pVar.f15136a == 1) {
                decorationWrapperWidget.f16289c = decorationWrapperWidget.f16290d;
            }
            return z.f158842a;
        }
        for (com.bytedance.android.livesdk.chatroom.widget.a aVar : decorationWrapperWidget.f16291e) {
            aVar.a(decorationWrapperWidget.f16289c);
        }
        return z.f158842a;
    }
}
