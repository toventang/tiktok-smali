package com.bytedance.tiktok.proxy;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LifecycleForceNotifyObserver<T> implements k, u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f44400a;

    /* renamed from: b  reason: collision with root package name */
    private T f44401b;

    /* renamed from: c  reason: collision with root package name */
    private final a<?, ?> f44402c;

    /* renamed from: d  reason: collision with root package name */
    private final b<T, z> f44403d;

    static {
        Covode.recordClassIndex(27196);
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(T t) {
        this.f44403d.invoke(t);
        this.f44401b = t;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        i lifecycle = this.f44402c.getLifecycle();
        l.a((Object) lifecycle, "");
        if (!lifecycle.a().isAtLeast(i.b.STARTED)) {
            this.f44400a.set(false);
        } else if (!this.f44400a.getAndSet(true)) {
            T t = this.f44401b;
            if (t != null && (!this.f44402c.h())) {
                onChanged(t);
            }
        } else {
            return;
        }
        if (e.f44404a[aVar.ordinal()] == 1) {
            this.f44402c.getLifecycle().b(this);
        }
    }
}
