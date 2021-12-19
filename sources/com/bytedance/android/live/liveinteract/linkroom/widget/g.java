package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.multilive.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.l;
import h.z;

final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10641a;

    static {
        Covode.recordClassIndex(5670);
    }

    g(LinkControlWidget linkControlWidget) {
        this.f10641a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10641a;
        int intValue = ((Integer) obj).intValue();
        DataChannel dataChannel = linkControlWidget.dataChannel;
        l.d(dataChannel, "");
        if (a.c()) {
            com.bytedance.android.livesdk.chatroom.model.c.a a2 = a.a();
            if (intValue == 1 || intValue == 2) {
                if (a.b(a2) && a.b()) {
                    a.d(dataChannel);
                }
            } else if (a.b(a2) && a.b()) {
                a.c(dataChannel);
            }
        }
        return z.f158842a;
    }
}
