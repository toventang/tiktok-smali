package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class VideoStream implements RefCounted {
    private final Buffer buffer;
    private final int height;
    private final int width;

    public interface Buffer extends RefCounted {
        static {
            Covode.recordClassIndex(106718);
        }

        ByteBuffer getData();

        int getDataSize();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();
    }

    static {
        Covode.recordClassIndex(106717);
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public static ByteBuffer allocateDirectByteBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2);
    }

    public VideoStream(Buffer buffer2, int i2, int i3) {
        this.buffer = buffer2;
        this.width = i2;
        this.height = i3;
    }
}
