package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.f;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class bj implements b {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16491a;

    static {
        Covode.recordClassIndex(9127);
    }

    bj(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16491a = decorationWrapperWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f16491a;
        Boolean bool = (Boolean) obj;
        if (decorationWrapperWidget.f16296k != null) {
            decorationWrapperWidget.f16296k.b(bool.booleanValue());
        }
        decorationWrapperWidget.f16297m = bool.booleanValue();
        if (!bool.booleanValue()) {
            return null;
        }
        a.a().a(new f());
        return null;
    }
}
