package com.bytedance.b.k.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentLinkedQueue<T> f26314a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0561a<T> f26315b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26316c;

    /* renamed from: com.bytedance.b.k.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0561a<T> {
        static {
            Covode.recordClassIndex(15280);
        }

        void a(T t);
    }

    static {
        Covode.recordClassIndex(15279);
    }

    public a(int i2) {
        this.f26316c = i2;
    }

    public final void a(T t) {
        this.f26314a.add(t);
        if (this.f26314a.size() > this.f26316c) {
            T poll = this.f26314a.poll();
            AbstractC0561a<T> aVar = this.f26315b;
            if (aVar != null) {
                aVar.a(poll);
            }
        }
    }
}
