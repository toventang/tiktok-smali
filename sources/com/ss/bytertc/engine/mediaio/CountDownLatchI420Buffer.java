package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;

public class CountDownLatchI420Buffer implements VideoFrame.I420Buffer {
    private final JavaI420Buffer buffer;
    private final CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private Runnable mCustomReleaseCallback;

    static {
        Covode.recordClassIndex(101005);
    }

    public CountDownLatch getLatch() {
        return this.mCountDownLatch;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.buffer.getHeight();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.buffer.getWidth();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        this.buffer.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.buffer.toI420();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$CountDownLatchI420Buffer(Runnable runnable) {
        this.mCountDownLatch.countDown();
        if (this.mCustomReleaseCallback != null) {
            runnable.run();
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i2, int i3, int i4, int i5) {
        return this.buffer.scaleAndFill(i2, i3, i4, i5);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i2, int i3, int i4, int i5, int i6, int i7) {
        return this.buffer.cropAndScale(i2, i3, i4, i5, i6, i7);
    }

    public static CountDownLatchI420Buffer wrap(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, Runnable runnable) {
        return new CountDownLatchI420Buffer(i2, i3, byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, runnable);
    }

    private CountDownLatchI420Buffer(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, Runnable runnable) {
        this.mCustomReleaseCallback = runnable;
        this.buffer = JavaI420Buffer.wrap(i2, i3, byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, new CountDownLatchI420Buffer$$Lambda$0(this, runnable));
    }
}
