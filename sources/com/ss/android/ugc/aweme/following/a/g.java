package com.ss.android.ugc.aweme.following.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f96342a;

    /* renamed from: b  reason: collision with root package name */
    public final User f96343b;

    /* renamed from: c  reason: collision with root package name */
    public final int f96344c;

    /* renamed from: d  reason: collision with root package name */
    public final String f96345d;

    static {
        Covode.recordClassIndex(60996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f96342a == gVar.f96342a && l.a(this.f96343b, gVar.f96343b) && this.f96344c == gVar.f96344c && l.a(this.f96345d, gVar.f96345d);
    }

    public final int hashCode() {
        int i2 = this.f96342a * 31;
        User user = this.f96343b;
        int i3 = 0;
        int hashCode = (((i2 + (user != null ? user.hashCode() : 0)) * 31) + this.f96344c) * 31;
        String str = this.f96345d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "RelationUser(type=" + this.f96342a + ", user=" + this.f96343b + ", order=" + this.f96344c + ", requestId=" + this.f96345d + ")";
    }

    public /* synthetic */ g(int i2, User user) {
        this(i2, user, 0, "");
    }

    public static /* synthetic */ g a(g gVar, int i2) {
        int i3 = gVar.f96342a;
        User user = gVar.f96343b;
        String str = gVar.f96345d;
        l.d(user, "");
        l.d(str, "");
        return new g(i3, user, i2, str);
    }

    public g(int i2, User user, int i3, String str) {
        l.d(user, "");
        l.d(str, "");
        this.f96342a = i2;
        this.f96343b = user;
        this.f96344c = i3;
        this.f96345d = str;
    }
}
