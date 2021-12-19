package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.aj;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class av implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16472a;

    static {
        Covode.recordClassIndex(9112);
    }

    av(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16472a = decorationWrapperWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f16472a.onEvent((aj) obj);
    }
}
