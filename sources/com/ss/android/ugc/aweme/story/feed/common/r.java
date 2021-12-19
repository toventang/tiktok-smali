package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;

public enum r {
    UNLOADING,
    LOADED,
    LOADING,
    PUBLISH;

    static {
        Covode.recordClassIndex(90099);
    }
}
