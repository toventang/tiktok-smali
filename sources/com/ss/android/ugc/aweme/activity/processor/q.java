package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class q extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f65551a = new q();

    static {
        Covode.recordClassIndex(40335);
    }

    q() {
        super(x.class, "navigationBarColorAttr", "getNavigationBarColorAttr()I", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Integer.valueOf(((x) obj).f65560f);
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((x) obj).f65560f = ((Number) obj2).intValue();
    }
}
