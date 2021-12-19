package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.k;

public abstract class x extends u implements k {
    static {
        Covode.recordClassIndex(105235);
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public b computeReflected() {
        return this;
    }

    public x() {
    }

    @Override // h.k.k
    public k.a getGetter() {
        return ((k) getReflected()).getGetter();
    }

    public x(Object obj) {
        super(obj);
    }

    @Override // h.f.a.b
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // h.k.k
    public Object getDelegate(Object obj) {
        return ((k) getReflected()).getDelegate(obj);
    }

    public x(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
