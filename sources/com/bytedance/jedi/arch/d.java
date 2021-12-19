package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f39403a;

    /* renamed from: b  reason: collision with root package name */
    public final T f39404b;

    static {
        Covode.recordClassIndex(24184);
    }

    public final T a() {
        if (this.f39403a) {
            return null;
        }
        this.f39403a = true;
        return this.f39404b;
    }

    public d(T t) {
        this.f39404b = t;
    }

    public final void a(b<? super T, z> bVar) {
        l.d(bVar, "");
        if (!this.f39403a) {
            this.f39403a = true;
            bVar.invoke(this.f39404b);
        }
    }
}
