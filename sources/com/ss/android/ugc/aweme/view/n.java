package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class n extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144287a = new n();

    static {
        Covode.recordClassIndex(94441);
    }

    n() {
        super(ProfileNaviHubState.class, "isDoneNaviExperience", "isDoneNaviExperience()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isDoneNaviExperience());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setDoneNaviExperience(((Boolean) obj2).booleanValue());
    }
}
