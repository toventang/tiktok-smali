package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.j;
import com.ss.android.ugc.aweme.recommend.RecommendUserListState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class ae extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96457a = new ae();

    static {
        Covode.recordClassIndex(61087);
    }

    ae() {
        super(j.class, "loadMore", "getLoadMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;", 1);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return j.c((RecommendUserListState) obj);
    }
}
