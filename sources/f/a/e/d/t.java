package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

public final class t<T> implements ae<T> {

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<b> f157232a;

    /* renamed from: b  reason: collision with root package name */
    final ae<? super T> f157233b;

    static {
        Covode.recordClassIndex(104456);
    }

    @Override // f.a.ae
    public final void onError(Throwable th) {
        this.f157233b.onError(th);
    }

    @Override // f.a.ae
    public final void onSubscribe(b bVar) {
        f.a.e.a.b.replace(this.f157232a, bVar);
    }

    @Override // f.a.ae
    public final void onSuccess(T t) {
        this.f157233b.onSuccess(t);
    }

    public t(AtomicReference<b> atomicReference, ae<? super T> aeVar) {
        this.f157232a = atomicReference;
        this.f157233b = aeVar;
    }
}
