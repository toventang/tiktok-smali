package com.bytedance.ies.xbridge.model.b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class d<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f36294a;

    static {
        Covode.recordClassIndex(21719);
    }

    @Override // com.bytedance.ies.xbridge.b.e
    public final void a() {
        WeakReference<T> weakReference = this.f36294a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f36294a = null;
    }

    @Override // com.bytedance.ies.xbridge.model.b.a
    public final T b() {
        WeakReference<T> weakReference = this.f36294a;
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
        this.f36294a = weakReference;
    }
}
