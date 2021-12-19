package com.ss.android.ugc.aweme.lego.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class c extends Handler {
    static {
        Covode.recordClassIndex(68727);
    }

    public c() {
    }

    public final void a() {
        a(1205, 15000);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Handler.Callback callback) {
        super(callback);
        l.d(callback, "");
    }

    public final void a(int i2, long j2) {
        Message obtainMessage = obtainMessage();
        l.b(obtainMessage, "");
        obtainMessage.what = i2;
        obtainMessage.obj = null;
        removeMessages(i2);
        sendMessageDelayed(obtainMessage, j2);
    }
}
