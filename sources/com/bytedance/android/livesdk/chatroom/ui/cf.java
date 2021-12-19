package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16061a;

    static {
        Covode.recordClassIndex(8885);
    }

    cf(br brVar) {
        this.f16061a = brVar;
    }

    public final void run() {
        br brVar = this.f16061a;
        ((IGiftService) a.a(IGiftService.class)).syncGiftList(brVar.ar, brVar.f15993c, 2, false);
    }
}
