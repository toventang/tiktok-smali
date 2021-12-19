package com.google.android.datatransport.runtime.b;

import com.bytedance.covode.number.Covode;
import java.lang.Throwable;

public interface a<TInput, TResult, TException extends Throwable> {
    static {
        Covode.recordClassIndex(30906);
    }

    TResult a(TInput tinput);
}
