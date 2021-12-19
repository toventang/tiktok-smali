package com.bytedance.android.livesdk.chatroom.a.c;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f14911a;

    static {
        Covode.recordClassIndex(8260);
    }

    b(a aVar) {
        this.f14911a = aVar;
    }

    public final void run() {
        a aVar = this.f14911a;
        if (aVar.f14898b != null) {
            aVar.f14898b.a(aVar.f14897a);
        }
    }
}
