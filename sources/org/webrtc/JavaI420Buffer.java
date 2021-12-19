package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        Covode.recordClassIndex(106608);
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, int i6, int i7, int i8, ByteBuffer byteBuffer4, int i9, ByteBuffer byteBuffer5, int i10, ByteBuffer byteBuffer6, int i11, int i12, int i13);

    private static native void nativeScaleAndFillI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, int i6, ByteBuffer byteBuffer4, int i7, ByteBuffer byteBuffer5, int i8, ByteBuffer byteBuffer6, int i9, int i10, int i11, int i12, int i13);

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
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        this.refCountDelegate.retain();
    }

    static final /* synthetic */ void lambda$allocate$0$JavaI420Buffer(ByteBuffer byteBuffer) {
        MethodCollector.i(9801);
        JniCommon.nativeFreeByteBuffer(byteBuffer);
        MethodCollector.o(9801);
    }

    static final /* synthetic */ void lambda$allocate$1$JavaI420Buffer(ByteBuffer byteBuffer) {
        MethodCollector.i(9800);
        JniCommon.nativeFreeByteBuffer(byteBuffer);
        MethodCollector.o(9800);
    }

    public static JavaI420Buffer allocate(int i2, int i3) {
        MethodCollector.i(8890);
        int i4 = (i3 + 1) / 2;
        int i5 = (i2 + 1) / 2;
        int i6 = i2 * i3;
        int i7 = i6 + 0;
        int i8 = i5 * i4;
        int i9 = i7 + i8;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i6 + (i5 * 2 * i4));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i9);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i9);
        nativeAllocateByteBuffer.limit(i9 + i8);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i2, i3, slice, i2, slice2, i5, nativeAllocateByteBuffer.slice(), i5, new JavaI420Buffer$$Lambda$0(nativeAllocateByteBuffer));
        MethodCollector.o(8890);
        return javaI420Buffer;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i2, int i3, int i4, int i5) {
        return scaleAndFillI420(this, i2, i3, i4, i5);
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5 = (i4 * (i3 - 1)) + i2;
        if (byteBuffer.capacity() < i5) {
            throw new IllegalArgumentException("Buffer must be at least " + i5 + " bytes, but was " + byteBuffer.capacity());
        }
    }

    public static JavaI420Buffer allocate(int i2, int i3, int i4, int i5) {
        MethodCollector.i(9079);
        int i6 = i4 / 2;
        int i7 = i4 * i5;
        int i8 = i7 + 0;
        int i9 = i6 * i5;
        int i10 = (i9 / 2) + i8;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i7 + (i6 * 2 * i5));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        nativeAllocateByteBuffer.limit(i10);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i10);
        nativeAllocateByteBuffer.limit(i10 + i9);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i2, i3, slice, i4, slice2, i6, nativeAllocateByteBuffer.slice(), i6, new JavaI420Buffer$$Lambda$1(nativeAllocateByteBuffer));
        MethodCollector.o(9079);
        return javaI420Buffer;
    }

    public static VideoFrame.Buffer scaleAndFillI420(VideoFrame.I420Buffer i420Buffer, int i2, int i3, int i4, int i5) {
        MethodCollector.i(9624);
        JavaI420Buffer allocate = allocate(i2, i3);
        nativeScaleAndFillI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i420Buffer.getWidth(), i420Buffer.getHeight(), allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i2, i3, i4, i5);
        MethodCollector.o(9624);
        return allocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return cropAndScaleI420(this, i2, i3, i4, i5, i6, i7);
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i2, int i3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(9277);
        if (i4 == i6 && i5 == i7) {
            ByteBuffer dataY2 = i420Buffer.getDataY();
            ByteBuffer dataU2 = i420Buffer.getDataU();
            ByteBuffer dataV2 = i420Buffer.getDataV();
            dataY2.position((i420Buffer.getStrideY() * i3) + i2);
            int i8 = i2 / 2;
            int i9 = i3 / 2;
            dataU2.position((i420Buffer.getStrideU() * i9) + i8);
            dataV2.position(i8 + (i9 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            ByteBuffer slice = dataY2.slice();
            int strideY2 = i420Buffer.getStrideY();
            ByteBuffer slice2 = dataU2.slice();
            int strideU2 = i420Buffer.getStrideU();
            ByteBuffer slice3 = dataV2.slice();
            int strideV2 = i420Buffer.getStrideV();
            i420Buffer.getClass();
            JavaI420Buffer wrap = wrap(i6, i7, slice, strideY2, slice2, strideU2, slice3, strideV2, JavaI420Buffer$$Lambda$2.get$Lambda(i420Buffer));
            MethodCollector.o(9277);
            return wrap;
        }
        JavaI420Buffer allocate = allocate(i6, i7);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i2, i3, i4, i5, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i6, i7);
        MethodCollector.o(9277);
        return allocate;
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
        this.refCountDelegate = new RefCountDelegate(runnable);
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
            int i7 = (i2 + 1) / 2;
            int i8 = (i3 + 1) / 2;
            checkCapacity(slice, i2, i3, i4);
            checkCapacity(slice2, i7, i8, i5);
            checkCapacity(slice3, i7, i8, i6);
            return new JavaI420Buffer(i2, i3, slice, i4, slice2, i5, slice3, i6, runnable);
        }
    }
}
