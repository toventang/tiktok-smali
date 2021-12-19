package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;

public interface RTCEglContextChecker extends EglBase.EglContextChecker {
    static {
        Covode.recordClassIndex(101054);
    }
}
