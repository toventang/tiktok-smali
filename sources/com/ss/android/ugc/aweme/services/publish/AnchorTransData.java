package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class AnchorTransData implements Serializable {
    private Long addTime;
    private String anchorContent;
    private final UrlModel anchorIcon;
    private final String anchorTag;
    private final int businessType;
    private final boolean canDelete;
    private final String extra;
    private final String id;
    private final String language;
    private final Integer source;
    private String subtype;
    private final String title;
    private final String url;

    static {
        Covode.recordClassIndex(79759);
    }

    public AnchorTransData(int i2, String str) {
        this(i2, str, null, null, null, null, null, false, null, null, null, null, null, 8188, null);
    }

    public AnchorTransData(int i2, String str, String str2) {
        this(i2, str, str2, null, null, null, null, false, null, null, null, null, null, 8184, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3) {
        this(i2, str, str2, str3, null, null, null, false, null, null, null, null, null, 8176, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num) {
        this(i2, str, str2, str3, num, null, null, false, null, null, null, null, null, 8160, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4) {
        this(i2, str, str2, str3, num, str4, null, false, null, null, null, null, null, 8128, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        this(i2, str, str2, str3, num, str4, urlModel, false, null, null, null, null, null, 8064, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z) {
        this(i2, str, str2, str3, num, str4, urlModel, z, null, null, null, null, null, 7936, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5) {
        this(i2, str, str2, str3, num, str4, urlModel, z, str5, null, null, null, null, 7680, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6) {
        this(i2, str, str2, str3, num, str4, urlModel, z, str5, str6, null, null, null, 7168, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l2) {
        this(i2, str, str2, str3, num, str4, urlModel, z, str5, str6, l2, null, null, 6144, null);
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l2, String str7) {
        this(i2, str, str2, str3, num, str4, urlModel, z, str5, str6, l2, str7, null, 4096, null);
    }

    public static int com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AnchorTransData copy$default(AnchorTransData anchorTransData, int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l2, String str7, String str8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = anchorTransData.businessType;
        }
        if ((i3 & 2) != 0) {
            str = anchorTransData.anchorContent;
        }
        if ((i3 & 4) != 0) {
            str2 = anchorTransData.title;
        }
        if ((i3 & 8) != 0) {
            str3 = anchorTransData.anchorTag;
        }
        if ((i3 & 16) != 0) {
            num = anchorTransData.source;
        }
        if ((i3 & 32) != 0) {
            str4 = anchorTransData.id;
        }
        if ((i3 & 64) != 0) {
            urlModel = anchorTransData.anchorIcon;
        }
        if ((i3 & 128) != 0) {
            z = anchorTransData.canDelete;
        }
        if ((i3 & 256) != 0) {
            str5 = anchorTransData.url;
        }
        if ((i3 & 512) != 0) {
            str6 = anchorTransData.language;
        }
        if ((i3 & 1024) != 0) {
            l2 = anchorTransData.addTime;
        }
        if ((i3 & 2048) != 0) {
            str7 = anchorTransData.extra;
        }
        if ((i3 & 4096) != 0) {
            str8 = anchorTransData.subtype;
        }
        return anchorTransData.copy(i2, str, str2, str3, num, str4, urlModel, z, str5, str6, l2, str7, str8);
    }

    public final int component1() {
        return this.businessType;
    }

    public final String component10() {
        return this.language;
    }

    public final Long component11() {
        return this.addTime;
    }

    public final String component12() {
        return this.extra;
    }

    public final String component13() {
        return this.subtype;
    }

    public final String component2() {
        return this.anchorContent;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.anchorTag;
    }

    public final Integer component5() {
        return this.source;
    }

    public final String component6() {
        return this.id;
    }

    public final UrlModel component7() {
        return this.anchorIcon;
    }

    public final boolean component8() {
        return this.canDelete;
    }

    public final String component9() {
        return this.url;
    }

    public final AnchorTransData copy(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l2, String str7, String str8) {
        l.d(str, "");
        return new AnchorTransData(i2, str, str2, str3, num, str4, urlModel, z, str5, str6, l2, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorTransData)) {
            return false;
        }
        AnchorTransData anchorTransData = (AnchorTransData) obj;
        return this.businessType == anchorTransData.businessType && l.a(this.anchorContent, anchorTransData.anchorContent) && l.a(this.title, anchorTransData.title) && l.a(this.anchorTag, anchorTransData.anchorTag) && l.a(this.source, anchorTransData.source) && l.a(this.id, anchorTransData.id) && l.a(this.anchorIcon, anchorTransData.anchorIcon) && this.canDelete == anchorTransData.canDelete && l.a(this.url, anchorTransData.url) && l.a(this.language, anchorTransData.language) && l.a(this.addTime, anchorTransData.addTime) && l.a(this.extra, anchorTransData.extra) && l.a(this.subtype, anchorTransData.subtype);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.businessType) * 31;
        String str = this.anchorContent;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.anchorTag;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.source;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.anchorIcon;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        boolean z = this.canDelete;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str5 = this.url;
        int hashCode7 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.language;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l2 = this.addTime;
        int hashCode9 = (hashCode8 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str7 = this.extra;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.subtype;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "AnchorTransData(businessType=" + this.businessType + ", anchorContent=" + this.anchorContent + ", title=" + this.title + ", anchorTag=" + this.anchorTag + ", source=" + this.source + ", id=" + this.id + ", anchorIcon=" + this.anchorIcon + ", canDelete=" + this.canDelete + ", url=" + this.url + ", language=" + this.language + ", addTime=" + this.addTime + ", extra=" + this.extra + ", subtype=" + this.subtype + ")";
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final String getAnchorContent() {
        return this.anchorContent;
    }

    public final UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public final String getAnchorTag() {
        return this.anchorTag;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public AnchorTransData(int i2, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l2, String str7, String str8) {
        l.d(str, "");
        this.businessType = i2;
        this.anchorContent = str;
        this.title = str2;
        this.anchorTag = str3;
        this.source = num;
        this.id = str4;
        this.anchorIcon = urlModel;
        this.canDelete = z;
        this.url = str5;
        this.language = str6;
        this.addTime = l2;
        this.extra = str7;
        this.subtype = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnchorTransData(int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, com.ss.android.ugc.aweme.base.model.UrlModel r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, java.lang.String r27, int r28, h.f.b.g r29) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.publish.AnchorTransData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }

    public final void setAddTime(Long l2) {
        this.addTime = l2;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public final void setAnchorContent(String str) {
        l.d(str, "");
        this.anchorContent = str;
    }
}
