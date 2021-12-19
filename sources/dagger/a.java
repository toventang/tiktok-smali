package dagger;

import com.bytedance.covode.number.Covode;

public interface a<T> {
    static {
        Covode.recordClassIndex(104019);
    }

    T get();
}
