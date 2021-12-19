package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.ac;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class au implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16471a;

    static {
        Covode.recordClassIndex(9111);
    }

    au(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16471a = decorationWrapperWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f16471a.onEvent((ac) obj);
    }
}
