package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;

public interface ILiveRtcEventObserver {
    static {
        Covode.recordClassIndex(100975);
    }

    void onLiveTranscodingResult(String str, int i2);

    void onStreamAdd(RTCStream rTCStream);

    void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason);
}
