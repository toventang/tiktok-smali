package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

public interface RefCounted {
    static {
        Covode.recordClassIndex(15345);
    }

    void release();

    void retain();
}
