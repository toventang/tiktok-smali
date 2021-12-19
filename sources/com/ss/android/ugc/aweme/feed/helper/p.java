package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class p {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public int f93415a;
    @c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public String f93416b;

    static {
        Covode.recordClassIndex(59190);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f93415a == pVar.f93415a && l.a(this.f93416b, pVar.f93416b);
    }

    public final int hashCode() {
        int i2 = this.f93415a * 31;
        String str = this.f93416b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Option(id=" + this.f93415a + ", name=" + this.f93416b + ")";
    }

    private /* synthetic */ p() {
        this("");
    }

    private p(String str) {
        l.d(str, "");
        this.f93415a = 0;
        this.f93416b = str;
    }
}
