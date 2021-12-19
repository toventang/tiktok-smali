package com.facebook.d;

import com.bytedance.covode.number.Covode;

public interface e<T> {
    static {
        Covode.recordClassIndex(28711);
    }

    void onCancellation(c<T> cVar);

    void onFailure(c<T> cVar);

    void onNewResult(c<T> cVar);

    void onProgressUpdate(c<T> cVar);
}
