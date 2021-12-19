package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.JniCommon;
import java.nio.ByteBuffer;

class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    private long captureMs;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private RoiInfo mROIInfo;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        Covode.recordClassIndex(99707);
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return null;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return false;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // com.ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        MethodCollector.i(12965);
        JniCommon.nativeReleaseRef(this.nativeBuffer);
        MethodCollector.o(12965);
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(14542);
        JniCommon.nativeAddRef(this.nativeBuffer);
        MethodCollector.o(14542);
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j2) {
        this.captureMs = j2;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return VideoFrame.cropAndScaleI420(this, i2, i3, i4, i5, i6, i7);
    }

    WrappedNativeI420Buffer(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, long j2) {
        this.width = i2;
        this.height = i3;
        this.dataY = byteBuffer;
        this.strideY = i4;
        this.dataU = byteBuffer2;
        this.strideU = i5;
        this.dataV = byteBuffer3;
        this.strideV = i6;
        this.nativeBuffer = j2;
        retain();
    }
}
