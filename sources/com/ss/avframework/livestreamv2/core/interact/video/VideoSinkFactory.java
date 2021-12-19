package com.ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;

public interface VideoSinkFactory {
    static {
        Covode.recordClassIndex(100306);
    }

    VideoSink create(String str, boolean z, boolean z2, boolean z3);

    void destroy(VideoSink videoSink);
}
