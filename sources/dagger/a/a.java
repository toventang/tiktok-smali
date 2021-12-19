package dagger.a;

import com.bytedance.covode.number.Covode;

public final class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public javax.a.a<T> f156650a;

    static {
        Covode.recordClassIndex(104020);
    }

    @Override // javax.a.a
    public final T get() {
        javax.a.a<T> aVar = this.f156650a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
