package com.ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final User f96131a;

    /* renamed from: b  reason: collision with root package name */
    public final int f96132b;

    static {
        Covode.recordClassIndex(60909);
    }

    public a() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f96131a, aVar.f96131a) && this.f96132b == aVar.f96132b;
    }

    public final int hashCode() {
        User user = this.f96131a;
        return ((user != null ? user.hashCode() : 0) * 31) + this.f96132b;
    }

    public final String toString() {
        return "FindFriendsData(user=" + this.f96131a + ", type=" + this.f96132b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3) {
        this((User) null, (i3 & 2) != 0 ? 2 : i2);
    }

    public a(User user, int i2) {
        this.f96131a = user;
        this.f96132b = i2;
    }
}
