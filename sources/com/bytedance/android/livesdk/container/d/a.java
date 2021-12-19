package com.bytedance.android.livesdk.container.d;

import com.bytedance.covode.number.Covode;

public enum a {
    WEB_VIEW("webview"),
    LYNX("lynxview");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(9305);
    }

    private a(String str) {
        this.type = str;
    }
}
