package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IAVScreenAdaptService {
    static {
        Covode.recordClassIndex(79624);
    }

    void calculateAdaptPlan(Context context);
}
