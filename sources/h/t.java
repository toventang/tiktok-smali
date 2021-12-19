package h;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import java.io.Serializable;

final class t<T> implements h<T>, Serializable {
    private volatile Object _value;
    private a<? extends T> initializer;
    private final Object lock;

    static {
        Covode.recordClassIndex(105389);
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

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // h.h
    public final T getValue() {
        T t;
        T t2 = (T) this._value;
        if (t2 != x.f158841a) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == x.f158841a) {
                a<? extends T> aVar = this.initializer;
                if (aVar == null) {
                    l.b();
                }
                t = (T) aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    private t(a<? extends T> aVar) {
        l.d(aVar, "");
        this.initializer = aVar;
        this._value = x.f158841a;
        this.lock = this;
    }

    public /* synthetic */ t(a aVar, byte b2) {
        this(aVar);
    }
}
