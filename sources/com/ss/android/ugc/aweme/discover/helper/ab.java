package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;

public final class ab implements j {

    /* renamed from: a  reason: collision with root package name */
    private int f81058a;

    static {
        Covode.recordClassIndex(50383);
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.j
    public final void a() {
        this.f81058a = 0;
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.j
    public final void a(b<? super Integer, Integer> bVar) {
        l.d(bVar, "");
        int i2 = this.f81058a;
        this.f81058a = i2 + bVar.invoke(Integer.valueOf(i2)).intValue();
    }
}
