package com.ss.android.medialib.listener;

import com.bytedance.covode.number.Covode;

public interface DistortionInfoCallback {
    static {
        Covode.recordClassIndex(36890);
    }

    void onResult(String str, String str2);
}
