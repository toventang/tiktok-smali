package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.j;
import com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class m extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96540a = new m();

    static {
        Covode.recordClassIndex(61166);
    }

    m() {
        super(j.class, "hasMore", "getHasMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", 1);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return j.d((RecommendUserListState) obj);
    }
}
