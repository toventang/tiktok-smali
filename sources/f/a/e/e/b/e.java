package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.c.b;
import f.a.d.f;
import f.a.d.j;
import f.a.h;
import f.a.l;
import org.a.c;
import org.a.d;

public final class e<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    private final f<? super d> f157299c;

    /* renamed from: d  reason: collision with root package name */
    private final j f157300d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.d.a f157301e;

    static {
        Covode.recordClassIndex(104499);
    }

    static final class a<T> implements l<T>, d {

        /* renamed from: a  reason: collision with root package name */
        final c<? super T> f157302a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super d> f157303b;

        /* renamed from: c  reason: collision with root package name */
        final j f157304c;

        /* renamed from: d  reason: collision with root package name */
        final f.a.d.a f157305d;

        /* renamed from: e  reason: collision with root package name */
        d f157306e;

        static {
            Covode.recordClassIndex(104500);
        }

        @Override // org.a.c
        public final void onComplete() {
            if (this.f157306e != f.a.e.i.f.CANCELLED) {
                this.f157302a.onComplete();
            }
        }

        @Override // org.a.d
        public final void cancel() {
            d dVar = this.f157306e;
            if (dVar != f.a.e.i.f.CANCELLED) {
                this.f157306e = f.a.e.i.f.CANCELLED;
                try {
                    this.f157305d.a();
                } catch (Throwable th) {
                    b.a(th);
                    f.a.h.a.a(th);
                }
                dVar.cancel();
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.f157302a.onNext(t);
        }

        @Override // org.a.d
        public final void request(long j2) {
            this.f157306e.request(j2);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.f157306e != f.a.e.i.f.CANCELLED) {
                this.f157302a.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            try {
                this.f157303b.accept(dVar);
                if (f.a.e.i.f.validate(this.f157306e, dVar)) {
                    this.f157306e = dVar;
                    this.f157302a.onSubscribe(this);
                }
            } catch (Throwable th) {
                b.a(th);
                dVar.cancel();
                this.f157306e = f.a.e.i.f.CANCELLED;
                f.a.e.i.c.error(th, this.f157302a);
            }
        }

        a(c<? super T> cVar, f<? super d> fVar, j jVar, f.a.d.a aVar) {
            this.f157302a = cVar;
            this.f157303b = fVar;
            this.f157305d = aVar;
            this.f157304c = jVar;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar, this.f157299c, this.f157300d, this.f157301e));
    }

    public e(h<T> hVar, f<? super d> fVar, j jVar, f.a.d.a aVar) {
        super(hVar);
        this.f157299c = fVar;
        this.f157300d = jVar;
        this.f157301e = aVar;
    }
}
