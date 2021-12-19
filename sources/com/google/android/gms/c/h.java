package com.google.android.gms.c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public abstract class h<TResult> {
    static {
        Covode.recordClassIndex(31154);
    }

    public abstract h<TResult> a(Activity activity, d dVar);

    public abstract h<TResult> a(Activity activity, e<? super TResult> eVar);

    public abstract h<TResult> a(e<? super TResult> eVar);

    public abstract h<TResult> a(Executor executor, d dVar);

    public abstract h<TResult> a(Executor executor, e<? super TResult> eVar);

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract TResult d();

    public abstract Exception e();

    public h<TResult> a(c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> a(Executor executor, c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> b(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> a(Executor executor, g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
