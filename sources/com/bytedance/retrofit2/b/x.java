package com.bytedance.retrofit2.b;

import com.bytedance.covode.number.Covode;

public @interface x {
    static {
        Covode.recordClassIndex(25999);
    }

    String a();

    boolean b() default true;
}
