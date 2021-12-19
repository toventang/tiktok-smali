package com.google.android.gms.internal.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public class g extends Handler {
    static {
        Covode.recordClassIndex(31563);
    }

    public g() {
    }

    public g(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                if ("Unknown authority com.google.android.gms.chimera".equals(th.getMessage())) {
                    return;
                }
            } else if ((th instanceof IllegalStateException) && "Nonexistent connection status for service config: com.google.android.gms.auth.api.identity.service.signin.START".equals(th.getMessage())) {
                return;
            }
            throw th;
        }
    }

    public g(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
