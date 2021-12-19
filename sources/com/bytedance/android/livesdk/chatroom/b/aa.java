package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14950b = 7;

    static {
        Covode.recordClassIndex(8296);
    }

    aa(Handler handler) {
        this.f14949a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14949a;
        int i2 = this.f14950b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i2);
            obtainMessage.obj = obj;
            handler.sendMessage(obtainMessage);
        }
    }
}
