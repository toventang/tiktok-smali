package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.b.ab;
import h.f.b.h;
import h.f.b.l;

public abstract class j extends i implements h<Object> {
    private final int arity;

    static {
        Covode.recordClassIndex(105121);
    }

    @Override // h.f.b.h
    public int getArity() {
        return this.arity;
    }

    @Override // h.c.b.a.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a2 = ab.a(this);
        l.b(a2, "");
        return a2;
    }

    public j(int i2) {
        this(i2, null);
    }

    public j(int i2, d<Object> dVar) {
        super(dVar);
        this.arity = i2;
    }
}
