package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import java.nio.ByteBuffer;

public class NV21Buffer implements VideoFrame.Buffer {
    private long captureMs;
    private final byte[] data;
    private final int height;
    private RoiInfo mROIInfo;
    private int refCount = 1;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int width;

    static {
        Covode.recordClassIndex(99680);
    }

    private static native void nativeCropAndScale(int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr, int i8, int i9, ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12);

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
        MethodCollector.i(12511);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.o(12511);
            }
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        MethodCollector.i(12617);
        synchronized (this.refCountLock) {
            try {
                int i2 = this.refCount - 1;
                this.refCount = i2;
                if (i2 == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } finally {
                MethodCollector.o(12617);
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

    public NV21Buffer(byte[] bArr, int i2, int i3, Runnable runnable) {
        this.data = bArr;
        this.width = i2;
        this.height = i3;
        this.releaseCallback = runnable;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(12619);
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i6, i7);
        nativeCropAndScale(i2, i3, i4, i5, i6, i7, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        MethodCollector.o(12619);
        return allocate;
    }
}
