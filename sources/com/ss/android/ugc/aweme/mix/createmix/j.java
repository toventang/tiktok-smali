package com.ss.android.ugc.aweme.mix.createmix;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.a;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class j extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f109863a = new j();

    static {
        Covode.recordClassIndex(70375);
    }

    j() {
        super(a.class, "isCreateFlag", "isCreateFlag()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((a) obj).f109894k);
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((a) obj).f109894k = ((Boolean) obj2).booleanValue();
    }
}
