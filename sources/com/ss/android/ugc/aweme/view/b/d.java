package com.ss.android.ugc.aweme.view.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import h.f.b.r;
import h.k.h;
import java.util.List;

final /* synthetic */ class d extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f144127a = new d();

    static {
        Covode.recordClassIndex(94320);
    }

    d() {
        super(ProfileNaviEditorState.class, "tabList", "getTabList()Ljava/util/List;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getTabList();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setTabList((List) obj2);
    }
}
