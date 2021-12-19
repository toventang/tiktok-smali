package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.z;
import kotlinx.coroutines.b.a;

public final class p<E> extends g<E> {

    /* renamed from: e  reason: collision with root package name */
    private final d<z> f158995e;

    static {
        Covode.recordClassIndex(105500);
    }

    @Override // kotlinx.coroutines.a
    public final void d() {
        a.a(this.f158995e, this);
    }

    public p(f fVar, f<E> fVar2, m<? super s<? super E>, ? super d<? super z>, ? extends Object> mVar) {
        super(fVar, fVar2, false);
        this.f158995e = b.a(mVar, this, this);
    }
}
