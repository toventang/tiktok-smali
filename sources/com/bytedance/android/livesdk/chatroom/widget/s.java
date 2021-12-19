package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final MessageBlockWidget f16671a;

    static {
        Covode.recordClassIndex(9249);
    }

    s(MessageBlockWidget messageBlockWidget) {
        this.f16671a = messageBlockWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        MessageBlockWidget messageBlockWidget = this.f16671a;
        if (((Boolean) obj).booleanValue()) {
            messageBlockWidget.getView().setVisibility(4);
        } else {
            messageBlockWidget.show();
        }
        return z.f158842a;
    }
}
