package com.ss.android.ugc.aweme.view.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class d extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144248a = new d();

    static {
        Covode.recordClassIndex(94417);
    }

    d() {
        super(ProfileNaviEditorState.class, "animationStarted", "getAnimationStarted()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getAnimationStarted());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setAnimationStarted(((Boolean) obj2).booleanValue());
    }
}
