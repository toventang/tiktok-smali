package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.StreamIndex;

public interface ILocalEncodedVideoFrameObserver {
    static {
        Covode.recordClassIndex(101007);
    }

    void onLocalEncodedVideoFrame(StreamIndex streamIndex, RTCEncodedVideoFrame rTCEncodedVideoFrame);
}
