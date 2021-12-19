package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.chatroom.b.c;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f17802a;

    static {
        Covode.recordClassIndex(9883);
    }

    l(c cVar) {
        this.f17802a = cVar;
    }

    public final void run() {
        this.f17802a.onMessageFinish();
    }
}
