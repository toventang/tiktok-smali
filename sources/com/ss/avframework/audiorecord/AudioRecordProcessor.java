package com.ss.avframework.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.NativeObject;
import java.nio.ByteBuffer;

public class AudioRecordProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99675);
    }

    private native int nativeAudioRecordInit(String str, int i2, int i3, int i4);

    private native int nativeAudioRecordWritePcm(ByteBuffer byteBuffer);

    private native int nativeCreate();

    private native void nativeStopAudioRecord();

    public AudioRecordProcessor() {
        MethodCollector.i(13456);
        nativeCreate();
        MethodCollector.o(13456);
    }

    public void stopRecord() {
        MethodCollector.i(13453);
        nativeStopAudioRecord();
        MethodCollector.o(13453);
    }

    public void writePcm(ByteBuffer byteBuffer) {
        MethodCollector.i(13455);
        nativeAudioRecordWritePcm(byteBuffer);
        MethodCollector.o(13455);
    }

    public int init(String str, int i2, int i3, int i4) {
        MethodCollector.i(13457);
        int nativeAudioRecordInit = nativeAudioRecordInit(str, i2, i3, i4);
        MethodCollector.o(13457);
        return nativeAudioRecordInit;
    }
}
