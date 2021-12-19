package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.al;
import com.bytedance.android.livesdk.chatroom.widget.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16473a;

    /* renamed from: b  reason: collision with root package name */
    private final al f16474b;

    static {
        Covode.recordClassIndex(9113);
    }

    aw(DecorationWrapperWidget decorationWrapperWidget, al alVar) {
        this.f16473a = decorationWrapperWidget;
        this.f16474b = alVar;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f16473a;
        decorationWrapperWidget.f16289c[1] = n.b(decorationWrapperWidget.context) - this.f16474b.f15099a;
        for (a aVar : decorationWrapperWidget.f16291e) {
            aVar.a(decorationWrapperWidget.f16289c);
        }
    }
}
