package h;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import java.io.Serializable;

public final class aa<T> implements h<T>, Serializable {
    private Object _value = x.f158841a;
    private a<? extends T> initializer;

    static {
        Covode.recordClassIndex(105091);
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this._value != x.f158841a) {
            return true;
        }
        return false;
    }

    @Override // h.h
    public final T getValue() {
        if (this._value == x.f158841a) {
            a<? extends T> aVar = this.initializer;
            if (aVar == null) {
                l.b();
            }
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public aa(a<? extends T> aVar) {
        l.d(aVar, "");
        this.initializer = aVar;
    }
}
