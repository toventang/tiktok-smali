package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14978a;

    static {
        Covode.recordClassIndex(8317);
    }

    public s(Handler handler) {
        this.f14978a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14978a;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(39);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
