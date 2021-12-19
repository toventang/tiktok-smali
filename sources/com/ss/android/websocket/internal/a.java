package com.ss.android.websocket.internal;

import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(99665);
    }

    int getMethod();

    byte[] getPayload();

    String getPayloadEncoding();

    String getPayloadType();

    int getService();
}
