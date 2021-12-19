package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public abstract class be<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<T> f109195a;

    static {
        Covode.recordClassIndex(69929);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public void run() {
        WeakReference<T> weakReference = this.f109195a;
        if (weakReference != null && weakReference.get() != null) {
            a(this.f109195a.get());
        }
    }

    public be(T t) {
        this.f109195a = new WeakReference<>(t);
    }
}
