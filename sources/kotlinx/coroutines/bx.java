package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class bx extends cb<bz> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159058a = AtomicIntegerFieldUpdater.newUpdater(bx.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: b  reason: collision with root package name */
    private final b<Throwable, z> f159059b;

    static {
        Covode.recordClassIndex(105579);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "InvokeOnCancelling[" + getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }

    @Override // kotlinx.coroutines.ad
    public final void a(Throwable th) {
        if (f159058a.compareAndSet(this, 0, 1)) {
            this.f159059b.invoke(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public bx(bz bzVar, b<? super Throwable, z> bVar) {
        super(bzVar);
        this.f159059b = bVar;
    }
}
