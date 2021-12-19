package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class aa implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10623a;

    static {
        Covode.recordClassIndex(5655);
    }

    aa(LinkControlWidget linkControlWidget) {
        this.f10623a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        this.f10623a.f10607d.a(LinkApi.a.INVITE_CANCEL);
        return z.f158842a;
    }
}
