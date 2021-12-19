package f.a;

import com.bytedance.covode.number.Covode;
import f.a.b.b;

public interface p<T> {
    static {
        Covode.recordClassIndex(104936);
    }

    void onComplete();

    void onError(Throwable th);

    void onSubscribe(b bVar);

    void onSuccess(T t);
}
