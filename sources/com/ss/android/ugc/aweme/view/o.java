package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class o extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144288a = new o();

    static {
        Covode.recordClassIndex(94442);
    }

    o() {
        super(ProfileNaviCreatorState.class, "shouldShowSetProfileView", "getShouldShowSetProfileView()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).getShouldShowSetProfileView());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setShouldShowSetProfileView(((Boolean) obj2).booleanValue());
    }
}
