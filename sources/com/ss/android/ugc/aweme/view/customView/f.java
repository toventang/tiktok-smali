package com.ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144196a = new f();

    static {
        Covode.recordClassIndex(94366);
    }

    f() {
        super(ProfileNaviSwitcherState.class, "hasNaviChanged", "getHasNaviChanged()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasNaviChanged());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSwitcherState) obj).setHasNaviChanged(((Boolean) obj2).booleanValue());
    }
}
