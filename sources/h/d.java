package h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class d<T> implements h<T>, Serializable {
    private final T value;

    static {
        Covode.recordClassIndex(105140);
    }

    @Override // h.h
    public final boolean isInitialized() {
        return true;
    }

    @Override // h.h
    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(getValue());
    }

    public d(T t) {
        this.value = t;
    }
}
