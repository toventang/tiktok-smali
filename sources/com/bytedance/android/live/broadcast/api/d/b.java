package com.bytedance.android.live.broadcast.api.d;

import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(3711);
    }

    void beforeLiveCoreStartStream();

    void connected();

    void onCaptureFirstFrame();

    void onFirstRTMPConnect();

    void onInfo(float f2);

    void onNetworkLow();

    void onNetworkStatus(int i2);

    void onReconnect();

    void onReconnected();

    void onStreamEnd(int i2, int i3, String str);

    void onStreamStart();
}
