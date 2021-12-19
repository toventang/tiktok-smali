package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class VideoTrack extends MediaTrack {
    protected VideoProcessor mVideoProcessor;

    static {
        Covode.recordClassIndex(99840);
    }

    /* access modifiers changed from: protected */
    public native void nativeSetVideoProcessor(VideoProcessor videoProcessor);

    @Override // com.ss.avframework.engine.MediaTrack
    public synchronized void release() {
        MethodCollector.i(11819);
        super.release();
        VideoProcessor videoProcessor = this.mVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.release();
        }
        MethodCollector.o(11819);
    }

    @Override // com.ss.avframework.engine.MediaTrack
    public void addVideoSink(VideoSink videoSink) {
        super.addVideoSink(videoSink);
    }

    @Override // com.ss.avframework.engine.MediaTrack
    public void removeVideoSink(VideoSink videoSink) {
        super.removeVideoSink(videoSink);
    }

    @Override // com.ss.avframework.engine.MediaTrack
    public boolean containVideoSink(VideoSink videoSink) {
        return super.containVideoSink(videoSink);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        MethodCollector.i(11818);
        this.mVideoProcessor = videoProcessor;
        nativeSetVideoProcessor(videoProcessor);
        MethodCollector.o(11818);
    }

    public VideoTrack(long j2, MediaSource mediaSource) {
        super(j2, mediaSource);
    }
}
