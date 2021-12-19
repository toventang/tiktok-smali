package com.bytedance.ies.lynx.lynx_adapter.annotation;

import com.bytedance.covode.number.Covode;

public @interface LynxPropWrapper {
    static {
        Covode.recordClassIndex(20424);
    }

    String name();
}
