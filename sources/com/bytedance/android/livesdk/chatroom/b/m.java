package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14972a;

    static {
        Covode.recordClassIndex(8311);
    }

    m(Handler handler) {
        this.f14972a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14972a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(32);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
