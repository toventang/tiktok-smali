package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14975a;

    static {
        Covode.recordClassIndex(8314);
    }

    p(Handler handler) {
        this.f14975a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14975a;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(38);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
