package com.google.android.datatransport.runtime.b;

import com.bytedance.covode.number.Covode;

public interface c<TInput, TResult> {
    static {
        Covode.recordClassIndex(30908);
    }

    TInput a(TInput tinput, TResult tresult);
}
