package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.event.e;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class cq implements f {

    /* renamed from: a  reason: collision with root package name */
    private final br f16075a;

    static {
        Covode.recordClassIndex(8896);
    }

    cq(br brVar) {
        this.f16075a = brVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f16075a.onEvent((e) obj);
    }
}
