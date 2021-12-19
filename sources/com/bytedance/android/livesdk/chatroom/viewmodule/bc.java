package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.ac;
import com.bytedance.android.livesdk.chatroom.c.ak;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class bc implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16484a;

    static {
        Covode.recordClassIndex(9120);
    }

    bc(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16484a = decorationWrapperWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f16484a.onEvent(new ac(((ak) obj).f15097a));
    }
}
