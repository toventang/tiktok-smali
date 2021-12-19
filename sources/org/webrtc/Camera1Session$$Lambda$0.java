package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class Camera1Session$$Lambda$0 implements VideoSink {
    private final Camera1Session arg$1;

    static {
        Covode.recordClassIndex(106508);
    }

    Camera1Session$$Lambda$0(Camera1Session camera1Session) {
        this.arg$1 = camera1Session;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        this.arg$1.lambda$listenForTextureFrames$0$Camera1Session(videoFrame);
    }
}
