package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class t implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14979a;

    static {
        Covode.recordClassIndex(8318);
    }

    public t(Handler handler) {
        this.f14979a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14979a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(39);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
