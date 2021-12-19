package f.a;

import com.bytedance.covode.number.Covode;

public interface ad<T> {
    static {
        Covode.recordClassIndex(104365);
    }

    void a(T t);

    void a(Throwable th);

    boolean b(Throwable th);

    boolean isDisposed();
}
