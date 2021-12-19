package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "action_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f112793a;
    @c(a = "view_type")

    /* renamed from: b  reason: collision with root package name */
    public final int f112794b;
    @c(a = "text_content")

    /* renamed from: c  reason: collision with root package name */
    public final String f112795c;
    @c(a = "schema_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f112796d;

    static {
        Covode.recordClassIndex(72507);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f112793a == aVar.f112793a && this.f112794b == aVar.f112794b && l.a(this.f112795c, aVar.f112795c) && l.a(this.f112796d, aVar.f112796d);
    }

    public final int hashCode() {
        int i2 = ((this.f112793a * 31) + this.f112794b) * 31;
        String str = this.f112795c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112796d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ExtraActionTemplate(actionType=" + this.f112793a + ", viewType=" + this.f112794b + ", content=" + this.f112795c + ", schema=" + this.f112796d + ")";
    }
}
