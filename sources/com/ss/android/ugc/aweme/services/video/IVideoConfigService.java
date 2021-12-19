package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

public interface IVideoConfigService {
    static {
        Covode.recordClassIndex(79850);
    }

    int getVideoHeight();

    int getVideoWidth();

    void invalidate();
}
