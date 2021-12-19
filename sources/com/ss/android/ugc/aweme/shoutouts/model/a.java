package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f133201a = -1;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f133202b = null;
    @c(a = "rating_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f133203c = null;

    static {
        Covode.recordClassIndex(87113);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f133201a == aVar.f133201a && l.a(this.f133202b, aVar.f133202b) && l.a(this.f133203c, aVar.f133203c);
    }

    public final int hashCode() {
        int i2 = this.f133201a * 31;
        String str = this.f133202b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f133203c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ShoutoutsCreatePermissionCheckResp(statusCode=" + this.f133201a + ", statusMsg=" + this.f133202b + ", ratingId=" + this.f133203c + ")";
    }

    private a() {
    }
}
