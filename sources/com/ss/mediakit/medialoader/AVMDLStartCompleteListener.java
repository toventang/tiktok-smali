package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public interface AVMDLStartCompleteListener {
    static {
        Covode.recordClassIndex(101123);
    }

    void onStartComplete();
}
