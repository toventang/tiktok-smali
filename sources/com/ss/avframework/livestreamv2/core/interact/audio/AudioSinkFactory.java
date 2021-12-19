package com.ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;

public interface AudioSinkFactory {
    static {
        Covode.recordClassIndex(100237);
    }

    AudioSink create(String str);

    void destroy(AudioSink audioSink);

    int getBitWidth();

    int getChannelCount();

    int getIntervalMs();

    int getSampleRate();
}
