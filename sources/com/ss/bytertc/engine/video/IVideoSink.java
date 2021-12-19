package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;

public interface IVideoSink {
    static {
        Covode.recordClassIndex(101077);
    }

    void onFrame(RTCVideoFrame rTCVideoFrame);
}
