package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;

public abstract class AudioPlayer extends AudioSink {
    static {
        Covode.recordClassIndex(99809);
    }
}
