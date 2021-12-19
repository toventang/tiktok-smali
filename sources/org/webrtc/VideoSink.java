package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface VideoSink {
    static {
        Covode.recordClassIndex(106716);
    }

    void onFrame(VideoFrame videoFrame);
}
