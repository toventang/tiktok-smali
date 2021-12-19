package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.e.a.c;

public final class o<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final T f157792a;

    static {
        Covode.recordClassIndex(104784);
    }

    public o(T t) {
        this.f157792a = t;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        aeVar.onSubscribe(c.INSTANCE);
        aeVar.onSuccess(this.f157792a);
    }
}
