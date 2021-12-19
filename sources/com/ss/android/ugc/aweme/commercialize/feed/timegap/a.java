package com.ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "source")
    private final int adjustSource;
    @c(a = "delta_gap")
    private final int deltaGap;

    static {
        Covode.recordClassIndex(45900);
    }

    public static int com_ss_android_ugc_aweme_commercialize_feed_timegap_AdAdjustInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ a copy$default(a aVar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = aVar.deltaGap;
        }
        if ((i4 & 2) != 0) {
            i3 = aVar.adjustSource;
        }
        return aVar.copy(i2, i3);
    }

    public final int component1() {
        return this.deltaGap;
    }

    public final int component2() {
        return this.adjustSource;
    }

    public final a copy(int i2, int i3) {
        return new a(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.deltaGap == aVar.deltaGap && this.adjustSource == aVar.adjustSource;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_commercialize_feed_timegap_AdAdjustInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.deltaGap) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdAdjustInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.adjustSource);
    }

    public final String toString() {
        return "AdAdjustInfo(deltaGap=" + this.deltaGap + ", adjustSource=" + this.adjustSource + ")";
    }

    public final int getAdjustSource() {
        return this.adjustSource;
    }

    public final int getDeltaGap() {
        return this.deltaGap;
    }

    public a(int i2, int i3) {
        this.deltaGap = i2;
        this.adjustSource = i3;
    }
}
