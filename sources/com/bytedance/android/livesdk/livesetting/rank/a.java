package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "hourly_ranklist_interval")

    /* renamed from: a  reason: collision with root package name */
    public final int f18749a = 5;
    @c(a = "weekly_ranklist_interval")

    /* renamed from: b  reason: collision with root package name */
    public final int f18750b = 5;

    static {
        Covode.recordClassIndex(10960);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18749a == aVar.f18749a && this.f18750b == aVar.f18750b;
    }

    public final int hashCode() {
        return (this.f18749a * 31) + this.f18750b;
    }

    public final String toString() {
        return "AutoRefreshRankInterval(hourly_rank=" + this.f18749a + ", weekly_rank=" + this.f18750b + ")";
    }
}
