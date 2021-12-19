package com.ss.android.ugc.aweme.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

public interface e {
    static {
        Covode.recordClassIndex(78232);
    }

    long getMaxShootingDuration();

    long getMaxShootingDuration(boolean z, ShortVideoContext shortVideoContext);

    long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j2);
}
