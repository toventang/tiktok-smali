package h;

import com.bytedance.covode.number.Covode;

public interface h<T> {
    static {
        Covode.recordClassIndex(105248);
    }

    T getValue();

    boolean isInitialized();
}
