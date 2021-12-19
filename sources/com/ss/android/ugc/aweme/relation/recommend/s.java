package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class s extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120471a = new s();

    static {
        Covode.recordClassIndex(78417);
    }

    s() {
        super(SocialRecRequestState.class, "friends", "getFriends()Lcom/ss/android/ugc/aweme/friends/model/FriendList;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SocialRecRequestState) obj).getFriends();
    }
}
