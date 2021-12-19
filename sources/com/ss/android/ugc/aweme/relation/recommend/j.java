package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f120441a;

    static {
        Covode.recordClassIndex(78390);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f120441a, ((j) obj).f120441a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f120441a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendFriendItem(user=" + this.f120441a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public j(User user) {
        l.d(user, "");
        this.f120441a = user;
    }
}
