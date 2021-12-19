package com.ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;

public interface VideoClient {
    static {
        Covode.recordClassIndex(100303);
    }

    Statistics getStatistics();

    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
