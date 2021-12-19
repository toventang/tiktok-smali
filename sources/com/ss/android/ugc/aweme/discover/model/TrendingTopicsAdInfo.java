package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class TrendingTopicsAdInfo implements Serializable {
    @c(a = "ad_id")
    private final long adId;
    @c(a = "ad_label")
    private final AdLabel adLabel;
    @c(a = "ad_position")
    private final int adPosition;
    @c(a = "click_track_url_list")
    private final UrlModel clickTrackUrlList;
    @c(a = "creative_id")
    private final long creativeId;
    @c(a = "description")
    private final String description;
    @c(a = "image_list")
    private final List<UrlModel> imageList;
    @c(a = "is_preview")
    private final boolean isPreview;
    @c(a = "label")
    private final AwemeTextLabelModel label;
    @c(a = "log_extra")
    private final String logExtra;
    @c(a = "mp_url")
    private final String mpUrl;
    @c(a = "open_url")
    private final String openUrl;
    @c(a = "source")
    private final String source;
    @c(a = "title")
    private final String title;
    @c(a = "track_url_list")
    private final UrlModel trackUrlList;
    @c(a = StringSet.type)
    private final String type;
    @c(a = "web_title")
    private final String webTitle;
    @c(a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50984);
    }

    public TrendingTopicsAdInfo() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 262143, null);
    }

    public static int com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ TrendingTopicsAdInfo copy$default(TrendingTopicsAdInfo trendingTopicsAdInfo, int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2, int i3, Object obj) {
        String str10 = str2;
        int i4 = i2;
        long j4 = j3;
        long j5 = j2;
        String str11 = str;
        List list2 = list;
        UrlModel urlModel3 = urlModel2;
        UrlModel urlModel4 = urlModel;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        boolean z2 = z;
        String str16 = str9;
        AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
        String str17 = str7;
        AdLabel adLabel3 = adLabel2;
        String str18 = str8;
        if ((i3 & 1) != 0) {
            i4 = trendingTopicsAdInfo.adPosition;
        }
        if ((i3 & 2) != 0) {
            j5 = trendingTopicsAdInfo.adId;
        }
        if ((i3 & 4) != 0) {
            j4 = trendingTopicsAdInfo.creativeId;
        }
        if ((i3 & 8) != 0) {
            str11 = trendingTopicsAdInfo.type;
        }
        if ((i3 & 16) != 0) {
            str10 = trendingTopicsAdInfo.source;
        }
        if ((i3 & 32) != 0) {
            str12 = trendingTopicsAdInfo.logExtra;
        }
        if ((i3 & 64) != 0) {
            str13 = trendingTopicsAdInfo.webUrl;
        }
        if ((i3 & 128) != 0) {
            str14 = trendingTopicsAdInfo.title;
        }
        if ((i3 & 256) != 0) {
            str15 = trendingTopicsAdInfo.webTitle;
        }
        if ((i3 & 512) != 0) {
            urlModel4 = trendingTopicsAdInfo.clickTrackUrlList;
        }
        if ((i3 & 1024) != 0) {
            urlModel3 = trendingTopicsAdInfo.trackUrlList;
        }
        if ((i3 & 2048) != 0) {
            list2 = trendingTopicsAdInfo.imageList;
        }
        if ((i3 & 4096) != 0) {
            z2 = trendingTopicsAdInfo.isPreview;
        }
        if ((i3 & 8192) != 0) {
            str17 = trendingTopicsAdInfo.openUrl;
        }
        if ((i3 & 16384) != 0) {
            str18 = trendingTopicsAdInfo.mpUrl;
        }
        if ((32768 & i3) != 0) {
            str16 = trendingTopicsAdInfo.description;
        }
        if ((65536 & i3) != 0) {
            awemeTextLabelModel2 = trendingTopicsAdInfo.label;
        }
        if ((i3 & 131072) != 0) {
            adLabel3 = trendingTopicsAdInfo.adLabel;
        }
        return trendingTopicsAdInfo.copy(i4, j5, j4, str11, str10, str12, str13, str14, str15, urlModel4, urlModel3, list2, z2, str17, str18, str16, awemeTextLabelModel2, adLabel3);
    }

    public final int component1() {
        return this.adPosition;
    }

    public final UrlModel component10() {
        return this.clickTrackUrlList;
    }

    public final UrlModel component11() {
        return this.trackUrlList;
    }

    public final List<UrlModel> component12() {
        return this.imageList;
    }

    public final boolean component13() {
        return this.isPreview;
    }

    public final String component14() {
        return this.openUrl;
    }

    public final String component15() {
        return this.mpUrl;
    }

    public final String component16() {
        return this.description;
    }

    public final AwemeTextLabelModel component17() {
        return this.label;
    }

    public final AdLabel component18() {
        return this.adLabel;
    }

    public final long component2() {
        return this.adId;
    }

    public final long component3() {
        return this.creativeId;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.source;
    }

    public final String component6() {
        return this.logExtra;
    }

    public final String component7() {
        return this.webUrl;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.webTitle;
    }

    public final TrendingTopicsAdInfo copy(int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(list, "");
        l.d(str7, "");
        l.d(str8, "");
        l.d(str9, "");
        return new TrendingTopicsAdInfo(i2, j2, j3, str, str2, str3, str4, str5, str6, urlModel, urlModel2, list, z, str7, str8, str9, awemeTextLabelModel, adLabel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopicsAdInfo)) {
            return false;
        }
        TrendingTopicsAdInfo trendingTopicsAdInfo = (TrendingTopicsAdInfo) obj;
        return this.adPosition == trendingTopicsAdInfo.adPosition && this.adId == trendingTopicsAdInfo.adId && this.creativeId == trendingTopicsAdInfo.creativeId && l.a(this.type, trendingTopicsAdInfo.type) && l.a(this.source, trendingTopicsAdInfo.source) && l.a(this.logExtra, trendingTopicsAdInfo.logExtra) && l.a(this.webUrl, trendingTopicsAdInfo.webUrl) && l.a(this.title, trendingTopicsAdInfo.title) && l.a(this.webTitle, trendingTopicsAdInfo.webTitle) && l.a(this.clickTrackUrlList, trendingTopicsAdInfo.clickTrackUrlList) && l.a(this.trackUrlList, trendingTopicsAdInfo.trackUrlList) && l.a(this.imageList, trendingTopicsAdInfo.imageList) && this.isPreview == trendingTopicsAdInfo.isPreview && l.a(this.openUrl, trendingTopicsAdInfo.openUrl) && l.a(this.mpUrl, trendingTopicsAdInfo.mpUrl) && l.a(this.description, trendingTopicsAdInfo.description) && l.a(this.label, trendingTopicsAdInfo.label) && l.a(this.adLabel, trendingTopicsAdInfo.adLabel);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.adPosition) * 31) + com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.adId)) * 31) + com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.creativeId)) * 31;
        String str = this.type;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.logExtra;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.webUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.webTitle;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        UrlModel urlModel = this.clickTrackUrlList;
        int hashCode7 = (hashCode6 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        int hashCode8 = (hashCode7 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        List<UrlModel> list = this.imageList;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isPreview;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode9 + i3) * 31;
        String str7 = this.openUrl;
        int hashCode10 = (i6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.mpUrl;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.description;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        AwemeTextLabelModel awemeTextLabelModel = this.label;
        int hashCode13 = (hashCode12 + (awemeTextLabelModel != null ? awemeTextLabelModel.hashCode() : 0)) * 31;
        AdLabel adLabel2 = this.adLabel;
        if (adLabel2 != null) {
            i2 = adLabel2.hashCode();
        }
        return hashCode13 + i2;
    }

    public final String toString() {
        return "TrendingTopicsAdInfo(adPosition=" + this.adPosition + ", adId=" + this.adId + ", creativeId=" + this.creativeId + ", type=" + this.type + ", source=" + this.source + ", logExtra=" + this.logExtra + ", webUrl=" + this.webUrl + ", title=" + this.title + ", webTitle=" + this.webTitle + ", clickTrackUrlList=" + this.clickTrackUrlList + ", trackUrlList=" + this.trackUrlList + ", imageList=" + this.imageList + ", isPreview=" + this.isPreview + ", openUrl=" + this.openUrl + ", mpUrl=" + this.mpUrl + ", description=" + this.description + ", label=" + this.label + ", adLabel=" + this.adLabel + ")";
    }

    public final long getAdId() {
        return this.adId;
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final int getAdPosition() {
        return this.adPosition;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<UrlModel> getImageList() {
        return this.imageList;
    }

    public final AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopicsAdInfo(int i2, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(list, "");
        l.d(str7, "");
        l.d(str8, "");
        l.d(str9, "");
        this.adPosition = i2;
        this.adId = j2;
        this.creativeId = j3;
        this.type = str;
        this.source = str2;
        this.logExtra = str3;
        this.webUrl = str4;
        this.title = str5;
        this.webTitle = str6;
        this.clickTrackUrlList = urlModel;
        this.trackUrlList = urlModel2;
        this.imageList = list;
        this.isPreview = z;
        this.openUrl = str7;
        this.mpUrl = str8;
        this.description = str9;
        this.label = awemeTextLabelModel;
        this.adLabel = adLabel2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TrendingTopicsAdInfo(int r23, long r24, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.ss.android.ugc.aweme.base.model.UrlModel r34, com.ss.android.ugc.aweme.base.model.UrlModel r35, java.util.List r36, boolean r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r41, com.ss.android.ugc.aweme.discover.model.AdLabel r42, int r43, h.f.b.g r44) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo.<init>(int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.base.model.UrlModel, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel, com.ss.android.ugc.aweme.discover.model.AdLabel, int, h.f.b.g):void");
    }
}
