package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.al;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bf implements b {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16487a;

    static {
        Covode.recordClassIndex(9123);
    }

    bf(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16487a = decorationWrapperWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f16487a;
        al alVar = (al) obj;
        if (decorationWrapperWidget.isViewValid() && decorationWrapperWidget.context != null) {
            decorationWrapperWidget.getView().post(new aw(decorationWrapperWidget, alVar));
        }
        return z.f158842a;
    }
}
