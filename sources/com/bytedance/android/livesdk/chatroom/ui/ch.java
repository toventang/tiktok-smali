package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ch implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16063a;

    static {
        Covode.recordClassIndex(8887);
    }

    ch(br brVar) {
        this.f16063a = brVar;
    }

    public final void run() {
        br brVar = this.f16063a;
        ((IGiftService) a.a(IGiftService.class)).syncGiftList(brVar.ar, brVar.f15993c, 2, false);
    }
}
