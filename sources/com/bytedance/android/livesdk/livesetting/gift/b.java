package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "new_tray_queue")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18710a;
    @c(a = "new_self_tray_queue")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18711b;
    @c(a = "others_queue_hot_threshold")

    /* renamed from: c  reason: collision with root package name */
    public final int f18712c;
    @c(a = "self_queue_hot_threshold")

    /* renamed from: d  reason: collision with root package name */
    public final int f18713d;

    static {
        Covode.recordClassIndex(10680);
    }

    public b() {
        this(0, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18710a == bVar.f18710a && this.f18711b == bVar.f18711b && this.f18712c == bVar.f18712c && this.f18713d == bVar.f18713d;
    }

    public final int hashCode() {
        boolean z = this.f18710a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f18711b) {
            i2 = 0;
        }
        return ((((i6 + i2) * 31) + this.f18712c) * 31) + this.f18713d;
    }

    public final String toString() {
        return "LiveGiftPerformanceConfig(useNewTrayQueue=" + this.f18710a + ", useNewSelfTrayQueue=" + this.f18711b + ", mOtherQueueHotSize=" + this.f18712c + ", mSelfQueueHotSize=" + this.f18713d + ")";
    }

    private b(int i2, int i3) {
        this.f18710a = false;
        this.f18711b = false;
        this.f18712c = i2;
        this.f18713d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3, int i4) {
        this((i4 & 4) != 0 ? 200 : i2, (i4 & 8) != 0 ? 200 : i3);
    }
}
