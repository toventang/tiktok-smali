package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState;
import h.k.h;

final /* synthetic */ class r extends h.f.b.r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144291a = new r();

    static {
        Covode.recordClassIndex(94445);
    }

    r() {
        super(ProfileNaviSpinnerState.class, "shouldShowSpinner", "getShouldShowSpinner()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSpinnerState) obj).getShouldShowSpinner());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSpinnerState) obj).setShouldShowSpinner(((Boolean) obj2).booleanValue());
    }
}
