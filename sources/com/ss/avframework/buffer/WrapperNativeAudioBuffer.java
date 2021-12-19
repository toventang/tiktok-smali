package com.ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

public class WrapperNativeAudioBuffer {
    public int mChannel;
    private long mNativeBuffer;
    public int mSampleRateHz;
    public int mSamplesPerChannel;
    public long timestampUs;

    static {
        Covode.recordClassIndex(99708);
    }

    public static ByteBuffer getDirectBuffer(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
        return null;
    }

    public synchronized long extract() {
        long j2;
        MethodCollector.i(14558);
        j2 = this.mNativeBuffer;
        this.mNativeBuffer = 0;
        MethodCollector.o(14558);
        return j2;
    }

    public WrapperNativeAudioBuffer(long j2, int i2, int i3, int i4, long j3) {
        this.mNativeBuffer = j2;
        this.mSamplesPerChannel = i2;
        this.mSampleRateHz = i3;
        this.mChannel = i4;
        this.timestampUs = j3;
    }
}
