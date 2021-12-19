package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class VPAInfo implements Serializable {
    @c(a = "show_info_bar_type")
    private final int infoBarType;
    @c(a = "show_opt_out_button")
    private final boolean showOptOut;

    static {
        Covode.recordClassIndex(59465);
    }

    public VPAInfo() {
        this(false, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_VPAInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ VPAInfo copy$default(VPAInfo vPAInfo, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = vPAInfo.showOptOut;
        }
        if ((i3 & 2) != 0) {
            i2 = vPAInfo.infoBarType;
        }
        return vPAInfo.copy(z, i2);
    }

    public final boolean component1() {
        return this.showOptOut;
    }

    public final int component2() {
        return this.infoBarType;
    }

    public final VPAInfo copy(boolean z, int i2) {
        return new VPAInfo(z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VPAInfo)) {
            return false;
        }
        VPAInfo vPAInfo = (VPAInfo) obj;
        return this.showOptOut == vPAInfo.showOptOut && this.infoBarType == vPAInfo.infoBarType;
    }

    public final int hashCode() {
        boolean z = this.showOptOut;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + com_ss_android_ugc_aweme_feed_model_VPAInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.infoBarType);
    }

    public final String toString() {
        return "VPAInfo(showOptOut=" + this.showOptOut + ", infoBarType=" + this.infoBarType + ")";
    }

    public final int getInfoBarType() {
        return this.infoBarType;
    }

    public final boolean getShowOptOut() {
        return this.showOptOut;
    }

    public VPAInfo(boolean z, int i2) {
        this.showOptOut = z;
        this.infoBarType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VPAInfo(boolean z, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i2);
    }
}
