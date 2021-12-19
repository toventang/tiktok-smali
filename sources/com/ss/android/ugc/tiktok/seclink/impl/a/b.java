package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class b {
    @c(a = "pattern")

    /* renamed from: a  reason: collision with root package name */
    public String f149007a;
    @c(a = StringSet.type)

    /* renamed from: b  reason: collision with root package name */
    public int f149008b;

    static {
        Covode.recordClassIndex(98146);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f149007a, bVar.f149007a) && this.f149008b == bVar.f149008b;
    }

    public final int hashCode() {
        String str = this.f149007a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f149008b;
    }

    public final String toString() {
        return "SecLinkConfigItem(pattern=" + this.f149007a + ", type=" + this.f149008b + ")";
    }

    private /* synthetic */ b() {
        this("");
    }

    private b(String str) {
        l.d(str, "");
        this.f149007a = str;
        this.f149008b = -1;
    }
}
