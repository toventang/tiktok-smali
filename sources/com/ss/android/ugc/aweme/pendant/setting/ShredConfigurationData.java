package com.ss.android.ugc.aweme.pendant.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;

public final class ShredConfigurationData {
    @c(a = "fragment_display_switch")
    private final boolean twinkleEnabled;
    @c(a = "vv_of_fragments")
    private final int[] vvList;

    static {
        Covode.recordClassIndex(73834);
    }

    public static /* synthetic */ ShredConfigurationData copy$default(ShredConfigurationData shredConfigurationData, boolean z, int[] iArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = shredConfigurationData.twinkleEnabled;
        }
        if ((i2 & 2) != 0) {
            iArr = shredConfigurationData.vvList;
        }
        return shredConfigurationData.copy(z, iArr);
    }

    public final boolean component1() {
        return this.twinkleEnabled;
    }

    public final int[] component2() {
        return this.vvList;
    }

    public final ShredConfigurationData copy(boolean z, int[] iArr) {
        l.d(iArr, "");
        return new ShredConfigurationData(z, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShredConfigurationData)) {
            return false;
        }
        ShredConfigurationData shredConfigurationData = (ShredConfigurationData) obj;
        return this.twinkleEnabled == shredConfigurationData.twinkleEnabled && l.a(this.vvList, shredConfigurationData.vvList);
    }

    public final int hashCode() {
        boolean z = this.twinkleEnabled;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        int[] iArr = this.vvList;
        return i5 + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public final String toString() {
        return "ShredConfigurationData(twinkleEnabled=" + this.twinkleEnabled + ", vvList=" + Arrays.toString(this.vvList) + ")";
    }

    public final boolean getTwinkleEnabled() {
        return this.twinkleEnabled;
    }

    public final int[] getVvList() {
        return this.vvList;
    }

    public ShredConfigurationData(boolean z, int[] iArr) {
        l.d(iArr, "");
        this.twinkleEnabled = z;
        this.vvList = iArr;
    }
}
