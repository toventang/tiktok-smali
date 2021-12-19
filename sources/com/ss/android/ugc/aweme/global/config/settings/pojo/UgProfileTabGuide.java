package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgProfileTabGuide {
    @c(a = "bubble")
    private UgBubble bubble;

    static {
        Covode.recordClassIndex(63098);
    }

    public UgBubble getBubble() {
        UgBubble ugBubble = this.bubble;
        if (ugBubble != null) {
            return ugBubble;
        }
        throw new a();
    }
}
