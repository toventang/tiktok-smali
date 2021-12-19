package com.ss.avframework.livestreamv2.recorder;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.engine.VideoSink;

/* access modifiers changed from: package-private */
public class RecordVideoSink extends VideoCapturer {
    private int mFps;
    private int mHeight;
    private int mStatus = 0;
    private VideoSink mVideoSink = new VideoSink() {
        /* class com.ss.avframework.livestreamv2.recorder.RecordVideoSink.AnonymousClass1 */

        static {
            Covode.recordClassIndex(100437);
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RecordVideoSink.this.onFrame(videoFrame.getBuffer(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
        }
    };
    private int mWidth;

    static {
        Covode.recordClassIndex(100436);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
    }

    public VideoSink getVideoSink() {
        return this.mVideoSink;
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(14581);
        stop();
        super.release();
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            videoSink.release();
            this.mVideoSink = null;
        }
        MethodCollector.o(14581);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void start(int i2, int i3, int i4) {
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFps = i4;
        nativeAdaptedOutputFormat(i2, i3, i4, false);
        this.mStatus = 1;
    }

    public int pushVideoFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
        return onFrame(buffer, i2, i3, i4, j2);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
        if (this.mStatus == 1) {
            return super.onFrame(buffer, i2, i3, i4, j2);
        }
        return -1;
    }
}
