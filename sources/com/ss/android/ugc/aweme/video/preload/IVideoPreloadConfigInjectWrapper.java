package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;

public interface IVideoPreloadConfigInjectWrapper {
    static {
        Covode.recordClassIndex(93896);
    }

    IVideoPreloadConfig wrap(IVideoPreloadConfig iVideoPreloadConfig);
}
