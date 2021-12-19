package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bk implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FullVideoButtonWidget f16492a;

    static {
        Covode.recordClassIndex(9128);
    }

    bk(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f16492a = fullVideoButtonWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = this.f16492a;
        fullVideoButtonWidget.f16316c = ((Boolean) obj).booleanValue();
        fullVideoButtonWidget.a(Boolean.valueOf(!fullVideoButtonWidget.f16316c && fullVideoButtonWidget.f16315b));
        return z.f158842a;
    }
}
