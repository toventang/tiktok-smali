package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public @interface WireFieldNoEnum {
    static {
        Covode.recordClassIndex(36140);
    }

    String adapter();

    String keyAdapter() default "";

    int label() default 1;

    boolean redacted() default false;

    int tag();
}
