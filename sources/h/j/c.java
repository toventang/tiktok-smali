package h.j;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;

public interface c<T extends Comparable<? super T>> extends d<T> {
    static {
        Covode.recordClassIndex(105268);
    }

    @Override // h.j.d
    boolean a(T t);
}
