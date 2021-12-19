package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14976a;

    static {
        Covode.recordClassIndex(8315);
    }

    q(Handler handler) {
        this.f14976a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14976a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(38);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
