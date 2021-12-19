package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.JniCommon;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private long captureMs;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private RoiInfo mROIInfo;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        Covode.recordClassIndex(99677);
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
    public void retain() {
        MethodCollector.i(13469);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.o(13469);
            }
        }
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        MethodCollector.i(13470);
        synchronized (this.refCountLock) {
            try {
                int i2 = this.refCount - 1;
                this.refCount = i2;
                if (i2 == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } finally {
                MethodCollector.o(13470);
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

    public static JavaI420Buffer allocate(int i2, int i3) {
        MethodCollector.i(12509);
        int i4 = (i3 + 1) / 2;
        int i5 = (i2 + 1) / 2;
        int i6 = i2 * i3;
        int i7 = i6 + 0;
        int i8 = i5 * i4;
        int i9 = i7 + i8;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i6 + (i5 * 2 * i4));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i9);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i9);
        nativeAllocateByteBuffer.limit(i9 + i8);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i2, i3, slice, i2, slice2, i5, nativeAllocateByteBuffer.slice(), i5, new Runnable() {
            /* class com.ss.avframework.buffer.JavaI420Buffer.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99678);
            }

            public final void run() {
                MethodCollector.i(14638);
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                MethodCollector.o(14638);
            }
        });
        MethodCollector.o(12509);
        return javaI420Buffer;
    }

    @Override // com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return VideoFrame.cropAndScaleI420(this, i2, i3, i4, i5, i6, i7);
    }

    private JavaI420Buffer(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, Runnable runnable) {
        this.width = i2;
        this.height = i3;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i4;
        this.strideU = i5;
        this.strideV = i6;
        this.releaseCallback = runnable;
        this.captureMs = TimeUtils.currentTimeMs();
        this.refCount = 1;
    }

    public static JavaI420Buffer wrap(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i7 = (i3 + 1) / 2;
            int i8 = i4 * i3;
            int i9 = i5 * i7;
            int i10 = i7 * i6;
            if (slice.capacity() < i8) {
                throw new IllegalArgumentException("Y-buffer must be at least " + i8 + " bytes.");
            } else if (slice2.capacity() < i9) {
                throw new IllegalArgumentException("U-buffer must be at least " + i9 + " bytes.");
            } else if (slice3.capacity() >= i10) {
                return new JavaI420Buffer(i2, i3, slice, i4, slice2, i5, slice3, i6, runnable);
            } else {
                throw new IllegalArgumentException("V-buffer must be at least " + i10 + " bytes.");
            }
        }
    }

    public static JavaI420Buffer wrap(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, long j2, Runnable runnable) {
        JavaI420Buffer wrap = wrap(i2, i3, byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, runnable);
        wrap.captureMs = j2;
        return wrap;
    }
}
