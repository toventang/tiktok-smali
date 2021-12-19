package com.ss.android.ugc.aweme.view.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class d extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144155a = new d();

    static {
        Covode.recordClassIndex(94346);
    }

    d() {
        super(ProfileNaviSwitcherState.class, "hasListBeenUpdated", "getHasListBeenUpdated()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasListBeenUpdated());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSwitcherState) obj).setHasListBeenUpdated(((Boolean) obj2).booleanValue());
    }
}
