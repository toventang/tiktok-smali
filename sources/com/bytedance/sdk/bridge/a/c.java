package com.bytedance.sdk.bridge.a;

import com.bytedance.covode.number.Covode;

public @interface c {
    static {
        Covode.recordClassIndex(26803);
    }

    String a();

    String b() default "protected";

    String c() default "ASYNC";
}
