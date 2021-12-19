package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class TermsConsentInfo implements Serializable {
    @c(a = "business")
    private final String business;
    @c(a = "button")
    private final String button;
    @c(a = "checkbox_tr_notification_subtitle")
    private final String cbNotificationSubTitle;
    @c(a = "checkbox_tr_notification_title")
    private final String cbNotificationTitle;
    @c(a = "checkbox_agree_all_terms")
    private final String checkboxAll;
    @c(a = "checkbox_privacy_policy")
    private final String checkboxPP;
    @c(a = "checkbox_terms_of_use")
    private final String checkboxTerms;
    @c(a = "desc")
    private final String description;
    @c(a = "tiktok_privacy_policy_url")
    private final String privacyPolicyUrl;
    @c(a = "tiktok_terms_of_use_url")
    private final String termsOfUseUrl;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47343);
    }

    public TermsConsentInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ TermsConsentInfo copy$default(TermsConsentInfo termsConsentInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = termsConsentInfo.termsOfUseUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = termsConsentInfo.privacyPolicyUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = termsConsentInfo.title;
        }
        if ((i2 & 8) != 0) {
            str4 = termsConsentInfo.description;
        }
        if ((i2 & 16) != 0) {
            str5 = termsConsentInfo.checkboxAll;
        }
        if ((i2 & 32) != 0) {
            str6 = termsConsentInfo.checkboxTerms;
        }
        if ((i2 & 64) != 0) {
            str7 = termsConsentInfo.checkboxPP;
        }
        if ((i2 & 128) != 0) {
            str8 = termsConsentInfo.button;
        }
        if ((i2 & 256) != 0) {
            str9 = termsConsentInfo.business;
        }
        if ((i2 & 512) != 0) {
            str10 = termsConsentInfo.cbNotificationTitle;
        }
        if ((i2 & 1024) != 0) {
            str11 = termsConsentInfo.cbNotificationSubTitle;
        }
        return termsConsentInfo.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final String component1() {
        return this.termsOfUseUrl;
    }

    public final String component10() {
        return this.cbNotificationTitle;
    }

    public final String component11() {
        return this.cbNotificationSubTitle;
    }

    public final String component2() {
        return this.privacyPolicyUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.checkboxAll;
    }

    public final String component6() {
        return this.checkboxTerms;
    }

    public final String component7() {
        return this.checkboxPP;
    }

    public final String component8() {
        return this.button;
    }

    public final String component9() {
        return this.business;
    }

    public final TermsConsentInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new TermsConsentInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsConsentInfo)) {
            return false;
        }
        TermsConsentInfo termsConsentInfo = (TermsConsentInfo) obj;
        return l.a(this.termsOfUseUrl, termsConsentInfo.termsOfUseUrl) && l.a(this.privacyPolicyUrl, termsConsentInfo.privacyPolicyUrl) && l.a(this.title, termsConsentInfo.title) && l.a(this.description, termsConsentInfo.description) && l.a(this.checkboxAll, termsConsentInfo.checkboxAll) && l.a(this.checkboxTerms, termsConsentInfo.checkboxTerms) && l.a(this.checkboxPP, termsConsentInfo.checkboxPP) && l.a(this.button, termsConsentInfo.button) && l.a(this.business, termsConsentInfo.business) && l.a(this.cbNotificationTitle, termsConsentInfo.cbNotificationTitle) && l.a(this.cbNotificationSubTitle, termsConsentInfo.cbNotificationSubTitle);
    }

    public final int hashCode() {
        String str = this.termsOfUseUrl;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.checkboxAll;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.checkboxTerms;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.checkboxPP;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.button;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.business;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.cbNotificationTitle;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.cbNotificationSubTitle;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "TermsConsentInfo(termsOfUseUrl=" + this.termsOfUseUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", title=" + this.title + ", description=" + this.description + ", checkboxAll=" + this.checkboxAll + ", checkboxTerms=" + this.checkboxTerms + ", checkboxPP=" + this.checkboxPP + ", button=" + this.button + ", business=" + this.business + ", cbNotificationTitle=" + this.cbNotificationTitle + ", cbNotificationSubTitle=" + this.cbNotificationSubTitle + ")";
    }

    public final String getBusiness() {
        return this.business;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getCbNotificationSubTitle() {
        return this.cbNotificationSubTitle;
    }

    public final String getCbNotificationTitle() {
        return this.cbNotificationTitle;
    }

    public final String getCheckboxAll() {
        return this.checkboxAll;
    }

    public final String getCheckboxPP() {
        return this.checkboxPP;
    }

    public final String getCheckboxTerms() {
        return this.checkboxTerms;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final String getTermsOfUseUrl() {
        return this.termsOfUseUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.termsOfUseUrl = str;
        this.privacyPolicyUrl = str2;
        this.title = str3;
        this.description = str4;
        this.checkboxAll = str5;
        this.checkboxTerms = str6;
        this.checkboxPP = str7;
        this.button = str8;
        this.business = str9;
        this.cbNotificationTitle = str10;
        this.cbNotificationSubTitle = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TermsConsentInfo(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, h.f.b.g r26) {
        /*
            r13 = this;
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r1 = r25
            r11 = r23
            r0 = r1 & 1
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x001b
            r2 = r12
        L_0x001b:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0020
            r3 = r12
        L_0x0020:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0025
            r4 = r12
        L_0x0025:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x002a
            r5 = r12
        L_0x002a:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002f
            r6 = r12
        L_0x002f:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0034
            r7 = r12
        L_0x0034:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0039
            r8 = r12
        L_0x0039:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            r9 = r12
        L_0x003e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            r10 = r12
        L_0x0043:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0048
            r11 = r12
        L_0x0048:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0051
        L_0x004c:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0051:
            r12 = r24
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
