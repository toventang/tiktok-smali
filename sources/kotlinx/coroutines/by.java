package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final class by extends ce<bz> {

    /* renamed from: a  reason: collision with root package name */
    private final b<Throwable, z> f159060a;

    static {
        Covode.recordClassIndex(105580);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "InvokeOnCompletion[" + getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
    }

    @Override // kotlinx.coroutines.ad
    public final void a(Throwable th) {
        this.f159060a.invoke(th);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public by(bz bzVar, b<? super Throwable, z> bVar) {
        super(bzVar);
        this.f159060a = bVar;
    }
}
