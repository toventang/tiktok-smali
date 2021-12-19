package com.bytedance.ies.bullet.c.e.a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class d<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f32080a;

    static {
        Covode.recordClassIndex(18814);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        WeakReference<T> weakReference = this.f32080a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f32080a = null;
    }

    @Override // com.bytedance.ies.bullet.c.e.a.c
    public final T b() {
        WeakReference<T> weakReference = this.f32080a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public d(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f32080a = weakReference;
    }
}
