package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class ax implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16475a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16476b;

    static {
        Covode.recordClassIndex(9114);
    }

    ax(DecorationWrapperWidget decorationWrapperWidget, List list) {
        this.f16475a = decorationWrapperWidget;
        this.f16476b = list;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f16475a;
        for (av avVar : this.f16476b) {
            decorationWrapperWidget.c(avVar);
            if (avVar.f19005g == 1 || avVar.f19005g == 2) {
                decorationWrapperWidget.b(avVar);
            }
        }
    }
}
