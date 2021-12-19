package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;

public @interface m {
    static {
        Covode.recordClassIndex(34949);
    }

    String a();

    String b() default "__default_type__";

    double c() default 0.0d;

    float d() default 0.0f;

    int e() default 0;

    boolean f() default false;
}
