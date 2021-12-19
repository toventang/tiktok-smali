package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import java.nio.ByteBuffer;

public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private long captureMs;
    private final int height;
    private RoiInfo mROIInfo;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    static {
        Covode.recordClassIndex(99679);
    }

    private static native void nativeCropAndScale(int i2, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer, int i8, int i9, int i10, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14);

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

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i2 = this.width;
        int i3 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i2, i3, i2, i3);
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(11391);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.o(11391);
            }
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        MethodCollector.i(11393);
        synchronized (this.refCountLock) {
            try {
                int i2 = this.refCount - 1;
                this.refCount = i2;
                if (i2 == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } finally {
                MethodCollector.o(11393);
            }
        }
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

    public NV12Buffer(int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i2;
        this.height = i3;
        this.stride = i4;
        this.sliceHeight = i5;
        this.buffer = byteBuffer;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(11569);
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i6, i7);
        nativeCropAndScale(i2, i3, i4, i5, i6, i7, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        MethodCollector.o(11569);
        return allocate;
    }
}
