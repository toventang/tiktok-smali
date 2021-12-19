package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class ad {
    @c(a = "base_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f123085a;
    @c(a = "whitelist_path")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f123086b;

    static {
        Covode.recordClassIndex(80841);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return l.a(this.f123085a, adVar.f123085a) && l.a(this.f123086b, adVar.f123086b);
    }

    public final int hashCode() {
        String str = this.f123085a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f123086b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SendAnalyticsEventData(baseUrl=" + this.f123085a + ", whiteList=" + this.f123086b + ")";
    }

    private /* synthetic */ ad() {
        this("");
    }

    private ad(String str) {
        l.d(str, "");
        this.f123085a = str;
        this.f123086b = null;
    }
}
