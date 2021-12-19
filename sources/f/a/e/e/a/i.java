package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.d;
import f.a.d.k;
import f.a.f;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    final f f157247a;

    /* renamed from: b  reason: collision with root package name */
    final k<? super Throwable> f157248b;

    static {
        Covode.recordClassIndex(104468);
    }

    final class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private final d f157250b;

        static {
            Covode.recordClassIndex(104469);
        }

        @Override // f.a.d
        public final void onComplete() {
            this.f157250b.onComplete();
        }

        @Override // f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            this.f157250b.onSubscribe(bVar);
        }

        @Override // f.a.d
        public final void onError(Throwable th) {
            try {
                if (i.this.f157248b.a(th)) {
                    this.f157250b.onComplete();
                } else {
                    this.f157250b.onError(th);
                }
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157250b.onError(new f.a.c.a(th, th2));
            }
        }

        a(d dVar) {
            this.f157250b = dVar;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157247a.a(new a(dVar));
    }

    public i(f fVar, k<? super Throwable> kVar) {
        this.f157247a = fVar;
        this.f157248b = kVar;
    }
}
