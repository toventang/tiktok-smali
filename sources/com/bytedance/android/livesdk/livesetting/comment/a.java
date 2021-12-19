package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "enable")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18706a = false;
    @c(a = "delayTime")

    /* renamed from: b  reason: collision with root package name */
    public final long f18707b = 0;

    static {
        Covode.recordClassIndex(10604);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18706a == aVar.f18706a && this.f18707b == aVar.f18707b;
    }

    public final int hashCode() {
        boolean z = this.f18706a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f18707b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InputDialogFixSettingModel(enable=" + this.f18706a + ", delayTime=" + this.f18707b + ")";
    }
}
