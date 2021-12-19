package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import org.webrtc.VideoStream;

class WrappedNativeStreamBuffer implements VideoStream.Buffer {
    private final ByteBuffer data;
    private final long nativeBuffer;
    private final int size;

    static {
        Covode.recordClassIndex(106720);
    }

    @Override // org.webrtc.VideoStream.Buffer
    public int getDataSize() {
        return this.size;
    }

    @Override // org.webrtc.VideoStream.Buffer
    public ByteBuffer getData() {
        return this.data.slice();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoStream.Buffer
    public void release() {
        MethodCollector.i(10066);
        JniCommon.nativeReleaseRef(this.nativeBuffer);
        MethodCollector.o(10066);
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoStream.Buffer
    public void retain() {
        MethodCollector.i(9895);
        JniCommon.nativeAddRef(this.nativeBuffer);
        MethodCollector.o(9895);
    }

    WrappedNativeStreamBuffer(int i2, ByteBuffer byteBuffer, long j2) {
        this.size = i2;
        this.data = byteBuffer;
        this.nativeBuffer = j2;
        retain();
    }
}
