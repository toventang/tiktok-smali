package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ITakeInSameOptimize {
    static {
        Covode.recordClassIndex(79481);
    }

    boolean enableCombineMusicAndEffectDownload();

    boolean enableTakeInSameRecordOptimize(Context context);
}
