package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "pattern")

    /* renamed from: a  reason: collision with root package name */
    public String f66152a;
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: b  reason: collision with root package name */
    public int f66153b;

    static {
        Covode.recordClassIndex(40667);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f66152a, cVar.f66152a) && this.f66153b == cVar.f66153b;
    }

    public final int hashCode() {
        String str = this.f66152a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f66153b;
    }

    public final String toString() {
        return "IntentSchemeInterceptConfig(pattern=" + this.f66152a + ", type=" + this.f66153b + ")";
    }

    private /* synthetic */ c() {
        this("");
    }

    private c(String str) {
        l.d(str, "");
        this.f66152a = str;
        this.f66153b = -1;
    }
}
