package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144282a = new i();

    static {
        Covode.recordClassIndex(94436);
    }

    i() {
        super(ProfileNaviHubState.class, "isCreateNewAvatar", "isCreateNewAvatar()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isCreateNewAvatar());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setCreateNewAvatar(((Boolean) obj2).booleanValue());
    }
}
