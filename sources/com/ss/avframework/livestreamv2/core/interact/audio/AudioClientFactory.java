package com.ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;

public interface AudioClientFactory {
    static {
        Covode.recordClassIndex(100235);
    }

    AudioClient create();

    void destroy(AudioClient audioClient);

    int getBitWidth();

    int getChannelCount();

    int getSampleRate();
}
