package com.ss.android.ugc.aweme.relation.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;

final /* synthetic */ class k extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.k f120330a = new k();

    static {
        Covode.recordClassIndex(78281);
    }

    k() {
        super(SocialRecRequestState.class, "friends", "getFriends()Lcom/ss/android/ugc/aweme/friends/model/FriendList;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SocialRecRequestState) obj).getFriends();
    }
}
