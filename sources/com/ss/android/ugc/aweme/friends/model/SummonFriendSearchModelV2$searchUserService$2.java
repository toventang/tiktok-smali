package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import h.f.a.a;
import h.f.b.m;

/* access modifiers changed from: package-private */
public final class SummonFriendSearchModelV2$searchUserService$2 extends m implements a<ISearchUserService> {
    public static final SummonFriendSearchModelV2$searchUserService$2 INSTANCE = new SummonFriendSearchModelV2$searchUserService$2();

    static {
        Covode.recordClassIndex(61610);
    }

    SummonFriendSearchModelV2$searchUserService$2() {
        super(0);
    }

    @Override // h.f.a.a
    public final ISearchUserService invoke() {
        return SearchUserService.b();
    }
}
