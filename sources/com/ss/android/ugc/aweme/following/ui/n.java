package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class n extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96541a = new n();

    static {
        Covode.recordClassIndex(61167);
    }

    n() {
        super(FollowerRelationState.class, "listState", "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((FollowerRelationState) obj).getListState();
    }
}
