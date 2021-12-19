package com.ss.android.ugc.aweme.social.widget.card.a;

import com.bytedance.covode.number.Covode;

public final class c {
    @com.google.gson.a.c(a = "max_exposure_count")

    /* renamed from: a  reason: collision with root package name */
    public final int f133731a;
    @com.google.gson.a.c(a = "max_auto_hide_days")

    /* renamed from: b  reason: collision with root package name */
    public final int f133732b;
    @com.google.gson.a.c(a = "max_delete_hide_days")

    /* renamed from: c  reason: collision with root package name */
    public final int f133733c;
    @com.google.gson.a.c(a = "max_delete_count")

    /* renamed from: d  reason: collision with root package name */
    public final int f133734d;

    static {
        Covode.recordClassIndex(87488);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f133731a == cVar.f133731a && this.f133732b == cVar.f133732b && this.f133733c == cVar.f133733c && this.f133734d == cVar.f133734d;
    }

    public final int hashCode() {
        return (((((this.f133731a * 31) + this.f133732b) * 31) + this.f133733c) * 31) + this.f133734d;
    }

    public final String toString() {
        return "PermissionCardFreqParams(maxExposureCount=" + this.f133731a + ", maxAutoHideDays=" + this.f133732b + ", maxDeleteHideDays=" + this.f133733c + ", maxDeleteCount=" + this.f133734d + ")";
    }

    private c() {
        this.f133731a = 10;
        this.f133732b = 14;
        this.f133733c = 14;
        this.f133734d = 3;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
