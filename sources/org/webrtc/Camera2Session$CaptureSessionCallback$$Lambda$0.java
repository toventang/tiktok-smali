package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.Camera2Session;

final /* synthetic */ class Camera2Session$CaptureSessionCallback$$Lambda$0 implements VideoSink {
    private final Camera2Session.CaptureSessionCallback arg$1;

    static {
        Covode.recordClassIndex(106521);
    }

    Camera2Session$CaptureSessionCallback$$Lambda$0(Camera2Session.CaptureSessionCallback captureSessionCallback) {
        this.arg$1 = captureSessionCallback;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        this.arg$1.lambda$onConfigured$0$Camera2Session$CaptureSessionCallback(videoFrame);
    }
}
