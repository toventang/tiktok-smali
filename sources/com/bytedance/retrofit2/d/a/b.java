package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import f.a.t;
import f.a.z;

final class b<T> extends t<u<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.retrofit2.b<T> f42482a;

    static {
        Covode.recordClassIndex(26017);
    }

    static final class a<T> implements d<T>, f.a.b.b {

        /* renamed from: a  reason: collision with root package name */
        boolean f42483a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.retrofit2.b<?> f42484b;

        /* renamed from: c  reason: collision with root package name */
        private final z<? super u<T>> f42485c;

        static {
            Covode.recordClassIndex(26018);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f42484b.cancel();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f42484b.isCanceled();
        }

        a(com.bytedance.retrofit2.b<?> bVar, z<? super u<T>> zVar) {
            this.f42484b = bVar;
            this.f42485c = zVar;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<T> bVar, Throwable th) {
            if (!bVar.isCanceled()) {
                try {
                    this.f42485c.onError(th);
                } catch (Throwable th2) {
                    f.a.c.b.a(th2);
                    f.a.h.a.a(new f.a.c.a(th, th2));
                }
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<T> bVar, u<T> uVar) {
            if (!bVar.isCanceled()) {
                try {
                    this.f42485c.onNext(uVar);
                    if (!bVar.isCanceled()) {
                        this.f42483a = true;
                        this.f42485c.onComplete();
                    }
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    f.a.h.a.a(new f.a.c.a(th, th));
                }
            }
        }
    }

    b(com.bytedance.retrofit2.b<T> bVar) {
        this.f42482a = bVar;
    }

    @Override // f.a.t
    public final void a(z<? super u<T>> zVar) {
        com.bytedance.retrofit2.b<T> clone = this.f42482a.clone();
        a aVar = new a(clone, zVar);
        zVar.onSubscribe(aVar);
        clone.enqueue(aVar);
    }
}
