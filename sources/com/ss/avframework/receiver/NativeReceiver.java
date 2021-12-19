package com.ss.avframework.receiver;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioDecoderFactory;
import com.ss.avframework.engine.Receiver;
import com.ss.avframework.engine.VideoDecoderFactory;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class NativeReceiver extends Receiver {
    static {
        Covode.recordClassIndex(100554);
    }

    private native int nativeAudioBuffer(ByteBuffer byteBuffer, boolean z, long j2);

    private native int nativeAudioBufferWithTimestampMs(ByteBuffer byteBuffer, boolean z, long j2, IntBuffer intBuffer);

    private native long nativeCreate(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory);

    private native void nativeRelease();

    @Override // com.ss.avframework.engine.Receiver
    public boolean isNativeReceiver() {
        return true;
    }

    @Override // com.ss.avframework.engine.Receiver
    public int readVideoBuffer(ByteBuffer byteBuffer) {
        return 0;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13832);
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0;
        }
        MethodCollector.o(13832);
    }

    @Override // com.ss.avframework.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z) {
        return readAudioBuffer(byteBuffer, z, null);
    }

    public NativeReceiver(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory) {
        MethodCollector.i(13785);
        nativeCreate(videoDecoderFactory, audioDecoderFactory);
        MethodCollector.o(13785);
    }

    @Override // com.ss.avframework.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z, IntBuffer intBuffer) {
        MethodCollector.i(13831);
        if (byteBuffer == null) {
            AVLog.logToIODevice2(6, "NativeReceiver", "readAudioBuffer null", new Throwable(), "NativeReceiver.readAudioBuffer", 100000);
            MethodCollector.o(13831);
            return -1;
        }
        int nativeAudioBufferWithTimestampMs = nativeAudioBufferWithTimestampMs(byteBuffer, z, this.mNativeObj, intBuffer);
        MethodCollector.o(13831);
        return nativeAudioBufferWithTimestampMs;
    }
}
