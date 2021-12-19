package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "cached_at")

    /* renamed from: a  reason: collision with root package name */
    public long f63716a;
    @c(a = "sec_user_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f63717b = null;
    @c(a = "last_login_time")

    /* renamed from: c  reason: collision with root package name */
    public final Long f63718c = null;
    @c(a = "screen_name")

    /* renamed from: d  reason: collision with root package name */
    public final String f63719d = null;
    @c(a = "nick_name")

    /* renamed from: e  reason: collision with root package name */
    public final String f63720e = null;
    @c(a = "login_info")

    /* renamed from: f  reason: collision with root package name */
    public final c f63721f = null;
    @c(a = "avatar_url")

    /* renamed from: g  reason: collision with root package name */
    public final String f63722g = null;

    static {
        Covode.recordClassIndex(39289);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f63717b, hVar.f63717b) && l.a(this.f63718c, hVar.f63718c) && l.a(this.f63719d, hVar.f63719d) && l.a(this.f63720e, hVar.f63720e) && l.a(this.f63721f, hVar.f63721f) && l.a(this.f63722g, hVar.f63722g);
    }

    public final int hashCode() {
        String str = this.f63717b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.f63718c;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.f63719d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63720e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        c cVar = this.f63721f;
        int hashCode5 = (hashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str4 = this.f63722g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "TrustedEnvUser(secUid=" + this.f63717b + ", lastLoginTimeInSeconds=" + this.f63718c + ", screenName=" + this.f63719d + ", nickname=" + this.f63720e + ", login_info=" + this.f63721f + ", avatarUrl=" + this.f63722g + ")";
    }

    private h() {
    }
}
