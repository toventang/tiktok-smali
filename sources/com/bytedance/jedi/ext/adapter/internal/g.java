package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<JediViewHolderProxy> f39748a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final d f39749b;

    static {
        Covode.recordClassIndex(24485);
    }

    public final void a() {
        if (this.f39748a.size() != 0) {
            for (T t : this.f39748a) {
                if (t != null) {
                    this.f39749b.b(t);
                }
            }
            this.f39748a.clear();
        }
    }

    private final void a(int i2) {
        this.f39748a.add(i2, null);
    }

    public g(d dVar) {
        l.c(dVar, "");
        this.f39749b = dVar;
    }

    private final void b(int i2, JediViewHolderProxy jediViewHolderProxy) {
        if (i2 < this.f39748a.size()) {
            this.f39748a.set(i2, jediViewHolderProxy);
        } else {
            this.f39748a.add(i2, jediViewHolderProxy);
        }
    }

    public final void a(int i2, JediViewHolderProxy jediViewHolderProxy) {
        if (i2 >= 0 && i2 <= this.f39748a.size()) {
            if (jediViewHolderProxy != null) {
                b(i2, jediViewHolderProxy);
            } else {
                a(i2);
            }
        }
    }
}
