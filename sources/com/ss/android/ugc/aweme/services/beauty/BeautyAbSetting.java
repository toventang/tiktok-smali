package com.ss.android.ugc.aweme.services.beauty;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class BeautyAbSetting {
    private final int abGroup;
    private final boolean isDataSync;

    static {
        Covode.recordClassIndex(79583);
    }

    public BeautyAbSetting() {
        this(false, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_services_beauty_BeautyAbSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ BeautyAbSetting copy$default(BeautyAbSetting beautyAbSetting, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = beautyAbSetting.isDataSync;
        }
        if ((i3 & 2) != 0) {
            i2 = beautyAbSetting.abGroup;
        }
        return beautyAbSetting.copy(z, i2);
    }

    public final boolean component1() {
        return this.isDataSync;
    }

    public final int component2() {
        return this.abGroup;
    }

    public final BeautyAbSetting copy(boolean z, int i2) {
        return new BeautyAbSetting(z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyAbSetting)) {
            return false;
        }
        BeautyAbSetting beautyAbSetting = (BeautyAbSetting) obj;
        return this.isDataSync == beautyAbSetting.isDataSync && this.abGroup == beautyAbSetting.abGroup;
    }

    public final int hashCode() {
        boolean z = this.isDataSync;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + com_ss_android_ugc_aweme_services_beauty_BeautyAbSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.abGroup);
    }

    public final String toString() {
        return "BeautyAbSetting(isDataSync=" + this.isDataSync + ", abGroup=" + this.abGroup + ")";
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean isDataSync() {
        return this.isDataSync;
    }

    public BeautyAbSetting(boolean z, int i2) {
        this.isDataSync = z;
        this.abGroup = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyAbSetting(boolean z, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i2);
    }
}
