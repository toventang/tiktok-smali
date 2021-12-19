package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;

public @interface n {
    static {
        Covode.recordClassIndex(34950);
    }

    String[] a();

    String b() default "__default_type__";

    float c() default 0.0f;

    double d() default 0.0d;

    int e() default 0;
}
