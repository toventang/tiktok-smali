package com.ss.android.ugc.aweme.view.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class g extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144274a = new g();

    static {
        Covode.recordClassIndex(94432);
    }

    g() {
        super(ProfileNaviCreatorState.class, "profileImageBackgroundColor", "getProfileImageBackgroundColor()Ljava/lang/String;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviCreatorState) obj).getProfileImageBackgroundColor();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setProfileImageBackgroundColor((String) obj2);
    }
}
