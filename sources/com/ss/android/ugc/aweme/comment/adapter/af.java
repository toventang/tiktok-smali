package com.ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Objects;

public final class af implements a {

    /* renamed from: a  reason: collision with root package name */
    public final User f71333a;

    /* renamed from: b  reason: collision with root package name */
    public final ah f71334b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71335c;

    static {
        Covode.recordClassIndex(43920);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final String toString() {
        return "LikeItem(user=" + this.f71333a + ", params=" + this.f71334b + ", shouldHint=" + this.f71335c + ")";
    }

    public final int hashCode() {
        return Objects.hash(this.f71333a.getUid());
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof af)) {
            return false;
        }
        return l.a((Object) this.f71333a.getUid(), (Object) ((af) aVar).f71333a.getUid());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof af)) {
            return false;
        }
        return l.a((Object) this.f71333a.getUid(), (Object) ((af) obj).f71333a.getUid());
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (!b(aVar)) {
            return false;
        }
        User user = ((af) aVar).f71333a;
        if (!l.a((Object) this.f71333a.getUid(), (Object) user.getUid()) || this.f71333a.getFollowStatus() != user.getFollowStatus() || this.f71333a.getFollowerStatus() != user.getFollowerStatus() || !Objects.equals(this.f71333a.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        return true;
    }

    public af(User user, ah ahVar, boolean z) {
        l.d(user, "");
        l.d(ahVar, "");
        this.f71333a = user;
        this.f71334b = ahVar;
        this.f71335c = z;
    }
}
