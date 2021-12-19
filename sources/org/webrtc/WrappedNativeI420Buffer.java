package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        Covode.recordClassIndex(106719);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        MethodCollector.i(9528);
        JniCommon.nativeReleaseRef(this.nativeBuffer);
        MethodCollector.o(9528);
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(9527);
        JniCommon.nativeAddRef(this.nativeBuffer);
        MethodCollector.o(9527);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i2, int i3, int i4, int i5) {
        return JavaI420Buffer.scaleAndFillI420(this, i2, i3, i4, i5);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return JavaI420Buffer.cropAndScaleI420(this, i2, i3, i4, i5, i6, i7);
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
