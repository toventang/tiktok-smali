package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recommend.l;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    public final User f120406a;

    static {
        Covode.recordClassIndex(78356);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f120406a, ((a) obj).f120406a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f120406a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FriendItem(friend=" + this.f120406a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(User user) {
        super(l.a.RECOMMEND_FRIEND, user);
        h.f.b.l.d(user, "");
        this.f120406a = user;
    }
}
