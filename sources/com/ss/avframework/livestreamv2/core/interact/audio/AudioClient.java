package com.ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;

public interface AudioClient {
    static {
        Covode.recordClassIndex(100234);
    }

    Statistics getStatistics();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
