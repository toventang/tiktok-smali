package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class d {
    @c(a = "aweme")

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f112841a;
    @c(a = "from_user")

    /* renamed from: b  reason: collision with root package name */
    public final User f112842b;

    static {
        Covode.recordClassIndex(72548);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f112841a, dVar.f112841a) && l.a(this.f112842b, dVar.f112842b);
    }

    public final int hashCode() {
        Aweme aweme = this.f112841a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        User user = this.f112842b;
        if (user != null) {
            i2 = user.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DonationNotice(aweme=" + this.f112841a + ", user=" + this.f112842b + ")";
    }
}
