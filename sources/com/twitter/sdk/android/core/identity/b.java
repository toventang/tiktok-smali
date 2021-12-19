package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.k;
import java.util.concurrent.atomic.AtomicReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f155928a = new AtomicReference<>(null);

    static {
        Covode.recordClassIndex(103600);
    }

    b() {
    }

    public final boolean a() {
        if (this.f155928a.get() != null) {
            return true;
        }
        return false;
    }

    public final boolean a(Activity activity, a aVar) {
        if (a()) {
            k.c().c();
        } else if (aVar.a(activity)) {
            boolean compareAndSet = this.f155928a.compareAndSet(null, aVar);
            if (compareAndSet) {
                return compareAndSet;
            }
            k.c().c();
            return compareAndSet;
        }
        return false;
    }
}
