package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final class bw extends k {

    /* renamed from: a  reason: collision with root package name */
    private final b<Throwable, z> f159057a;

    static {
        Covode.recordClassIndex(105578);
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f159057a.getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public bw(b<? super Throwable, z> bVar) {
        this.f159057a = bVar;
    }

    @Override // kotlinx.coroutines.l
    public final void a(Throwable th) {
        this.f159057a.invoke(th);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }
}
