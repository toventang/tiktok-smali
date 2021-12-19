package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public abstract class q<T> implements aa<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f48105a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final g<T> f48106b = new g<>();

    static {
        Covode.recordClassIndex(29065);
    }

    @Override // com.facebook.imagepipeline.memory.aa
    public final T a() {
        return c(this.f48106b.a());
    }

    private T c(T t) {
        if (t != null) {
            synchronized (this) {
                this.f48105a.remove(t);
            }
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.aa
    public T a(int i2) {
        return c(this.f48106b.a(i2));
    }

    @Override // com.facebook.imagepipeline.memory.aa
    public void a(T t) {
        boolean add;
        synchronized (this) {
            add = this.f48105a.add(t);
        }
        if (add) {
            this.f48106b.a(b(t), t);
        }
    }
}
