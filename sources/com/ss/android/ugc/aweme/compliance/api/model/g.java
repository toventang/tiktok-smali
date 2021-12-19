package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;

public final class g {
    @c(a = "download")

    /* renamed from: a  reason: collision with root package name */
    public int f76663a;
    @c(a = "duet")

    /* renamed from: b  reason: collision with root package name */
    public int f76664b;
    @c(a = "stitch")

    /* renamed from: c  reason: collision with root package name */
    public int f76665c;
    @c(a = UGCMonitor.EVENT_COMMENT)

    /* renamed from: d  reason: collision with root package name */
    public int f76666d;

    static {
        Covode.recordClassIndex(47351);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f76663a == gVar.f76663a && this.f76664b == gVar.f76664b && this.f76665c == gVar.f76665c && this.f76666d == gVar.f76666d;
    }

    public final int hashCode() {
        return (((((this.f76663a * 31) + this.f76664b) * 31) + this.f76665c) * 31) + this.f76666d;
    }

    public final String toString() {
        return "ItemSettings(download=" + this.f76663a + ", duet=" + this.f76664b + ", stitch=" + this.f76665c + ", comment=" + this.f76666d + ")";
    }

    public g(int i2, int i3, int i4, int i5) {
        this.f76663a = i2;
        this.f76664b = i3;
        this.f76665c = i4;
        this.f76666d = i5;
    }
}
