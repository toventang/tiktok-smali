package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class u extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144294a = new u();

    static {
        Covode.recordClassIndex(94448);
    }

    u() {
        super(ProfileNaviEditorState.class, "isQuitEditing", "isQuitEditing()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).isQuitEditing());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setQuitEditing(((Boolean) obj2).booleanValue());
    }
}
