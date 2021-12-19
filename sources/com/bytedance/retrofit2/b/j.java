package com.bytedance.retrofit2.b;

import com.bytedance.covode.number.Covode;

public @interface j {
    static {
        Covode.recordClassIndex(25985);
    }

    String a();

    String b() default "";

    boolean c() default false;
}
