package com.google.android.datatransport.runtime.b;

import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(30907);
    }

    public static <TInput, TResult, TException extends Throwable> TResult a(int i2, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult a2;
        do {
            a2 = aVar.a(tinput);
            tinput = cVar.a(tinput, a2);
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 > 0);
        return a2;
    }
}
