package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.g;
import h.k.j;

public abstract class o extends n implements g {
    static {
        Covode.recordClassIndex(105226);
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public b computeReflected() {
        return this;
    }

    public o() {
    }

    @Override // h.f.a.a
    public Object invoke() {
        return get();
    }

    @Override // h.k.j
    public Object getDelegate() {
        return ((g) getReflected()).getDelegate();
    }

    @Override // h.k.j
    public j.a getGetter() {
        return ((g) getReflected()).getGetter();
    }

    @Override // h.k.g
    public g.a getSetter() {
        return ((g) getReflected()).getSetter();
    }

    public o(Object obj) {
        super(obj);
    }

    public o(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
