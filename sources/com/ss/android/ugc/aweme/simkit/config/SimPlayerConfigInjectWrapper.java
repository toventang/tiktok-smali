package com.ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;

public class SimPlayerConfigInjectWrapper implements ISimPlayerConfigInjectWrapper {
    static {
        Covode.recordClassIndex(87314);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper
    public ISimPlayerConfig wrap(ISimPlayerConfig iSimPlayerConfig) {
        return new b(iSimPlayerConfig);
    }
}
