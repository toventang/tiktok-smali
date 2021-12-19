package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.a.f;
import f.a.x;
import f.a.z;

public final class be<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final x<? extends T> f157536b;

    static {
        Covode.recordClassIndex(104670);
    }

    static final class a<T> implements z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157537a;

        /* renamed from: b  reason: collision with root package name */
        final x<? extends T> f157538b;

        /* renamed from: c  reason: collision with root package name */
        final f f157539c = new f();

        /* renamed from: d  reason: collision with root package name */
        boolean f157540d = true;

        static {
            Covode.recordClassIndex(104671);
        }

        @Override // f.a.z
        public final void onComplete() {
            if (this.f157540d) {
                this.f157540d = false;
                this.f157538b.b(this);
                return;
            }
            this.f157537a.onComplete();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157537a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f157539c.update(bVar);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (this.f157540d) {
                this.f157540d = false;
            }
            this.f157537a.onNext(t);
        }

        a(z<? super T> zVar, x<? extends T> xVar) {
            this.f157537a = zVar;
            this.f157538b = xVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar, this.f157536b);
        zVar.onSubscribe(aVar.f157539c);
        this.f157412a.b(aVar);
    }

    public be(x<T> xVar, x<? extends T> xVar2) {
        super(xVar);
        this.f157536b = xVar2;
    }
}
