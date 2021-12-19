package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

public interface IFetchModelListener {
    static {
        Covode.recordClassIndex(95192);
    }

    void onFailed(Exception exc);

    void onSuccess(String[] strArr);
}
