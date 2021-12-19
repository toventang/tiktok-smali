package com.bytedance.realx;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

public final class RXNativeFunctions {
    static {
        Covode.recordClassIndex(25927);
    }

    public static native void nativeOnCapturerError(long j2, int i2);

    public static native void nativeOnCapturerStarted(long j2, boolean z);

    public static native void nativeOnCapturerStopped(long j2);

    public static native void nativeOnFrameCaptured(long j2, VideoFrame videoFrame);
}
