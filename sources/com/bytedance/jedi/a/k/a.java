package com.bytedance.jedi.a.k;

import com.bytedance.covode.number.Covode;
import f.a.e.j.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final l<c> f39269a = new l<>((byte) 0);

    static {
        Covode.recordClassIndex(24079);
    }

    @Override // com.bytedance.jedi.a.k.c
    public final void bn_() {
        T[] tArr = this.f39269a.f157951e;
        h.f.b.l.a((Object) tArr, "");
        for (T t : tArr) {
            if (t instanceof c) {
                t.bn_();
                this.f39269a.b(t);
            }
        }
    }
}
