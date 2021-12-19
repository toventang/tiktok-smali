package com.ss.android.ugc.aweme.view.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class e extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144250a = new e();

    static {
        Covode.recordClassIndex(94418);
    }

    e() {
        super(ProfileNaviEditorState.class, "naviDoneLoading", "getNaviDoneLoading()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getNaviDoneLoading());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setNaviDoneLoading(((Boolean) obj2).booleanValue());
    }
}
