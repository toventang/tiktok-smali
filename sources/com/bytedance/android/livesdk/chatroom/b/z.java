package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14989a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14990b = 7;

    static {
        Covode.recordClassIndex(8324);
    }

    z(Handler handler) {
        this.f14989a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14989a;
        int i2 = this.f14990b;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i2);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }
}
