package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.j;
import com.ss.android.ugc.aweme.recommend.RecommendUserListState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class ad extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96394a = new ad();

    static {
        Covode.recordClassIndex(61041);
    }

    ad() {
        super(j.class, "list", "getList(Lcom/bytedance/jedi/arch/ext/list/IListState;)Ljava/util/List;", 1);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return j.a((RecommendUserListState) obj);
    }
}
