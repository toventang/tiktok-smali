package com.bytedance.android.livesdk.b.a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14172a = true;

    /* renamed from: m  reason: collision with root package name */
    protected List<WeakReference<f<T>>> f14173m = new ArrayList();
    public T n;

    static {
        Covode.recordClassIndex(7856);
    }

    public final void a(f<T> fVar) {
        if (fVar != null) {
            Iterator<WeakReference<f<T>>> it = this.f14173m.iterator();
            while (it.hasNext()) {
                WeakReference<f<T>> next = it.next();
                if (next.get() == null) {
                    it.remove();
                } else if (next.get() == fVar) {
                    return;
                }
            }
            this.f14173m.add(new WeakReference<>(fVar));
            if (this.f14172a) {
                fVar.a(this.n);
            }
        }
    }

    public final void b(f<T> fVar) {
        Iterator<WeakReference<f<T>>> it = this.f14173m.iterator();
        while (it.hasNext()) {
            WeakReference<f<T>> next = it.next();
            if (next.get() == null) {
                it.remove();
            } else if (next.get() == fVar) {
                it.remove();
                return;
            }
        }
    }

    public void a(T t) {
        if (t != this.n) {
            this.n = t;
            Iterator<WeakReference<f<T>>> it = this.f14173m.iterator();
            while (it.hasNext()) {
                WeakReference<f<T>> next = it.next();
                if (next.get() == null) {
                    it.remove();
                } else {
                    next.get().a(this.n);
                }
            }
        }
    }
}
