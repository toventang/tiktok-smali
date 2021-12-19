package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class l extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144285a = new l();

    static {
        Covode.recordClassIndex(94439);
    }

    l() {
        super(ProfileNaviCreatorState.class, "isBackPressed", "isBackPressed()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).isBackPressed());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setBackPressed(((Boolean) obj2).booleanValue());
    }
}
