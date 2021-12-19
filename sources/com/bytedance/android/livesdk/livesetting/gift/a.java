package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "available_storage_threshold")

    /* renamed from: a  reason: collision with root package name */
    public final long f18708a = 204800;
    @c(a = "enable_check")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18709b = false;

    static {
        Covode.recordClassIndex(10679);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18708a == aVar.f18708a && this.f18709b == aVar.f18709b;
    }

    public final String toString() {
        return "GiftAssetsStorageConfig(availableThreshold=" + this.f18708a + ", enableCheck=" + this.f18709b + ")";
    }

    public final int hashCode() {
        long j2 = this.f18708a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        boolean z = this.f18709b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }
}
