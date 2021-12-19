package com.bytedance.android.livesdk.util.rxutils.b;

import com.bytedance.covode.number.Covode;

public enum b {
    ATTACH,
    CREATE,
    CREATE_VIEW,
    START,
    RESUME,
    PAUSE,
    STOP,
    DESTROY_VIEW,
    DESTROY,
    DETACH;

    static {
        Covode.recordClassIndex(13096);
    }
}
