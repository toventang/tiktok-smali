package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;

public interface FetchResourcesListener {
    static {
        Covode.recordClassIndex(95213);
    }

    void onFailed(Exception exc);

    void onSuccess();
}
