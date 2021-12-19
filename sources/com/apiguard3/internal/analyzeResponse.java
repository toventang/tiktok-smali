package com.apiguard3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class analyzeResponse extends Handler {
    private static int AGRequest = 1;
    private static int getBody;

    static {
        Covode.recordClassIndex(2535);
    }

    public analyzeResponse(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        APIGuard$Callback aPIGuard$Callback = (APIGuard$Callback) message.obj;
        if (aPIGuard$Callback != null) {
            APIGuard$InitializationCallback.getBody().getUrl(aPIGuard$Callback);
            int i2 = AGRequest + 111;
            getBody = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AGRequest + 105;
        getBody = i4 % 128;
        int i5 = i4 % 2;
    }
}
