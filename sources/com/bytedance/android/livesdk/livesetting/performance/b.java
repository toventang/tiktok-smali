package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "live_sdk_panel_open_cost_times_switch")

    /* renamed from: a  reason: collision with root package name */
    public boolean f18747a;
    @c(a = "live_sdk_panel_open_cost_times_limit_duration")

    /* renamed from: b  reason: collision with root package name */
    public int f18748b;

    static {
        Covode.recordClassIndex(10918);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18747a == bVar.f18747a && this.f18748b == bVar.f18748b;
    }

    public final int hashCode() {
        boolean z = this.f18747a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f18748b;
    }

    public final String toString() {
        return "LivePanelCostTimeModel(mSwitch=" + this.f18747a + ", mLimitDuration=" + this.f18748b + ")";
    }

    private b() {
        this.f18747a = true;
        this.f18748b = 3;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
