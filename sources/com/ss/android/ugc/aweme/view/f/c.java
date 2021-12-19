package com.ss.android.ugc.aweme.view.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144246a = new c();

    static {
        Covode.recordClassIndex(94416);
    }

    c() {
        super(ProfileNaviCreatorState.class, "shouldGenerateAnimation", "getShouldGenerateAnimation()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).getShouldGenerateAnimation());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setShouldGenerateAnimation(((Boolean) obj2).booleanValue());
    }
}
