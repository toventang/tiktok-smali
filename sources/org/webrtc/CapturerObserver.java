package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface CapturerObserver {
    static {
        Covode.recordClassIndex(106553);
    }

    void onCapturerError(String str);

    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
