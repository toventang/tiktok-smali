package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bl implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FullVideoButtonWidget f16493a;

    static {
        Covode.recordClassIndex(9129);
    }

    bl(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f16493a = fullVideoButtonWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        boolean z;
        FullVideoButtonWidget fullVideoButtonWidget = this.f16493a;
        fullVideoButtonWidget.f16315b = ((an) obj).a();
        if (fullVideoButtonWidget.f16316c || !fullVideoButtonWidget.f16315b) {
            z = false;
        } else {
            z = true;
        }
        fullVideoButtonWidget.a(Boolean.valueOf(z));
        return z.f158842a;
    }
}
