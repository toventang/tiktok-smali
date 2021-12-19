package com.ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144194a = new d();

    static {
        Covode.recordClassIndex(94364);
    }

    d() {
        super(ProfileNaviEditorState.class, "headStickerPath", "getHeadStickerPath()Ljava/lang/String;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getHeadStickerPath();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setHeadStickerPath((String) obj2);
    }
}
