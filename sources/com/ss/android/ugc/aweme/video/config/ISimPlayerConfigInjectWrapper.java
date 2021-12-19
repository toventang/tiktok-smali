package com.ss.android.ugc.aweme.video.config;

import com.bytedance.covode.number.Covode;

public interface ISimPlayerConfigInjectWrapper {
    static {
        Covode.recordClassIndex(93824);
    }

    ISimPlayerConfig wrap(ISimPlayerConfig iSimPlayerConfig);
}
