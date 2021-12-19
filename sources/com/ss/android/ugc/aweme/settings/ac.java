package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ac {
    @c(a = "channel")

    /* renamed from: a  reason: collision with root package name */
    public final String f123083a;
    @c(a = "source_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f123084b;

    static {
        Covode.recordClassIndex(80840);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f123083a, acVar.f123083a) && l.a(this.f123084b, acVar.f123084b);
    }

    public final int hashCode() {
        String str = this.f123083a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f123084b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RnSourceUrlSetting(channel=" + this.f123083a + ", sourceUrl=" + this.f123084b + ")";
    }

    private /* synthetic */ ac() {
        this("", "");
    }

    private ac(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f123083a = str;
        this.f123084b = str2;
    }
}
