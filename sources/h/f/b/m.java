package h.f.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    static {
        Covode.recordClassIndex(105224);
    }

    @Override // h.f.b.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a2 = ab.a(this);
        l.b(a2, "");
        return a2;
    }

    public m(int i2) {
        this.arity = i2;
    }
}
