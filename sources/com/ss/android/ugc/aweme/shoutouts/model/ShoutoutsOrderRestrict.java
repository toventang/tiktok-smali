package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ShoutoutsOrderRestrict {
    @c(a = "opening")
    private final boolean opening;
    @c(a = "other_restrict")
    private final boolean otherRestrict;
    @c(a = "reason")
    private final String reason;
    @c(a = "restrict_type")
    private final int restrictType;

    static {
        Covode.recordClassIndex(87100);
    }

    public static int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsOrderRestrict_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ShoutoutsOrderRestrict copy$default(ShoutoutsOrderRestrict shoutoutsOrderRestrict, boolean z, boolean z2, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = shoutoutsOrderRestrict.opening;
        }
        if ((i3 & 2) != 0) {
            z2 = shoutoutsOrderRestrict.otherRestrict;
        }
        if ((i3 & 4) != 0) {
            str = shoutoutsOrderRestrict.reason;
        }
        if ((i3 & 8) != 0) {
            i2 = shoutoutsOrderRestrict.restrictType;
        }
        return shoutoutsOrderRestrict.copy(z, z2, str, i2);
    }

    public final boolean component1() {
        return this.opening;
    }

    public final boolean component2() {
        return this.otherRestrict;
    }

    public final String component3() {
        return this.reason;
    }

    public final int component4() {
        return this.restrictType;
    }

    public final ShoutoutsOrderRestrict copy(boolean z, boolean z2, String str, int i2) {
        return new ShoutoutsOrderRestrict(z, z2, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsOrderRestrict)) {
            return false;
        }
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = (ShoutoutsOrderRestrict) obj;
        return this.opening == shoutoutsOrderRestrict.opening && this.otherRestrict == shoutoutsOrderRestrict.otherRestrict && l.a(this.reason, shoutoutsOrderRestrict.reason) && this.restrictType == shoutoutsOrderRestrict.restrictType;
    }

    public final int hashCode() {
        boolean z = this.opening;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.otherRestrict) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str = this.reason;
        return ((i7 + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsOrderRestrict_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.restrictType);
    }

    public final String toString() {
        return "ShoutoutsOrderRestrict(opening=" + this.opening + ", otherRestrict=" + this.otherRestrict + ", reason=" + this.reason + ", restrictType=" + this.restrictType + ")";
    }

    public final boolean getOpening() {
        return this.opening;
    }

    public final boolean getOtherRestrict() {
        return this.otherRestrict;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getRestrictType() {
        return this.restrictType;
    }

    public ShoutoutsOrderRestrict(boolean z, boolean z2, String str, int i2) {
        this.opening = z;
        this.otherRestrict = z2;
        this.reason = str;
        this.restrictType = i2;
    }
}
