package com.ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "adgap_delta_by_time")
    public String deltaGapTimeMap;
    @com.google.gson.a.c(a = "downstream_range_end")
    public int downstreamRange;
    @com.google.gson.a.c(a = "fast_browse_time_threshold")
    public int fastBrowseTimeThreshold;
    @com.google.gson.a.c(a = "enable_fast_browse")
    public boolean isEnableFastBrowseAdjust;
    @com.google.gson.a.c(a = "enable_client_adgap_adjust")
    public boolean isEnableGapAdjust;
    @com.google.gson.a.c(a = "enable_showtime_gap")
    public boolean isEnableShowTimeGap;
    @com.google.gson.a.c(a = "use_fast_browse_model")
    public boolean isUserFastBrowseModel;
    @com.google.gson.a.c(a = "min_gap")
    public int minGap;
    @com.google.gson.a.c(a = "single_vid_view_time")
    public int singleVidViewTime;
    @com.google.gson.a.c(a = "viewed_vid_num")
    public int viewVidNumForFastBrowse;

    static {
        Covode.recordClassIndex(45902);
    }

    public c() {
        this(false, false, false, null, 0, false, 0, 0, 0, 0, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ c copy$default(c cVar, boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z = cVar.isEnableGapAdjust;
        }
        if ((i7 & 2) != 0) {
            z2 = cVar.isEnableShowTimeGap;
        }
        if ((i7 & 4) != 0) {
            z3 = cVar.isEnableFastBrowseAdjust;
        }
        if ((i7 & 8) != 0) {
            str = cVar.deltaGapTimeMap;
        }
        if ((i7 & 16) != 0) {
            i2 = cVar.downstreamRange;
        }
        if ((i7 & 32) != 0) {
            z4 = cVar.isUserFastBrowseModel;
        }
        if ((i7 & 64) != 0) {
            i3 = cVar.viewVidNumForFastBrowse;
        }
        if ((i7 & 128) != 0) {
            i4 = cVar.singleVidViewTime;
        }
        if ((i7 & 256) != 0) {
            i5 = cVar.fastBrowseTimeThreshold;
        }
        if ((i7 & 512) != 0) {
            i6 = cVar.minGap;
        }
        return cVar.copy(z, z2, z3, str, i2, z4, i3, i4, i5, i6);
    }

    public final boolean component1() {
        return this.isEnableGapAdjust;
    }

    public final int component10() {
        return this.minGap;
    }

    public final boolean component2() {
        return this.isEnableShowTimeGap;
    }

    public final boolean component3() {
        return this.isEnableFastBrowseAdjust;
    }

    public final String component4() {
        return this.deltaGapTimeMap;
    }

    public final int component5() {
        return this.downstreamRange;
    }

    public final boolean component6() {
        return this.isUserFastBrowseModel;
    }

    public final int component7() {
        return this.viewVidNumForFastBrowse;
    }

    public final int component8() {
        return this.singleVidViewTime;
    }

    public final int component9() {
        return this.fastBrowseTimeThreshold;
    }

    public final c copy(boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, int i3, int i4, int i5, int i6) {
        return new c(z, z2, z3, str, i2, z4, i3, i4, i5, i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.isEnableGapAdjust == cVar.isEnableGapAdjust && this.isEnableShowTimeGap == cVar.isEnableShowTimeGap && this.isEnableFastBrowseAdjust == cVar.isEnableFastBrowseAdjust && l.a(this.deltaGapTimeMap, cVar.deltaGapTimeMap) && this.downstreamRange == cVar.downstreamRange && this.isUserFastBrowseModel == cVar.isUserFastBrowseModel && this.viewVidNumForFastBrowse == cVar.viewVidNumForFastBrowse && this.singleVidViewTime == cVar.singleVidViewTime && this.fastBrowseTimeThreshold == cVar.fastBrowseTimeThreshold && this.minGap == cVar.minGap;
    }

    public final int hashCode() {
        boolean z = this.isEnableGapAdjust;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.isEnableShowTimeGap;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isEnableFastBrowseAdjust;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        String str = this.deltaGapTimeMap;
        int hashCode = (((i14 + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.downstreamRange)) * 31;
        if (!this.isUserFastBrowseModel) {
            i2 = 0;
        }
        return ((((((((hashCode + i2) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewVidNumForFastBrowse)) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.singleVidViewTime)) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.fastBrowseTimeThreshold)) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_AdShowTimeGapResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minGap);
    }

    public final String toString() {
        return "AdShowTimeGapResponse(isEnableGapAdjust=" + this.isEnableGapAdjust + ", isEnableShowTimeGap=" + this.isEnableShowTimeGap + ", isEnableFastBrowseAdjust=" + this.isEnableFastBrowseAdjust + ", deltaGapTimeMap=" + this.deltaGapTimeMap + ", downstreamRange=" + this.downstreamRange + ", isUserFastBrowseModel=" + this.isUserFastBrowseModel + ", viewVidNumForFastBrowse=" + this.viewVidNumForFastBrowse + ", singleVidViewTime=" + this.singleVidViewTime + ", fastBrowseTimeThreshold=" + this.fastBrowseTimeThreshold + ", minGap=" + this.minGap + ")";
    }

    public final String getDeltaGapTimeMap() {
        return this.deltaGapTimeMap;
    }

    public final int getDownstreamRange() {
        return this.downstreamRange;
    }

    public final int getFastBrowseTimeThreshold() {
        return this.fastBrowseTimeThreshold;
    }

    public final int getMinGap() {
        return this.minGap;
    }

    public final int getSingleVidViewTime() {
        return this.singleVidViewTime;
    }

    public final int getViewVidNumForFastBrowse() {
        return this.viewVidNumForFastBrowse;
    }

    public final boolean isEnableFastBrowseAdjust() {
        return this.isEnableFastBrowseAdjust;
    }

    public final boolean isEnableGapAdjust() {
        return this.isEnableGapAdjust;
    }

    public final boolean isEnableShowTimeGap() {
        return this.isEnableShowTimeGap;
    }

    public final boolean isUserFastBrowseModel() {
        return this.isUserFastBrowseModel;
    }

    public c(boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, int i3, int i4, int i5, int i6) {
        this.isEnableGapAdjust = z;
        this.isEnableShowTimeGap = z2;
        this.isEnableFastBrowseAdjust = z3;
        this.deltaGapTimeMap = str;
        this.downstreamRange = i2;
        this.isUserFastBrowseModel = z4;
        this.viewVidNumForFastBrowse = i3;
        this.singleVidViewTime = i4;
        this.fastBrowseTimeThreshold = i5;
        this.minGap = i6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z, boolean z2, boolean z3, String str, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, g gVar) {
        this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? false : z2, (i7 & 4) != 0 ? false : z3, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? false : z4, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? i6 : 0);
    }
}
