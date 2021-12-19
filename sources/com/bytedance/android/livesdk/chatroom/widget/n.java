package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LockScreenWidget f16664a;

    static {
        Covode.recordClassIndex(9242);
    }

    n(LockScreenWidget lockScreenWidget) {
        this.f16664a = lockScreenWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LockScreenWidget lockScreenWidget = this.f16664a;
        if (((Boolean) obj).booleanValue()) {
            lockScreenWidget.getView().setVisibility(4);
        } else {
            lockScreenWidget.show();
        }
        return z.f158842a;
    }
}
