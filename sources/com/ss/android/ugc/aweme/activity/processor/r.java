package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import h.k.h;

final /* synthetic */ class r extends h.f.b.r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f65552a = new r();

    static {
        Covode.recordClassIndex(40336);
    }

    r() {
        super(x.class, "statusBarColorAttr", "getStatusBarColorAttr()I", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Integer.valueOf(((x) obj).f65559e);
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((x) obj).f65559e = ((Number) obj2).intValue();
    }
}
