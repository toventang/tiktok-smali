package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.z;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a;
import kotlinx.coroutines.ca;

public class i<E> extends a<z> implements h<E> {

    /* renamed from: b  reason: collision with root package name */
    public final h<E> f158978b;

    static {
        Covode.recordClassIndex(105488);
    }

    @Override // kotlinx.coroutines.a.y
    public final boolean b_(Throwable th) {
        return this.f158978b.b_(th);
    }

    @Override // kotlinx.coroutines.bz, kotlinx.coroutines.JobSupport
    public final /* synthetic */ void o() {
        b((Throwable) new ca(g(), null, this));
    }

    @Override // kotlinx.coroutines.a.u
    public final Object a(d<? super aa<? extends E>> dVar) {
        return this.f158978b.a(dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void b(Throwable th) {
        CancellationException cancellationException = a(th, (String) null);
        this.f158978b.a(cancellationException);
        d((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.bz, kotlinx.coroutines.a.u, kotlinx.coroutines.JobSupport
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ca(g(), null, this);
        }
        b((Throwable) cancellationException);
    }

    public i(f fVar, h<E> hVar) {
        super(fVar, true);
        this.f158978b = hVar;
    }

    @Override // kotlinx.coroutines.a.y
    public final Object a(E e2, d<? super z> dVar) {
        return this.f158978b.a(e2, dVar);
    }
}
