package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14932a;

    static {
        Covode.recordClassIndex(8288);
    }

    public c(Handler handler) {
        this.f14932a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14932a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(22);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
