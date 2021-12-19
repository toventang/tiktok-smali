package com.ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144195a = new e();

    static {
        Covode.recordClassIndex(94365);
    }

    e() {
        super(ProfileNaviEditorState.class, "setUpConfigChanged", "getSetUpConfigChanged()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getSetUpConfigChanged());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setSetUpConfigChanged(((Boolean) obj2).booleanValue());
    }
}
