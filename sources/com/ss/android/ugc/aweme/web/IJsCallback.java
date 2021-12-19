package com.ss.android.ugc.aweme.web;

import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;

public interface IJsCallback<T> {
    static {
        Covode.recordClassIndex(94722);
    }

    T get();

    ResultReceiver getResultReceiver();
}
