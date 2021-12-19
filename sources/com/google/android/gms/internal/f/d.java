package com.google.android.gms.internal.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static e f50601a;

    static {
        Covode.recordClassIndex(31574);
    }

    public d() {
    }

    public d(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        if (f50601a == null) {
            super.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    public boolean sendMessageAtTime(Message message, long j2) {
        return super.sendMessageAtTime(message, j2);
    }

    public d(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
