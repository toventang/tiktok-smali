package com.ss.android.ugc.aweme.relation.viewholder;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.user.repository.UserState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120497a = new b();

    static {
        Covode.recordClassIndex(78439);
    }

    b() {
        super(UserState.class, "followStatus", "getFollowStatus()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((UserState) obj).getFollowStatus();
    }
}
