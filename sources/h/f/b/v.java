package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.j;

public abstract class v extends u implements j {
    static {
        Covode.recordClassIndex(105233);
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public b computeReflected() {
        return this;
    }

    public v() {
    }

    @Override // h.f.a.a
    public Object invoke() {
        return get();
    }

    @Override // h.k.j
    public Object getDelegate() {
        return ((j) getReflected()).getDelegate();
    }

    @Override // h.k.j
    public j.a getGetter() {
        return ((j) getReflected()).getGetter();
    }

    public v(Object obj) {
        super(obj);
    }

    public v(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
