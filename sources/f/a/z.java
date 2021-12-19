package f.a;

import com.bytedance.covode.number.Covode;
import f.a.b.b;

public interface z<T> {
    static {
        Covode.recordClassIndex(104947);
    }

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(b bVar);
}
