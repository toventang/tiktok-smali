package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class m extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144286a = new m();

    static {
        Covode.recordClassIndex(94440);
    }

    m() {
        super(ProfileNaviHubState.class, "isContinueEditing", "isContinueEditing()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isContinueEditing());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setContinueEditing(((Boolean) obj2).booleanValue());
    }
}
