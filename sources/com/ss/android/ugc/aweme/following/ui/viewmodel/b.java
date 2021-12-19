package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96656a = new b();

    static {
        Covode.recordClassIndex(61299);
    }

    b() {
        super(FollowingRelationState.class, "listState", "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getListState();
    }
}
