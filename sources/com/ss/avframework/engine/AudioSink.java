package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.WrapperNativeAudioBuffer;
import java.nio.Buffer;

public abstract class AudioSink extends NativeObject {
    static {
        Covode.recordClassIndex(99811);
    }

    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
    }

    public abstract void onData(Buffer buffer, int i2, int i3, int i4, long j2);

    public abstract void onNoData();
}
