package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

public enum r {
    COMPILE("compile"),
    UPLOAD("upload"),
    AUTH_KEY("auth_key"),
    COVER_TEXT_UPLOAD("cover_text_upload"),
    CREATE_AWEME("create_aweme");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(85247);
    }

    private r(String str) {
        this.desc = str;
    }
}
