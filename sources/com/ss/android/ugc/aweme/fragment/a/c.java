package com.ss.android.ugc.aweme.fragment.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f96669a = new c();

    static {
        Covode.recordClassIndex(61335);
    }

    c() {
        super(x.class, "statusBarColor", "getStatusBarColor()I", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Integer.valueOf(((x) obj).f65561g);
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((x) obj).f65561g = ((Number) obj2).intValue();
    }
}
