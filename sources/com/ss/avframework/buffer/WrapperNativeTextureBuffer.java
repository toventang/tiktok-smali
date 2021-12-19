package com.ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;

public class WrapperNativeTextureBuffer extends TextureBufferImpl implements VideoFrame.TextureBuffer {
    private long mNativeObj;

    static {
        Covode.recordClassIndex(99709);
    }

    private native void nativeRelease(long j2);

    private native void nativeRetain(long j2);

    private native VideoFrame.I420Buffer nativeToI420(long j2);

    @Override // com.ss.avframework.buffer.TextureBufferImpl, com.ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.i(14607);
        nativeRetain(this.mNativeObj);
        MethodCollector.o(14607);
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl, com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        MethodCollector.i(14604);
        VideoFrame.I420Buffer nativeToI420 = nativeToI420(this.mNativeObj);
        MethodCollector.o(14604);
        return nativeToI420;
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl, com.ss.avframework.buffer.VideoFrame.Buffer
    public synchronized void release() {
        MethodCollector.i(14606);
        nativeRelease(this.mNativeObj);
        MethodCollector.o(14606);
    }

    private void setROIInfoNative(long j2) {
        if (j2 != 0) {
            setROIInfo(new RoiInfo(j2));
        }
    }

    private static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (videoFrame == null || !(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0;
        }
        long j2 = ((WrapperNativeTextureBuffer) videoFrame.getBuffer()).mNativeObj;
        if (j2 != 0) {
            return j2;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    public WrapperNativeTextureBuffer(int i2, int i3, int i4, long j2) {
        this(i2, i3, i4, new Matrix(), j2);
        this.mNativeObj = j2;
    }

    public WrapperNativeTextureBuffer(int i2, int i3, int i4, Matrix matrix, long j2) {
        super(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i4, matrix, (TextureBufferImpl.ToI420Interface) null, (Runnable) null);
        this.mNativeObj = j2;
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl, com.ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 == i2 && i2 == 0 && i4 == i6 && i5 == i7) {
            retain();
            return this;
        }
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
