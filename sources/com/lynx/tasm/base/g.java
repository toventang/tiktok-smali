package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

public enum g {
    JS,
    Native,
    JS_EXT,
    JAVA;

    static {
        Covode.recordClassIndex(34880);
    }
}
