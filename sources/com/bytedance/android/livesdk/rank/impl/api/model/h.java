package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "threshold")

    /* renamed from: a  reason: collision with root package name */
    public int f20648a;
    @c(a = "fuzzy_text")

    /* renamed from: b  reason: collision with root package name */
    public String f20649b;

    static {
        Covode.recordClassIndex(12201);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20648a == hVar.f20648a && l.a(this.f20649b, hVar.f20649b);
    }

    public final int hashCode() {
        int i2 = this.f20648a * 31;
        String str = this.f20649b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ThresholdConfig(threshold=" + this.f20648a + ", fuzzyText=" + this.f20649b + ")";
    }

    private /* synthetic */ h() {
        this("");
    }

    private h(String str) {
        l.d(str, "");
        this.f20648a = 0;
        this.f20649b = str;
    }
}
