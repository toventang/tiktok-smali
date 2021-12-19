package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f15474a;

    static {
        Covode.recordClassIndex(8542);
    }

    c(a aVar) {
        this.f15474a = aVar;
    }

    public final void run() {
        a aVar = this.f15474a;
        aVar.f15463b.postDelayed(aVar.o, 1000);
    }
}
