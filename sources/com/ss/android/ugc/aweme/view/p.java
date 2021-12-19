package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class p extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144289a = new p();

    static {
        Covode.recordClassIndex(94443);
    }

    p() {
        super(ProfileNaviSwitcherState.class, "shouldCreateNewNavi", "getShouldCreateNewNavi()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getShouldCreateNewNavi());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSwitcherState) obj).setShouldCreateNewNavi(((Boolean) obj2).booleanValue());
    }
}
