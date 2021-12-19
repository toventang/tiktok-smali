package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

public @interface r {
    static {
        Covode.recordClassIndex(106490);
    }

    ThreadMode a() default ThreadMode.POSTING;

    boolean b() default false;

    int c() default 0;
}
