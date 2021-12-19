package com.ss.android.ugc.g.a.c;

import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.z;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f145626a;

    static {
        Covode.recordClassIndex(95639);
    }

    public static final class a implements z<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f145627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f145628b;

        static {
            Covode.recordClassIndex(95640);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f145627a.a();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.c(th, "");
            this.f145627a.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Long l2) {
            this.f145628b.invoke(Long.valueOf(l2.longValue()));
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.c(bVar, "");
            this.f145627a.f145626a = bVar;
        }

        a(b bVar, h.f.a.b bVar2) {
            this.f145627a = bVar;
            this.f145628b = bVar2;
        }
    }

    public final void a() {
        f.a.b.b bVar = this.f145626a;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = this.f145626a;
            if (bVar2 == null) {
                l.a();
            }
            bVar2.dispose();
        }
    }

    public final void a(long j2, h.f.a.b<? super Long, h.z> bVar) {
        l.c(bVar, "");
        t.b(j2, TimeUnit.MILLISECONDS).b(new a(this, bVar));
    }
}
