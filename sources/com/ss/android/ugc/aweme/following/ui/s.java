package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class s extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96592a = new s();

    static {
        Covode.recordClassIndex(61235);
    }

    s() {
        super(FollowingRelationState.class, "recommendList", "getRecommendList()Ljava/util/List;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getRecommendList();
    }
}
