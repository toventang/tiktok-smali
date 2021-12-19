package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public final User f120173a;

    static {
        Covode.recordClassIndex(78162);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof l) && h.f.b.l.a(this.f120173a, ((l) obj).f120173a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f120173a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VerticalRecommendListInitData(user=" + this.f120173a + ")";
    }

    private /* synthetic */ l() {
        this(null);
    }

    public l(User user) {
        this.f120173a = user;
    }
}
