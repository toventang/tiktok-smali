package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class s<T> implements h<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f158839a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<s<?>, Object> f158840b = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_value");
    private volatile Object _value = x.f158841a;

    /* renamed from: final  reason: not valid java name */
    private final Object f353final = x.f158841a;
    private volatile h.f.a.a<? extends T> initializer;

    public static final class a {
        static {
            Covode.recordClassIndex(105388);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    static {
        Covode.recordClassIndex(105387);
    }

    @Override // h.h
    public final T getValue() {
        T t = (T) this._value;
        if (t != x.f158841a) {
            return t;
        }
        h.f.a.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T t2 = (T) aVar.invoke();
            if (f158840b.compareAndSet(this, x.f158841a, t2)) {
                this.initializer = null;
                return t2;
            }
        }
        return (T) this._value;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public s(h.f.a.a<? extends T> aVar) {
        l.d(aVar, "");
        this.initializer = aVar;
    }
}
