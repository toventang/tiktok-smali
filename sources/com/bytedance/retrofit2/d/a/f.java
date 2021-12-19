package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import f.a.b.b;
import f.a.t;
import f.a.z;
import java.util.Objects;

final class f<T> extends t<e<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final t<u<T>> f42491a;

    static {
        Covode.recordClassIndex(26023);
    }

    static class a<R> implements z<u<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final z<? super e<R>> f42492a;

        static {
            Covode.recordClassIndex(26024);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f42492a.onComplete();
        }

        a(z<? super e<R>> zVar) {
            this.f42492a = zVar;
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f42492a.onSubscribe(bVar);
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            u uVar = (u) obj;
            z<? super e<R>> zVar = this.f42492a;
            Objects.requireNonNull(uVar, "response == null");
            zVar.onNext(new e(uVar, null));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            try {
                z<? super e<R>> zVar = this.f42492a;
                if (th != null) {
                    zVar.onNext(new e(null, th));
                    this.f42492a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                f.a.h.a.a(new f.a.c.a(th, th2));
            }
        }
    }

    f(t<u<T>> tVar) {
        this.f42491a = tVar;
    }

    @Override // f.a.t
    public final void a(z<? super e<T>> zVar) {
        this.f42491a.b(new a(zVar));
    }
}
