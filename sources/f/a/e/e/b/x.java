package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.e.b.v;
import f.a.h;
import org.a.b;
import org.a.c;
import org.a.d;

public final class x<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final g<? super h<Throwable>, ? extends b<?>> f157343c;

    static {
        Covode.recordClassIndex(104539);
    }

    static final class a<T> extends v.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        static {
            Covode.recordClassIndex(104540);
        }

        @Override // org.a.c
        public final void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            a(th);
        }

        a(c<? super T> cVar, f.a.i.a<Throwable> aVar, d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        f.a.m.b bVar = new f.a.m.b(cVar);
        f.a.i.a<T> f2 = new f.a.i.d().f();
        try {
            b bVar2 = (b) f.a.e.b.b.a(this.f157343c.apply(f2), "handler returned a null Publisher");
            v.b bVar3 = new v.b(this.f157263b);
            a aVar = new a(bVar, f2, bVar3);
            bVar3.subscriber = aVar;
            cVar.onSubscribe(aVar);
            bVar2.a_(bVar3);
            bVar3.onNext(0);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.e.i.c.error(th, cVar);
        }
    }

    public x(h<T> hVar, g<? super h<Throwable>, ? extends b<?>> gVar) {
        super(hVar);
        this.f157343c = gVar;
    }
}
