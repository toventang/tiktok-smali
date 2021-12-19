package com.ss.android.ugc.aweme.recommend.users.profile.powerlist;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f120139a;

    static {
        Covode.recordClassIndex(78124);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f120139a, ((b) obj).f120139a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f120139a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendUserItem(user=" + this.f120139a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public b(User user) {
        l.d(user, "");
        this.f120139a = user;
    }
}
