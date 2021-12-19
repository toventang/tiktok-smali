package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14970a;

    static {
        Covode.recordClassIndex(8309);
    }

    public k(Handler handler) {
        this.f14970a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14970a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
