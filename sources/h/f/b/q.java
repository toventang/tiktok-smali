package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.h;
import h.k.k;

public abstract class q extends n implements h {
    static {
        Covode.recordClassIndex(105228);
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public b computeReflected() {
        return this;
    }

    public q() {
    }

    @Override // h.k.k
    public k.a getGetter() {
        return ((h) getReflected()).getGetter();
    }

    @Override // h.k.h
    public h.a getSetter() {
        return ((h) getReflected()).getSetter();
    }

    public q(Object obj) {
        super(obj);
    }

    @Override // h.f.a.b
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // h.k.k
    public Object getDelegate(Object obj) {
        return ((h) getReflected()).getDelegate(obj);
    }

    public q(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
