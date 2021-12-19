package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class r extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96591a = new r();

    static {
        Covode.recordClassIndex(61234);
    }

    r() {
        super(FollowingRelationState.class, "listState", "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getListState();
    }
}
