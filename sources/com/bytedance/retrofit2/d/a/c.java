package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.u;
import f.a.t;
import f.a.z;

final class c<T> extends t<u<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f42486a;

    static {
        Covode.recordClassIndex(26019);
    }

    static final class a implements f.a.b.b {

        /* renamed from: a  reason: collision with root package name */
        private final b<?> f42487a;

        static {
            Covode.recordClassIndex(26020);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f42487a.cancel();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f42487a.isCanceled();
        }

        a(b<?> bVar) {
            this.f42487a = bVar;
        }
    }

    c(b<T> bVar) {
        this.f42486a = bVar;
    }

    @Override // f.a.t
    public final void a(z<? super u<T>> zVar) {
        Throwable th;
        boolean z;
        b<T> clone = this.f42486a.clone();
        zVar.onSubscribe(new a(clone));
        try {
            u<T> execute = clone.execute();
            if (!clone.isCanceled()) {
                zVar.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    zVar.onComplete();
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
            f.a.c.b.a(th);
            if (z) {
                f.a.h.a.a(th);
            } else if (!clone.isCanceled()) {
                try {
                    zVar.onError(th);
                } catch (Throwable th4) {
                    f.a.c.b.a(th4);
                    f.a.h.a.a(new f.a.c.a(th, th4));
                }
            }
        }
    }
}
