package com.bytedance.sdk.xbridge.registry.core.annotation;

import com.bytedance.covode.number.Covode;

public @interface a {
    static {
        Covode.recordClassIndex(26893);
    }

    DefaultType a() default DefaultType.NONE;

    double b() default 0.0d;

    String c() default "";

    int d() default 0;

    boolean e() default false;

    long f() default 0;
}
