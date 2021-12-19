package com.ss.android.ugc.aweme.find.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96069a = new a();

    static {
        Covode.recordClassIndex(60857);
    }

    a() {
        super(FindFriendsState.class, "hasMore", "getHasMore()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((FindFriendsState) obj).getHasMore());
    }
}
