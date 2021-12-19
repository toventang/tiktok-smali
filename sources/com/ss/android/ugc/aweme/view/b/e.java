package com.ss.android.ugc.aweme.view.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class e extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144129a = new e();

    static {
        Covode.recordClassIndex(94321);
    }

    e() {
        super(ProfileNaviEditorState.class, "editCategory", "getEditCategory()Lcom/ss/android/ugc/aweme/common/NaviEditCategory;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getEditCategory();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setEditCategory((x) obj2);
    }
}
