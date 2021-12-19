package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bn implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FullVideoButtonWidget f16495a;

    static {
        Covode.recordClassIndex(9131);
    }

    bn(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f16495a = fullVideoButtonWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = this.f16495a;
        if (((Boolean) obj).booleanValue()) {
            fullVideoButtonWidget.hide();
        } else {
            fullVideoButtonWidget.show();
        }
        return z.f158842a;
    }
}
