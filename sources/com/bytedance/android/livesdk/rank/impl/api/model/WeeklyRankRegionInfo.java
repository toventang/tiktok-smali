package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class WeeklyRankRegionInfo {
    @c(a = "current_type")
    private final int currentType;
    @c(a = "region_status")
    private final int regionStatus;
    @c(a = "room_region")
    private final String roomRegion;
    @c(a = "viewer_region")
    private final String viewerRegion;

    static {
        Covode.recordClassIndex(12193);
    }

    public WeeklyRankRegionInfo() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ WeeklyRankRegionInfo copy$default(WeeklyRankRegionInfo weeklyRankRegionInfo, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = weeklyRankRegionInfo.regionStatus;
        }
        if ((i4 & 2) != 0) {
            i3 = weeklyRankRegionInfo.currentType;
        }
        if ((i4 & 4) != 0) {
            str = weeklyRankRegionInfo.roomRegion;
        }
        if ((i4 & 8) != 0) {
            str2 = weeklyRankRegionInfo.viewerRegion;
        }
        return weeklyRankRegionInfo.copy(i2, i3, str, str2);
    }

    public final int component1() {
        return this.regionStatus;
    }

    public final int component2() {
        return this.currentType;
    }

    public final String component3() {
        return this.roomRegion;
    }

    public final String component4() {
        return this.viewerRegion;
    }

    public final WeeklyRankRegionInfo copy(int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new WeeklyRankRegionInfo(i2, i3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeeklyRankRegionInfo)) {
            return false;
        }
        WeeklyRankRegionInfo weeklyRankRegionInfo = (WeeklyRankRegionInfo) obj;
        return this.regionStatus == weeklyRankRegionInfo.regionStatus && this.currentType == weeklyRankRegionInfo.currentType && l.a(this.roomRegion, weeklyRankRegionInfo.roomRegion) && l.a(this.viewerRegion, weeklyRankRegionInfo.viewerRegion);
    }

    public final int hashCode() {
        int com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.regionStatus) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentType)) * 31;
        String str = this.roomRegion;
        int i2 = 0;
        int hashCode = (com_bytedance_android_livesdk_rank_impl_api_model_WeeklyRankRegionInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.viewerRegion;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "WeeklyRankRegionInfo(regionStatus=" + this.regionStatus + ", currentType=" + this.currentType + ", roomRegion=" + this.roomRegion + ", viewerRegion=" + this.viewerRegion + ")";
    }

    public final int getCurrentType() {
        return this.currentType;
    }

    public final int getRegionStatus() {
        return this.regionStatus;
    }

    public final String getRoomRegion() {
        return this.roomRegion;
    }

    public final String getViewerRegion() {
        return this.viewerRegion;
    }

    public WeeklyRankRegionInfo(int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.regionStatus = i2;
        this.currentType = i3;
        this.roomRegion = str;
        this.viewerRegion = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WeeklyRankRegionInfo(int i2, int i3, String str, String str2, int i4, g gVar) {
        this((i4 & 1) != 0 ? c.UNKNOWN_STATUS.getValue() : i2, (i4 & 2) != 0 ? d.UNKNOWN.getValue() : i3, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2);
    }
}
