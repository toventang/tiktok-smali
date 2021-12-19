package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final User f20593a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20594b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20595c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20596d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20597e;

    static {
        Covode.recordClassIndex(12172);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f20593a, bVar.f20593a) && this.f20594b == bVar.f20594b && this.f20595c == bVar.f20595c && this.f20596d == bVar.f20596d && l.a(this.f20597e, bVar.f20597e);
    }

    public final String toString() {
        return "AudienceInRankDialogItem(user=" + this.f20593a + ", rank=" + this.f20594b + ", score=" + this.f20595c + ", userRestrictionLevel=" + this.f20596d + ", gapDescription=" + this.f20597e + ")";
    }

    public final int hashCode() {
        int i2;
        User user = this.f20593a;
        int i3 = 0;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f20595c;
        int i4 = ((((((i2 * 31) + this.f20594b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f20596d) * 31;
        String str = this.f20597e;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i4 + i3;
    }

    public b(User user, int i2, long j2, int i3, String str) {
        l.d(user, "");
        l.d(str, "");
        this.f20593a = user;
        this.f20594b = i2;
        this.f20595c = j2;
        this.f20596d = i3;
        this.f20597e = str;
    }
}
