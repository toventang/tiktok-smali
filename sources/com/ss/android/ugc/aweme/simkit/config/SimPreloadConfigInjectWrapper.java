package com.ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;
import com.ss.android.ugc.aweme.video.preload.api.a.n;

public class SimPreloadConfigInjectWrapper implements IVideoPreloadConfigInjectWrapper {
    static {
        Covode.recordClassIndex(87315);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper
    public IVideoPreloadConfig wrap(IVideoPreloadConfig iVideoPreloadConfig) {
        return new n(new c(iVideoPreloadConfig));
    }
}
