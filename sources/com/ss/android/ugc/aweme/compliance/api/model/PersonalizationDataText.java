package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class PersonalizationDataText implements Serializable {
    @c(a = "pers_ad_interest_label_detail")
    private final String interestLabelDetail;
    @c(a = "pers_ad_interest_label_title")
    private final String interestLabelTitle;
    @c(a = "list_of_ad_partners")
    private final String listPartner;
    @c(a = "list_of_third_party_ad_networks")
    private final String listThirdAd;
    @c(a = "pers_ad_data_received_partner_detail")
    private final String partnerAdDetail;
    @c(a = "pers_ad_data_received_partner_title")
    private final String partnerAdTitle;
    @c(a = "pers_ad_third_party_networks_detail")
    private final String thirdAdDetail;
    @c(a = "pers_ad_third_party_networks_title")
    private final String thirdAdTitle;
    @c(a = "pers_ad_third_party_measurement_detail")
    private final String thirdPartyMeasurementDetail;
    @c(a = "pers_ad_third_party_measurement_title")
    private final String thirdPartyMeasurementTitle;

    static {
        Covode.recordClassIndex(47338);
    }

    public PersonalizationDataText() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ PersonalizationDataText copy$default(PersonalizationDataText personalizationDataText, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = personalizationDataText.thirdAdTitle;
        }
        if ((i2 & 2) != 0) {
            str2 = personalizationDataText.thirdAdDetail;
        }
        if ((i2 & 4) != 0) {
            str3 = personalizationDataText.partnerAdTitle;
        }
        if ((i2 & 8) != 0) {
            str4 = personalizationDataText.partnerAdDetail;
        }
        if ((i2 & 16) != 0) {
            str5 = personalizationDataText.thirdPartyMeasurementTitle;
        }
        if ((i2 & 32) != 0) {
            str6 = personalizationDataText.thirdPartyMeasurementDetail;
        }
        if ((i2 & 64) != 0) {
            str7 = personalizationDataText.interestLabelTitle;
        }
        if ((i2 & 128) != 0) {
            str8 = personalizationDataText.interestLabelDetail;
        }
        if ((i2 & 256) != 0) {
            str9 = personalizationDataText.listThirdAd;
        }
        if ((i2 & 512) != 0) {
            str10 = personalizationDataText.listPartner;
        }
        return personalizationDataText.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String component1() {
        return this.thirdAdTitle;
    }

    public final String component10() {
        return this.listPartner;
    }

    public final String component2() {
        return this.thirdAdDetail;
    }

    public final String component3() {
        return this.partnerAdTitle;
    }

    public final String component4() {
        return this.partnerAdDetail;
    }

    public final String component5() {
        return this.thirdPartyMeasurementTitle;
    }

    public final String component6() {
        return this.thirdPartyMeasurementDetail;
    }

    public final String component7() {
        return this.interestLabelTitle;
    }

    public final String component8() {
        return this.interestLabelDetail;
    }

    public final String component9() {
        return this.listThirdAd;
    }

    public final PersonalizationDataText copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new PersonalizationDataText(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizationDataText)) {
            return false;
        }
        PersonalizationDataText personalizationDataText = (PersonalizationDataText) obj;
        return l.a(this.thirdAdTitle, personalizationDataText.thirdAdTitle) && l.a(this.thirdAdDetail, personalizationDataText.thirdAdDetail) && l.a(this.partnerAdTitle, personalizationDataText.partnerAdTitle) && l.a(this.partnerAdDetail, personalizationDataText.partnerAdDetail) && l.a(this.thirdPartyMeasurementTitle, personalizationDataText.thirdPartyMeasurementTitle) && l.a(this.thirdPartyMeasurementDetail, personalizationDataText.thirdPartyMeasurementDetail) && l.a(this.interestLabelTitle, personalizationDataText.interestLabelTitle) && l.a(this.interestLabelDetail, personalizationDataText.interestLabelDetail) && l.a(this.listThirdAd, personalizationDataText.listThirdAd) && l.a(this.listPartner, personalizationDataText.listPartner);
    }

    public final int hashCode() {
        String str = this.thirdAdTitle;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.thirdAdDetail;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.partnerAdTitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.partnerAdDetail;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.thirdPartyMeasurementTitle;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.thirdPartyMeasurementDetail;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.interestLabelTitle;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.interestLabelDetail;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.listThirdAd;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.listPartner;
        if (str10 != null) {
            i2 = str10.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "PersonalizationDataText(thirdAdTitle=" + this.thirdAdTitle + ", thirdAdDetail=" + this.thirdAdDetail + ", partnerAdTitle=" + this.partnerAdTitle + ", partnerAdDetail=" + this.partnerAdDetail + ", thirdPartyMeasurementTitle=" + this.thirdPartyMeasurementTitle + ", thirdPartyMeasurementDetail=" + this.thirdPartyMeasurementDetail + ", interestLabelTitle=" + this.interestLabelTitle + ", interestLabelDetail=" + this.interestLabelDetail + ", listThirdAd=" + this.listThirdAd + ", listPartner=" + this.listPartner + ")";
    }

    public final String getInterestLabelDetail() {
        return this.interestLabelDetail;
    }

    public final String getInterestLabelTitle() {
        return this.interestLabelTitle;
    }

    public final String getListPartner() {
        return this.listPartner;
    }

    public final String getListThirdAd() {
        return this.listThirdAd;
    }

    public final String getPartnerAdDetail() {
        return this.partnerAdDetail;
    }

    public final String getPartnerAdTitle() {
        return this.partnerAdTitle;
    }

    public final String getThirdAdDetail() {
        return this.thirdAdDetail;
    }

    public final String getThirdAdTitle() {
        return this.thirdAdTitle;
    }

    public final String getThirdPartyMeasurementDetail() {
        return this.thirdPartyMeasurementDetail;
    }

    public final String getThirdPartyMeasurementTitle() {
        return this.thirdPartyMeasurementTitle;
    }

    public PersonalizationDataText(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.thirdAdTitle = str;
        this.thirdAdDetail = str2;
        this.partnerAdTitle = str3;
        this.partnerAdDetail = str4;
        this.thirdPartyMeasurementTitle = str5;
        this.thirdPartyMeasurementDetail = str6;
        this.interestLabelTitle = str7;
        this.interestLabelDetail = str8;
        this.listThirdAd = str9;
        this.listPartner = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PersonalizationDataText(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, h.f.b.g r24) {
        /*
            r12 = this;
            r10 = r21
            r9 = r20
            r8 = r19
            r7 = r18
            r6 = r17
            r2 = r13
            r3 = r14
            r4 = r15
            r1 = r23
            r5 = r16
            r0 = r1 & 1
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0018
            r2 = r11
        L_0x0018:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x001d
            r3 = r11
        L_0x001d:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0022
            r4 = r11
        L_0x0022:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0027
            r5 = r11
        L_0x0027:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002c
            r6 = r11
        L_0x002c:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0031
            r7 = r11
        L_0x0031:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0036
            r8 = r11
        L_0x0036:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            r9 = r11
        L_0x003b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0040
            r10 = r11
        L_0x0040:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0049
        L_0x0044:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0049:
            r11 = r22
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
