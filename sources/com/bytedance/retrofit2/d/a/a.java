package com.bytedance.retrofit2.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import f.a.b.b;
import f.a.t;
import f.a.z;

final class a<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final t<u<T>> f42479a;

    static {
        Covode.recordClassIndex(26015);
    }

    /* renamed from: com.bytedance.retrofit2.d.a.a$a  reason: collision with other inner class name */
    static class C1038a<R> implements z<u<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final z<? super R> f42480a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f42481b;

        static {
            Covode.recordClassIndex(26016);
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f42481b) {
                this.f42480a.onComplete();
            }
        }

        C1038a(z<? super R> zVar) {
            this.f42480a = zVar;
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f42480a.onSubscribe(bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (!this.f42481b) {
                this.f42480a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            f.a.h.a.a(assertionError);
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            u uVar = (u) obj;
            if (uVar.f42629a.a()) {
                this.f42480a.onNext(uVar.f42630b);
                return;
            }
            this.f42481b = true;
            d dVar = new d(uVar);
            try {
                this.f42480a.onError(dVar);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(new f.a.c.a(dVar, th));
            }
        }
    }

    a(t<u<T>> tVar) {
        this.f42479a = tVar;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f42479a.b(new C1038a(zVar));
    }
}
