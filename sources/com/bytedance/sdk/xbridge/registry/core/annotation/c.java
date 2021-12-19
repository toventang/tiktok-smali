package com.bytedance.sdk.xbridge.registry.core.annotation;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

public @interface c {
    static {
        Covode.recordClassIndex(26895);
    }

    boolean a() default false;

    String b() default "";

    Class<? extends XBaseModel> c() default XBaseModel.a.class;

    boolean d() default false;

    boolean e() default true;

    a f() default @a;
}
