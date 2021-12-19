package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.z;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.ca;

public class g<E> extends a<z> implements f<E>, s<E> {

    /* renamed from: b  reason: collision with root package name */
    public final f<E> f158975b;

    static {
        Covode.recordClassIndex(105485);
    }

    @Override // kotlinx.coroutines.a.y
    public final boolean b_(Throwable th) {
        return this.f158975b.b_(th);
    }

    @Override // kotlinx.coroutines.bz, kotlinx.coroutines.JobSupport, kotlinx.coroutines.a
    public final boolean b() {
        return super.b();
    }

    @Override // kotlinx.coroutines.a
    public final /* synthetic */ void f() {
        this.f158975b.b_(null);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void b(Throwable th) {
        this.f158975b.a(a(th, (String) null));
        d(th);
    }

    @Override // kotlinx.coroutines.bz, kotlinx.coroutines.a.f, kotlinx.coroutines.JobSupport
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ca(g(), null, this);
        }
        b((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.a.y
    public final Object a(E e2, d<? super z> dVar) {
        return this.f158975b.a(e2, dVar);
    }

    @Override // kotlinx.coroutines.a
    public final void a(Throwable th, boolean z) {
        if (!this.f158975b.b_(th) && !z) {
            aj.a(getContext(), th);
        }
    }

    public g(f fVar, f<E> fVar2, boolean z) {
        super(fVar, z);
        this.f158975b = fVar2;
    }
}
