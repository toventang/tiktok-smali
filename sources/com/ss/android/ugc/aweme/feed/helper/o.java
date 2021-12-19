package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public String f93410a = "";

    /* renamed from: b  reason: collision with root package name */
    public final String f93411b;

    /* renamed from: c  reason: collision with root package name */
    public final int f93412c;

    /* renamed from: d  reason: collision with root package name */
    public final long f93413d;

    /* renamed from: e  reason: collision with root package name */
    public final String f93414e;

    static {
        Covode.recordClassIndex(59189);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f93411b, oVar.f93411b) && this.f93412c == oVar.f93412c && this.f93413d == oVar.f93413d && l.a(this.f93414e, oVar.f93414e);
    }

    public final String toString() {
        return "NewUserBehavior(gid=" + this.f93411b + ", action=" + this.f93412c + ", actionTime=" + this.f93413d + ", eventType=" + this.f93414e + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f93411b;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f93413d;
        int i4 = ((((i2 * 31) + this.f93412c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f93414e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public o(String str, int i2, long j2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f93411b = str;
        this.f93412c = i2;
        this.f93413d = j2;
        this.f93414e = str2;
    }
}
