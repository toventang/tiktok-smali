package com.ss.android.ugc.aweme.view.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import h.f.b.r;

final /* synthetic */ class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.h f144279a = new h();

    static {
        Covode.recordClassIndex(94433);
    }

    h() {
        super(ProfileNaviCreatorState.class, "isAnimationFileGenerated", "isAnimationFileGenerated()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).isAnimationFileGenerated());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setAnimationFileGenerated(((Boolean) obj2).booleanValue());
    }
}
