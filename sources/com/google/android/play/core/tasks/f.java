package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutionException;

public final class f {
    static {
        Covode.recordClassIndex(32968);
    }

    public static <ResultT> d<ResultT> a(Exception exc) {
        q qVar = new q();
        qVar.a(exc);
        return qVar;
    }

    public static <ResultT> d<ResultT> a(ResultT resultt) {
        q qVar = new q();
        qVar.a((Object) resultt);
        return qVar;
    }

    public static <ResultT> ResultT a(d<ResultT> dVar) {
        if (dVar.b()) {
            return dVar.c();
        }
        throw new ExecutionException(dVar.d());
    }
}
