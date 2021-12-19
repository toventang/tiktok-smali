package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class AlgoFreeInfo extends BaseResponse implements Serializable {
    @c(a = "background_video_url")
    private final String backgroundVideoUrl;
    @c(a = "body")
    private final String body;
    @c(a = "icon_url")
    private final String iconUrl;
    @c(a = "learn_more_link")
    private final String learnMoreLink;
    @c(a = "learn_more_text")
    private final String learnMoreText;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47325);
    }

    public AlgoFreeInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AlgoFreeInfo copy$default(AlgoFreeInfo algoFreeInfo, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = algoFreeInfo.iconUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = algoFreeInfo.title;
        }
        if ((i2 & 4) != 0) {
            str3 = algoFreeInfo.body;
        }
        if ((i2 & 8) != 0) {
            str4 = algoFreeInfo.learnMoreText;
        }
        if ((i2 & 16) != 0) {
            str5 = algoFreeInfo.learnMoreLink;
        }
        if ((i2 & 32) != 0) {
            str6 = algoFreeInfo.backgroundVideoUrl;
        }
        return algoFreeInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final String component4() {
        return this.learnMoreText;
    }

    public final String component5() {
        return this.learnMoreLink;
    }

    public final String component6() {
        return this.backgroundVideoUrl;
    }

    public final AlgoFreeInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        return new AlgoFreeInfo(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoFreeInfo)) {
            return false;
        }
        AlgoFreeInfo algoFreeInfo = (AlgoFreeInfo) obj;
        return l.a(this.iconUrl, algoFreeInfo.iconUrl) && l.a(this.title, algoFreeInfo.title) && l.a(this.body, algoFreeInfo.body) && l.a(this.learnMoreText, algoFreeInfo.learnMoreText) && l.a(this.learnMoreLink, algoFreeInfo.learnMoreLink) && l.a(this.backgroundVideoUrl, algoFreeInfo.backgroundVideoUrl);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.body;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.learnMoreText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.learnMoreLink;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.backgroundVideoUrl;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AlgoFreeInfo(iconUrl=" + this.iconUrl + ", title=" + this.title + ", body=" + this.body + ", learnMoreText=" + this.learnMoreText + ", learnMoreLink=" + this.learnMoreLink + ", backgroundVideoUrl=" + this.backgroundVideoUrl + ")";
    }

    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final String getTitle() {
        return this.title;
    }

    public AlgoFreeInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.iconUrl = str;
        this.title = str2;
        this.body = str3;
        this.learnMoreText = str4;
        this.learnMoreLink = str5;
        this.backgroundVideoUrl = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AlgoFreeInfo(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, h.f.b.g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0 = r14 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r6
        L_0x000c:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r6 = r13
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
