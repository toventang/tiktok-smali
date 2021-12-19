package dagger.a;

import com.bytedance.covode.number.Covode;
import dagger.a;

public final class d<T> implements a<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final d<Object> f156655a = new d<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final T f156656b;

    @Override // javax.a.a, dagger.a
    public final T get() {
        return this.f156656b;
    }

    static {
        Covode.recordClassIndex(104023);
    }

    private d(T t) {
        this.f156656b = t;
    }

    public static <T> c<T> a(T t) {
        return new d(f.a(t, "instance cannot be null"));
    }
}
