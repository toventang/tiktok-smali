package com.ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    @c(a = "ad_drop_time_list")
    private final List<Long> adDropTimeList;
    @c(a = "ad_extra_info_list")
    private final List<b> adExtraInfoList;
    @c(a = "client_last_ad_pos")
    private final int lastAdPost;
    @c(a = "not_show_length")
    private final int notShowLength;

    static {
        Covode.recordClassIndex(45903);
    }

    public static int com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.feed.timegap.d */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d copy$default(d dVar, int i2, int i3, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = dVar.notShowLength;
        }
        if ((i4 & 2) != 0) {
            i3 = dVar.lastAdPost;
        }
        if ((i4 & 4) != 0) {
            list = dVar.adDropTimeList;
        }
        if ((i4 & 8) != 0) {
            list2 = dVar.adExtraInfoList;
        }
        return dVar.copy(i2, i3, list, list2);
    }

    public final int component1() {
        return this.notShowLength;
    }

    public final int component2() {
        return this.lastAdPost;
    }

    public final List<Long> component3() {
        return this.adDropTimeList;
    }

    public final List<b> component4() {
        return this.adExtraInfoList;
    }

    public final d copy(int i2, int i3, List<Long> list, List<b> list2) {
        l.d(list, "");
        l.d(list2, "");
        return new d(i2, i3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.notShowLength == dVar.notShowLength && this.lastAdPost == dVar.lastAdPost && l.a(this.adDropTimeList, dVar.adDropTimeList) && l.a(this.adExtraInfoList, dVar.adExtraInfoList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.notShowLength) * 31) + com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.lastAdPost)) * 31;
        List<Long> list = this.adDropTimeList;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_feed_timegap_ShowTimeGapReqInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<b> list2 = this.adExtraInfoList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShowTimeGapReqInfo(notShowLength=" + this.notShowLength + ", lastAdPost=" + this.lastAdPost + ", adDropTimeList=" + this.adDropTimeList + ", adExtraInfoList=" + this.adExtraInfoList + ")";
    }

    public final List<Long> getAdDropTimeList() {
        return this.adDropTimeList;
    }

    public final List<b> getAdExtraInfoList() {
        return this.adExtraInfoList;
    }

    public final int getLastAdPost() {
        return this.lastAdPost;
    }

    public final int getNotShowLength() {
        return this.notShowLength;
    }

    public d(int i2, int i3, List<Long> list, List<b> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.notShowLength = i2;
        this.lastAdPost = i3;
        this.adDropTimeList = list;
        this.adExtraInfoList = list2;
    }
}
