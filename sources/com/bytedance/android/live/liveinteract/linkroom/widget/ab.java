package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ab implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10624a;

    static {
        Covode.recordClassIndex(5656);
    }

    ab(LinkControlWidget linkControlWidget) {
        this.f10624a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10624a;
        linkControlWidget.f10607d.d();
        linkControlWidget.f10607d.a(LinkApi.a.INVITE_CANCEL);
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() != 0) {
            b.a.a().af = false;
            linkControlWidget.c(false);
        }
        return z.f158842a;
    }
}
