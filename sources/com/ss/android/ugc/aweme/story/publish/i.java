package com.ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;

public enum i {
    SUCCESS,
    FAILED,
    CANCEL,
    UPLOADING,
    DEFAULT;

    static {
        Covode.recordClassIndex(90339);
    }
}
