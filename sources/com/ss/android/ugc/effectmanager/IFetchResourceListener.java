package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

public interface IFetchResourceListener {
    static {
        Covode.recordClassIndex(95193);
    }

    void onFailure(Exception exc);

    void onSuccess(long j2);
}
