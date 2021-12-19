package com.ss.android.ugc.aweme.view.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import h.f.b.r;
import h.k.h;
import java.util.List;

final /* synthetic */ class d extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144228a = new d();

    static {
        Covode.recordClassIndex(94393);
    }

    d() {
        super(ProfileNaviOnboardingState.class, "starterAvatarList", "getStarterAvatarList()Ljava/util/List;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviOnboardingState) obj).getStarterAvatarList();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviOnboardingState) obj).setStarterAvatarList((List) obj2);
    }
}
