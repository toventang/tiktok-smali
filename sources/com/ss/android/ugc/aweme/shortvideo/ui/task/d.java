package com.ss.android.ugc.aweme.shortvideo.ui.task;

import com.bytedance.covode.number.Covode;

public enum d {
    RECORD_ON_NONE,
    RECORD_ON_CREATE,
    RECORD_ON_RESUME,
    RECORD_ON_FIRST_FRAME,
    RECORD_ON_UI_SHOW,
    RECORD_ON_DESTROY;

    static {
        Covode.recordClassIndex(86435);
    }
}
