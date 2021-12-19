package com.bytedance.ies.bullet.c.e.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class e<T, R> implements c<R> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f32081a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T, R> f32082b;

    static {
        Covode.recordClassIndex(18815);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        WeakReference<T> weakReference = this.f32081a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f32081a = null;
    }

    @Override // com.bytedance.ies.bullet.c.e.a.c
    public final R b() {
        T t;
        WeakReference<T> weakReference = this.f32081a;
        if (weakReference == null || (t = weakReference.get()) == null) {
            return null;
        }
        return this.f32082b.invoke(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(T t, b<? super T, ? extends R> bVar) {
        l.c(bVar, "");
        this.f32082b = bVar;
        this.f32081a = new WeakReference<>(t);
    }
}
