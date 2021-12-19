package com.ss.avframework.livestreamv2.capture;

import com.bytedance.covode.number.Covode;

public interface CameraObserver {
    static {
        Covode.recordClassIndex(99958);
    }

    void onCaptureStarted(int i2, int i3);

    void onCaptureStopped(int i2);

    void onError(int i2, String str);

    void onInfo(int i2, int i3, String str);
}
