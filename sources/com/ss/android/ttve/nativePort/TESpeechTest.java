package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TESpeechTest {
    private long handle;

    static {
        Covode.recordClassIndex(37730);
    }

    private static native long createSpeechUtils();

    private static native void init(long j2);

    private static native int process(long j2, short[] sArr, int i2);

    private static native int stop(long j2);

    public void init() {
        MethodCollector.i(9665);
        init(this.handle);
        MethodCollector.o(9665);
    }

    public int stop() {
        MethodCollector.i(8055);
        int stop = stop(this.handle);
        MethodCollector.o(8055);
        return stop;
    }

    public static TESpeechTest create() {
        MethodCollector.i(9662);
        TESpeechTest tESpeechTest = new TESpeechTest();
        tESpeechTest.handle = createSpeechUtils();
        MethodCollector.o(9662);
        return tESpeechTest;
    }

    public int process(short[] sArr, int i2) {
        MethodCollector.i(9667);
        int process = process(this.handle, sArr, i2);
        MethodCollector.o(9667);
        return process;
    }
}
