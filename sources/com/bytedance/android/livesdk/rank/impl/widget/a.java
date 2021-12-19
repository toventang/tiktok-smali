package com.bytedance.android.livesdk.rank.impl.widget;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public enum a implements Serializable {
    BOTH_NON_REVENUE,
    BOTH_REVENUE,
    SELF_NON_ANCHOR_REVENUE,
    SELF_REVENUE_ANCHOR_NON;

    static {
        Covode.recordClassIndex(12459);
    }
}
