package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class om extends Handler {
    static {
        Covode.recordClassIndex(32045);
    }

    public om() {
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public om(Looper looper) {
        super(looper);
    }
}
