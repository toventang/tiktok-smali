package com.ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;

public interface ICrashEffectIdInfoListener {
    static {
        Covode.recordClassIndex(79750);
    }

    void setEffectIdInfo(String str, String str2);
}
