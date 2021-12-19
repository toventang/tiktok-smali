package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "daily_max_times")

    /* renamed from: a  reason: collision with root package name */
    public int f134419a;
    @c(a = "life_time_max_times")

    /* renamed from: b  reason: collision with root package name */
    public int f134420b;
    @c(a = "inactive_days")

    /* renamed from: c  reason: collision with root package name */
    public int f134421c;
    @c(a = "max_close")

    /* renamed from: d  reason: collision with root package name */
    public int f134422d;

    static {
        Covode.recordClassIndex(87879);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f134419a == eVar.f134419a && this.f134420b == eVar.f134420b && this.f134421c == eVar.f134421c && this.f134422d == eVar.f134422d;
    }

    public final int hashCode() {
        return (((((this.f134419a * 31) + this.f134420b) * 31) + this.f134421c) * 31) + this.f134422d;
    }

    public final String toString() {
        return "FrequencyControl(dailyMaxTimes=" + this.f134419a + ", lifeTimeMaxTimes=" + this.f134420b + ", inactiveDays=" + this.f134421c + ", maxClose=" + this.f134422d + ")";
    }

    private e() {
        this.f134419a = 0;
        this.f134420b = 0;
        this.f134421c = 0;
        this.f134422d = 0;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
