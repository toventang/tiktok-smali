package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.statics.StaticsReport;

public abstract class VideoSource extends MediaSource {
    static {
        Covode.recordClassIndex(99839);
    }

    private native VideoFrame.I420Buffer nativeGetBlackFrameBuffer(int i2, int i3);

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isScreenCast();

    public native void nativeAdaptedOutputFormat(int i2, int i3, int i4, boolean z);

    /* access modifiers changed from: protected */
    public native int nativeOnFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2);

    public VideoFrame.I420Buffer GetBlackFrameBuffer(int i2, int i3) {
        return nativeGetBlackFrameBuffer(i2, i3);
    }

    public void adaptOutputFormat(int i2, int i3, int i4, boolean z) {
        nativeAdaptedOutputFormat(i2, i3, i4, z);
    }
}
