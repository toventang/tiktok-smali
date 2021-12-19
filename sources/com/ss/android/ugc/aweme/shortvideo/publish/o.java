package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

public enum o {
    UPLOAD_SDK("upload_sdk"),
    VESDK("vesdk"),
    SERVER("server"),
    CLIENT("client"),
    USER("user");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(85244);
    }

    private o(String str) {
        this.desc = str;
    }
}
