package com.ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;

public interface VideoClientFactory {
    static {
        Covode.recordClassIndex(100304);
    }

    VideoClient create();

    void destroy(VideoClient videoClient);
}
