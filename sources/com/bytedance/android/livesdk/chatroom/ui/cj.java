package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.backroom.d.a;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16066a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16067b;

    static {
        Covode.recordClassIndex(8889);
    }

    cj(br brVar, int i2) {
        this.f16066a = brVar;
        this.f16067b = i2;
    }

    public final void run() {
        br brVar = this.f16066a;
        int i2 = this.f16067b;
        if (brVar.s != null && brVar.r == p.LIVE_STARTED) {
            brVar.s.a(brVar.f15994d);
        }
        if (!a.c() || i2 != 8 || brVar.at == null || !brVar.at.j()) {
            brVar.a(br.a.USER_CLOSE);
        }
    }
}
