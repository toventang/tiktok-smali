package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import f.a.b.c;
import f.a.e.b.a;
import java.util.concurrent.Callable;

public final class l<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends T> f157787a;

    static {
        Covode.recordClassIndex(104780);
    }

    public l(Callable<? extends T> callable) {
        this.f157787a = callable;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        b a2 = c.a(a.f157189b);
        aeVar.onSubscribe(a2);
        if (!a2.isDisposed()) {
            try {
                Object obj = (Object) f.a.e.b.b.a(this.f157787a.call(), "The callable returned a null value");
                if (!a2.isDisposed()) {
                    aeVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                if (!a2.isDisposed()) {
                    aeVar.onError(th);
                } else {
                    f.a.h.a.a(th);
                }
            }
        }
    }
}
