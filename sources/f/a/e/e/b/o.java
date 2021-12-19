package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.c.g;
import f.a.e.i.d;
import f.a.h;
import org.a.c;

public final class o<T> extends h<T> implements g<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f157328b;

    static {
        Covode.recordClassIndex(104517);
    }

    @Override // f.a.e.c.g, java.util.concurrent.Callable
    public final T call() {
        return this.f157328b;
    }

    public o(T t) {
        this.f157328b = t;
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        cVar.onSubscribe(new d(cVar, this.f157328b));
    }
}
