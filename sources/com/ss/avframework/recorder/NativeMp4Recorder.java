package com.ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.transport.MP4Transport;
import java.nio.ByteBuffer;

public class NativeMp4Recorder extends MP4Transport implements MediaRecorder {
    static {
        Covode.recordClassIndex(100556);
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int start() {
        nativeStartRecord();
        return 0;
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int stop() {
        nativeStopRecord();
        return 0;
    }

    @Override // com.ss.avframework.transport.NativeTransport, com.ss.avframework.engine.NativeObject, com.ss.avframework.recorder.MediaRecorder, com.ss.avframework.transport.MP4Transport
    public synchronized void release() {
        MethodCollector.i(13996);
        super.release();
        MethodCollector.o(13996);
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    public NativeMp4Recorder(boolean z, boolean z2) {
        super(z, z2);
    }

    @Override // com.ss.avframework.recorder.MediaRecorder
    public int writeSampleData(int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        throw new AndroidRuntimeException("Should not be here.");
    }
}
