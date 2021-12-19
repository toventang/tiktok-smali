package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

/* access modifiers changed from: package-private */
public final /* synthetic */ class JavaI420Buffer$$Lambda$2 implements Runnable {
    private final VideoFrame.I420Buffer arg$1;

    static {
        Covode.recordClassIndex(106611);
    }

    private JavaI420Buffer$$Lambda$2(VideoFrame.I420Buffer i420Buffer) {
        this.arg$1 = i420Buffer;
    }

    static Runnable get$Lambda(VideoFrame.I420Buffer i420Buffer) {
        return new JavaI420Buffer$$Lambda$2(i420Buffer);
    }

    public final void run() {
        this.arg$1.release();
    }
}
