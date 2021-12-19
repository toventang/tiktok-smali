package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final User f20590a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20591b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20592c;

    static {
        Covode.recordClassIndex(12171);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f20590a, aVar.f20590a) && this.f20591b == aVar.f20591b && this.f20592c == aVar.f20592c;
    }

    public final String toString() {
        return "AudienceInProfileListItem(user=" + this.f20590a + ", score=" + this.f20591b + ", rank=" + this.f20592c + ")";
    }

    public final int hashCode() {
        int i2;
        User user = this.f20590a;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f20591b;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f20592c;
    }

    public a(User user, long j2, int i2) {
        l.d(user, "");
        this.f20590a = user;
        this.f20591b = j2;
        this.f20592c = i2;
    }
}
