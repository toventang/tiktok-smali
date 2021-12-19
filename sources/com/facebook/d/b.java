package com.facebook.d;

import com.bytedance.covode.number.Covode;

public abstract class b<T> implements e<T> {
    static {
        Covode.recordClassIndex(28707);
    }

    @Override // com.facebook.d.e
    public void onCancellation(c<T> cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(c<T> cVar);

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(c<T> cVar);

    @Override // com.facebook.d.e
    public void onProgressUpdate(c<T> cVar) {
    }

    @Override // com.facebook.d.e
    public void onFailure(c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.g();
        }
    }

    @Override // com.facebook.d.e
    public void onNewResult(c<T> cVar) {
        boolean b2 = cVar.b();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (b2) {
                cVar.g();
            }
        }
    }
}
