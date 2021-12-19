package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.api.a.b;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import h.f.b.r;

final /* synthetic */ class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.h f144281a = new h();

    static {
        Covode.recordClassIndex(94435);
    }

    h() {
        super(ProfileNaviOnboardingState.class, "starterAvatarSelected", "getStarterAvatarSelected()Lcom/ss/android/ugc/aweme/model/api/data/ProfileNaviDataModel;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviOnboardingState) obj).getStarterAvatarSelected();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviOnboardingState) obj).setStarterAvatarSelected((b) obj2);
    }
}
