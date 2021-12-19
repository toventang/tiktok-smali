package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.e.d.c;
import f.a.t;
import f.a.z;
import java.util.Iterator;

public final class ad<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterable<? extends T> f157423a;

    static {
        Covode.recordClassIndex(104602);
    }

    static final class a<T> extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157424a;

        /* renamed from: b  reason: collision with root package name */
        final Iterator<? extends T> f157425b;

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f157426c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157427d;

        /* renamed from: e  reason: collision with root package name */
        boolean f157428e;

        /* renamed from: f  reason: collision with root package name */
        boolean f157429f;

        static {
            Covode.recordClassIndex(104603);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.f157428e = true;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157426c = true;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157426c;
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.f157428e;
        }

        @Override // f.a.e.c.i
        public final T poll() {
            if (this.f157428e) {
                return null;
            }
            if (!this.f157429f) {
                this.f157429f = true;
            } else if (!this.f157425b.hasNext()) {
                this.f157428e = true;
                return null;
            }
            return (T) b.a(this.f157425b.next(), "The iterator returned a null value");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f157427d = true;
            return 1;
        }

        a(z<? super T> zVar, Iterator<? extends T> it) {
            this.f157424a = zVar;
            this.f157425b = it;
        }
    }

    public ad(Iterable<? extends T> iterable) {
        this.f157423a = iterable;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        try {
            Iterator<? extends T> it = this.f157423a.iterator();
            try {
                if (!it.hasNext()) {
                    f.a.e.a.c.complete(zVar);
                    return;
                }
                a aVar = new a(zVar, it);
                zVar.onSubscribe(aVar);
                if (!aVar.f157427d) {
                    while (!aVar.isDisposed()) {
                        try {
                            aVar.f157424a.onNext(b.a(aVar.f157425b.next(), "The iterator returned a null value"));
                            if (!aVar.isDisposed()) {
                                try {
                                    if (!aVar.f157425b.hasNext()) {
                                        if (!aVar.isDisposed()) {
                                            aVar.f157424a.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    f.a.c.b.a(th);
                                    aVar.f157424a.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            f.a.c.b.a(th2);
                            aVar.f157424a.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                f.a.c.b.a(th3);
                f.a.e.a.c.error(th3, zVar);
            }
        } catch (Throwable th4) {
            f.a.c.b.a(th4);
            f.a.e.a.c.error(th4, zVar);
        }
    }
}
