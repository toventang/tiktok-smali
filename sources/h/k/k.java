package h.k;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.k.i;

public interface k<T, V> extends b<T, V>, i<V> {

    public interface a<T, V> extends b<T, V>, i.a<V> {
        static {
            Covode.recordClassIndex(105295);
        }
    }

    static {
        Covode.recordClassIndex(105294);
    }

    V get(T t);

    Object getDelegate(T t);

    a<T, V> getGetter();
}
