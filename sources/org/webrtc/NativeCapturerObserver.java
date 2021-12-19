package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.VideoFrame;

class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    static {
        Covode.recordClassIndex(106630);
    }

    private static native void nativeCapturerStarted(long j2, boolean z);

    private static native void nativeCapturerStopped(long j2);

    private static native void nativeOnFrameCaptured(long j2, int i2, int i3, int i4, long j3, VideoFrame.Buffer buffer);

    @Override // org.webrtc.CapturerObserver
    public void onCapturerError(String str) {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        MethodCollector.i(13195);
        nativeCapturerStopped(this.nativeSource);
        MethodCollector.o(13195);
    }

    public NativeCapturerObserver(long j2) {
        this.nativeSource = j2;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        MethodCollector.i(13194);
        nativeCapturerStarted(this.nativeSource, z);
        MethodCollector.o(13194);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        MethodCollector.i(13270);
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
        MethodCollector.o(13270);
    }
}
