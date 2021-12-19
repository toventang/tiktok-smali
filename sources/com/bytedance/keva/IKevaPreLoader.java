package com.bytedance.keva;

import com.bytedance.covode.number.Covode;

public interface IKevaPreLoader {
    static {
        Covode.recordClassIndex(24496);
    }

    void access(String str, int i2);

    void preload();
}
