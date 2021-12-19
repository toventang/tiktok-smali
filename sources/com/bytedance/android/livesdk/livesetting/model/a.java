package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "enable_new_banner")
    private final boolean enableNewBanner;

    static {
        Covode.recordClassIndex(10804);
    }

    public a() {
        this(false, 1, null);
    }

    public static /* synthetic */ a copy$default(a aVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = aVar.enableNewBanner;
        }
        return aVar.copy(z);
    }

    public final boolean component1() {
        return this.enableNewBanner;
    }

    public final a copy(boolean z) {
        return new a(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.enableNewBanner == ((a) obj).enableNewBanner;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.enableNewBanner;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LiveBannerSettings(enableNewBanner=" + this.enableNewBanner + ")";
    }

    public final boolean getEnableNewBanner() {
        return this.enableNewBanner;
    }

    public a(boolean z) {
        this.enableNewBanner = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : z);
    }
}
