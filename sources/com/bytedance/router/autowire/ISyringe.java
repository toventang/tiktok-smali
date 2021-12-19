package com.bytedance.router.autowire;

import com.bytedance.covode.number.Covode;

public interface ISyringe {
    static {
        Covode.recordClassIndex(26177);
    }

    void inject(Object obj);
}
