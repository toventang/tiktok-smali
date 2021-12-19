package f.a.e.c;

import com.bytedance.covode.number.Covode;

public interface i<T> {
    static {
        Covode.recordClassIndex(104436);
    }

    void clear();

    boolean isEmpty();

    boolean offer(T t);

    T poll();
}
