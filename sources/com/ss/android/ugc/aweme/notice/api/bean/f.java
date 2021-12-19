package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;

public enum f {
    DEFAULT,
    SYSTEM,
    SOCIAL,
    NOTICE,
    LIVE,
    BC;

    static {
        Covode.recordClassIndex(72421);
    }
}
