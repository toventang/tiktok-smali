package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.f;
import kotlinx.coroutines.aj;

public final class r<E> extends i<E> implements s<E> {
    static {
        Covode.recordClassIndex(105502);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.a, kotlinx.coroutines.bz
    public final boolean b() {
        return super.b();
    }

    @Override // kotlinx.coroutines.a
    public final /* synthetic */ void f() {
        ((i) this).f158978b.b_(null);
    }

    public r(f fVar, h<E> hVar) {
        super(fVar, hVar);
    }

    @Override // kotlinx.coroutines.a
    public final void a(Throwable th, boolean z) {
        if (!((i) this).f158978b.b_(th) && !z) {
            aj.a(getContext(), th);
        }
    }
}
