package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class af<T> implements l<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f67701a;

    static {
        Covode.recordClassIndex(41671);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.l
    public final T a() {
        WeakReference<T> weakReference = this.f67701a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.l
    public final void b() {
        WeakReference<T> weakReference = this.f67701a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f67701a = null;
    }

    public af(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f67701a = weakReference;
    }
}
