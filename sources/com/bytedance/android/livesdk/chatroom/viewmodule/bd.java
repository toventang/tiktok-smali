package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class bd implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16485a;

    static {
        Covode.recordClassIndex(9121);
    }

    bd(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16485a = decorationWrapperWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f16485a;
        s sVar = (s) obj;
        if (sVar != null && decorationWrapperWidget.getView() != null) {
            if (sVar.f15147b) {
                decorationWrapperWidget.hide();
            } else {
                decorationWrapperWidget.show();
            }
        }
    }
}
