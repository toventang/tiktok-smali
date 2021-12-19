package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14971a;

    static {
        Covode.recordClassIndex(8310);
    }

    l(Handler handler) {
        this.f14971a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14971a;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(32));
        }
    }
}
