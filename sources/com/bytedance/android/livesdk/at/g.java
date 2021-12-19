package com.bytedance.android.livesdk.at;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.b.b;
import f.a.z;

public class g<T> implements ae<T>, z<T> {
    static {
        Covode.recordClassIndex(7839);
    }

    @Override // f.a.z
    public void onComplete() {
    }

    @Override // f.a.z
    public void onNext(T t) {
    }

    @Override // f.a.z, f.a.ae
    public void onSubscribe(b bVar) {
    }

    @Override // f.a.ae
    public void onSuccess(T t) {
    }

    @Override // f.a.z, f.a.ae
    public void onError(Throwable th) {
        a.a("LiveEmptyObserver", th);
        if (th instanceof com.bytedance.android.live.core.e.a) {
            a.a(6, "LiveEmptyObserver", "ApiServerException thrown, url: " + ((com.bytedance.android.live.core.e.a) th).getUrl());
        }
    }
}
