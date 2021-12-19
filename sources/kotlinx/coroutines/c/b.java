package kotlinx.coroutines.c;

import com.bytedance.covode.number.Covode;
import f.a.x;
import f.a.z;
import h.c.d;
import h.f.b.l;
import h.q;
import h.r;
import java.util.NoSuchElementException;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;

public final class b {
    static {
        Covode.recordClassIndex(105588);
    }

    public static final class a implements z<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f159075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f159076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f159077c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f159078d = null;

        /* renamed from: e  reason: collision with root package name */
        private f.a.b.b f159079e;

        /* renamed from: f  reason: collision with root package name */
        private T f159080f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f159081g;

        static {
            Covode.recordClassIndex(105589);
        }

        @Override // f.a.z
        public final void onComplete() {
            if (this.f159081g) {
                if (this.f159075a.a()) {
                    this.f159075a.resumeWith(q.m223constructorimpl(this.f159080f));
                }
            } else if (this.f159077c == a.FIRST_OR_DEFAULT) {
                this.f159075a.resumeWith(q.m223constructorimpl(this.f159078d));
            } else if (this.f159075a.a()) {
                this.f159075a.resumeWith(q.m223constructorimpl(r.a((Throwable) new NoSuchElementException("No value received via onNext for " + this.f159077c))));
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f159075a.resumeWith(q.m223constructorimpl(r.a(th)));
        }

        @Override // f.a.z
        public final void onSubscribe(final f.a.b.b bVar) {
            this.f159079e = bVar;
            this.f159075a.a((h.f.a.b<? super Throwable, h.z>) new h.f.a.b<Throwable, h.z>() {
                /* class kotlinx.coroutines.c.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(105590);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Throwable th) {
                    bVar.dispose();
                    return h.z.f158842a;
                }
            });
        }

        @Override // f.a.z
        public final void onNext(T t) {
            int i2 = c.f159082a[this.f159077c.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!this.f159081g) {
                    this.f159081g = true;
                    this.f159075a.resumeWith(q.m223constructorimpl(t));
                    f.a.b.b bVar = this.f159079e;
                    if (bVar == null) {
                        l.a("subscription");
                    }
                    bVar.dispose();
                }
            } else if (i2 != 3 && i2 != 4) {
            } else {
                if (this.f159077c != a.SINGLE || !this.f159081g) {
                    this.f159080f = t;
                    this.f159081g = true;
                    return;
                }
                if (this.f159075a.a()) {
                    this.f159075a.resumeWith(q.m223constructorimpl(r.a((Throwable) new IllegalArgumentException("More than one onNext value for " + this.f159077c))));
                }
                f.a.b.b bVar2 = this.f159079e;
                if (bVar2 == null) {
                    l.a("subscription");
                }
                bVar2.dispose();
            }
        }

        a(m mVar, x xVar, a aVar, Object obj) {
            this.f159075a = mVar;
            this.f159076b = xVar;
            this.f159077c = aVar;
        }
    }

    public static final <T> Object a(x<T> xVar, d<? super T> dVar) {
        return a(xVar, a.FIRST, dVar);
    }

    private static /* synthetic */ <T> Object a(x<T> xVar, a aVar, d<? super T> dVar) {
        n nVar = new n(h.c.a.b.a(dVar), 1);
        xVar.b(new a(nVar, xVar, aVar, null));
        Object e2 = nVar.e();
        if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        return e2;
    }
}
